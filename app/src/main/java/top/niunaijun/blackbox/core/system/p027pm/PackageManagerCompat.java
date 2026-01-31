package top.niunaijun.blackbox.core.system.p027pm;

import android.content.Context;
import android.content.p001pm.PackageParser;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SigningInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import black.android.content.p008pm.ApplicationInfoLContext;
import black.android.content.p008pm.PackageParserSigningDetailsContext;
import black.android.content.p008pm.SigningInfoStatic;
import black.android.content.res.AssetManagerContext;
import black.android.content.res.AssetManagerStatic;
import java.util.ArrayList;
import java.util.HashSet;
import p014d.AbstractC0921a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.env.AppSystemEnv;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.p027pm.BPackage;
import top.niunaijun.blackbox.utils.ArrayUtils;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: top.niunaijun.blackbox.core.system.pm.PackageManagerCompat */
/* loaded from: classes3.dex */
public class PackageManagerCompat {
    private static boolean checkUseInstalledOrHidden(int i, BPackageUserState bPackageUserState, ApplicationInfo applicationInfo) {
        return (AppSystemEnv.isBlackPackage(applicationInfo.packageName) || !bPackageUserState.installed || bPackageUserState.hidden) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (top.niunaijun.blackbox.utils.FileUtils.isExist("/system/framework/org.apache.http.legacy.jar") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void fixJar(ApplicationInfo applicationInfo) {
        HashSet hashSet = new HashSet();
        String str = BuildCompat.isQ() ? "/system/framework/org.apache.http.legacy.jar" : "/system/framework/org.apache.http.legacy.boot.jar";
        hashSet.add(str);
        applicationInfo.sharedLibraryFiles = (String[]) hashSet.toArray(new String[0]);
    }

    public static ActivityInfo generateActivityInfo(BPackage.Activity activity, int i, BPackageUserState bPackageUserState, int i2) {
        if (checkUseInstalledOrHidden(i, bPackageUserState, activity.info.applicationInfo)) {
            ActivityInfo activityInfo = new ActivityInfo(activity.info);
            activityInfo.metaData = activity.metaData;
            activityInfo.processName = BPackageManagerService.fixProcessName(activityInfo.packageName, activityInfo.processName);
            activityInfo.applicationInfo = generateApplicationInfo(activity.owner, i, bPackageUserState, i2);
            return activityInfo;
        }
        return null;
    }

    public static ApplicationInfo generateApplicationInfo(BPackage bPackage, int i, BPackageUserState bPackageUserState, int i2) {
        if (checkUseInstalledOrHidden(i, bPackageUserState, bPackage.applicationInfo)) {
            try {
                ApplicationInfo applicationInfo = BlackBoxCore.getPackageManager().getApplicationInfo(BlackBoxCore.getHostPkg(), i);
                String str = bPackage.baseCodePath;
                if (bPackage.applicationInfo == null) {
                    bPackage.applicationInfo = BlackBoxCore.getPackageManager().getPackageArchiveInfo(str, 0).applicationInfo;
                }
                ApplicationInfo applicationInfo2 = new ApplicationInfo(bPackage.applicationInfo);
                if ((i & 128) != 0) {
                    applicationInfo2.metaData = bPackage.mAppMetaData;
                }
                applicationInfo2.dataDir = BEnvironment.getDataDir(applicationInfo2.packageName, i2).getAbsolutePath();
                if (!bPackage.installOption.isFlag(1)) {
                    applicationInfo2.nativeLibraryDir = BEnvironment.getAppLibDir(applicationInfo2.packageName).getAbsolutePath();
                }
                applicationInfo2.processName = BPackageManagerService.fixProcessName(bPackage.packageName, applicationInfo2.packageName);
                applicationInfo2.publicSourceDir = str;
                applicationInfo2.sourceDir = str;
                applicationInfo2.uid = bPackage.mExtras.appId;
                if (BuildCompat.isL()) {
                    ((ApplicationInfoLContext) BlackReflection.create(ApplicationInfoLContext.class, applicationInfo2, false))._set_primaryCpuAbi(Build.CPU_ABI);
                    ((ApplicationInfoLContext) BlackReflection.create(ApplicationInfoLContext.class, applicationInfo2, false))._set_scanPublicSourceDir(((ApplicationInfoLContext) BlackReflection.create(ApplicationInfoLContext.class, applicationInfo, false)).scanPublicSourceDir());
                    ((ApplicationInfoLContext) BlackReflection.create(ApplicationInfoLContext.class, applicationInfo2, false))._set_scanSourceDir(((ApplicationInfoLContext) BlackReflection.create(ApplicationInfoLContext.class, applicationInfo, false)).scanSourceDir());
                }
                if (BuildCompat.isN()) {
                    applicationInfo2.deviceProtectedDataDir = BEnvironment.getDeDataDir(bPackage.packageName, i2).getAbsolutePath();
                    if (AbstractC0921a.m89a(applicationInfo2)._check_deviceEncryptedDataDir() != null) {
                        AbstractC0921a.m89a(applicationInfo2)._set_deviceEncryptedDataDir(applicationInfo2.deviceProtectedDataDir);
                    }
                    if (AbstractC0921a.m89a(applicationInfo2)._check_credentialEncryptedDataDir() != null) {
                        AbstractC0921a.m89a(applicationInfo2)._set_credentialEncryptedDataDir(applicationInfo2.dataDir);
                    }
                    if (AbstractC0921a.m89a(applicationInfo2)._check_deviceProtectedDataDir() != null) {
                        AbstractC0921a.m89a(applicationInfo2)._set_deviceProtectedDataDir(applicationInfo2.deviceProtectedDataDir);
                    }
                    if (AbstractC0921a.m89a(applicationInfo2)._check_credentialProtectedDataDir() != null) {
                        AbstractC0921a.m89a(applicationInfo2)._set_credentialProtectedDataDir(applicationInfo2.dataDir);
                    }
                }
                fixJar(applicationInfo2);
                return applicationInfo2;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public static InstrumentationInfo generateInstrumentationInfo(BPackage.Instrumentation instrumentation, int i) {
        if (instrumentation == null) {
            return null;
        }
        if ((i & 128) == 0) {
            return instrumentation.info;
        }
        InstrumentationInfo instrumentationInfo = new InstrumentationInfo(instrumentation.info);
        instrumentationInfo.metaData = instrumentation.metaData;
        return instrumentationInfo;
    }

    public static PackageInfo generatePackageInfo(BPackage bPackage, int i, long j, long j2, BPackageUserState bPackageUserState, int i2) {
        PackageInfo packageInfo;
        SigningInfo signingInfo;
        int i3;
        if (checkUseInstalledOrHidden(i, bPackageUserState, bPackage.applicationInfo)) {
            PackageInfo packageInfo2 = new PackageInfo();
            packageInfo2.packageName = bPackage.packageName;
            packageInfo2.versionCode = bPackage.mVersionCode;
            packageInfo2.versionName = bPackage.mVersionName;
            packageInfo2.sharedUserId = bPackage.mSharedUserId;
            packageInfo2.sharedUserLabel = bPackage.mSharedUserLabel;
            packageInfo2.applicationInfo = generateApplicationInfo(bPackage, i, bPackageUserState, i2);
            packageInfo2.firstInstallTime = j;
            packageInfo2.lastUpdateTime = j2;
            if (!bPackage.requestedPermissions.isEmpty()) {
                String[] strArr = new String[bPackage.requestedPermissions.size()];
                bPackage.requestedPermissions.toArray(strArr);
                packageInfo2.requestedPermissions = strArr;
            }
            if ((i & 256) != 0) {
                packageInfo2.gids = new int[0];
            }
            if ((i & 16384) != 0) {
                ArrayList<ConfigurationInfo> arrayList = bPackage.configPreferences;
                int size = arrayList != null ? arrayList.size() : 0;
                if (size > 0) {
                    ConfigurationInfo[] configurationInfoArr = new ConfigurationInfo[size];
                    packageInfo2.configPreferences = configurationInfoArr;
                    bPackage.configPreferences.toArray(configurationInfoArr);
                }
                ArrayList<FeatureInfo> arrayList2 = bPackage.reqFeatures;
                int size2 = arrayList2 != null ? arrayList2.size() : 0;
                if (size2 > 0) {
                    FeatureInfo[] featureInfoArr = new FeatureInfo[size2];
                    packageInfo2.reqFeatures = featureInfoArr;
                    bPackage.reqFeatures.toArray(featureInfoArr);
                }
            }
            if ((i & 1) != 0) {
                packageInfo2.activities = null;
                int size3 = bPackage.activities.size();
                if (size3 > 0) {
                    ActivityInfo[] activityInfoArr = new ActivityInfo[size3];
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size3) {
                        activityInfoArr[i5] = generateActivityInfo(bPackage.activities.get(i4), i, bPackageUserState, i2);
                        i4++;
                        i5++;
                    }
                    packageInfo2.activities = (ActivityInfo[]) ArrayUtils.trimToSize(activityInfoArr, i5);
                }
            }
            if ((i & 2) != 0) {
                packageInfo2.receivers = null;
                int size4 = bPackage.receivers.size();
                if (size4 > 0) {
                    ActivityInfo[] activityInfoArr2 = new ActivityInfo[size4];
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size4) {
                        activityInfoArr2[i7] = generateActivityInfo(bPackage.receivers.get(i6), i, bPackageUserState, i2);
                        i6++;
                        i7++;
                    }
                    packageInfo2.receivers = (ActivityInfo[]) ArrayUtils.trimToSize(activityInfoArr2, i7);
                }
            }
            if ((i & 4) != 0) {
                packageInfo2.services = null;
                int size5 = bPackage.services.size();
                if (size5 > 0) {
                    ServiceInfo[] serviceInfoArr = new ServiceInfo[size5];
                    int i8 = 0;
                    for (int i9 = 0; i9 < size5; i9++) {
                        ServiceInfo generateServiceInfo = generateServiceInfo(bPackage.services.get(i9), i, bPackageUserState, i2);
                        if (generateServiceInfo != null) {
                            if ((i & 128) == 0) {
                                i3 = i8 + 1;
                                serviceInfoArr[i8] = generateServiceInfo;
                            } else if (generateServiceInfo.metaData != null) {
                                i3 = i8 + 1;
                                serviceInfoArr[i8] = generateServiceInfo;
                            }
                            i8 = i3;
                        }
                    }
                    packageInfo2.services = (ServiceInfo[]) ArrayUtils.trimToSize(serviceInfoArr, i8);
                }
            }
            if ((i & 8) != 0) {
                packageInfo2.providers = null;
                int size6 = bPackage.providers.size();
                if (size6 > 0) {
                    ProviderInfo[] providerInfoArr = new ProviderInfo[size6];
                    int i10 = 0;
                    for (int i11 = 0; i11 < size6; i11++) {
                        ProviderInfo generateProviderInfo = generateProviderInfo(bPackage.providers.get(i11), i, bPackageUserState, i2);
                        if (generateProviderInfo != null) {
                            providerInfoArr[i10] = generateProviderInfo;
                            i10++;
                        }
                    }
                    packageInfo2.providers = (ProviderInfo[]) ArrayUtils.trimToSize(providerInfoArr, i10);
                }
            }
            if ((i & 16) != 0) {
                packageInfo2.instrumentation = null;
                int size7 = bPackage.instrumentation.size();
                if (size7 > 0) {
                    packageInfo2.instrumentation = new InstrumentationInfo[size7];
                    for (int i12 = 0; i12 < size7; i12++) {
                        packageInfo2.instrumentation[i12] = generateInstrumentationInfo(bPackage.instrumentation.get(i12), i);
                    }
                }
            }
            if ((i & 4096) != 0) {
                packageInfo2.permissions = null;
                int size8 = bPackage.permissions.size();
                if (size8 > 0) {
                    packageInfo2.permissions = new PermissionInfo[size8];
                    for (int i13 = 0; i13 < size8; i13++) {
                        packageInfo2.permissions[i13] = generatePermissionInfo(bPackage.permissions.get(i13), i);
                    }
                }
                packageInfo2.requestedPermissions = null;
                int size9 = bPackage.requestedPermissions.size();
                if (size9 > 0) {
                    packageInfo2.requestedPermissions = new String[size9];
                    packageInfo2.requestedPermissionsFlags = new int[size9];
                    for (int i14 = 0; i14 < size9; i14++) {
                        packageInfo2.requestedPermissions[i14] = bPackage.requestedPermissions.get(i14);
                    }
                }
            }
            try {
                packageInfo = BlackBoxCore.getContext().getPackageManager().getPackageInfo(bPackage.packageName, i);
            } catch (PackageManager.NameNotFoundException e) {
                packageInfo = null;
            }
            if ((i & 64) != 0) {
                if (packageInfo == null) {
                    packageInfo2.signatures = bPackage.mSignatures;
                } else {
                    packageInfo2.signatures = packageInfo.signatures;
                }
            }
            if (BuildCompat.isPie() && (i & 134217728) != 0) {
                if (packageInfo == null) {
                    PackageParser.SigningDetails signingDetails = PackageParser.SigningDetails.UNKNOWN;
                    ((PackageParserSigningDetailsContext) BlackReflection.create(PackageParserSigningDetailsContext.class, signingDetails, false))._set_signatures(bPackage.mSigningDetails.signatures);
                    signingInfo = ((SigningInfoStatic) BlackReflection.create(SigningInfoStatic.class, null, false))._new(signingDetails);
                } else {
                    signingInfo = packageInfo.signingInfo;
                }
                packageInfo2.signingInfo = signingInfo;
            }
            return packageInfo2;
        }
        return null;
    }

    public static PermissionInfo generatePermissionInfo(BPackage.Permission permission, int i) {
        if (permission == null) {
            return null;
        }
        if ((i & 128) == 0) {
            return permission.info;
        }
        PermissionInfo permissionInfo = new PermissionInfo(permission.info);
        permissionInfo.metaData = permission.metaData;
        return permissionInfo;
    }

    public static ProviderInfo generateProviderInfo(BPackage.Provider provider, int i, BPackageUserState bPackageUserState, int i2) {
        if (checkUseInstalledOrHidden(i, bPackageUserState, provider.info.applicationInfo)) {
            ProviderInfo providerInfo = new ProviderInfo(provider.info);
            if (providerInfo.authority == null) {
                return null;
            }
            providerInfo.metaData = provider.metaData;
            providerInfo.processName = BPackageManagerService.fixProcessName(providerInfo.packageName, providerInfo.processName);
            if ((i & 2048) == 0) {
                providerInfo.uriPermissionPatterns = null;
            }
            providerInfo.applicationInfo = generateApplicationInfo(provider.owner, i, bPackageUserState, i2);
            return providerInfo;
        }
        return null;
    }

    public static ServiceInfo generateServiceInfo(BPackage.Service service, int i, BPackageUserState bPackageUserState, int i2) {
        if (checkUseInstalledOrHidden(i, bPackageUserState, service.info.applicationInfo)) {
            ServiceInfo serviceInfo = new ServiceInfo(service.info);
            serviceInfo.metaData = service.metaData;
            serviceInfo.processName = BPackageManagerService.fixProcessName(serviceInfo.packageName, serviceInfo.processName);
            serviceInfo.applicationInfo = generateApplicationInfo(service.owner, i, bPackageUserState, i2);
            return serviceInfo;
        }
        return null;
    }

    public static Resources getResources(Context context, ApplicationInfo applicationInfo) {
        BPackageSettings bPackageSetting = BPackageManagerService.get().getBPackageSetting(applicationInfo.packageName);
        if (bPackageSetting != null) {
            AssetManager _new = ((AssetManagerStatic) BlackReflection.create(AssetManagerStatic.class, null, false))._new();
            ((AssetManagerContext) BlackReflection.create(AssetManagerContext.class, _new, false)).addAssetPath(bPackageSetting.pkg.baseCodePath);
            Resources resources = context.getResources();
            return new Resources(_new, resources.getDisplayMetrics(), resources.getConfiguration());
        }
        return null;
    }

    public static PackageInfo generatePackageInfo(BPackageSettings bPackageSettings, int i, BPackageUserState bPackageUserState, int i2) {
        BPackage bPackage;
        if (bPackageSettings != null && (bPackage = bPackageSettings.pkg) != null) {
            try {
                return generatePackageInfo(bPackage, i, 0L, 0L, bPackageUserState, i2);
            } catch (Throwable th) {
                return null;
            }
        }
        return null;
    }
}
