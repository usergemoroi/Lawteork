package top.niunaijun.blackbox.fake.service;

import black.android.view.accessibility.IAccessibilityManagerStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.user.BUserHandle;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethods;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IAccessibilityManagerProxy extends BinderInvocationStub {

    @ProxyMethods({"interrupt", "sendAccessibilityEvent", "addClient", "getInstalledAccessibilityServiceList", "getEnabledAccessibilityServiceList", "addAccessibilityInteractionConnection", "getWindowToken"})
    /* loaded from: classes3.dex */
    public static class ReplaceUserId extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                int length = objArr.length - 1;
                if (objArr[length] instanceof Integer) {
                    objArr[length] = Integer.valueOf(BUserHandle.getUserId(BlackBoxCore.getContext().getApplicationInfo().uid));
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    public IAccessibilityManagerProxy() {
        super(AbstractC0922a.m88a().getService("accessibility"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IAccessibilityManagerStubStatic) BlackReflection.create(IAccessibilityManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("accessibility"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("accessibility");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
