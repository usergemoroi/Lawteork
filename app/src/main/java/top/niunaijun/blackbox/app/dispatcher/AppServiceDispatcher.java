package top.niunaijun.blackbox.app.dispatcher;

import android.app.Service;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.entity.ServiceRecord;
import top.niunaijun.blackbox.entity.UnbindRecord;
import top.niunaijun.blackbox.proxy.record.ProxyServiceRecord;
/* loaded from: classes3.dex */
public class AppServiceDispatcher {
    public static final String TAG = "AppServiceDispatcher";
    private static final AppServiceDispatcher sServiceDispatcher = new AppServiceDispatcher();
    private Map<Intent.FilterComparison, ServiceRecord> mService = new HashMap();
    private final Handler mHandler = BlackBoxCore.get().getHandler();

    private ServiceRecord findRecord(Intent intent) {
        return this.mService.get(new Intent.FilterComparison(intent));
    }

    public static AppServiceDispatcher get() {
        return sServiceDispatcher;
    }

    private Service getOrCreateService(ProxyServiceRecord proxyServiceRecord) {
        Intent intent = proxyServiceRecord.mServiceIntent;
        ServiceInfo serviceInfo = proxyServiceRecord.mServiceInfo;
        IBinder iBinder = proxyServiceRecord.mToken;
        ServiceRecord findRecord = findRecord(intent);
        if (findRecord == null || findRecord.getService() == null) {
            Service createService = BActivityThread.currentActivityThread().createService(serviceInfo, iBinder);
            if (createService == null) {
                return null;
            }
            ServiceRecord serviceRecord = new ServiceRecord();
            serviceRecord.setService(createService);
            this.mService.put(new Intent.FilterComparison(intent), serviceRecord);
            return createService;
        }
        return findRecord.getService();
    }

    public IBinder onBind(Intent intent) {
        Service orCreateService;
        ProxyServiceRecord create = ProxyServiceRecord.create(intent);
        Intent intent2 = create.mServiceIntent;
        ServiceInfo serviceInfo = create.mServiceInfo;
        if (intent2 == null || serviceInfo == null || (orCreateService = getOrCreateService(create)) == null) {
            return null;
        }
        intent2.setExtrasClassLoader(orCreateService.getClassLoader());
        ServiceRecord findRecord = findRecord(intent2);
        findRecord.incrementAndGetBindCount(intent2);
        if (findRecord.hasBinder(intent2)) {
            if (findRecord.isRebind()) {
                orCreateService.onRebind(intent2);
                findRecord.setRebind(false);
            }
            return findRecord.getBinder(intent2);
        }
        try {
            IBinder onBind = orCreateService.onBind(intent2);
            findRecord.addBinder(intent2, onBind);
            return onBind;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.mService.size() > 0) {
            for (ServiceRecord serviceRecord : this.mService.values()) {
                try {
                    serviceRecord.getService().onConfigurationChanged(configuration);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void onDestroy() {
        if (this.mService.size() > 0) {
            for (ServiceRecord serviceRecord : this.mService.values()) {
                try {
                    serviceRecord.getService().onDestroy();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        this.mService.clear();
    }

    public void onLowMemory() {
        if (this.mService.size() > 0) {
            for (ServiceRecord serviceRecord : this.mService.values()) {
                try {
                    serviceRecord.getService().onLowMemory();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Service orCreateService;
        ProxyServiceRecord create = ProxyServiceRecord.create(intent);
        if (create.mServiceIntent == null || create.mServiceInfo == null || (orCreateService = getOrCreateService(create)) == null) {
            return 2;
        }
        create.mServiceIntent.setExtrasClassLoader(orCreateService.getClassLoader());
        findRecord(create.mServiceIntent).setStartId(create.mStartId);
        try {
            int onStartCommand = orCreateService.onStartCommand(create.mServiceIntent, i, create.mStartId);
            BlackBoxCore.getBActivityManager().onStartCommand(intent, create.mUserId);
            return onStartCommand;
        } catch (Throwable th) {
            th.printStackTrace();
            return 2;
        }
    }

    public void onTrimMemory(int i) {
        if (this.mService.size() > 0) {
            for (ServiceRecord serviceRecord : this.mService.values()) {
                try {
                    serviceRecord.getService().onTrimMemory(i);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public boolean onUnbind(Intent intent) {
        Service orCreateService;
        ProxyServiceRecord create = ProxyServiceRecord.create(intent);
        Intent intent2 = create.mServiceIntent;
        if (intent2 != null && create.mServiceInfo != null) {
            try {
                UnbindRecord onServiceUnbind = BlackBoxCore.getBActivityManager().onServiceUnbind(intent, BActivityThread.getUserId());
                if (onServiceUnbind == null || (orCreateService = getOrCreateService(create)) == null) {
                    return false;
                }
                create.mServiceIntent.setExtrasClassLoader(orCreateService.getClassLoader());
                ServiceRecord findRecord = findRecord(intent2);
                boolean z = onServiceUnbind.getStartId() == 0;
                if (z || findRecord.decreaseConnectionCount(intent2)) {
                    orCreateService.onUnbind(intent2);
                    if (z) {
                        orCreateService.onDestroy();
                        BlackBoxCore.getBActivityManager().onServiceDestroy(intent, BActivityThread.getUserId());
                        this.mService.remove(new Intent.FilterComparison(intent2));
                    }
                    findRecord.setRebind(true);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public IBinder peekService(Intent intent) {
        ServiceRecord findRecord = findRecord(intent);
        if (findRecord == null) {
            return null;
        }
        return findRecord.getBinder(intent);
    }

    public void stopService(Intent intent) {
        final ServiceRecord findRecord;
        if (intent == null || (findRecord = findRecord(intent)) == null || findRecord.getService() == null) {
            return;
        }
        if (findRecord.getStartId() > 0) {
            try {
                this.mHandler.post(new Runnable() { // from class: top.niunaijun.blackbox.app.dispatcher.AppServiceDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceRecord.this.getService().onDestroy();
                    }
                });
                BlackBoxCore.getBActivityManager().onServiceDestroy(intent, BActivityThread.getUserId());
                this.mService.remove(new Intent.FilterComparison(intent));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
