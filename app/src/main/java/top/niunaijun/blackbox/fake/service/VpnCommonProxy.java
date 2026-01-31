package top.niunaijun.blackbox.fake.service;

import black.com.android.internal.net.VpnConfigContext;
import java.lang.reflect.Method;
import java.util.List;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.proxy.ProxyVpnService;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class VpnCommonProxy {

    @ProxyMethod("prepareVpn")
    /* loaded from: classes3.dex */
    public static class PrepareVpn extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("establishVpn")
    /* loaded from: classes3.dex */
    public static class establishVpn extends MethodHook {
        private void handlePackage(List<String> list) {
            if (list != null && list.contains(BActivityThread.getAppPackageName())) {
                list.add(BlackBoxCore.getHostPkg());
            }
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            VpnConfigContext vpnConfigContext = (VpnConfigContext) BlackReflection.create(VpnConfigContext.class, objArr[0], false);
            vpnConfigContext._set_user(ProxyVpnService.class.getName());
            handlePackage(vpnConfigContext.allowedApplications());
            handlePackage(vpnConfigContext.disallowedApplications());
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setVpnPackageAuthorization")
    /* loaded from: classes3.dex */
    public static class setVpnPackageAuthorization extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }
}
