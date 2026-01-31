package com.itsaky.androidide.logsender;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.widget.Toast;
import com.itsaky.androidide.logsender.utils.Logger;
/* loaded from: classes.dex */
public class LogSenderService extends Service {
    public static final String ACTION_START_SERVICE = "ide.logsender.service.start";
    public static final String ACTION_STOP_SERVICE = "ide.logsender.service.stop";
    private static final String NOTIFICATION_CHANNEL_ID = "ide.logsender.service";
    private static final String NOTIFICATION_CHANNEL_NAME = "LogSender Service";
    private static final int NOTIFICATION_ID = 644;
    private static final String NOTIFICATION_TEXT = "Connected to AndroidIDE";
    private static final String NOTIFICATION_TITLE = "LogSender Service";
    private final LogSender logSender = new LogSender();

    @Override // android.app.Service
    public void onCreate() {
        Logger.LOG.logThis();
        super.onCreate();
        setupNotificationChannel();
        startForeground(NOTIFICATION_ID, buildNotification());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Logger.debug("Unexpected request to bind.", intent);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        char c;
        Logger.debug("onStartCommand", intent, Integer.valueOf(flags), Integer.valueOf(startId));
        String action = intent.getAction();
        switch (action.hashCode()) {
            case 1024849076:
                if (action.equals(ACTION_STOP_SERVICE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1705537008:
                if (action.equals(ACTION_START_SERVICE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                actionStartService();
                return 2;
            case 1:
                actionStopService();
                return 2;
            default:
                Logger.error("Unknown service action:", intent.getAction());
                return 2;
        }
    }

    private void actionStartService() {
        Logger.info("Starting log sender service...");
        boolean result = false;
        try {
            result = this.logSender.bind(getApplicationContext());
            Logger.debug("Bind to AndroidIDE:", Boolean.valueOf(result));
        } catch (Exception err) {
            Logger.error(getString(C0917R.string.msg_bind_service_failed), err);
        }
        if (!result) {
            Toast.makeText(this, getString(C0917R.string.msg_bind_service_failed), 0).show();
            actionStopService();
        }
    }

    private void actionStopService() {
        Logger.info("Stopping log sender service...");
        stopSelf();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        Logger.LOG.logThis();
        if (!this.logSender.isConnected() && !this.logSender.isBinding()) {
            Logger.debug("Not bound to AndroidIDE. Ignored.");
            return;
        }
        Logger.warn("Task removed. Destroying log sender...");
        this.logSender.destroy(getApplicationContext());
        stopSelf();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.LOG.logThis();
        if (!this.logSender.isConnected() && !this.logSender.isBinding()) {
            Logger.debug("Not bound to AndroidIDE. Ignored.");
            return;
        }
        Logger.warn("Service is being destroyed. Destroying log sender...");
        this.logSender.destroy(getApplicationContext());
        super.onDestroy();
    }

    private void setupNotificationChannel() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationChannel channel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "LogSender Service", 2);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(channel);
        }
    }

    private Notification buildNotification() {
        Resources res = getResources();
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("LogSender Service");
        builder.setContentText(NOTIFICATION_TEXT);
        builder.setStyle(new Notification.BigTextStyle().bigText(NOTIFICATION_TEXT));
        builder.setPriority(-1);
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId(NOTIFICATION_CHANNEL_ID);
        }
        builder.setShowWhen(false);
        builder.setSmallIcon(C0917R.C0918drawable.ic_androidide_log);
        builder.setColor(-10453621);
        builder.setOngoing(true);
        Intent exitIntent = new Intent(this, LogSenderService.class).setAction(ACTION_STOP_SERVICE);
        builder.addAction(17301533, res.getString(C0917R.string.notification_action_exit), PendingIntent.getService(this, 0, exitIntent, 67108864));
        return builder.build();
    }
}
