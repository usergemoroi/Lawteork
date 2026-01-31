package com.itsaky.androidide.logsender;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.itsaky.androidide.logsender.ILogReceiver;
import com.itsaky.androidide.logsender.ILogSender;
import com.itsaky.androidide.logsender.utils.LogReader;
import com.itsaky.androidide.logsender.utils.Logger;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class LogSender extends ILogSender.Stub implements ServiceConnection {
    public static final String PACKAGE_ANDROIDIDE = "com.itsaky.androidide";
    public static final String PACKAGE_UNKNOWN = "<unknown-package-name>";
    public static final String SERVICE_ACTION = "com.itsaky.androidide.LOG_SERVICE_ACTION";
    private Context context;
    private String packageName;
    private LogReader reader;
    private ILogReceiver receiver;
    private final AtomicBoolean isBinding = new AtomicBoolean(false);
    private final AtomicBoolean isConnected = new AtomicBoolean(false);
    private final String senderId = UUID.randomUUID().toString();

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        ILogReceiver asInterface = ILogReceiver.Stub.asInterface(service);
        this.receiver = asInterface;
        if (asInterface == null) {
            throw new IllegalStateException("Failed to get log receiver instance");
        }
        try {
            asInterface.connect(this);
            Logger.info("Connecting to log receiver");
            this.isConnected.set(true);
        } catch (RemoteException e) {
            Logger.error("Failed to connect to log receiver", e);
            throw new RuntimeException(e);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        tryDisconnect(true);
        Context context = this.context;
        if (context != null) {
            tryUnbind(context);
            this.context = null;
        }
    }

    @Override // com.itsaky.androidide.logsender.ILogSender
    public void ping() {
        Log.d("LogSender", "ping: Received a ping request");
    }

    @Override // com.itsaky.androidide.logsender.ILogSender
    public void startReader(int port) {
        LogReader logReader = this.reader;
        if (logReader != null && logReader.isAlive()) {
            Logger.warn("LogReader has already been started");
            return;
        }
        LogReader logReader2 = new LogReader(getId(), getPackageName(), port);
        this.reader = logReader2;
        logReader2.start();
    }

    @Override // com.itsaky.androidide.logsender.ILogSender
    public int getPid() {
        return Process.myPid();
    }

    @Override // com.itsaky.androidide.logsender.ILogSender
    public String getPackageName() {
        String str = this.packageName;
        if (str == null) {
            return PACKAGE_UNKNOWN;
        }
        return str;
    }

    @Override // com.itsaky.androidide.logsender.ILogSender
    public String getId() {
        return this.senderId;
    }

    @Override // com.itsaky.androidide.logsender.ILogSender
    public void onDisconnect() {
        tryDisconnect(false);
        tryUnbind(this.context);
        try {
            this.context.stopService(new Intent(this.context, LogSenderService.class));
        } catch (Exception err) {
            Logger.error("Failed to stop LogSenderService", err);
        }
        this.context = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isBinding() {
        return this.isBinding.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isConnected() {
        return this.isConnected.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean bind(Context context) {
        if (isConnected()) {
            Logger.warn("LogSender is already installed");
            return true;
        } else if (isBinding()) {
            Logger.warn("LogSender is already being installed");
            return true;
        } else {
            String packageName = context.getPackageName();
            this.packageName = packageName;
            if (PACKAGE_ANDROIDIDE.equals(packageName)) {
                return false;
            }
            this.context = context;
            Intent intent = new Intent(SERVICE_ACTION);
            intent.setPackage(PACKAGE_ANDROIDIDE);
            this.isBinding.set(context.bindService(intent, this, 65));
            if (isBinding()) {
                Logger.info("Binding to log receiver");
            } else {
                Logger.error("Failed to bind to log receiver");
            }
            return isBinding();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void destroy(Context context) {
        tryDisconnect(true);
        tryUnbind(context);
        this.context = null;
    }

    private void tryDisconnect(boolean notifyRecevier) {
        Logger.info("Disconnecting from log receiver...");
        LogReader logReader = this.reader;
        if (logReader != null) {
            logReader.cancel();
        }
        if (notifyRecevier && isReceiverAlive(this.receiver)) {
            try {
                this.receiver.disconnect(getPackageName(), getId());
            } catch (Exception err) {
                Logger.error("Failed to disconnect from log receiver service", err);
            }
        }
        this.receiver = null;
        this.reader = null;
        this.isBinding.set(false);
        this.isConnected.set(false);
    }

    private void tryUnbind(Context context) {
        try {
            context.unbindService(this);
        } catch (Exception err) {
            Logger.error("Failed to unbind from the the log receiver service", err);
        }
    }

    private boolean isReceiverAlive(ILogReceiver receiver) {
        if (receiver == null) {
            return false;
        }
        try {
            receiver.ping();
            return true;
        } catch (RemoteException e) {
            return false;
        }
    }
}
