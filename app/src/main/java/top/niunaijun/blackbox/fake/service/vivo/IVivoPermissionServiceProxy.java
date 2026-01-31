package top.niunaijun.blackbox.fake.service.vivo;

import android.os.Process;
import black.model.vivo.IVivoPermissionServiceStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IVivoPermissionServiceProxy extends BinderInvocationStub {

    @ProxyMethod("checkDelete")
    /* loaded from: classes3.dex */
    public static class checkDelete extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr[1] instanceof String) {
                objArr[1] = BlackBoxCore.getHostPkg();
            }
            MethodParameterUtils.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("checkPermission")
    /* loaded from: classes3.dex */
    public static class checkPermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (((Integer) objArr[2]).intValue() == Process.myUid()) {
                objArr[2] = Integer.valueOf(BlackBoxCore.getHostUid());
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getAppPermission")
    /* loaded from: classes3.dex */
    public static class getAppPermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("isBuildInThirdPartApp")
    /* loaded from: classes3.dex */
    public static class isBuildInThirdPartApp extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("isVivoImeiPkg")
    /* loaded from: classes3.dex */
    public static class isVivoImeiPkg extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("noteStartActivityProcess")
    /* loaded from: classes3.dex */
    public static class noteStartActivityProcess extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setAppPermission")
    /* loaded from: classes3.dex */
    public static class setAppPermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setBlackListApp")
    /* loaded from: classes3.dex */
    public static class setBlackListApp extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setOnePermission")
    /* loaded from: classes3.dex */
    public static class setOnePermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastUserId(objArr);
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setOnePermissionExt")
    /* loaded from: classes3.dex */
    public static class setOnePermissionExt extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastUserId(objArr);
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setWhiteListApp")
    /* loaded from: classes3.dex */
    public static class setWhiteListApp extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public IVivoPermissionServiceProxy() {
        super(AbstractC0922a.m88a().getService("vivo_permission_service"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IVivoPermissionServiceStubStatic) BlackReflection.create(IVivoPermissionServiceStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("vivo_permission_service"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("vivo_permission_service");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
