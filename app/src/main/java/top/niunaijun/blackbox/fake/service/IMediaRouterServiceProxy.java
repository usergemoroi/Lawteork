package top.niunaijun.blackbox.fake.service;

import black.android.media.IMediaRouterServiceStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IMediaRouterServiceProxy extends BinderInvocationStub {

    @ProxyMethod("registerClientAsUser")
    /* loaded from: classes3.dex */
    public static class registerClientAsUser extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerRouter2")
    /* loaded from: classes3.dex */
    public static class registerRouter2 extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public IMediaRouterServiceProxy() {
        super(AbstractC0922a.m88a().getService("media_router"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IMediaRouterServiceStubStatic) BlackReflection.create(IMediaRouterServiceStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("media_router"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("media_router");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
