package top.niunaijun.blackbox.fake.service;

import android.app.AppOpsManager;
import black.android.app.AppOpsManagerContext;
import black.com.android.internal.app.IAppOpsServiceStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IAppOpsManagerProxy extends BinderInvocationStub {

    @ProxyMethod("checkOperation")
    /* loaded from: classes3.dex */
    public static class CheckOperation extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastUid(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("checkPackage")
    /* loaded from: classes3.dex */
    public static class CheckPackage extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("noteOperation")
    /* loaded from: classes3.dex */
    public static class NoteOperation extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("noteProxyOperation")
    /* loaded from: classes3.dex */
    public static class NoteProxyOperation extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public IAppOpsManagerProxy() {
        super(AbstractC0922a.m88a().getService("appops"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IAppOpsServiceStubStatic) BlackReflection.create(IAppOpsServiceStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("appops"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        if (((AppOpsManagerContext) BlackReflection.create(AppOpsManagerContext.class, null, false))._check_mService() != null) {
            try {
                ((AppOpsManagerContext) BlackReflection.create(AppOpsManagerContext.class, (AppOpsManager) BlackBoxCore.getContext().getSystemService("appops"), false))._set_mService(getProxyInvocation());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        replaceSystemService("appops");
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        MethodParameterUtils.replaceLastUid(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
