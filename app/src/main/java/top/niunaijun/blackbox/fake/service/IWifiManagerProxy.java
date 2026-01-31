package top.niunaijun.blackbox.fake.service;

import android.net.wifi.WifiInfo;
import black.android.net.wifi.IWifiManagerStubStatic;
import black.android.net.wifi.WifiInfoContext;
import black.android.net.wifi.WifiSsidStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IWifiManagerProxy extends BinderInvocationStub {
    public static final String TAG = "IWifiManagerProxy";

    @ProxyMethod("getConnectionInfo")
    /* loaded from: classes3.dex */
    public static class GetConnectionInfo extends MethodHook {
        public static String intIP2StringIP(int i) {
            return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
        }

        public static int ip2Int(String str) {
            String[] split = str.split("\\.");
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                i |= Integer.parseInt(split[i2]) << (i2 * 8);
            }
            return i;
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            WifiInfo wifiInfo = (WifiInfo) method.invoke(obj, objArr);
            ((WifiInfoContext) BlackReflection.create(WifiInfoContext.class, wifiInfo, false))._set_mBSSID("ac:62:5a:82:65:c4");
            ((WifiInfoContext) BlackReflection.create(WifiInfoContext.class, wifiInfo, false))._set_mMacAddress("ac:62:5a:82:65:c4");
            ((WifiInfoContext) BlackReflection.create(WifiInfoContext.class, wifiInfo, false))._set_mWifiSsid(((WifiSsidStatic) BlackReflection.create(WifiSsidStatic.class, null, false)).createFromAsciiEncoded("BlackBox_Wifi"));
            return wifiInfo;
        }
    }

    public IWifiManagerProxy() {
        super(AbstractC0922a.m88a().getService("wifi"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IWifiManagerStubStatic) BlackReflection.create(IWifiManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("wifi"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("wifi");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
