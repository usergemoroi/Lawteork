package top.niunaijun.blackbox.fake.service.context;

import black.android.content.IRestrictionsManagerStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class RestrictionsManagerStub extends BinderInvocationStub {

    @ProxyMethod("getApplicationRestrictions")
    /* loaded from: classes3.dex */
    public static class GetApplicationRestrictions extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[0] = BlackBoxCore.getHostPkg();
            return method.invoke(obj, objArr);
        }
    }

    public RestrictionsManagerStub() {
        super(AbstractC0922a.m88a().getService("restrictions"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IRestrictionsManagerStubStatic) BlackReflection.create(IRestrictionsManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("restrictions"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("restrictions");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
