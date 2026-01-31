package top.niunaijun.blackbox.fake.service;

import black.android.bluetooth.IBluetoothStubStatic;
import black.android.content.AttributionSourceContext;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackbox.utils.compat.ContextCompat;
import top.niunaijun.blackreflection.BlackReflection;
import top.niunaijun.blackreflection.utils.ClassUtil;
/* loaded from: classes3.dex */
public class IBluetoothProxy extends BinderInvocationStub {
    private static final String SERVER_NAME = "bluetooth_manager";

    @ProxyMethod("disable")
    /* loaded from: classes3.dex */
    public static class disable extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (!BuildCompat.isS()) {
                MethodParameterUtils.replaceFirstAppPkg(objArr);
            } else if (objArr != null && objArr.length > 0) {
                for (int i = 0; i < objArr.length; i++) {
                    if (ClassUtil.classReady(AttributionSourceContext.class).isInstance(objArr[i])) {
                        ContextCompat.fixAttributionSourceState(objArr[i], BlackBoxCore.getHostUid());
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("disableBle")
    /* loaded from: classes3.dex */
    public static class disableBle extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (!BuildCompat.isS()) {
                MethodParameterUtils.replaceFirstAppPkg(objArr);
            } else if (objArr != null && objArr.length > 0) {
                for (int i = 0; i < objArr.length; i++) {
                    if (ClassUtil.classReady(AttributionSourceContext.class).isInstance(objArr[i])) {
                        ContextCompat.fixAttributionSourceState(objArr[i], BlackBoxCore.getHostUid());
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("enable")
    /* loaded from: classes3.dex */
    public static class enable extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (!BuildCompat.isS()) {
                MethodParameterUtils.replaceFirstAppPkg(objArr);
            } else if (objArr != null && objArr.length > 0) {
                for (int i = 0; i < objArr.length; i++) {
                    if (ClassUtil.classReady(AttributionSourceContext.class).isInstance(objArr[i])) {
                        ContextCompat.fixAttributionSourceState(objArr[i], BlackBoxCore.getHostUid());
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("enableBle")
    /* loaded from: classes3.dex */
    public static class enableBle extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (!BuildCompat.isS()) {
                MethodParameterUtils.replaceFirstAppPkg(objArr);
            } else if (objArr != null && objArr.length > 0) {
                for (int i = 0; i < objArr.length; i++) {
                    if (ClassUtil.classReady(AttributionSourceContext.class).isInstance(objArr[i])) {
                        ContextCompat.fixAttributionSourceState(objArr[i], BlackBoxCore.getHostUid());
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("enableNoAutoConnect")
    /* loaded from: classes3.dex */
    public static class enableNoAutoConnect extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (!BuildCompat.isS()) {
                MethodParameterUtils.replaceFirstAppPkg(objArr);
            } else if (objArr != null && objArr.length > 0) {
                for (int i = 0; i < objArr.length; i++) {
                    if (ClassUtil.classReady(AttributionSourceContext.class).isInstance(objArr[i])) {
                        ContextCompat.fixAttributionSourceState(objArr[i], BlackBoxCore.getHostUid());
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("updateBleAppCount")
    /* loaded from: classes3.dex */
    public static class updateBleAppCount extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (!BuildCompat.isS()) {
                MethodParameterUtils.replaceFirstAppPkg(objArr);
            } else if (objArr != null && objArr.length > 0) {
                for (int i = 0; i < objArr.length; i++) {
                    if (ClassUtil.classReady(AttributionSourceContext.class).isInstance(objArr[i])) {
                        ContextCompat.fixAttributionSourceState(objArr[i], BlackBoxCore.getHostUid());
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    public IBluetoothProxy() {
        super(AbstractC0922a.m88a().getService(SERVER_NAME));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IBluetoothStubStatic) BlackReflection.create(IBluetoothStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService(SERVER_NAME));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(SERVER_NAME);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
