package top.niunaijun.blackbox.fake.service;

import android.app.ActivityManager;
import android.os.IBinder;
import black.android.app.ActivityClientContext;
import black.android.app.ActivityClientStatic;
import black.android.util.SingletonContext;
import java.lang.reflect.Method;
import top.niunaijun.blackbox.fake.frameworks.BActivityManager;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.fake.hook.ScanClass;
import top.niunaijun.blackbox.utils.compat.TaskDescriptionCompat;
import top.niunaijun.blackreflection.BlackReflection;
@ScanClass({ActivityManagerCommonProxy.class})
/* loaded from: classes3.dex */
public class IActivityClientProxy extends ClassInvocationStub {
    public static final String TAG = "IActivityClientProxy";
    private final Object who;

    @ProxyMethod("activityDestroyed")
    /* loaded from: classes3.dex */
    public static class ActivityDestroyed extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BActivityManager.get().onActivityDestroyed((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("activityResumed")
    /* loaded from: classes3.dex */
    public static class ActivityResumed extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BActivityManager.get().onActivityResumed((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("finishActivity")
    /* loaded from: classes3.dex */
    public static class FinishActivity extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BActivityManager.get().onFinishActivity((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setTaskDescription")
    /* loaded from: classes3.dex */
    public static class SetTaskDescription extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[1] = TaskDescriptionCompat.fix((ActivityManager.TaskDescription) objArr[1]);
            return method.invoke(obj, objArr);
        }
    }

    public IActivityClientProxy(Object obj) {
        this.who = obj;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getProxyInvocation() {
        return super.getProxyInvocation();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        Object obj = this.who;
        return obj != null ? obj : ((SingletonContext) BlackReflection.create(SingletonContext.class, ((ActivityClientContext) BlackReflection.create(ActivityClientContext.class, ((ActivityClientStatic) BlackReflection.create(ActivityClientStatic.class, null, false)).getInstance(), false)).INTERFACE_SINGLETON(), false)).get();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        ((SingletonContext) BlackReflection.create(SingletonContext.class, ((ActivityClientContext) BlackReflection.create(ActivityClientContext.class, ((ActivityClientStatic) BlackReflection.create(ActivityClientStatic.class, null, false)).getInstance(), false)).INTERFACE_SINGLETON(), false))._set_mInstance(obj2);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void onlyProxy(boolean z) {
        super.onlyProxy(z);
    }
}
