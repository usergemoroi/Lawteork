package top.niunaijun.blackbox.fake.service;

import android.app.job.JobInfo;
import black.android.app.job.IJobSchedulerStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IJobServiceProxy extends BinderInvocationStub {
    public static final String TAG = "JobServiceStub";

    @ProxyMethod("cancel")
    /* loaded from: classes3.dex */
    public static class Cancel extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr == null || objArr.length == 0 || (obj2 = objArr[0]) == null) {
                BlackBoxCore.getBJobManager().cancelAll(BActivityThread.getAppConfig().processName);
                return obj.getClass().getMethod("cancelAll", new Class[0]).invoke(obj, new Object[0]);
            }
            BlackBoxCore.getBJobManager().cancel(BActivityThread.getAppConfig().processName, ((Integer) obj2).intValue());
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("cancelAll")
    /* loaded from: classes3.dex */
    public static class CancelAll extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (BActivityThread.getAppConfig() != null) {
                BlackBoxCore.getBJobManager().cancelAll(BActivityThread.getAppConfig().processName);
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("enqueue")
    /* loaded from: classes3.dex */
    public static class Enqueue extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            JobInfo schedule;
            JobInfo jobInfo = (JobInfo) objArr[0];
            if (jobInfo != null && (schedule = BlackBoxCore.getBJobManager().schedule(jobInfo)) != null) {
                objArr[0] = schedule;
                Object invoke = method.invoke(obj, objArr);
                if (invoke instanceof Integer) {
                    return invoke;
                }
            }
            return 0;
        }
    }

    @ProxyMethod("schedule")
    /* loaded from: classes3.dex */
    public static class Schedule extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            JobInfo jobInfo = (JobInfo) objArr[0];
            if (jobInfo == null) {
                return 0;
            }
            JobInfo schedule = BlackBoxCore.getBJobManager().schedule(jobInfo);
            if (schedule != null) {
                objArr[0] = schedule;
            }
            return method.invoke(obj, objArr);
        }
    }

    public IJobServiceProxy() {
        super(AbstractC0922a.m88a().getService("jobscheduler"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IJobSchedulerStubStatic) BlackReflection.create(IJobSchedulerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("jobscheduler"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("jobscheduler");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
