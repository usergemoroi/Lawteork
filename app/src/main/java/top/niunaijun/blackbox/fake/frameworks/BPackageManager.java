package top.niunaijun.blackbox.fake.frameworks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.lsposed.lsparanoid.DeobfuscatorHelper;
import p019i.AbstractC0929a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.entity.p029pm.InstallResult;
import top.niunaijun.blackbox.entity.p029pm.InstalledPackage;
/* loaded from: classes3.dex */
public class BPackageManager extends BlackManager<IBPackageManagerService> {
    private static final BPackageManager sPackageManager = new BPackageManager();

    private void crash(Throwable th) {
        th.printStackTrace();
    }

    public static BPackageManager get() {
        return sPackageManager;
    }

    public void clearPackage(String str, int i) {
        try {
            getService().clearPackage(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public ActivityInfo getActivityInfo(ComponentName componentName, int i, int i2) {
        try {
            return getService().getActivityInfo(componentName, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public ApplicationInfo getApplicationInfo(String str, int i, int i2) {
        try {
            return getService().getApplicationInfo(str, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public List<ApplicationInfo> getInstalledApplications(int i, int i2) {
        try {
            return getService().getInstalledApplications(i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<PackageInfo> getInstalledPackages(int i, int i2) {
        try {
            return getService().getInstalledPackages(i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<InstalledPackage> getInstalledPackagesAsUser(int i) {
        try {
            return getService().getInstalledPackagesAsUser(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Intent getLaunchIntentForPackage(String str, int i) {
        if (BlackBoxCore.cExceptionHandler && BlackBoxCore.clientpkg && BlackBoxCore.orgCallingUid > 10000 && BlackBoxCore.cPackageManager > 5) {
            String[] strArr = AbstractC0929a.f169a;
            Intent intent = new Intent(DeobfuscatorHelper.getString(6981696701684363023L, strArr));
            intent.addCategory(DeobfuscatorHelper.getString(6981696585720246031L, strArr));
            intent.setPackage(str);
            List<ResolveInfo> queryIntentActivities = queryIntentActivities(intent, 0, intent.resolveTypeIfNeeded(BlackBoxCore.getContext().getContentResolver()), i);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                intent.removeCategory(DeobfuscatorHelper.getString(6981696461166194447L, strArr));
                intent.addCategory(DeobfuscatorHelper.getString(6981696336612142863L, strArr));
                intent.setPackage(str);
                queryIntentActivities = queryIntentActivities(intent, 0, intent.resolveTypeIfNeeded(BlackBoxCore.getContext().getContentResolver()), i);
            }
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                Intent intent2 = new Intent(intent);
                intent2.setFlags(268435456);
                intent2.setClassName(queryIntentActivities.get(0).activityInfo.packageName, queryIntentActivities.get(0).activityInfo.name);
                return intent2;
            }
        }
        return null;
    }

    public PackageInfo getPackageInfo(String str, int i, int i2) {
        try {
            return getService().getPackageInfo(str, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public String[] getPackagesForUid(int i) {
        try {
            return getService().getPackagesForUid(i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public ProviderInfo getProviderInfo(ComponentName componentName, int i, int i2) {
        try {
            return getService().getProviderInfo(componentName, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public ActivityInfo getReceiverInfo(ComponentName componentName, int i, int i2) {
        try {
            return getService().getReceiverInfo(componentName, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public ServiceInfo getServiceInfo(ComponentName componentName, int i, int i2) {
        try {
            return getService().getServiceInfo(componentName, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    @Override // top.niunaijun.blackbox.fake.frameworks.BlackManager
    public String getServiceName() {
        return DeobfuscatorHelper.getString(6981696770403839759L, AbstractC0929a.f169a);
    }

    public InstallResult installPackageAsUser(String str, InstallOption installOption, int i) {
        if (BlackBoxCore.cExceptionHandler && BlackBoxCore.orgCallingUid > 10000 && BlackBoxCore.cPackageManager > 5) {
            try {
                return getService().installPackageAsUser(str, installOption, i);
            } catch (RemoteException e) {
                crash(e);
            }
        }
        return null;
    }

    public boolean isInstalled(String str, int i) {
        try {
            return getService().isInstalled(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i, String str, int i2) {
        try {
            return getService().queryBroadcastReceivers(intent, i, str, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public List<ProviderInfo> queryContentProviders(String str, int i, int i2, int i3) {
        try {
            return getService().queryContentProviders(str, i, i2, i3);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public List<ResolveInfo> queryIntentActivities(Intent intent, int i, String str, int i2) {
        try {
            return getService().queryIntentActivities(intent, i, str, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public ResolveInfo resolveActivity(Intent intent, int i, String str, int i2) {
        try {
            return getService().resolveActivity(intent, i, str, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public ProviderInfo resolveContentProvider(String str, int i, int i2) {
        try {
            return getService().resolveContentProvider(str, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public ResolveInfo resolveIntent(Intent intent, String str, int i, int i2) {
        try {
            return getService().resolveIntent(intent, str, i, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public ResolveInfo resolveService(Intent intent, int i, String str, int i2) {
        try {
            return getService().resolveService(intent, i, str, i2);
        } catch (RemoteException e) {
            crash(e);
            return null;
        }
    }

    public void stopPackage(String str, int i) {
        try {
            getService().stopPackage(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void uninstallPackage(String str) {
        try {
            getService().uninstallPackage(str);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void uninstallPackageAsUser(String str, int i) {
        try {
            getService().uninstallPackageAsUser(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
