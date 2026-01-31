package top.niunaijun.blackbox.fake.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007b.AbstractC0567c;
import p007b.AbstractC0568d;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.GmsCore;
import top.niunaijun.blackbox.core.env.AppSystemEnv;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.fake.service.base.PkgMethodProxy;
import top.niunaijun.blackbox.fake.service.base.ValueMethodProxy;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackbox.utils.Reflector;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackbox.utils.compat.ParceledListSliceCompat;
/* loaded from: classes3.dex */
public class IPackageManagerProxy extends BinderInvocationStub {
    public static final String TAG = "PackageManagerStub";

    @ProxyMethod("canRequestPackageInstalls")
    /* loaded from: classes3.dex */
    public static class CanRequestPackageInstalls extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getActivityInfo")
    /* loaded from: classes3.dex */
    public static class GetActivityInfo extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            ActivityInfo activityInfo = BlackBoxCore.getBPackageManager().getActivityInfo(componentName, MethodParameterUtils.toInt(objArr[1]), BActivityThread.getUserId());
            if (activityInfo != null) {
                return activityInfo;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getApplicationInfo")
    /* loaded from: classes3.dex */
    public static class GetApplicationInfo extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ApplicationInfo applicationInfo;
            String str = (String) objArr[0];
            if (BuildCompat.isT()) {
                applicationInfo = BlackBoxCore.getBPackageManager().getApplicationInfo(str, Math.toIntExact(((Long) objArr[1]).longValue()), BActivityThread.getUserId());
            } else {
                applicationInfo = BlackBoxCore.getBPackageManager().getApplicationInfo(str, ((Integer) objArr[1]).intValue(), BActivityThread.getUserId());
            }
            MethodParameterUtils.replaceLastUserId(objArr);
            if (applicationInfo != null) {
                return applicationInfo;
            }
            if (AppSystemEnv.isOpenPackage(str)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getInstalledApplications")
    /* loaded from: classes3.dex */
    public static class GetInstalledApplications extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BlackBoxCore.getBPackageManager().getInstalledApplications(MethodParameterUtils.toInt(objArr[0]), BActivityThread.getUserId()));
        }
    }

    @ProxyMethod("getInstalledPackages")
    /* loaded from: classes3.dex */
    public static class GetInstalledPackages extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BlackBoxCore.getBPackageManager().getInstalledPackages(MethodParameterUtils.toInt(objArr[0]), BActivityThread.getUserId()));
        }
    }

    @ProxyMethod("getInstallerPackageName")
    /* loaded from: classes3.dex */
    public static class GetInstallerPackageName extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return GmsCore.VENDING_PKG;
        }
    }

    @ProxyMethod("getPackageInfo")
    /* loaded from: classes3.dex */
    public static class GetPackageInfo extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str = (String) objArr[0];
            PackageInfo packageInfo = BlackBoxCore.getBPackageManager().getPackageInfo(str, MethodParameterUtils.toInt(objArr[1]), BActivityThread.getUserId());
            if (packageInfo != null) {
                return packageInfo;
            }
            if ("com.google.android.webview".equals(str) || "com.android.webview".equals(str)) {
                try {
                    return method.invoke(obj, objArr);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (AppSystemEnv.isOpenPackage(str)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getPackageUid")
    /* loaded from: classes3.dex */
    public static class GetPackageUid extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getPackagesForUid")
    /* loaded from: classes3.dex */
    public static class GetPackagesForUid extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == BlackBoxCore.getHostUid()) {
                Integer valueOf = Integer.valueOf(BActivityThread.getBUid());
                objArr[0] = valueOf;
                intValue = valueOf.intValue();
            }
            String[] packagesForUid = BlackBoxCore.getBPackageManager().getPackagesForUid(intValue);
            Slog.m20d(IPackageManagerProxy.TAG, objArr[0] + " , " + BActivityThread.getAppProcessName() + " GetPackagesForUid: " + Arrays.toString(packagesForUid));
            return packagesForUid;
        }
    }

    @ProxyMethod("getProviderInfo")
    /* loaded from: classes3.dex */
    public static class GetProviderInfo extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            ProviderInfo providerInfo = BlackBoxCore.getBPackageManager().getProviderInfo(componentName, MethodParameterUtils.toInt(objArr[1]), BActivityThread.getUserId());
            if (providerInfo != null) {
                return providerInfo;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getReceiverInfo")
    /* loaded from: classes3.dex */
    public static class GetReceiverInfo extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            ActivityInfo receiverInfo = BlackBoxCore.getBPackageManager().getReceiverInfo(componentName, MethodParameterUtils.toInt(objArr[1]), BActivityThread.getUserId());
            if (receiverInfo != null) {
                return receiverInfo;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getServiceInfo")
    /* loaded from: classes3.dex */
    public static class GetServiceInfo extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            ServiceInfo serviceInfo = BlackBoxCore.getBPackageManager().getServiceInfo(componentName, MethodParameterUtils.toInt(objArr[1]), BActivityThread.getUserId());
            if (serviceInfo != null) {
                return serviceInfo;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getSharedLibraries")
    /* loaded from: classes3.dex */
    public static class GetSharedLibraries extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(new ArrayList());
        }
    }

    @ProxyMethod("queryIntentReceivers")
    /* loaded from: classes3.dex */
    public static class QueryBroadcastReceivers extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            List<ResolveInfo> queryBroadcastReceivers = BlackBoxCore.getBPackageManager().queryBroadcastReceivers((Intent) MethodParameterUtils.getFirstParam(objArr, Intent.class), ((Integer) MethodParameterUtils.getFirstParam(objArr, Integer.class)).intValue(), (String) MethodParameterUtils.getFirstParam(objArr, String.class), BActivityThread.getUserId());
            Slog.m20d(IPackageManagerProxy.TAG, "queryIntentReceivers: " + queryBroadcastReceivers);
            return BuildCompat.isN() ? ParceledListSliceCompat.create(queryBroadcastReceivers) : queryBroadcastReceivers;
        }
    }

    @ProxyMethod("queryContentProviders")
    /* loaded from: classes3.dex */
    public static class QueryContentProviders extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BlackBoxCore.getBPackageManager().queryContentProviders(BActivityThread.getAppProcessName(), BActivityThread.getBUid(), MethodParameterUtils.toInt(objArr[2]), BActivityThread.getUserId()));
        }
    }

    @ProxyMethod("resolveContentProvider")
    /* loaded from: classes3.dex */
    public static class ResolveContentProvider extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ProviderInfo resolveContentProvider = BlackBoxCore.getBPackageManager().resolveContentProvider((String) objArr[0], MethodParameterUtils.toInt(objArr[1]), BActivityThread.getUserId());
            return resolveContentProvider == null ? method.invoke(obj, objArr) : resolveContentProvider;
        }
    }

    @ProxyMethod("resolveIntent")
    /* loaded from: classes3.dex */
    public static class ResolveIntent extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ResolveInfo resolveIntent = BlackBoxCore.getBPackageManager().resolveIntent((Intent) objArr[0], (String) objArr[1], MethodParameterUtils.toInt(objArr[2]), BActivityThread.getUserId());
            return resolveIntent != null ? resolveIntent : method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("resolveService")
    /* loaded from: classes3.dex */
    public static class ResolveService extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ResolveInfo resolveService = BlackBoxCore.getBPackageManager().resolveService((Intent) objArr[0], MethodParameterUtils.toInt(objArr[2]), (String) objArr[1], BActivityThread.getUserId());
            return resolveService != null ? resolveService : method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setComponentEnabledSetting")
    /* loaded from: classes3.dex */
    public static class SetComponentEnabledSetting extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("getComponentEnabledSetting")
    /* loaded from: classes3.dex */
    public static class getComponentEnabledSetting extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ComponentName componentName = (ComponentName) objArr[0];
            if (BlackBoxCore.getBPackageManager().getApplicationInfo(componentName.getPackageName(), 0, BActivityThread.getUserId()) != null) {
                return 0;
            }
            if (AppSystemEnv.isOpenPackage(componentName)) {
                return method.invoke(obj, objArr);
            }
            throw new IllegalArgumentException();
        }
    }

    public IPackageManagerProxy() {
        super(AbstractC0567c.m165a().sPackageManager().asBinder());
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return AbstractC0567c.m165a().sPackageManager();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        AbstractC0567c.m165a()._set_sPackageManager(obj2);
        replaceSystemService("package");
        PackageManager mPackageManager = AbstractC0568d.m163a(AbstractC0567c.m164a(BlackBoxCore.mainThread()).getSystemContext()).mPackageManager();
        if (mPackageManager != null) {
            try {
                Reflector.m28on("android.app.ApplicationPackageManager").field("mPM").set(mPackageManager, obj2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // top.niunaijun.blackbox.fake.hook.BinderInvocationStub, top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new ValueMethodProxy("addOnPermissionsChangeListener", 0));
        addMethodHook(new ValueMethodProxy("removeOnPermissionsChangeListener", 0));
        addMethodHook(new PkgMethodProxy("shouldShowRequestPermissionRationale"));
        if (BuildCompat.isT()) {
            return;
        }
        addMethodHook(new PkgMethodProxy("clearPackagePreferredActivities"));
    }
}
