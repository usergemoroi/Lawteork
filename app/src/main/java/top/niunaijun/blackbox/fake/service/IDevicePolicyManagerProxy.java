package top.niunaijun.blackbox.fake.service;

import android.content.ComponentName;
import black.android.app.admin.IDevicePolicyManagerStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IDevicePolicyManagerProxy extends BinderInvocationStub {

    @ProxyMethod("getDeviceOwnerComponent")
    /* loaded from: classes3.dex */
    public static class GetDeviceOwnerComponent extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return new ComponentName("", "");
        }
    }

    @ProxyMethod("getStorageEncryptionStatus")
    /* loaded from: classes3.dex */
    public static class GetStorageEncryptionStatus extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getDeviceOwnerName")
    /* loaded from: classes3.dex */
    public static class getDeviceOwnerName extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return "BlackBox";
        }
    }

    @ProxyMethod("getProfileOwnerName")
    /* loaded from: classes3.dex */
    public static class getProfileOwnerName extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return "BlackBox";
        }
    }

    @ProxyMethod("isDeviceProvisioned")
    /* loaded from: classes3.dex */
    public static class isDeviceProvisioned extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    public IDevicePolicyManagerProxy() {
        super(AbstractC0922a.m88a().getService("device_policy"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IDevicePolicyManagerStubStatic) BlackReflection.create(IDevicePolicyManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("device_policy"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("device_policy");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
