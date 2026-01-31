package top.niunaijun.blackbox.core.system.p027pm;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import androidx.core.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService;
import top.niunaijun.blackbox.entity.p029pm.InstalledModule;
import top.niunaijun.blackbox.entity.p029pm.XposedConfig;
import top.niunaijun.blackbox.utils.CloseUtils;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.compat.XposedParserCompat;
/* renamed from: top.niunaijun.blackbox.core.system.pm.BXposedManagerService */
/* loaded from: classes3.dex */
public class BXposedManagerService extends IBXposedManagerService.Stub implements ISystemService, PackageMonitor {
    private static final BXposedManagerService sService = new BXposedManagerService();
    private BPackageManagerService mPms;
    private XposedConfig mXposedConfig;
    private final Object mLock = new Object();
    private final Map<String, InstalledModule> mCacheModule = new HashMap();

    public static BXposedManagerService get() {
        return sService;
    }

    private void loadModuleStateLr() {
        File xPModuleConf = BEnvironment.getXPModuleConf();
        if (!xPModuleConf.exists()) {
            this.mXposedConfig = new XposedConfig();
            saveModuleStateLw();
            return;
        }
        Parcel parcel = null;
        try {
            try {
                parcel = FileUtils.readToParcel(xPModuleConf);
                this.mXposedConfig = new XposedConfig(parcel);
                if (parcel == null) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (parcel == null) {
                    return;
                }
            }
            parcel.recycle();
        } catch (Throwable th) {
            if (parcel != null) {
                parcel.recycle();
            }
            throw th;
        }
    }

    private void saveModuleStateLw() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(BEnvironment.getXPModuleConf());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                this.mXposedConfig.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                fileOutputStream = atomicFile.startWrite();
                FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
                obtain.recycle();
                CloseUtils.close(fileOutputStream);
            } catch (Exception e) {
                atomicFile.failWrite(fileOutputStream);
                obtain.recycle();
                CloseUtils.close(fileOutputStream);
            }
        } catch (Throwable th) {
            obtain.recycle();
            CloseUtils.close(fileOutputStream);
            throw th;
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
    public List<InstalledModule> getInstalledModules() {
        ArrayList arrayList;
        InstalledModule parseModule;
        List<ApplicationInfo> installedApplications = this.mPms.getInstalledApplications(128, -4);
        synchronized (this.mCacheModule) {
            for (ApplicationInfo applicationInfo : installedApplications) {
                if (!this.mCacheModule.containsKey(applicationInfo.packageName) && (parseModule = XposedParserCompat.parseModule(applicationInfo)) != null) {
                    this.mCacheModule.put(applicationInfo.packageName, parseModule);
                }
            }
            arrayList = new ArrayList(this.mCacheModule.values());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InstalledModule installedModule = (InstalledModule) it.next();
                installedModule.enable = isModuleEnable(installedModule.packageName);
            }
        }
        return arrayList;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
    public boolean isModuleEnable(String str) {
        boolean z;
        synchronized (this.mLock) {
            Boolean bool = this.mXposedConfig.moduleState.get(str);
            z = bool != null && bool.booleanValue();
        }
        return z;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
    public boolean isXPEnable() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mXposedConfig.enable;
        }
        return z;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.PackageMonitor
    public void onPackageInstalled(String str, int i) {
        if (i == -4 || i == -1) {
            synchronized (this.mCacheModule) {
                this.mCacheModule.remove(str);
            }
            synchronized (this.mLock) {
                this.mXposedConfig.moduleState.put(str, Boolean.FALSE);
                saveModuleStateLw();
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.PackageMonitor
    public void onPackageUninstalled(String str, boolean z, int i) {
        if (i == -4 || i == -1) {
            synchronized (this.mCacheModule) {
                this.mCacheModule.remove(str);
            }
            synchronized (this.mLock) {
                this.mXposedConfig.moduleState.remove(str);
                saveModuleStateLw();
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
    public void setModuleEnable(String str, boolean z) {
        synchronized (this.mLock) {
            if (this.mPms.isInstalled(str, -4)) {
                this.mXposedConfig.moduleState.put(str, Boolean.valueOf(z));
                saveModuleStateLw();
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
    public void setXPEnable(boolean z) {
        synchronized (this.mLock) {
            this.mXposedConfig.enable = z;
            saveModuleStateLw();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
        loadModuleStateLr();
        BPackageManagerService bPackageManagerService = BPackageManagerService.get();
        this.mPms = bPackageManagerService;
        bPackageManagerService.addPackageMonitor(this);
    }
}
