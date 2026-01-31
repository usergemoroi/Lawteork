package top.niunaijun.blackbox.fake.frameworks;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.system.ServiceManager;
import top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService;
import top.niunaijun.blackbox.entity.AppConfig;
import top.niunaijun.blackbox.entity.UnbindRecord;
import top.niunaijun.blackbox.entity.p028am.PendingResultData;
import top.niunaijun.blackbox.entity.p028am.RunningAppProcessInfo;
import top.niunaijun.blackbox.entity.p028am.RunningServiceInfo;
/* loaded from: classes3.dex */
public class BActivityManager extends BlackManager<IBActivityManagerService> {
    private static final BActivityManager sActivityManager = new BActivityManager();

    public static BActivityManager get() {
        return sActivityManager;
    }

    public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
        try {
            return getService().acquireContentProviderClient(providerInfo);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Intent bindService(Intent intent, IBinder iBinder, String str, int i) {
        try {
            return getService().bindService(intent, iBinder, str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void finishBroadcast(PendingResultData pendingResultData) {
        try {
            getService().finishBroadcast(pendingResultData);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public ComponentName getCallingActivity(IBinder iBinder, int i) {
        try {
            return getService().getCallingActivity(iBinder, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getCallingPackage(IBinder iBinder, int i) {
        try {
            return getService().getCallingPackage(iBinder, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getIntentSender(IBinder iBinder, String str, int i) {
        try {
            getService().getIntentSender(iBinder, str, i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public String getPackageForIntentSender(IBinder iBinder) {
        try {
            return getService().getPackageForIntentSender(iBinder, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public RunningAppProcessInfo getRunningAppProcesses(String str, int i) {
        try {
            return getService().getRunningAppProcesses(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public RunningServiceInfo getRunningServices(String str, int i) {
        try {
            return getService().getRunningServices(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // top.niunaijun.blackbox.fake.frameworks.BlackManager
    public String getServiceName() {
        return ServiceManager.ACTIVITY_MANAGER;
    }

    public int getUidForIntentSender(IBinder iBinder) {
        try {
            return getService().getUidForIntentSender(iBinder, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public AppConfig initProcess(String str, String str2, int i) {
        try {
            return getService().initProcess(str, str2, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void onActivityCreated(int i, IBinder iBinder, IBinder iBinder2) {
        try {
            getService().onActivityCreated(i, iBinder, iBinder2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onActivityDestroyed(IBinder iBinder) {
        try {
            getService().onActivityDestroyed(iBinder);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onActivityResumed(IBinder iBinder) {
        Activity activityByToken;
        try {
            if ("com.tencent.mm".equals(BActivityThread.getAppPackageName()) && (activityByToken = BActivityThread.getActivityByToken(iBinder)) != null) {
                activityByToken.getWindow().getDecorView().clearFocus();
            }
        } catch (Throwable th) {
        }
        try {
            getService().onActivityResumed(iBinder);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onFinishActivity(IBinder iBinder) {
        try {
            getService().onFinishActivity(iBinder);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onServiceDestroy(Intent intent, int i) {
        try {
            getService().onServiceDestroy(intent, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public UnbindRecord onServiceUnbind(Intent intent, int i) {
        try {
            return getService().onServiceUnbind(intent, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void onStartCommand(Intent intent, int i) {
        try {
            getService().onStartCommand(intent, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public IBinder peekService(Intent intent, String str, int i) {
        try {
            return getService().peekService(intent, str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void restartProcess(String str, String str2, int i) {
        try {
            getService().restartProcess(str, str2, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void scheduleBroadcastReceiver(Intent intent, PendingResultData pendingResultData, int i) {
        getService().scheduleBroadcastReceiver(intent, pendingResultData, i);
    }

    public Intent sendBroadcast(Intent intent, String str, int i) {
        try {
            return getService().sendBroadcast(intent, str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int startActivities(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        try {
            return getService().startActivities(i, intentArr, strArr, iBinder, bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void startActivity(Intent intent, int i) {
        try {
            getService().startActivity(intent, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public int startActivityAms(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle) {
        try {
            return getService().startActivityAms(i, intent, str, iBinder, str2, i2, i3, bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public ComponentName startService(Intent intent, String str, boolean z, int i) {
        try {
            return getService().startService(intent, str, z, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int stopService(Intent intent, String str, int i) {
        try {
            return getService().stopService(intent, str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void stopServiceToken(ComponentName componentName, IBinder iBinder, int i) {
        try {
            getService().stopServiceToken(componentName, iBinder, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void unbindService(IBinder iBinder, int i) {
        try {
            getService().unbindService(iBinder, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
