package top.niunaijun.blackbox.fake.service;

import black.android.net.IConnectivityManagerStubStatic;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.ScanClass;
import top.niunaijun.blackreflection.BlackReflection;
@ScanClass({VpnCommonProxy.class})
/* loaded from: classes3.dex */
public class IConnectivityManagerProxy extends BinderInvocationStub {
    public static final String TAG = "IConnectivityManagerProxy";

    public IConnectivityManagerProxy() {
        super(AbstractC0922a.m88a().getService("connectivity"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IConnectivityManagerStubStatic) BlackReflection.create(IConnectivityManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("connectivity"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("connectivity");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
