package top.niunaijun.blackbox.fake.service;

import black.android.view.IGraphicsStatsStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IGraphicsStatsProxy extends BinderInvocationStub {

    @ProxyMethod("requestBufferForProcess")
    /* loaded from: classes3.dex */
    public static class RequestBufferForProcess extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public IGraphicsStatsProxy() {
        super(AbstractC0922a.m88a().getService("graphicsstats"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IGraphicsStatsStubStatic) BlackReflection.create(IGraphicsStatsStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("graphicsstats"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("graphicsstats");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
