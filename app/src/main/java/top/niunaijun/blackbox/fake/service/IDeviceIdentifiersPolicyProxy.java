package top.niunaijun.blackbox.fake.service;

import black.android.p009os.IDeviceIdentifiersPolicyServiceStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.Md5Utils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IDeviceIdentifiersPolicyProxy extends BinderInvocationStub {

    @ProxyMethod("getSerialForPackage")
    /* renamed from: top.niunaijun.blackbox.fake.service.IDeviceIdentifiersPolicyProxy$x */
    /* loaded from: classes3.dex */
    public static class C1117x extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    public IDeviceIdentifiersPolicyProxy() {
        super(AbstractC0922a.m88a().getService("device_identifiers"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IDeviceIdentifiersPolicyServiceStubStatic) BlackReflection.create(IDeviceIdentifiersPolicyServiceStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("device_identifiers"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("device_identifiers");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
