package top.niunaijun.blackbox.fake.service;

import java.lang.reflect.Method;
import p016f.AbstractC0926a;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
/* loaded from: classes3.dex */
public class IPhoneSubInfoProxy extends ClassInvocationStub {
    public static final String TAG = "IPhoneSubInfoProxy";

    @ProxyMethod("getLine1NumberForSubscriber")
    /* loaded from: classes3.dex */
    public static class getLine1NumberForSubscriber extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    public IPhoneSubInfoProxy() {
        if (AbstractC0926a.m85a()._check_sServiceHandleCacheEnabled() != null) {
            AbstractC0926a.m85a()._set_sServiceHandleCacheEnabled(Boolean.TRUE);
        }
        if (AbstractC0926a.m85a()._check_getSubscriberInfoService() != null) {
            AbstractC0926a.m85a().getSubscriberInfoService();
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return AbstractC0926a.m85a().sIPhoneSubInfo();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        AbstractC0926a.m85a()._set_sIPhoneSubInfo(obj2);
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
