package top.niunaijun.blackbox.core.system.p025am;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.IEmpty;
import top.niunaijun.blackbox.core.system.BProcessManagerService;
import top.niunaijun.blackbox.core.system.ProcessRecord;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.entity.UnbindRecord;
import top.niunaijun.blackbox.entity.p028am.RunningServiceInfo;
import top.niunaijun.blackbox.proxy.ProxyManifest;
import top.niunaijun.blackbox.proxy.record.ProxyServiceRecord;
/* renamed from: top.niunaijun.blackbox.core.system.am.ActiveServices */
/* loaded from: classes3.dex */
public class ActiveServices {
    public static final String TAG = "ActiveServices";
    private final Map<Intent.FilterComparison, RunningServiceRecord> mRunningServiceRecords = new HashMap();
    private final Map<IBinder, RunningServiceRecord> mRunningTokens = new HashMap();
    private final Map<IBinder, ConnectedServiceRecord> mConnectedServices = new HashMap();

    /* renamed from: top.niunaijun.blackbox.core.system.am.ActiveServices$ConnectedServiceRecord */
    /* loaded from: classes3.dex */
    public static class ConnectedServiceRecord {
        private IBinder mIBinder;
        private Intent mIntent;
    }

    /* renamed from: top.niunaijun.blackbox.core.system.am.ActiveServices$RunningServiceRecord */
    /* loaded from: classes3.dex */
    public static class RunningServiceRecord extends IEmpty.Stub {
        private ConnectedServiceRecord mConnectedServiceRecord;
        private Intent mIntent;
        private ServiceInfo mServiceInfo;
        private final AtomicInteger mStartId = new AtomicInteger(1);
        private final AtomicInteger mBindCount = new AtomicInteger(0);

        public int decrementBindCountAndGet() {
            return this.mBindCount.decrementAndGet();
        }

        public int getAndIncrementStartId() {
            return this.mStartId.getAndIncrement();
        }

        public int incrementBindCountAndGet() {
            return this.mBindCount.incrementAndGet();
        }
    }

    private Intent createStubServiceIntent(Intent intent, ServiceInfo serviceInfo, ProcessRecord processRecord, RunningServiceRecord runningServiceRecord) {
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.getProxyService(processRecord.bpid)));
        intent2.setAction(UUID.randomUUID().toString());
        ProxyServiceRecord.saveStub(intent2, intent, serviceInfo, runningServiceRecord, processRecord.userId, runningServiceRecord.mStartId.get());
        return intent2;
    }

    private RunningServiceRecord findRunningServiceByToken(IBinder iBinder) {
        return this.mRunningTokens.get(iBinder);
    }

    private RunningServiceRecord findRunningServiceRecord(Intent intent) {
        return this.mRunningServiceRecords.get(new Intent.FilterComparison(intent));
    }

    private RunningServiceRecord getOrCreateRunningServiceRecord(Intent intent) {
        RunningServiceRecord findRunningServiceRecord = findRunningServiceRecord(intent);
        if (findRunningServiceRecord == null) {
            RunningServiceRecord runningServiceRecord = new RunningServiceRecord();
            runningServiceRecord.mIntent = intent;
            this.mRunningServiceRecords.put(new Intent.FilterComparison(intent), runningServiceRecord);
            this.mRunningTokens.put(runningServiceRecord, runningServiceRecord);
            return runningServiceRecord;
        }
        return findRunningServiceRecord;
    }

    private ResolveInfo resolveService(Intent intent, String str, int i) {
        return BPackageManagerService.get().resolveService(intent, 0, str, i);
    }

    public Intent bindService(Intent intent, final IBinder iBinder, String str, int i) {
        RunningServiceRecord orCreateRunningServiceRecord;
        boolean z;
        ResolveInfo resolveService = resolveService(intent, str, i);
        if (resolveService == null) {
            return intent;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        ProcessRecord startProcessLocked = BProcessManagerService.get().startProcessLocked(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid());
        if (startProcessLocked != null) {
            synchronized (this.mRunningServiceRecords) {
                orCreateRunningServiceRecord = getOrCreateRunningServiceRecord(intent);
                orCreateRunningServiceRecord.mServiceInfo = serviceInfo;
                if (iBinder != null) {
                    ConnectedServiceRecord connectedServiceRecord = this.mConnectedServices.get(iBinder);
                    if (connectedServiceRecord != null) {
                        z = true;
                    } else {
                        connectedServiceRecord = new ConnectedServiceRecord();
                        try {
                            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: top.niunaijun.blackbox.core.system.am.ActiveServices.2
                                @Override // android.os.IBinder.DeathRecipient
                                public void binderDied() {
                                    iBinder.unlinkToDeath(this, 0);
                                    ActiveServices.this.mConnectedServices.remove(iBinder);
                                }
                            }, 0);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        connectedServiceRecord.mIBinder = iBinder;
                        connectedServiceRecord.mIntent = intent;
                        this.mConnectedServices.put(iBinder, connectedServiceRecord);
                        z = false;
                    }
                    if (!z) {
                        orCreateRunningServiceRecord.incrementBindCountAndGet();
                    }
                    orCreateRunningServiceRecord.mConnectedServiceRecord = connectedServiceRecord;
                }
            }
            return createStubServiceIntent(intent, serviceInfo, startProcessLocked, orCreateRunningServiceRecord);
        }
        throw new RuntimeException("Unable to create " + serviceInfo.name);
    }

    public RunningServiceInfo getRunningServiceInfo(String str, int i) {
        ActivityManager.RunningServiceInfo runningServiceInfo;
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) BlackBoxCore.getContext().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        HashMap hashMap = new HashMap();
        for (ActivityManager.RunningServiceInfo runningServiceInfo2 : runningServices) {
            hashMap.put(Integer.valueOf(runningServiceInfo2.pid), runningServiceInfo2);
        }
        RunningServiceInfo runningServiceInfo3 = new RunningServiceInfo();
        for (RunningServiceRecord runningServiceRecord : this.mRunningServiceRecords.values()) {
            ServiceInfo serviceInfo = runningServiceRecord.mServiceInfo;
            ProcessRecord findProcessRecord = BProcessManagerService.get().findProcessRecord(str, serviceInfo.processName, i);
            if (findProcessRecord != null && (runningServiceInfo = (ActivityManager.RunningServiceInfo) hashMap.get(Integer.valueOf(findProcessRecord.pid))) != null) {
                runningServiceInfo.process = findProcessRecord.processName;
                runningServiceInfo.service = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                runningServiceInfo3.mRunningServiceInfoList.add(runningServiceInfo);
            }
        }
        return runningServiceInfo3;
    }

    public void onServiceDestroy(Intent intent, int i) {
        if (intent == null) {
            return;
        }
        Intent intent2 = ProxyServiceRecord.create(intent).mServiceIntent;
        if (intent2 != null) {
            intent = intent2;
        }
        RunningServiceRecord remove = this.mRunningServiceRecords.remove(new Intent.FilterComparison(intent));
        if (remove != null) {
            this.mRunningTokens.remove(remove);
        }
    }

    public UnbindRecord onServiceUnbind(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        ProxyServiceRecord create = ProxyServiceRecord.create(intent);
        ComponentName component = create.mServiceIntent.getComponent();
        RunningServiceRecord findRunningServiceRecord = findRunningServiceRecord(create.mServiceIntent);
        if (findRunningServiceRecord == null) {
            return null;
        }
        UnbindRecord unbindRecord = new UnbindRecord();
        unbindRecord.setComponentName(component);
        unbindRecord.setBindCount(findRunningServiceRecord.mBindCount.get());
        unbindRecord.setStartId(findRunningServiceRecord.mStartId.get());
        return unbindRecord;
    }

    public void onStartCommand(Intent intent, int i) {
    }

    public IBinder peekService(Intent intent, String str, int i) {
        ResolveInfo resolveService = resolveService(intent, str, i);
        if (resolveService == null) {
            return null;
        }
        BProcessManagerService bProcessManagerService = BProcessManagerService.get();
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        ProcessRecord findProcessRecord = bProcessManagerService.findProcessRecord(serviceInfo.packageName, serviceInfo.processName, i);
        if (findProcessRecord == null) {
            return null;
        }
        try {
            return findProcessRecord.bActivityThread.peekService(intent);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void startService(Intent intent, String str, boolean z, int i) {
        ResolveInfo resolveService = resolveService(intent, str, i);
        if (resolveService == null) {
            return;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        ProcessRecord startProcessLocked = BProcessManagerService.get().startProcessLocked(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid());
        if (startProcessLocked == null) {
            throw new RuntimeException("Unable to create " + serviceInfo.name);
        }
        RunningServiceRecord orCreateRunningServiceRecord = getOrCreateRunningServiceRecord(intent);
        orCreateRunningServiceRecord.mServiceInfo = serviceInfo;
        orCreateRunningServiceRecord.getAndIncrementStartId();
        final Intent createStubServiceIntent = createStubServiceIntent(intent, serviceInfo, startProcessLocked, orCreateRunningServiceRecord);
        new Thread(new Runnable() { // from class: top.niunaijun.blackbox.core.system.am.ActiveServices.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    BlackBoxCore.getContext().startService(createStubServiceIntent);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }).start();
    }

    public int stopService(Intent intent, String str, int i) {
        synchronized (this.mRunningServiceRecords) {
            RunningServiceRecord findRunningServiceRecord = findRunningServiceRecord(intent);
            if (findRunningServiceRecord == null) {
                return 0;
            }
            if (findRunningServiceRecord.mBindCount.get() > 0) {
                Log.d(TAG, "There are also connections");
                return 0;
            }
            findRunningServiceRecord.mStartId.set(0);
            ResolveInfo resolveService = resolveService(intent, str, i);
            if (resolveService == null) {
                return 0;
            }
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            ProcessRecord startProcessLocked = BProcessManagerService.get().startProcessLocked(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid());
            if (startProcessLocked == null) {
                return 0;
            }
            try {
                startProcessLocked.bActivityThread.stopService(intent);
            } catch (RemoteException e) {
            }
            return 0;
        }
    }

    public void stopServiceToken(ComponentName componentName, IBinder iBinder, int i) {
        RunningServiceRecord findRunningServiceByToken = findRunningServiceByToken(iBinder);
        if (findRunningServiceByToken != null) {
            stopService(findRunningServiceByToken.mIntent, null, i);
        }
    }

    public void unbindService(IBinder iBinder, int i) {
        ConnectedServiceRecord connectedServiceRecord = this.mConnectedServices.get(iBinder);
        if (connectedServiceRecord == null) {
            return;
        }
        RunningServiceRecord orCreateRunningServiceRecord = getOrCreateRunningServiceRecord(connectedServiceRecord.mIntent);
        orCreateRunningServiceRecord.mConnectedServiceRecord = null;
        orCreateRunningServiceRecord.mBindCount.decrementAndGet();
        this.mConnectedServices.remove(iBinder);
    }
}
