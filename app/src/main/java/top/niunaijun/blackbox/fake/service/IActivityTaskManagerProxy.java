package top.niunaijun.blackbox.fake.service;

import android.app.ActivityManager;
import black.android.app.ActivityTaskManagerStatic;
import black.android.app.IActivityTaskManagerStubStatic;
import black.android.util.SingletonContext;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.fake.hook.ScanClass;
import top.niunaijun.blackbox.utils.compat.TaskDescriptionCompat;
import top.niunaijun.blackreflection.BlackReflection;
@ScanClass({ActivityManagerCommonProxy.class})
/* loaded from: classes3.dex */
public class IActivityTaskManagerProxy extends BinderInvocationStub {
    public static final String TAG = "ActivityTaskManager";

    @ProxyMethod("setTaskDescription")
    /* loaded from: classes3.dex */
    public static class SetTaskDescription extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[1] = TaskDescriptionCompat.fix((ActivityManager.TaskDescription) objArr[1]);
            return method.invoke(obj, objArr);
        }
    }

    public IActivityTaskManagerProxy() {
        super(AbstractC0922a.m88a().getService("activity_task"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IActivityTaskManagerStubStatic) BlackReflection.create(IActivityTaskManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("activity_task"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("activity_task");
        ((ActivityTaskManagerStatic) BlackReflection.create(ActivityTaskManagerStatic.class, null, false)).getService();
        ((SingletonContext) BlackReflection.create(SingletonContext.class, ((ActivityTaskManagerStatic) BlackReflection.create(ActivityTaskManagerStatic.class, null, false)).IActivityTaskManagerSingleton(), false))._set_mInstance(((IActivityTaskManagerStubStatic) BlackReflection.create(IActivityTaskManagerStubStatic.class, null, false)).asInterface(this));
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
