package top.niunaijun.blackbox.fake.service;

import android.content.Intent;
import black.android.content.p008pm.IShortcutServiceStubStatic;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.fake.service.base.PkgMethodProxy;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackbox.utils.compat.ParceledListSliceCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IShortcutManagerProxy extends BinderInvocationStub {

    @ProxyMethod("addDynamicShortcuts")
    /* loaded from: classes3.dex */
    public static class AddDynamicShortcuts extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("createShortcutResultIntent")
    /* loaded from: classes3.dex */
    public static class CreateShortcutResultIntent extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return new Intent();
        }
    }

    @ProxyMethod("requestPinShortcut")
    /* loaded from: classes3.dex */
    public static class RequestPinShortcut extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("setDynamicShortcuts")
    /* loaded from: classes3.dex */
    public static class SetDynamicShortcuts extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("pushDynamicShortcut")
    /* loaded from: classes3.dex */
    public static class pushDynamicShortcut extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public IShortcutManagerProxy() {
        super(AbstractC0922a.m88a().getService("shortcut"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IShortcutServiceStubStatic) BlackReflection.create(IShortcutServiceStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("shortcut"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("shortcut");
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceAllAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // top.niunaijun.blackbox.fake.hook.BinderInvocationStub, top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new PkgMethodProxy("getShortcuts"));
        addMethodHook(new PkgMethodProxy("disableShortcuts"));
        addMethodHook(new PkgMethodProxy("enableShortcuts"));
        addMethodHook(new PkgMethodProxy("getRemainingCallCount"));
        addMethodHook(new PkgMethodProxy("getRateLimitResetTime"));
        addMethodHook(new PkgMethodProxy("getIconMaxDimensions"));
        addMethodHook(new PkgMethodProxy("getMaxShortcutCountPerActivity"));
        addMethodHook(new PkgMethodProxy("reportShortcutUsed"));
        addMethodHook(new PkgMethodProxy("onApplicationActive"));
        addMethodHook(new PkgMethodProxy("hasShortcutHostPermission"));
        addMethodHook(new PkgMethodProxy("removeAllDynamicShortcuts"));
        addMethodHook(new PkgMethodProxy("removeDynamicShortcuts"));
        addMethodHook(new PkgMethodProxy("removeLongLivedShortcuts"));
        addMethodHook(new PkgMethodProxy("getManifestShortcuts") { // from class: top.niunaijun.blackbox.fake.service.IShortcutManagerProxy.1
            @Override // top.niunaijun.blackbox.fake.service.base.PkgMethodProxy, top.niunaijun.blackbox.fake.hook.MethodHook
            public Object hook(Object obj, Method method, Object[] objArr) {
                return ParceledListSliceCompat.create(new ArrayList());
            }
        });
    }
}
