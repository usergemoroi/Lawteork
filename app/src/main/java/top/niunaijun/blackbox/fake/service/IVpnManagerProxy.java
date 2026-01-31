package top.niunaijun.blackbox.fake.service;

import black.android.net.IVpnManagerStubStatic;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.ScanClass;
import top.niunaijun.blackreflection.BlackReflection;
@ScanClass({VpnCommonProxy.class})
/* loaded from: classes3.dex */
public class IVpnManagerProxy extends BinderInvocationStub {
    public static final String TAG = "IVpnManagerProxy";
    public static final String VPN_MANAGEMENT_SERVICE = "vpn_management";

    public IVpnManagerProxy() {
        super(AbstractC0922a.m88a().getService(VPN_MANAGEMENT_SERVICE));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IVpnManagerStubStatic) BlackReflection.create(IVpnManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService(VPN_MANAGEMENT_SERVICE));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(VPN_MANAGEMENT_SERVICE);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
