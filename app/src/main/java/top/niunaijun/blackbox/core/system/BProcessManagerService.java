package top.niunaijun.blackbox.core.system;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.IBActivityThread;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.notification.BNotificationManagerService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.core.system.user.BUserHandle;
import top.niunaijun.blackbox.entity.AppConfig;
import top.niunaijun.blackbox.proxy.ProxyManifest;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.PermissionUtils;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.ApplicationThreadCompat;
import top.niunaijun.blackbox.utils.compat.BundleCompat;
import top.niunaijun.blackbox.utils.provider.ProviderCall;
/* loaded from: classes3.dex */
public class BProcessManagerService implements ISystemService {
    public static final String TAG = "BProcessManager";
    public static BProcessManagerService sBProcessManagerService = new BProcessManagerService();
    private final Map<Integer, Map<String, ProcessRecord>> mProcessMap = new HashMap();
    private final List<ProcessRecord> mPidsSelfLocked = new ArrayList();
    private final Object mProcessLock = new Object();

    private void attachClientL(final ProcessRecord processRecord, final IBinder iBinder) {
        IBActivityThread asInterface = IBActivityThread.Stub.asInterface(iBinder);
        if (asInterface == null) {
            processRecord.kill();
            return;
        }
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: top.niunaijun.blackbox.core.system.BProcessManagerService.2
                @Override // android.os.IBinder.DeathRecipient
                public void binderDied() {
                    Log.d(BProcessManagerService.TAG, "App Died: " + processRecord.processName);
                    iBinder.unlinkToDeath(this, 0);
                    BProcessManagerService.this.onProcessDie(processRecord);
                }
            }, 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        processRecord.bActivityThread = asInterface;
        try {
            processRecord.appThread = ApplicationThreadCompat.asInterface(asInterface.getActivityThread());
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
        processRecord.initLock.open();
    }

    private static void createProc(ProcessRecord processRecord) {
        try {
            FileUtils.writeToFile(processRecord.processName.getBytes(), new File(BEnvironment.getProcDir(processRecord.bpid), "cmdline"));
        } catch (IOException e) {
        }
    }

    public static BProcessManagerService get() {
        return sBProcessManagerService;
    }

    public static int getPid(Context context, String str) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    private static String getProcessName(Context context, int i) {
        String str;
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == i) {
                str = next.processName;
                break;
            }
        }
        if (str != null) {
            return str;
        }
        throw new RuntimeException("processName = null");
    }

    private int getUsingBPidL() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) BlackBoxCore.getContext().getSystemService("activity")).getRunningAppProcesses();
        HashSet hashSet = new HashSet();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            hashSet.add(Integer.valueOf(parseBPid(runningAppProcessInfo.processName)));
        }
        for (int i = 0; i < 50; i++) {
            if (!hashSet.contains(Integer.valueOf(i))) {
                return i;
            }
        }
        return -1;
    }

    private boolean initAppProcessL(ProcessRecord processRecord) {
        Log.d(TAG, "initProcess: " + processRecord.processName);
        AppConfig clientConfig = processRecord.getClientConfig();
        Bundle bundle = new Bundle();
        bundle.putParcelable(AppConfig.KEY, clientConfig);
        IBinder binder = BundleCompat.getBinder(ProviderCall.callSafely(processRecord.getProviderAuthority(), "_Black_|_init_process_", null, bundle), "_Black_|_client_");
        if (binder == null || !binder.isBinderAlive()) {
            return false;
        }
        attachClientL(processRecord, binder);
        createProc(processRecord);
        return true;
    }

    private int parseBPid(String str) {
        if (str == null) {
            return -1;
        }
        String str2 = BlackBoxCore.getHostPkg() + ":p";
        if (str.startsWith(str2)) {
            try {
                return Integer.parseInt(str.substring(str2.length()));
            } catch (NumberFormatException e) {
            }
        }
        return -1;
    }

    private static void removeProc(ProcessRecord processRecord) {
        FileUtils.deleteDir(BEnvironment.getProcDir(processRecord.bpid));
    }

    private void requestPermissionIfNeed(ProcessRecord processRecord) {
        if (PermissionUtils.isCheckPermissionRequired(processRecord.info)) {
            String[] dangerousPermissions = BPackageManagerService.get().getDangerousPermissions(processRecord.info.packageName);
            if (PermissionUtils.checkPermissions(dangerousPermissions)) {
                return;
            }
            ConditionVariable conditionVariable = new ConditionVariable();
            startRequestPermission(dangerousPermissions, conditionVariable);
            conditionVariable.block();
        }
    }

    private void startRequestPermission(String[] strArr, final ConditionVariable conditionVariable) {
        PermissionUtils.startRequestPermissions(BlackBoxCore.getContext(), strArr, new PermissionUtils.CallBack() { // from class: top.niunaijun.blackbox.core.system.BProcessManagerService.1
            @Override // top.niunaijun.blackbox.utils.PermissionUtils.CallBack
            public boolean onResult(int i, String[] strArr2, int[] iArr) {
                try {
                    return PermissionUtils.isRequestGranted(iArr);
                } finally {
                    conditionVariable.open();
                }
            }
        });
    }

    public ProcessRecord findProcessByPid(int i) {
        synchronized (this.mPidsSelfLocked) {
            for (ProcessRecord processRecord : this.mPidsSelfLocked) {
                if (processRecord.pid == i) {
                    return processRecord;
                }
            }
            return null;
        }
    }

    public ProcessRecord findProcessRecord(String str, String str2, int i) {
        synchronized (this.mProcessMap) {
            Map<String, ProcessRecord> map = this.mProcessMap.get(Integer.valueOf(BUserHandle.getUid(i, BPackageManagerService.get().getAppId(str))));
            if (map == null) {
                return null;
            }
            return map.get(str2);
        }
    }

    public int getBUidByPidOrPackageName(int i, String str) {
        ProcessRecord findProcessByPid = findProcessByPid(i);
        return findProcessByPid == null ? BPackageManagerService.get().getAppId(str) : BUserHandle.getAppId(findProcessByPid.buid);
    }

    public List<ProcessRecord> getPackageProcessAsUser(String str, int i) {
        synchronized (this.mProcessMap) {
            Map<String, ProcessRecord> map = this.mProcessMap.get(Integer.valueOf(BUserHandle.getUid(i, BPackageManagerService.get().getAppId(str))));
            if (map == null) {
                return new ArrayList();
            }
            return new ArrayList(map.values());
        }
    }

    public int getUserIdByCallingPid(int i) {
        ProcessRecord findProcessByPid = findProcessByPid(i);
        if (findProcessByPid == null) {
            return 0;
        }
        return findProcessByPid.userId;
    }

    public void killAllByPackageName(String str) {
        synchronized (this.mProcessLock) {
            synchronized (this.mPidsSelfLocked) {
                ArrayList arrayList = new ArrayList(this.mPidsSelfLocked);
                int appId = BPackageManagerService.get().getAppId(str);
                for (ProcessRecord processRecord : this.mPidsSelfLocked) {
                    if (appId == BUserHandle.getAppId(processRecord.buid)) {
                        this.mProcessMap.remove(Integer.valueOf(processRecord.buid));
                        arrayList.remove(processRecord);
                        processRecord.kill();
                    }
                }
                this.mPidsSelfLocked.clear();
                this.mPidsSelfLocked.addAll(arrayList);
            }
        }
    }

    public void killPackageAsUser(String str, int i) {
        synchronized (this.mProcessLock) {
            int uid = BUserHandle.getUid(i, BPackageManagerService.get().getAppId(str));
            Map<String, ProcessRecord> map = this.mProcessMap.get(Integer.valueOf(uid));
            if (map == null) {
                return;
            }
            for (ProcessRecord processRecord : map.values()) {
                processRecord.kill();
                this.mPidsSelfLocked.remove(processRecord);
            }
            this.mProcessMap.remove(Integer.valueOf(uid));
        }
    }

    public void onProcessDie(ProcessRecord processRecord) {
        synchronized (this.mProcessLock) {
            processRecord.kill();
            Map<String, ProcessRecord> map = this.mProcessMap.get(Integer.valueOf(processRecord.buid));
            if (map != null) {
                map.remove(processRecord.processName);
                if (map.isEmpty()) {
                    this.mProcessMap.remove(Integer.valueOf(processRecord.buid));
                }
            }
            this.mPidsSelfLocked.remove(processRecord);
            removeProc(processRecord);
            BNotificationManagerService.get().deletePackageNotification(processRecord.getPackageName(), processRecord.userId);
        }
    }

    public void restartAppProcess(String str, String str2, int i) {
        synchronized (this.mProcessLock) {
            Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            if (findProcessByPid(callingPid) == null) {
                startProcessLocked(str, str2, i, parseBPid(getProcessName(BlackBoxCore.getContext(), callingPid)), callingPid);
            }
        }
    }

    public ProcessRecord startProcessLocked(String str, String str2, int i, int i2, int i3) {
        ApplicationInfo applicationInfo = BPackageManagerService.get().getApplicationInfo(str, 0, i);
        ProcessRecord processRecord = null;
        if (applicationInfo == null) {
            return null;
        }
        int uid = BUserHandle.getUid(i, BPackageManagerService.get().getAppId(str));
        synchronized (this.mProcessLock) {
            Map<String, ProcessRecord> map = this.mProcessMap.get(Integer.valueOf(uid));
            if (map == null) {
                map = new HashMap<>();
            }
            if (i2 == -1) {
                ProcessRecord processRecord2 = map.get(str2);
                if (processRecord2 != null) {
                    ConditionVariable conditionVariable = processRecord2.initLock;
                    if (conditionVariable != null) {
                        conditionVariable.block();
                    }
                    if (processRecord2.bActivityThread != null) {
                        return processRecord2;
                    }
                }
                i2 = getUsingBPidL();
                Slog.m20d(TAG, "init bUid = " + uid + ", bPid = " + i2);
            }
            if (i2 != -1) {
                ProcessRecord processRecord3 = new ProcessRecord(applicationInfo, str2);
                processRecord3.uid = Process.myUid();
                processRecord3.bpid = i2;
                processRecord3.buid = BPackageManagerService.get().getAppId(str);
                processRecord3.callingBUid = getBUidByPidOrPackageName(i3, str);
                processRecord3.userId = i;
                map.put(str2, processRecord3);
                this.mPidsSelfLocked.add(processRecord3);
                synchronized (this.mProcessMap) {
                    this.mProcessMap.put(Integer.valueOf(uid), map);
                }
                if (initAppProcessL(processRecord3)) {
                    processRecord3.pid = getPid(BlackBoxCore.getContext(), ProxyManifest.getProcessName(processRecord3.bpid));
                    processRecord = processRecord3;
                } else {
                    map.remove(str2);
                    this.mPidsSelfLocked.remove(processRecord3);
                }
                return processRecord;
            }
            throw new RuntimeException("No processes available");
        }
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
        FileUtils.deleteDir(BEnvironment.getProcDir());
    }
}
