package top.niunaijun.blackbox.core.system.p025am;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.BProcessManagerService;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.ProcessRecord;
import top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.entity.AppConfig;
import top.niunaijun.blackbox.entity.UnbindRecord;
import top.niunaijun.blackbox.entity.p028am.PendingResultData;
import top.niunaijun.blackbox.entity.p028am.ReceiverData;
import top.niunaijun.blackbox.entity.p028am.RunningAppProcessInfo;
import top.niunaijun.blackbox.entity.p028am.RunningServiceInfo;
import top.niunaijun.blackbox.utils.Slog;
/* renamed from: top.niunaijun.blackbox.core.system.am.BActivityManagerService */
/* loaded from: classes3.dex */
public class BActivityManagerService extends IBActivityManagerService.Stub implements ISystemService {
    public static final String TAG = "BActivityManagerService";
    private static final BActivityManagerService sService = new BActivityManagerService();
    private final BroadcastManager mBroadcastManager;
    private final BPackageManagerService mPms;
    private final Map<Integer, UserSpace> mUserSpace = new HashMap();

    public BActivityManagerService() {
        BPackageManagerService bPackageManagerService = BPackageManagerService.get();
        this.mPms = bPackageManagerService;
        this.mBroadcastManager = BroadcastManager.startSystem(this, bPackageManagerService);
    }

    public static BActivityManagerService get() {
        return sService;
    }

    private UserSpace getOrCreateSpaceLocked(int i) {
        synchronized (this.mUserSpace) {
            UserSpace userSpace = this.mUserSpace.get(Integer.valueOf(i));
            if (userSpace != null) {
                return userSpace;
            }
            UserSpace userSpace2 = new UserSpace();
            this.mUserSpace.put(Integer.valueOf(i), userSpace2);
            return userSpace2;
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
        ProcessRecord startProcessLocked = BProcessManagerService.get().startProcessLocked(providerInfo.packageName, providerInfo.processName, BProcessManagerService.get().getUserIdByCallingPid(Binder.getCallingPid()), -1, Binder.getCallingPid());
        if (startProcessLocked != null) {
            try {
                return startProcessLocked.bActivityThread.acquireContentProviderClient(providerInfo);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        throw new RuntimeException("Unable to create process " + providerInfo.name);
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public Intent bindService(Intent intent, IBinder iBinder, String str, int i) {
        Intent bindService;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            bindService = orCreateSpaceLocked.mActiveServices.bindService(intent, iBinder, str, i);
        }
        return bindService;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void finishBroadcast(PendingResultData pendingResultData) {
        this.mBroadcastManager.finishBroadcast(pendingResultData);
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public ComponentName getCallingActivity(IBinder iBinder, int i) {
        ComponentName callingActivity;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mStack) {
            callingActivity = orCreateSpaceLocked.mStack.getCallingActivity(iBinder, i);
        }
        return callingActivity;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public String getCallingPackage(IBinder iBinder, int i) {
        String callingPackage;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mStack) {
            callingPackage = orCreateSpaceLocked.mStack.getCallingPackage(iBinder, i);
        }
        return callingPackage;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void getIntentSender(IBinder iBinder, String str, int i, int i2) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i2);
        synchronized (orCreateSpaceLocked.mIntentSenderRecords) {
            PendingIntentRecord pendingIntentRecord = new PendingIntentRecord();
            pendingIntentRecord.uid = i;
            pendingIntentRecord.packageName = str;
            orCreateSpaceLocked.mIntentSenderRecords.put(iBinder, pendingIntentRecord);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public String getPackageForIntentSender(IBinder iBinder, int i) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mIntentSenderRecords) {
            PendingIntentRecord pendingIntentRecord = orCreateSpaceLocked.mIntentSenderRecords.get(iBinder);
            if (pendingIntentRecord != null) {
                return pendingIntentRecord.packageName;
            }
            return null;
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public RunningAppProcessInfo getRunningAppProcesses(String str, int i) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) BlackBoxCore.getContext().getSystemService("activity")).getRunningAppProcesses();
        HashMap hashMap = new HashMap();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            hashMap.put(Integer.valueOf(runningAppProcessInfo.pid), runningAppProcessInfo);
        }
        List<ProcessRecord> packageProcessAsUser = BProcessManagerService.get().getPackageProcessAsUser(str, i);
        RunningAppProcessInfo runningAppProcessInfo2 = new RunningAppProcessInfo();
        for (ProcessRecord processRecord : packageProcessAsUser) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo3 = (ActivityManager.RunningAppProcessInfo) hashMap.get(Integer.valueOf(processRecord.pid));
            if (runningAppProcessInfo3 != null) {
                runningAppProcessInfo3.processName = processRecord.processName;
                runningAppProcessInfo2.mAppProcessInfoList.add(runningAppProcessInfo3);
            }
        }
        return runningAppProcessInfo2;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public RunningServiceInfo getRunningServices(String str, int i) {
        return getOrCreateSpaceLocked(i).mActiveServices.getRunningServiceInfo(str, i);
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public int getUidForIntentSender(IBinder iBinder, int i) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mIntentSenderRecords) {
            PendingIntentRecord pendingIntentRecord = orCreateSpaceLocked.mIntentSenderRecords.get(iBinder);
            if (pendingIntentRecord != null) {
                return pendingIntentRecord.uid;
            }
            return -1;
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public AppConfig initProcess(String str, String str2, int i) {
        ProcessRecord startProcessLocked = BProcessManagerService.get().startProcessLocked(str, str2, i, -1, Binder.getCallingPid());
        if (startProcessLocked == null) {
            return null;
        }
        return startProcessLocked.getClientConfig();
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void onActivityCreated(int i, IBinder iBinder, IBinder iBinder2) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        ActivityRecord activityRecord = (ActivityRecord) iBinder2;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(findProcessByPid.userId);
        synchronized (orCreateSpaceLocked.mStack) {
            orCreateSpaceLocked.mStack.onActivityCreated(findProcessByPid, i, iBinder, activityRecord);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void onActivityDestroyed(IBinder iBinder) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(findProcessByPid.userId);
        synchronized (orCreateSpaceLocked.mStack) {
            orCreateSpaceLocked.mStack.onActivityDestroyed(findProcessByPid.userId, iBinder);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void onActivityResumed(IBinder iBinder) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(findProcessByPid.userId);
        synchronized (orCreateSpaceLocked.mStack) {
            orCreateSpaceLocked.mStack.onActivityResumed(findProcessByPid.userId, iBinder);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void onFinishActivity(IBinder iBinder) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(findProcessByPid.userId);
        synchronized (orCreateSpaceLocked.mStack) {
            orCreateSpaceLocked.mStack.onFinishActivity(findProcessByPid.userId, iBinder);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void onServiceDestroy(Intent intent, int i) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            orCreateSpaceLocked.mActiveServices.onServiceDestroy(intent, i);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public UnbindRecord onServiceUnbind(Intent intent, int i) {
        UnbindRecord onServiceUnbind;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            onServiceUnbind = orCreateSpaceLocked.mActiveServices.onServiceUnbind(intent, i);
        }
        return onServiceUnbind;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void onStartCommand(Intent intent, int i) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            orCreateSpaceLocked.mActiveServices.onStartCommand(intent, i);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public IBinder peekService(Intent intent, String str, int i) {
        IBinder peekService;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            peekService = orCreateSpaceLocked.mActiveServices.peekService(intent, str, i);
        }
        return peekService;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void restartProcess(String str, String str2, int i) {
        BProcessManagerService.get().restartAppProcess(str, str2, i);
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void scheduleBroadcastReceiver(Intent intent, PendingResultData pendingResultData, int i) {
        List<ResolveInfo> queryBroadcastReceivers = BPackageManagerService.get().queryBroadcastReceivers(intent, 128, null, i);
        if (queryBroadcastReceivers.isEmpty()) {
            pendingResultData.build().finish();
            Slog.m20d(TAG, "scheduleBroadcastReceiver empty");
            return;
        }
        this.mBroadcastManager.sendBroadcast(pendingResultData);
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            BProcessManagerService bProcessManagerService = BProcessManagerService.get();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ProcessRecord findProcessRecord = bProcessManagerService.findProcessRecord(activityInfo.packageName, activityInfo.processName, i);
            if (findProcessRecord != null) {
                ReceiverData receiverData = new ReceiverData();
                receiverData.intent = intent;
                receiverData.activityInfo = resolveInfo.activityInfo;
                receiverData.data = pendingResultData;
                findProcessRecord.bActivityThread.scheduleReceiver(receiverData);
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public Intent sendBroadcast(Intent intent, String str, int i) {
        for (ResolveInfo resolveInfo : BPackageManagerService.get().queryBroadcastReceivers(intent, 128, str, i)) {
            BProcessManagerService bProcessManagerService = BProcessManagerService.get();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ProcessRecord findProcessRecord = bProcessManagerService.findProcessRecord(activityInfo.packageName, activityInfo.processName, i);
            if (findProcessRecord != null) {
                try {
                    findProcessRecord.bActivityThread.bindApplication();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
        Intent intent2 = new Intent();
        intent2.setPackage(BlackBoxCore.getHostPkg());
        intent2.setComponent(null);
        intent2.setAction(intent.getAction());
        return intent2;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public int startActivities(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        int startActivitiesLocked;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mStack) {
            startActivitiesLocked = orCreateSpaceLocked.mStack.startActivitiesLocked(i, intentArr, strArr, iBinder, bundle);
        }
        return startActivitiesLocked;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void startActivity(Intent intent, int i) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mStack) {
            orCreateSpaceLocked.mStack.startActivityLocked(i, intent, null, null, null, -1, -1, null);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public int startActivityAms(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle) {
        int startActivityLocked;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mStack) {
            startActivityLocked = orCreateSpaceLocked.mStack.startActivityLocked(i, intent, str, iBinder, str2, i2, i3, bundle);
        }
        return startActivityLocked;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public ComponentName startService(Intent intent, String str, boolean z, int i) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            orCreateSpaceLocked.mActiveServices.startService(intent, str, z, i);
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public int stopService(Intent intent, String str, int i) {
        int stopService;
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            stopService = orCreateSpaceLocked.mActiveServices.stopService(intent, str, i);
        }
        return stopService;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void stopServiceToken(ComponentName componentName, IBinder iBinder, int i) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            orCreateSpaceLocked.mActiveServices.stopServiceToken(componentName, iBinder, i);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
        this.mBroadcastManager.startup();
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBActivityManagerService
    public void unbindService(IBinder iBinder, int i) {
        UserSpace orCreateSpaceLocked = getOrCreateSpaceLocked(i);
        synchronized (orCreateSpaceLocked.mActiveServices) {
            orCreateSpaceLocked.mActiveServices.unbindService(iBinder, i);
        }
    }
}
