package top.niunaijun.blackbox.fake.service;

import black.android.hardware.display.DisplayManagerGlobalContext;
import black.android.hardware.display.DisplayManagerGlobalStatic;
import java.lang.reflect.Method;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IDisplayManagerProxy extends ClassInvocationStub {

    @ProxyMethod("createVirtualDisplay")
    /* loaded from: classes3.dex */
    public static class CreateVirtualDisplay extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public String getMethodName() {
            return "createVirtualDisplay";
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((DisplayManagerGlobalContext) BlackReflection.create(DisplayManagerGlobalContext.class, ((DisplayManagerGlobalStatic) BlackReflection.create(DisplayManagerGlobalStatic.class, null, false)).getInstance(), false)).mDm();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        ((DisplayManagerGlobalContext) BlackReflection.create(DisplayManagerGlobalContext.class, ((DisplayManagerGlobalStatic) BlackReflection.create(DisplayManagerGlobalStatic.class, null, false)).getInstance(), false))._set_mDm(getProxyInvocation());
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return ((DisplayManagerGlobalContext) BlackReflection.create(DisplayManagerGlobalContext.class, ((DisplayManagerGlobalStatic) BlackReflection.create(DisplayManagerGlobalStatic.class, null, false)).getInstance(), false)).mDm() != getProxyInvocation();
    }
}
