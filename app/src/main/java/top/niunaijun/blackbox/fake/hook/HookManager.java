package top.niunaijun.blackbox.fake.hook;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.delegate.AppInstrumentation;
import top.niunaijun.blackbox.fake.service.BuildProxy;
import top.niunaijun.blackbox.fake.service.HCallbackProxy;
import top.niunaijun.blackbox.fake.service.IAccessibilityManagerProxy;
import top.niunaijun.blackbox.fake.service.IAccountManagerProxy;
import top.niunaijun.blackbox.fake.service.IActivityClientProxy;
import top.niunaijun.blackbox.fake.service.IActivityManagerProxy;
import top.niunaijun.blackbox.fake.service.IActivityTaskManagerProxy;
import top.niunaijun.blackbox.fake.service.IAlarmManagerProxy;
import top.niunaijun.blackbox.fake.service.IAppOpsManagerProxy;
import top.niunaijun.blackbox.fake.service.IAppWidgetManagerProxy;
import top.niunaijun.blackbox.fake.service.IAutofillManagerProxy;
import top.niunaijun.blackbox.fake.service.IBluetoothProxy;
import top.niunaijun.blackbox.fake.service.IConnectivityManagerProxy;
import top.niunaijun.blackbox.fake.service.IContextHubServiceProxy;
import top.niunaijun.blackbox.fake.service.IDeviceIdentifiersPolicyProxy;
import top.niunaijun.blackbox.fake.service.IDevicePolicyManagerProxy;
import top.niunaijun.blackbox.fake.service.IDisplayManagerProxy;
import top.niunaijun.blackbox.fake.service.IFingerprintManagerProxy;
import top.niunaijun.blackbox.fake.service.IGraphicsStatsProxy;
import top.niunaijun.blackbox.fake.service.IJobServiceProxy;
import top.niunaijun.blackbox.fake.service.ILauncherAppsProxy;
import top.niunaijun.blackbox.fake.service.ILocationManagerProxy;
import top.niunaijun.blackbox.fake.service.IMediaRouterServiceProxy;
import top.niunaijun.blackbox.fake.service.INetworkManagementServiceProxy;
import top.niunaijun.blackbox.fake.service.INotificationManagerProxy;
import top.niunaijun.blackbox.fake.service.IPackageManagerProxy;
import top.niunaijun.blackbox.fake.service.IPermissionManagerProxy;
import top.niunaijun.blackbox.fake.service.IPersistentDataBlockServiceProxy;
import top.niunaijun.blackbox.fake.service.IPhoneSubInfoProxy;
import top.niunaijun.blackbox.fake.service.IPowerManagerProxy;
import top.niunaijun.blackbox.fake.service.IShortcutManagerProxy;
import top.niunaijun.blackbox.fake.service.IStorageManagerProxy;
import top.niunaijun.blackbox.fake.service.IStorageStatsManagerProxy;
import top.niunaijun.blackbox.fake.service.ISystemUpdateProxy;
import top.niunaijun.blackbox.fake.service.ITelephonyManagerProxy;
import top.niunaijun.blackbox.fake.service.ITelephonyRegistryProxy;
import top.niunaijun.blackbox.fake.service.IUserManagerProxy;
import top.niunaijun.blackbox.fake.service.IVibratorServiceProxy;
import top.niunaijun.blackbox.fake.service.IWifiManagerProxy;
import top.niunaijun.blackbox.fake.service.IWifiScannerProxy;
import top.niunaijun.blackbox.fake.service.IWindowManagerProxy;
import top.niunaijun.blackbox.fake.service.context.ContentServiceStub;
import top.niunaijun.blackbox.fake.service.context.RestrictionsManagerStub;
import top.niunaijun.blackbox.fake.service.libcore.OsStub;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
/* loaded from: classes3.dex */
public class HookManager {
    public static final String TAG = "HookManager";
    private static final HookManager sHookManager = new HookManager();
    private final Map<Class<?>, IInjectHook> mInjectors = new HashMap();

    public static HookManager get() {
        return sHookManager;
    }

    public void addInjector(IInjectHook iInjectHook) {
        this.mInjectors.put(iInjectHook.getClass(), iInjectHook);
    }

    public void checkAll() {
        for (Class<?> cls : this.mInjectors.keySet()) {
            IInjectHook iInjectHook = this.mInjectors.get(cls);
            if (iInjectHook != null && iInjectHook.isBadEnv()) {
                Log.d(TAG, "checkEnv: " + cls.getSimpleName() + " is bad env");
                iInjectHook.injectHook();
            }
        }
    }

    public void checkEnv(Class<?> cls) {
        IInjectHook iInjectHook = this.mInjectors.get(cls);
        if (iInjectHook == null || !iInjectHook.isBadEnv()) {
            return;
        }
        Log.d(TAG, "checkEnv: " + cls.getSimpleName() + " is bad env");
        iInjectHook.injectHook();
    }

    public void init() {
        if (BlackBoxCore.get().isBlackProcess() || BlackBoxCore.get().isServerProcess()) {
            addInjector(new IDisplayManagerProxy());
            addInjector(new OsStub());
            addInjector(new IActivityManagerProxy());
            addInjector(new IPackageManagerProxy());
            addInjector(new ITelephonyManagerProxy());
            addInjector(new HCallbackProxy());
            addInjector(new IAppOpsManagerProxy());
            addInjector(new INotificationManagerProxy());
            addInjector(new IAlarmManagerProxy());
            addInjector(new IAppWidgetManagerProxy());
            addInjector(new ContentServiceStub());
            addInjector(new IWindowManagerProxy());
            addInjector(new IUserManagerProxy());
            addInjector(new RestrictionsManagerStub());
            addInjector(new ILocationManagerProxy());
            addInjector(new IStorageManagerProxy());
            addInjector(new ILauncherAppsProxy());
            addInjector(new IJobServiceProxy());
            addInjector(new IAccessibilityManagerProxy());
            addInjector(new ITelephonyRegistryProxy());
            addInjector(new IDevicePolicyManagerProxy());
            addInjector(new IAccountManagerProxy());
            addInjector(new IConnectivityManagerProxy());
            addInjector(new IPhoneSubInfoProxy());
            addInjector(new IMediaRouterServiceProxy());
            addInjector(new IPowerManagerProxy());
            addInjector(new IContextHubServiceProxy());
            addInjector(new IVibratorServiceProxy());
            addInjector(new IPersistentDataBlockServiceProxy());
            addInjector(new IBluetoothProxy());
            addInjector(new BuildProxy());
            addInjector(AppInstrumentation.get());
            addInjector(new IWifiManagerProxy());
            addInjector(new IWifiScannerProxy());
            if (BuildCompat.isS()) {
                addInjector(new IActivityClientProxy(null));
            }
            if (BuildCompat.isR()) {
                addInjector(new IPermissionManagerProxy());
            }
            if (BuildCompat.isQ()) {
                addInjector(new IActivityTaskManagerProxy());
            }
            if (BuildCompat.isPie()) {
                addInjector(new ISystemUpdateProxy());
            }
            if (BuildCompat.isOreo()) {
                addInjector(new IAutofillManagerProxy());
                addInjector(new IDeviceIdentifiersPolicyProxy());
                addInjector(new IStorageStatsManagerProxy());
            }
            if (BuildCompat.isN_MR1()) {
                addInjector(new IShortcutManagerProxy());
            }
            if (BuildCompat.isN()) {
                addInjector(new INetworkManagementServiceProxy());
            }
            if (BuildCompat.isM()) {
                addInjector(new IFingerprintManagerProxy());
                addInjector(new IGraphicsStatsProxy());
            }
            if (BuildCompat.isL()) {
                addInjector(new IJobServiceProxy());
            }
        }
        injectAll();
    }

    public void injectAll() {
        for (IInjectHook iInjectHook : this.mInjectors.values()) {
            try {
                Slog.m20d(TAG, "hook: " + iInjectHook);
                iInjectHook.injectHook();
            } catch (Exception e) {
                Slog.m20d(TAG, "hook error: " + iInjectHook);
            }
        }
    }
}
