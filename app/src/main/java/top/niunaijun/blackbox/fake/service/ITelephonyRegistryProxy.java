package top.niunaijun.blackbox.fake.service;

import black.com.android.internal.telephony.ITelephonyRegistryStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ITelephonyRegistryProxy extends BinderInvocationStub {

    @ProxyMethod("listen")
    /* loaded from: classes3.dex */
    public static class Listen extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("listenForSubscriber")
    /* loaded from: classes3.dex */
    public static class ListenForSubscriber extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public ITelephonyRegistryProxy() {
        super(AbstractC0922a.m88a().getService("telephony.registry"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((ITelephonyRegistryStubStatic) BlackReflection.create(ITelephonyRegistryStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("telephony.registry"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("telephony.registry");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
