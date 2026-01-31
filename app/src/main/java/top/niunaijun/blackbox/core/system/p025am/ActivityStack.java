package top.niunaijun.blackbox.core.system.p025am;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import black.android.app.IActivityManagerContext;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p007b.AbstractC0566b;
import p017g.AbstractC0927a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.BProcessManagerService;
import top.niunaijun.blackbox.core.system.ProcessRecord;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.core.system.p027pm.PackageManagerCompat;
import top.niunaijun.blackbox.proxy.ProxyActivity;
import top.niunaijun.blackbox.proxy.ProxyManifest;
import top.niunaijun.blackbox.proxy.record.ProxyActivityRecord;
import top.niunaijun.blackbox.utils.ComponentUtils;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: top.niunaijun.blackbox.core.system.am.ActivityStack */
/* loaded from: classes3.dex */
public class ActivityStack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int LAUNCH_TIME_OUT = 0;
    public static final String TAG = "ActivityStack";
    private final Map<Integer, TaskRecord> mTasks = new LinkedHashMap();
    private final Set<ActivityRecord> mLaunchingActivities = new HashSet();
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: top.niunaijun.blackbox.core.system.am.ActivityStack.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ActivityRecord activityRecord;
            if (message.what == 0 && (activityRecord = (ActivityRecord) message.obj) != null) {
                ActivityStack.this.mLaunchingActivities.remove(activityRecord);
            }
        }
    };
    private final ActivityManager mAms = (ActivityManager) BlackBoxCore.getContext().getSystemService("activity");

    private void deliverNewIntentLocked(ActivityRecord activityRecord, Intent intent) {
        try {
            activityRecord.processRecord.bActivityThread.handleNewIntent(activityRecord.token, intent);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private ActivityRecord findActivityRecordByComponentName(int i, ComponentName componentName) {
        ActivityRecord activityRecord = null;
        for (TaskRecord taskRecord : this.mTasks.values()) {
            if (i == taskRecord.userId) {
                Iterator<ActivityRecord> it = taskRecord.activities.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ActivityRecord next = it.next();
                        if (next.component.equals(componentName)) {
                            activityRecord = next;
                            break;
                        }
                    }
                }
            }
        }
        return activityRecord;
    }

    private ActivityRecord findActivityRecordByToken(int i, IBinder iBinder) {
        ActivityRecord activityRecord = null;
        if (iBinder != null) {
            for (TaskRecord taskRecord : this.mTasks.values()) {
                if (i == taskRecord.userId) {
                    Iterator<ActivityRecord> it = taskRecord.activities.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ActivityRecord next = it.next();
                            if (next.token == iBinder) {
                                activityRecord = next;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return activityRecord;
    }

    private TaskRecord findTaskRecordByTaskAffinityLocked(int i, String str) {
        synchronized (this.mTasks) {
            for (TaskRecord taskRecord : this.mTasks.values()) {
                if (i == taskRecord.userId && taskRecord.taskAffinity.equals(str)) {
                    return taskRecord;
                }
            }
            return null;
        }
    }

    private TaskRecord findTaskRecordByTokenLocked(int i, IBinder iBinder) {
        synchronized (this.mTasks) {
            for (TaskRecord taskRecord : this.mTasks.values()) {
                if (i == taskRecord.userId) {
                    for (ActivityRecord activityRecord : taskRecord.activities) {
                        if (activityRecord.token == iBinder) {
                            return taskRecord;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    private void finishAllActivity(int i) {
        for (TaskRecord taskRecord : this.mTasks.values()) {
            for (ActivityRecord activityRecord : taskRecord.activities) {
                if (activityRecord.userId == i && activityRecord.finished) {
                    try {
                        activityRecord.processRecord.bActivityThread.finishActivity(activityRecord.token);
                    } catch (RemoteException e) {
                    }
                }
            }
        }
    }

    private Intent getStartStubActivityIntentInner(Intent intent, int i, int i2, ProxyActivityRecord proxyActivityRecord, ActivityInfo activityInfo) {
        Resources resources;
        int i3;
        Intent intent2 = new Intent();
        TypedArray typedArray = null;
        try {
            resources = PackageManagerCompat.getResources(BlackBoxCore.getContext(), activityInfo.applicationInfo);
            i3 = activityInfo.theme;
            if (i3 == 0) {
                i3 = activityInfo.applicationInfo.theme;
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                intent2.setComponent(new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.getProxyActivity(i)));
            } finally {
                if (0 != 0) {
                    typedArray.recycle();
                }
            }
        }
        if (resources != null) {
            typedArray = resources.newTheme().obtainStyledAttributes(i3, AbstractC0927a.m84a().Window());
            boolean z = typedArray.getBoolean(AbstractC0927a.m84a().Window_windowIsTranslucent().intValue(), false);
            intent2.setComponent(z ? new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.TransparentProxyActivity(i)) : new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.getProxyActivity(i)));
            Slog.m20d(TAG, activityInfo + ", windowIsTranslucent: " + z);
            ProxyActivityRecord.saveStub(intent2, intent, proxyActivityRecord.mActivityInfo, proxyActivityRecord.mActivityRecord, proxyActivityRecord.mUserId);
            return intent2;
        }
        throw new AssertionError();
    }

    private ActivityRecord getTopActivityRecord() {
        synchronized (this.mTasks) {
            synchronizeTasks();
        }
        LinkedList linkedList = new LinkedList(this.mTasks.values());
        if (linkedList.isEmpty()) {
            return null;
        }
        return ((TaskRecord) linkedList.get(linkedList.size() - 1)).getTopActivityRecord();
    }

    private int realStartActivityLocked(IInterface iInterface, Intent intent, String str, IBinder iBinder, String str2, int i, int i2, Bundle bundle) {
        try {
            ((IActivityManagerContext) BlackReflection.create(IActivityManagerContext.class, AbstractC0566b.m166a().getDefault(), false)).startActivity(iInterface, BlackBoxCore.getHostPkg(), intent, str, iBinder, str2, i, i2 & (-3) & (-9) & (-5), null, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    private int startActivityInNewTaskLocked(int i, Intent intent, ActivityInfo activityInfo, IBinder iBinder, int i2) {
        Intent startActivityProcess = startActivityProcess(i, intent, activityInfo, newActivityRecord(intent, activityInfo, iBinder, i));
        startActivityProcess.addFlags(134217728);
        startActivityProcess.addFlags(524288);
        startActivityProcess.addFlags(268435456);
        startActivityProcess.addFlags(i2);
        BlackBoxCore.getContext().startActivity(startActivityProcess);
        return 0;
    }

    private int startActivityInSourceTask(Intent intent, String str, IBinder iBinder, String str2, int i, int i2, Bundle bundle, int i3, ActivityRecord activityRecord, ActivityInfo activityInfo, int i4) {
        Intent startActivityProcess = startActivityProcess(i3, intent, activityInfo, newActivityRecord(intent, activityInfo, iBinder, i3));
        startActivityProcess.setAction(UUID.randomUUID().toString());
        startActivityProcess.addFlags(i4);
        if (iBinder == null) {
            startActivityProcess.addFlags(268435456);
        }
        return realStartActivityLocked(activityRecord.processRecord.appThread, startActivityProcess, str, iBinder, str2, i, i2, bundle);
    }

    private Intent startActivityProcess(int i, Intent intent, ActivityInfo activityInfo, ActivityRecord activityRecord) {
        ProxyActivityRecord proxyActivityRecord = new ProxyActivityRecord(i, activityInfo, intent, activityRecord);
        ProcessRecord startProcessLocked = BProcessManagerService.get().startProcessLocked(activityInfo.packageName, activityInfo.processName, i, -1, Binder.getCallingPid());
        if (startProcessLocked != null) {
            return getStartStubActivityIntentInner(intent, startProcessLocked.bpid, i, proxyActivityRecord, activityInfo);
        }
        throw new RuntimeException("Unable to create process, name:" + activityInfo.name);
    }

    private void synchronizeTasks() {
        List<ActivityManager.RecentTaskInfo> recentTasks = this.mAms.getRecentTasks(100, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int size = recentTasks.size() - 1; size >= 0; size--) {
            ActivityManager.RecentTaskInfo recentTaskInfo = recentTasks.get(size);
            TaskRecord taskRecord = this.mTasks.get(Integer.valueOf(recentTaskInfo.id));
            if (taskRecord != null) {
                linkedHashMap.put(Integer.valueOf(recentTaskInfo.id), taskRecord);
            }
        }
        this.mTasks.clear();
        this.mTasks.putAll(linkedHashMap);
    }

    public boolean containsFlag(Intent intent, int i) {
        return (intent.getFlags() & i) != 0;
    }

    public ComponentName getCallingActivity(IBinder iBinder, int i) {
        ActivityRecord findActivityRecordByToken;
        synchronized (this.mTasks) {
            synchronizeTasks();
            ActivityRecord findActivityRecordByToken2 = findActivityRecordByToken(i, iBinder);
            return (findActivityRecordByToken2 == null || (findActivityRecordByToken = findActivityRecordByToken(i, findActivityRecordByToken2.resultTo)) == null) ? new ComponentName(BlackBoxCore.getHostPkg(), ProxyActivity.ActivityC1120P0.class.getName()) : findActivityRecordByToken.component;
        }
    }

    public String getCallingPackage(IBinder iBinder, int i) {
        ActivityRecord findActivityRecordByToken;
        synchronized (this.mTasks) {
            synchronizeTasks();
            ActivityRecord findActivityRecordByToken2 = findActivityRecordByToken(i, iBinder);
            return (findActivityRecordByToken2 == null || (findActivityRecordByToken = findActivityRecordByToken(i, findActivityRecordByToken2.resultTo)) == null) ? BlackBoxCore.getHostPkg() : findActivityRecordByToken.info.packageName;
        }
    }

    public ActivityRecord newActivityRecord(Intent intent, ActivityInfo activityInfo, IBinder iBinder, int i) {
        ActivityRecord create = ActivityRecord.create(intent, activityInfo, iBinder, i);
        synchronized (this.mLaunchingActivities) {
            this.mLaunchingActivities.add(create);
            this.mHandler.sendMessageDelayed(Message.obtain(this.mHandler, 0, create), 2000L);
        }
        return create;
    }

    public void onActivityCreated(ProcessRecord processRecord, int i, IBinder iBinder, ActivityRecord activityRecord) {
        synchronized (this.mLaunchingActivities) {
            this.mLaunchingActivities.remove(activityRecord);
            this.mHandler.removeMessages(0, activityRecord);
        }
        synchronized (this.mTasks) {
            synchronizeTasks();
            TaskRecord taskRecord = this.mTasks.get(Integer.valueOf(i));
            if (taskRecord == null) {
                taskRecord = new TaskRecord(i, activityRecord.userId, ComponentUtils.getTaskAffinity(activityRecord.info));
                taskRecord.rootIntent = activityRecord.intent;
                this.mTasks.put(Integer.valueOf(i), taskRecord);
            }
            activityRecord.token = iBinder;
            activityRecord.processRecord = processRecord;
            activityRecord.task = taskRecord;
            taskRecord.addTopActivity(activityRecord);
            Log.d(TAG, "onActivityCreated : " + activityRecord.component.toString());
        }
    }

    public void onActivityDestroyed(int i, IBinder iBinder) {
        synchronized (this.mTasks) {
            synchronizeTasks();
            ActivityRecord findActivityRecordByToken = findActivityRecordByToken(i, iBinder);
            if (findActivityRecordByToken == null) {
                return;
            }
            findActivityRecordByToken.finished = true;
            Log.d(TAG, "onActivityDestroyed : " + findActivityRecordByToken.component.toString());
            findActivityRecordByToken.task.removeActivity(findActivityRecordByToken);
        }
    }

    public void onActivityResumed(int i, IBinder iBinder) {
        synchronized (this.mTasks) {
            synchronizeTasks();
            ActivityRecord findActivityRecordByToken = findActivityRecordByToken(i, iBinder);
            if (findActivityRecordByToken == null) {
                return;
            }
            Log.d(TAG, "onActivityResumed : " + findActivityRecordByToken.component.toString());
            findActivityRecordByToken.task.removeActivity(findActivityRecordByToken);
            findActivityRecordByToken.task.addTopActivity(findActivityRecordByToken);
        }
    }

    public void onFinishActivity(int i, IBinder iBinder) {
        synchronized (this.mTasks) {
            synchronizeTasks();
            ActivityRecord findActivityRecordByToken = findActivityRecordByToken(i, iBinder);
            if (findActivityRecordByToken == null) {
                return;
            }
            findActivityRecordByToken.finished = true;
            Log.d(TAG, "onFinishActivity : " + findActivityRecordByToken.component.toString());
        }
    }

    public int startActivitiesLocked(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        if (intentArr != null) {
            if (strArr != null) {
                if (intentArr.length == strArr.length) {
                    for (int i2 = 0; i2 < intentArr.length; i2++) {
                        startActivityLocked(i, intentArr[i2], strArr[i2], iBinder, null, -1, 0, bundle);
                    }
                    return 0;
                }
                throw new IllegalArgumentException("intents are length different than resolvedTypes");
            }
            throw new NullPointerException("resolvedTypes is null");
        }
        throw new NullPointerException("intents is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cc A[LOOP:3: B:121:0x01c6->B:123:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int startActivityLocked(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle) {
        TaskRecord findTaskRecordByTaskAffinityLocked;
        IBinder iBinder2;
        TaskRecord taskRecord;
        boolean z;
        boolean z2;
        ActivityRecord topActivityRecord;
        synchronized (this.mTasks) {
            synchronizeTasks();
        }
        ResolveInfo resolveActivity = BPackageManagerService.get().resolveActivity(intent, 1, str, i);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            return 0;
        }
        Log.d(TAG, "startActivityLocked : " + resolveActivity.activityInfo);
        ActivityInfo activityInfo = resolveActivity.activityInfo;
        IBinder iBinder3 = iBinder;
        ActivityRecord findActivityRecordByToken = findActivityRecordByToken(i, iBinder3);
        if (findActivityRecordByToken == null) {
            iBinder3 = null;
        }
        TaskRecord taskRecord2 = findActivityRecordByToken != null ? findActivityRecordByToken.task : null;
        String taskAffinity = ComponentUtils.getTaskAffinity(activityInfo);
        boolean z3 = containsFlag(intent, 536870912) || activityInfo.launchMode == 1;
        boolean containsFlag = containsFlag(intent, 268435456);
        boolean containsFlag2 = containsFlag(intent, 67108864);
        boolean containsFlag3 = containsFlag(intent, 32768);
        switch (activityInfo.launchMode) {
            case 0:
            case 1:
            case 2:
                findTaskRecordByTaskAffinityLocked = findTaskRecordByTaskAffinityLocked(i, taskAffinity);
                if (findTaskRecordByTaskAffinityLocked == null && !containsFlag) {
                    findTaskRecordByTaskAffinityLocked = taskRecord2;
                    break;
                }
                break;
            case 3:
                findTaskRecordByTaskAffinityLocked = findTaskRecordByTaskAffinityLocked(i, taskAffinity);
                break;
            default:
                findTaskRecordByTaskAffinityLocked = null;
                break;
        }
        if (findTaskRecordByTaskAffinityLocked == null || findTaskRecordByTaskAffinityLocked.needNewTask()) {
            return startActivityInNewTaskLocked(i, intent, activityInfo, iBinder3, 0);
        }
        this.mAms.moveTaskToFront(findTaskRecordByTaskAffinityLocked.f245id, 0);
        if (!(containsFlag2 || z3 || containsFlag3) && ComponentUtils.intentFilterEquals(findTaskRecordByTaskAffinityLocked.rootIntent, intent) && findTaskRecordByTaskAffinityLocked.rootIntent.getFlags() == intent.getFlags()) {
            return 0;
        }
        ActivityRecord topActivityRecord2 = findTaskRecordByTaskAffinityLocked.getTopActivityRecord();
        ActivityRecord findActivityRecordByComponentName = findActivityRecordByComponentName(i, ComponentUtils.toComponentName(activityInfo));
        if (!containsFlag2 || findActivityRecordByComponentName == null) {
            iBinder2 = iBinder3;
            taskRecord = taskRecord2;
            z = containsFlag;
            findActivityRecordByComponentName = null;
        } else {
            synchronized (findActivityRecordByComponentName.task.activities) {
                int size = findActivityRecordByComponentName.task.activities.size() - 1;
                while (true) {
                    if (size < 0) {
                        iBinder2 = iBinder3;
                        taskRecord = taskRecord2;
                        z = containsFlag;
                    } else {
                        ActivityRecord activityRecord = findActivityRecordByComponentName.task.activities.get(size);
                        if (activityRecord != findActivityRecordByComponentName) {
                            activityRecord.finished = true;
                            Log.d(TAG, "makerFinish: " + activityRecord.component.toString());
                            size--;
                            taskRecord2 = taskRecord2;
                            iBinder3 = iBinder3;
                            containsFlag = containsFlag;
                        } else {
                            iBinder2 = iBinder3;
                            taskRecord = taskRecord2;
                            z = containsFlag;
                            if (!z3) {
                                findActivityRecordByComponentName.finished = true;
                            }
                        }
                    }
                }
                findActivityRecordByComponentName = null;
            }
        }
        if (z3 && !containsFlag2) {
            if (!ComponentUtils.intentFilterEquals(topActivityRecord2.intent, intent)) {
                synchronized (this.mLaunchingActivities) {
                    z2 = false;
                    for (ActivityRecord activityRecord2 : this.mLaunchingActivities) {
                        if (!activityRecord2.finished && activityRecord2.component.equals(intent.getComponent())) {
                            z2 = true;
                        }
                    }
                }
                if (activityInfo.launchMode == 2 && !containsFlag2) {
                    if (ComponentUtils.intentFilterEquals(topActivityRecord2.intent, intent)) {
                        ActivityRecord findActivityRecordByComponentName2 = findActivityRecordByComponentName(i, ComponentUtils.toComponentName(activityInfo));
                        if (findActivityRecordByComponentName2 != null) {
                            synchronized (findTaskRecordByTaskAffinityLocked.activities) {
                                boolean z4 = true;
                                int size2 = findTaskRecordByTaskAffinityLocked.activities.size() - 1;
                                while (size2 >= 0) {
                                    ActivityRecord activityRecord3 = findTaskRecordByTaskAffinityLocked.activities.get(size2);
                                    if (activityRecord3 != findActivityRecordByComponentName2) {
                                        activityRecord3.finished = z4;
                                        size2--;
                                        z4 = true;
                                    }
                                }
                            }
                            findActivityRecordByComponentName = findActivityRecordByComponentName2;
                        }
                    } else {
                        findActivityRecordByComponentName = topActivityRecord2;
                    }
                }
                if (activityInfo.launchMode == 3) {
                    findActivityRecordByComponentName = topActivityRecord2;
                }
                if (containsFlag3 && z) {
                    for (ActivityRecord activityRecord4 : findTaskRecordByTaskAffinityLocked.activities) {
                        activityRecord4.finished = true;
                    }
                }
                finishAllActivity(i);
                if (findActivityRecordByComponentName == null) {
                    deliverNewIntentLocked(findActivityRecordByComponentName, intent);
                    return 0;
                } else if (z2) {
                    return 0;
                } else {
                    return startActivityInSourceTask(intent, str, (iBinder2 != null ? taskRecord == null || (topActivityRecord = taskRecord.getTopActivityRecord()) == null : (topActivityRecord = findTaskRecordByTaskAffinityLocked.getTopActivityRecord()) == null) ? iBinder2 : topActivityRecord.token, str2, i2, i3, bundle, i, topActivityRecord2, activityInfo, 0);
                }
            }
            findActivityRecordByComponentName = topActivityRecord2;
        }
        z2 = false;
        if (activityInfo.launchMode == 2) {
            if (ComponentUtils.intentFilterEquals(topActivityRecord2.intent, intent)) {
            }
        }
        if (activityInfo.launchMode == 3) {
        }
        if (containsFlag3) {
            while (r1.hasNext()) {
            }
        }
        finishAllActivity(i);
        if (findActivityRecordByComponentName == null) {
        }
    }
}
