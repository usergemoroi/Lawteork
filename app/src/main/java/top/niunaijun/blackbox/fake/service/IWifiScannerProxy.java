package top.niunaijun.blackbox.fake.service;

import black.android.net.wifi.IWifiManagerStubStatic;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IWifiScannerProxy extends BinderInvocationStub {
    public IWifiScannerProxy() {
        super(AbstractC0922a.m88a().getService("wifiscanner"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IWifiManagerStubStatic) BlackReflection.create(IWifiManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("wifiscanner"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("wifiscanner");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
