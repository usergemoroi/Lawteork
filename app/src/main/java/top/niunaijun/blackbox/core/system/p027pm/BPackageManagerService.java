package top.niunaijun.blackbox.core.system.p027pm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.p001pm.PackageParser;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Binder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.GmsCore;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.BProcessManagerService;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.ProcessRecord;
import top.niunaijun.blackbox.core.system.p027pm.BPackage;
import top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService;
import top.niunaijun.blackbox.core.system.user.BUserInfo;
import top.niunaijun.blackbox.core.system.user.BUserManagerService;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.entity.p029pm.InstallResult;
import top.niunaijun.blackbox.entity.p029pm.InstalledPackage;
import top.niunaijun.blackbox.utils.AbiUtils;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.PermissionUtils;
import top.niunaijun.blackbox.utils.ShellUtils;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.PackageParserCompat;
import top.niunaijun.blackbox.utils.compat.XposedParserCompat;
/* renamed from: top.niunaijun.blackbox.core.system.pm.BPackageManagerService */
/* loaded from: classes3.dex */
public class BPackageManagerService extends IBPackageManagerService.Stub implements ISystemService {
    public static final String TAG = "BPackageManagerService";
    public static BPackageManagerService sService = new BPackageManagerService();
    private static final BUserManagerService sUserManager = BUserManagerService.get();
    private final ComponentResolver mComponentResolver;
    private final Map<String, String[]> mDangerousPermissions;
    private final Map<String, ApplicationInfo> mFakeApps;
    final Object mInstallLock;
    private final BroadcastReceiver mPackageChangedHandler;
    private final List<PackageMonitor> mPackageMonitors;
    final Map<String, BPackageSettings> mPackages;
    private final Settings mSettings;

    public BPackageManagerService() {
        Settings settings = new Settings();
        this.mSettings = settings;
        this.mPackageMonitors = new ArrayList();
        this.mFakeApps = new HashMap();
        this.mDangerousPermissions = new HashMap();
        this.mPackages = settings.mPackages;
        this.mInstallLock = new Object();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: top.niunaijun.blackbox.core.system.pm.BPackageManagerService.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    BPackageManagerService.this.mSettings.scanPackage();
                }
            }
        };
        this.mPackageChangedHandler = broadcastReceiver;
        this.mComponentResolver = new ComponentResolver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        BlackBoxCore.getContext().registerReceiver(broadcastReceiver, intentFilter);
    }

    private ResolveInfo chooseBestActivity(Intent intent, String str, int i, List<ResolveInfo> list) {
        if (list != null) {
            int size = list.size();
            if (size != 1) {
                if (size <= 1) {
                    return null;
                }
                ResolveInfo resolveInfo = list.get(0);
                ResolveInfo resolveInfo2 = list.get(1);
                if (resolveInfo.priority == resolveInfo2.priority && resolveInfo.preferredOrder == resolveInfo2.preferredOrder && resolveInfo.isDefault == resolveInfo2.isDefault) {
                    return null;
                }
            }
            return list.get(0);
        }
        return null;
    }

    public static String fixProcessName(String str, String str2) {
        return str2 == null ? str : str2;
    }

    public static BPackageManagerService get() {
        return sService;
    }

    private ActivityInfo getActivity(ComponentName componentName, int i, int i2) {
        int updateFlags = updateFlags(i, i2);
        synchronized (this.mPackages) {
            BPackage.Activity activity = this.mComponentResolver.getActivity(componentName);
            if (activity != null) {
                BPackageSettings bPackageSettings = this.mSettings.mPackages.get(componentName.getPackageName());
                if (bPackageSettings == null) {
                    return null;
                }
                return PackageManagerCompat.generateActivityInfo(activity, updateFlags, bPackageSettings.readUserState(i2), i2);
            }
            return null;
        }
    }

    private List<ApplicationInfo> getInstalledApplicationsListInternal(int i, int i2, int i3) {
        ArrayList arrayList;
        if (sUserManager.exists(i2)) {
            synchronized (this.mPackages) {
                arrayList = new ArrayList(this.mPackages.size());
                for (BPackageSettings bPackageSettings : this.mPackages.values()) {
                    ApplicationInfo generateApplicationInfo = PackageManagerCompat.generateApplicationInfo(bPackageSettings.pkg, i, bPackageSettings.readUserState(i2), i2);
                    if (generateApplicationInfo != null) {
                        arrayList.add(generateApplicationInfo);
                    }
                }
                arrayList.addAll(this.mFakeApps.values());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private InstallResult installPackageAsUserLocked(String str, InstallOption installOption, int i) {
        StringBuilder sb;
        File file;
        long currentTimeMillis = System.currentTimeMillis();
        InstallResult installResult = new InstallResult();
        File file2 = null;
        try {
            BUserManagerService bUserManagerService = sUserManager;
            if (!bUserManagerService.exists(i)) {
                bUserManagerService.createUser(i);
            }
            if (installOption.isFlag(8)) {
                file = new File(BEnvironment.getCacheDir(), UUID.randomUUID().toString() + ".apk");
                try {
                    FileUtils.copyFile(BlackBoxCore.getContext().getContentResolver().openInputStream(Uri.parse(str)), file);
                } catch (Throwable th) {
                    th = th;
                    file2 = file;
                    try {
                        th.printStackTrace();
                        if (file2 != null && installOption.isFlag(8)) {
                            FileUtils.deleteDir(file2);
                        }
                        sb = new StringBuilder("install finish: ");
                        Slog.m20d(TAG, sb.append(System.currentTimeMillis() - currentTimeMillis).append("ms").toString());
                        return installResult;
                    } catch (Throwable th2) {
                        if (file2 != null && installOption.isFlag(8)) {
                            FileUtils.deleteDir(file2);
                        }
                        Slog.m20d(TAG, "install finish: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                        throw th2;
                    }
                }
            } else {
                file = new File(str);
            }
            File file3 = file;
            if (installOption.isFlag(4) && i != -4) {
                installResult = new InstallResult().installError("Please install the XP module in XP module management");
                if (installOption.isFlag(8)) {
                    FileUtils.deleteDir(file3);
                }
                sb = new StringBuilder("install finish: ");
            } else if (!installOption.isFlag(4) || XposedParserCompat.isXPModule(file3.getAbsolutePath())) {
                PackageInfo packageArchiveInfo = BlackBoxCore.getPackageManager().getPackageArchiveInfo(file3.getAbsolutePath(), 0);
                if (packageArchiveInfo == null) {
                    installResult = installResult.installError("getPackageArchiveInfo error.Please check whether APK is normal.");
                    if (installOption.isFlag(8)) {
                        FileUtils.deleteDir(file3);
                    }
                    sb = new StringBuilder("install finish: ");
                } else if (AbiUtils.isSupport(file3)) {
                    PackageParser.Package parserApk = parserApk(file3.getAbsolutePath());
                    if (parserApk == null) {
                        installResult = installResult.installError("parser apk error.");
                        if (installOption.isFlag(8)) {
                            FileUtils.deleteDir(file3);
                        }
                        sb = new StringBuilder("install finish: ");
                    } else {
                        installResult.packageName = parserApk.packageName;
                        if (installOption.isFlag(1)) {
                            parserApk.applicationInfo = BlackBoxCore.getPackageManager().getPackageInfo(parserApk.packageName, 0).applicationInfo;
                        }
                        BPackageSettings packageLPw = this.mSettings.getPackageLPw(parserApk.packageName, parserApk, installOption);
                        BProcessManagerService.get().killPackageAsUser(parserApk.packageName, i);
                        if (BPackageInstallerService.get().installPackageAsUser(packageLPw, i) < 0) {
                            installResult = installResult.installError("install apk error.");
                            if (installOption.isFlag(8)) {
                                FileUtils.deleteDir(file3);
                            }
                            sb = new StringBuilder("install finish: ");
                        } else {
                            synchronized (this.mPackages) {
                                packageLPw.setInstalled(true, i);
                                packageLPw.save();
                            }
                            this.mComponentResolver.removeAllComponents(packageLPw.pkg);
                            this.mComponentResolver.addAllComponents(packageLPw.pkg);
                            this.mSettings.scanPackage(parserApk.packageName);
                            onPackageInstalled(packageLPw.pkg.packageName, i);
                            if (installOption.isFlag(8)) {
                                FileUtils.deleteDir(file3);
                            }
                            sb = new StringBuilder("install finish: ");
                        }
                    }
                } else {
                    installResult = installResult.installError(packageArchiveInfo.packageName, (((Object) packageArchiveInfo.applicationInfo.loadLabel(BlackBoxCore.getPackageManager())) + "[" + packageArchiveInfo.packageName + "]") + ShellUtils.COMMAND_LINE_END + (BlackBoxCore.is64Bit() ? "The box does not support 32-bit Application" : "The box does not support 64-bit Application"));
                    if (installOption.isFlag(8)) {
                        FileUtils.deleteDir(file3);
                    }
                    sb = new StringBuilder("install finish: ");
                }
            } else {
                installResult = new InstallResult().installError("not a XP module");
                if (installOption.isFlag(8)) {
                    FileUtils.deleteDir(file3);
                }
                sb = new StringBuilder("install finish: ");
            }
        } catch (Throwable th3) {
            th = th3;
        }
        Slog.m20d(TAG, sb.append(System.currentTimeMillis() - currentTimeMillis).append("ms").toString());
        return installResult;
    }

    private PackageParser.Package parserApk(String str) {
        try {
            PackageParser createParser = PackageParserCompat.createParser(new File(str));
            PackageParser.Package parsePackage = PackageParserCompat.parsePackage(createParser, new File(str), 0);
            PackageParserCompat.collectCertificates(createParser, parsePackage, 0);
            return parsePackage;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private List<ResolveInfo> queryIntentServicesInternal(Intent intent, String str, int i, int i2) {
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ServiceInfo serviceInfo = getServiceInfo(component, i, i2);
            if (serviceInfo != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.serviceInfo = serviceInfo;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.mPackages) {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                return this.mComponentResolver.queryServices(intent2, str, i, i2);
            }
            BPackageSettings bPackageSettings = this.mPackages.get(str2);
            if (bPackageSettings == null) {
                return Collections.emptyList();
            }
            return this.mComponentResolver.queryServices(intent2, str, i, bPackageSettings.pkg.services, i2);
        }
    }

    private int updateFlags(int i, int i2) {
        return (i & 786432) != 0 ? i : i | 786432;
    }

    public void addPackageMonitor(PackageMonitor packageMonitor) {
        this.mPackageMonitors.add(packageMonitor);
    }

    public void analyzePackageLocked(BPackageSettings bPackageSettings) {
        synchronized (this.mDangerousPermissions) {
            Map<String, String[]> map = this.mDangerousPermissions;
            BPackage bPackage = bPackageSettings.pkg;
            map.put(bPackage.packageName, PermissionUtils.findDangerousPermissions(bPackage.requestedPermissions));
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public void clearPackage(String str, int i) {
        if (isInstalled(str, i)) {
            BProcessManagerService.get().killPackageAsUser(str, i);
            BPackageSettings bPackageSettings = this.mPackages.get(str);
            if (bPackageSettings == null) {
                return;
            }
            BPackageInstallerService.get().clearPackage(bPackageSettings, i);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public void deleteUser(int i) {
        synchronized (this.mPackages) {
            for (BPackageSettings bPackageSettings : this.mPackages.values()) {
                uninstallPackageAsUser(bPackageSettings.pkg.packageName, i);
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ActivityInfo getActivityInfo(ComponentName componentName, int i, int i2) {
        if (sUserManager.exists(i2)) {
            synchronized (this.mPackages) {
                BPackage.Activity activity = this.mComponentResolver.getActivity(componentName);
                if (activity != null) {
                    BPackageSettings bPackageSettings = this.mPackages.get(componentName.getPackageName());
                    if (bPackageSettings == null) {
                        return null;
                    }
                    return PackageManagerCompat.generateActivityInfo(activity, i, bPackageSettings.readUserState(i2), i2);
                }
                return null;
            }
        }
        return null;
    }

    public int getAppId(String str) {
        BPackageSettings bPackageSettings = this.mPackages.get(str);
        if (bPackageSettings != null) {
            return bPackageSettings.appId;
        }
        return -1;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ApplicationInfo getApplicationInfo(String str, int i, int i2) {
        if (sUserManager.exists(i2)) {
            if (this.mFakeApps.containsKey(str)) {
                return this.mFakeApps.get(str);
            }
            if (Objects.equals(str, BlackBoxCore.getHostPkg())) {
                try {
                    return BlackBoxCore.getPackageManager().getApplicationInfo(str, i);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            int updateFlags = updateFlags(i, i2);
            synchronized (this.mPackages) {
                BPackageSettings bPackageSettings = this.mPackages.get(str);
                if (bPackageSettings != null) {
                    return PackageManagerCompat.generateApplicationInfo(bPackageSettings.pkg, updateFlags, bPackageSettings.readUserState(i2), i2);
                }
                return null;
            }
        }
        return null;
    }

    public BPackageSettings getBPackageSetting(String str) {
        return this.mPackages.get(str);
    }

    public List<BPackageSettings> getBPackageSettings() {
        return new ArrayList(this.mPackages.values());
    }

    public String[] getDangerousPermissions(String str) {
        String[] strArr;
        synchronized (this.mDangerousPermissions) {
            strArr = this.mDangerousPermissions.get(str);
        }
        return strArr;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public List<ApplicationInfo> getInstalledApplications(int i, int i2) {
        return getInstalledApplicationsListInternal(i, i2, Binder.getCallingUid());
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public List<PackageInfo> getInstalledPackages(int i, int i2) {
        ArrayList arrayList;
        Binder.getCallingUid();
        if (sUserManager.exists(i2)) {
            synchronized (this.mPackages) {
                ArrayList arrayList2 = new ArrayList(this.mPackages.size());
                for (BPackageSettings bPackageSettings : this.mPackages.values()) {
                    PackageInfo packageInfo = getPackageInfo(bPackageSettings.pkg.packageName, i, i2);
                    if (packageInfo != null) {
                        arrayList2.add(packageInfo);
                    }
                }
                arrayList = new ArrayList(arrayList2);
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public List<InstalledPackage> getInstalledPackagesAsUser(int i) {
        ArrayList arrayList;
        if (sUserManager.exists(i)) {
            synchronized (this.mPackages) {
                arrayList = new ArrayList();
                for (BPackageSettings bPackageSettings : this.mPackages.values()) {
                    if (bPackageSettings.getInstalled(i) && !GmsCore.isGoogleAppOrService(bPackageSettings.pkg.packageName)) {
                        InstalledPackage installedPackage = new InstalledPackage();
                        installedPackage.userId = i;
                        installedPackage.packageName = bPackageSettings.pkg.packageName;
                        arrayList.add(installedPackage);
                    }
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public PackageInfo getPackageInfo(String str, int i, int i2) {
        BPackageSettings bPackageSettings;
        if (sUserManager.exists(i2)) {
            if (Objects.equals(str, BlackBoxCore.getHostPkg())) {
                try {
                    return BlackBoxCore.getPackageManager().getPackageInfo(str, i);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            int updateFlags = updateFlags(i, i2);
            synchronized (this.mPackages) {
                bPackageSettings = this.mPackages.get(str);
            }
            if (bPackageSettings != null) {
                return PackageManagerCompat.generatePackageInfo(bPackageSettings, updateFlags, bPackageSettings.readUserState(i2), i2);
            }
            return null;
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public String[] getPackagesForUid(int i, int i2) {
        String[] strArr;
        ProcessRecord findProcessByPid;
        if (sUserManager.exists(i2)) {
            synchronized (this.mPackages) {
                ArrayList arrayList = new ArrayList();
                for (BPackageSettings bPackageSettings : this.mPackages.values()) {
                    String str = bPackageSettings.pkg.packageName;
                    if (bPackageSettings.getInstalled(i2) && getAppId(str) == i) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty() && (findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid())) != null) {
                    arrayList.add(findProcessByPid.getPackageName());
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            return strArr;
        }
        return new String[0];
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ProviderInfo getProviderInfo(ComponentName componentName, int i, int i2) {
        if (sUserManager.exists(i2)) {
            synchronized (this.mPackages) {
                BPackage.Provider provider = this.mComponentResolver.getProvider(componentName);
                if (provider != null) {
                    BPackageSettings bPackageSettings = this.mPackages.get(componentName.getPackageName());
                    if (bPackageSettings == null) {
                        return null;
                    }
                    return PackageManagerCompat.generateProviderInfo(provider, i, bPackageSettings.readUserState(i2), i2);
                }
                return null;
            }
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ActivityInfo getReceiverInfo(ComponentName componentName, int i, int i2) {
        if (sUserManager.exists(i2)) {
            synchronized (this.mPackages) {
                BPackage.Activity receiver = this.mComponentResolver.getReceiver(componentName);
                if (receiver != null) {
                    BPackageSettings bPackageSettings = this.mPackages.get(componentName.getPackageName());
                    if (bPackageSettings == null) {
                        return null;
                    }
                    return PackageManagerCompat.generateActivityInfo(receiver, i, bPackageSettings.readUserState(i2), i2);
                }
                return null;
            }
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ServiceInfo getServiceInfo(ComponentName componentName, int i, int i2) {
        if (sUserManager.exists(i2)) {
            synchronized (this.mPackages) {
                BPackage.Service service = this.mComponentResolver.getService(componentName);
                if (service != null) {
                    BPackageSettings bPackageSettings = this.mPackages.get(componentName.getPackageName());
                    if (bPackageSettings == null) {
                        return null;
                    }
                    return PackageManagerCompat.generateServiceInfo(service, i, bPackageSettings.readUserState(i2), i2);
                }
                return null;
            }
        }
        return null;
    }

    public Settings getSettings() {
        return this.mSettings;
    }

    public void injectFakeApp(String str, ApplicationInfo applicationInfo) {
        this.mFakeApps.put(str, applicationInfo);
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public InstallResult installPackageAsUser(String str, InstallOption installOption, int i) {
        InstallResult installPackageAsUserLocked;
        synchronized (this.mInstallLock) {
            installPackageAsUserLocked = installPackageAsUserLocked(str, installOption, i);
        }
        return installPackageAsUserLocked;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public boolean isInstalled(String str, int i) {
        if (sUserManager.exists(i)) {
            synchronized (this.mPackages) {
                BPackageSettings bPackageSettings = this.mPackages.get(str);
                if (bPackageSettings == null) {
                    return false;
                }
                return bPackageSettings.getInstalled(i);
            }
        }
        return false;
    }

    public void onPackageInstalled(String str, int i) {
        for (PackageMonitor packageMonitor : this.mPackageMonitors) {
            packageMonitor.onPackageInstalled(str, i);
        }
        Slog.m20d(TAG, "onPackageInstalled: " + str + ", userId: " + i);
    }

    public void onPackageUninstalled(String str, boolean z, int i) {
        for (PackageMonitor packageMonitor : this.mPackageMonitors) {
            packageMonitor.onPackageUninstalled(str, z, i);
        }
        Slog.m20d(TAG, "onPackageUninstalled: " + str + ", userId: " + i);
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i, String str, int i2) {
        if (sUserManager.exists(i2)) {
            ComponentName component = intent.getComponent();
            if (component == null && intent.getSelector() != null) {
                intent = intent.getSelector();
                component = intent.getComponent();
            }
            Intent intent2 = intent;
            if (component != null) {
                ArrayList arrayList = new ArrayList(1);
                ActivityInfo receiverInfo = getReceiverInfo(component, i, i2);
                if (receiverInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = receiverInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            synchronized (this.mPackages) {
                BPackageSettings bPackageSettings = this.mPackages.get(intent2.getPackage());
                if (bPackageSettings == null) {
                    return this.mComponentResolver.queryReceivers(intent2, str, i, i2);
                }
                return this.mComponentResolver.queryReceivers(intent2, str, i, bPackageSettings.pkg.receivers, i2);
            }
        }
        return Collections.emptyList();
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public List<ProviderInfo> queryContentProviders(String str, int i, int i2, int i3) {
        if (sUserManager.exists(i3)) {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                return arrayList;
            }
            arrayList.addAll(this.mComponentResolver.queryProviders(str, (String) null, i2, i3));
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public List<ResolveInfo> queryIntentActivities(Intent intent, int i, String str, int i2) {
        List<ResolveInfo> list;
        if (sUserManager.exists(i2)) {
            String str2 = intent.getPackage();
            ComponentName component = intent.getComponent();
            if (component == null && intent.getSelector() != null) {
                intent = intent.getSelector();
                component = intent.getComponent();
            }
            Intent intent2 = intent;
            if (component != null) {
                ArrayList arrayList = new ArrayList(1);
                ActivityInfo activityInfo = getActivityInfo(component, i, i2);
                if (activityInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = activityInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            synchronized (this.mPackages) {
                if (str2 != null) {
                    BPackageSettings bPackageSettings = this.mPackages.get(str2);
                    if (bPackageSettings != null) {
                        list = this.mComponentResolver.queryActivities(intent2, str, i, bPackageSettings.pkg.activities, i2);
                    } else {
                        list = null;
                    }
                    if ((list == null || list.size() == 0) && list == null) {
                        list = new ArrayList<>();
                    }
                    return list;
                }
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public List<ResolveInfo> queryIntentServices(Intent intent, int i, int i2) {
        return queryIntentServicesInternal(intent, intent.resolveTypeIfNeeded(BlackBoxCore.getContext().getContentResolver()), i, i2);
    }

    public void removePackageMonitor(PackageMonitor packageMonitor) {
        this.mPackageMonitors.remove(packageMonitor);
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ResolveInfo resolveActivity(Intent intent, int i, String str, int i2) {
        if (sUserManager.exists(i2)) {
            return chooseBestActivity(intent, str, i, queryIntentActivities(intent, str, i, i2));
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ProviderInfo resolveContentProvider(String str, int i, int i2) {
        if (sUserManager.exists(i2)) {
            return this.mComponentResolver.queryProvider(str, i, i2);
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ResolveInfo resolveIntent(Intent intent, String str, int i, int i2) {
        if (sUserManager.exists(i2)) {
            return chooseBestActivity(intent, str, i, queryIntentActivities(intent, str, i, i2));
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public ResolveInfo resolveService(Intent intent, int i, String str, int i2) {
        List<ResolveInfo> queryIntentServicesInternal;
        if (sUserManager.exists(i2) && (queryIntentServicesInternal = queryIntentServicesInternal(intent, str, i, i2)) != null && queryIntentServicesInternal.size() >= 1) {
            return queryIntentServicesInternal.get(0);
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public void stopPackage(String str, int i) {
        BProcessManagerService.get().killPackageAsUser(str, i);
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
        this.mSettings.scanPackage();
        for (BPackageSettings bPackageSettings : this.mPackages.values()) {
            this.mComponentResolver.removeAllComponents(bPackageSettings.pkg);
            this.mComponentResolver.addAllComponents(bPackageSettings.pkg);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public void uninstallPackage(String str) {
        synchronized (this.mInstallLock) {
            synchronized (this.mPackages) {
                BPackageSettings bPackageSettings = this.mPackages.get(str);
                if (bPackageSettings == null) {
                    return;
                }
                BProcessManagerService.get().killAllByPackageName(str);
                if (bPackageSettings.installOption.isFlag(4)) {
                    for (BUserInfo bUserInfo : BUserManagerService.get().getAllUsers()) {
                        if (BPackageInstallerService.get().uninstallPackageAsUser(bPackageSettings, true, bUserInfo.f247id) >= 0) {
                            onPackageUninstalled(str, true, bUserInfo.f247id);
                        }
                    }
                } else {
                    for (Integer num : bPackageSettings.getUserIds()) {
                        if (BPackageInstallerService.get().uninstallPackageAsUser(bPackageSettings, true, num.intValue()) >= 0) {
                            onPackageUninstalled(str, true, num.intValue());
                        }
                    }
                }
                this.mSettings.removePackage(str);
                this.mComponentResolver.removeAllComponents(bPackageSettings.pkg);
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
    public void uninstallPackageAsUser(String str, int i) {
        synchronized (this.mInstallLock) {
            synchronized (this.mPackages) {
                BPackageSettings bPackageSettings = this.mPackages.get(str);
                if (bPackageSettings == null) {
                    return;
                }
                if (!bPackageSettings.installOption.isFlag(4) || i == -4) {
                    if (isInstalled(str, i)) {
                        boolean z = true;
                        if (bPackageSettings.getUserState().size() > 1) {
                            z = false;
                        }
                        BProcessManagerService.get().killPackageAsUser(str, i);
                        BPackageInstallerService.get().uninstallPackageAsUser(bPackageSettings, z, i);
                        if (z) {
                            this.mSettings.removePackage(str);
                            this.mComponentResolver.removeAllComponents(bPackageSettings.pkg);
                        } else {
                            bPackageSettings.removeUser(i);
                            bPackageSettings.save();
                        }
                        onPackageUninstalled(str, z, i);
                    }
                }
            }
        }
    }

    private List<ResolveInfo> queryIntentActivities(Intent intent, String str, int i, int i2) {
        List<ResolveInfo> queryActivities;
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ActivityInfo activity = getActivity(component, i, i2);
            if (activity != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = activity;
                arrayList.add(resolveInfo);
                return arrayList;
            }
        }
        synchronized (this.mPackages) {
            queryActivities = this.mComponentResolver.queryActivities(intent, str, i, i2);
        }
        return queryActivities;
    }
}
