package top.niunaijun.blackbox.core.system.p027pm;

import android.content.p001pm.PackageParser;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.util.ArrayMap;
import android.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.BProcessManagerService;
import top.niunaijun.blackbox.core.system.user.BUserHandle;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.PackageParserCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: top.niunaijun.blackbox.core.system.pm.Settings */
/* loaded from: classes3.dex */
public class Settings {
    public static final String TAG = "Settings";
    private final Map<String, Integer> mAppIds;
    private int mCurrUid;
    final ArrayMap<String, BPackageSettings> mPackages;
    private final Map<String, SharedUserSetting> mSharedUsers;

    public Settings() {
        ArrayMap<String, BPackageSettings> arrayMap = new ArrayMap<>();
        this.mPackages = arrayMap;
        this.mAppIds = new HashMap();
        this.mSharedUsers = SharedUserSetting.sSharedUsers;
        this.mCurrUid = 0;
        synchronized (arrayMap) {
            loadUidLP();
            SharedUserSetting.loadSharedUsers();
        }
    }

    private int acquireAndRegisterNewAppIdLPw(BPackageSettings bPackageSettings) {
        Integer num = this.mAppIds.get(bPackageSettings.pkg.packageName);
        if (num != null) {
            return num.intValue();
        }
        int i = this.mCurrUid;
        if (i >= 19999) {
            return -1;
        }
        int i2 = i + 1;
        this.mCurrUid = i2;
        this.mAppIds.put(bPackageSettings.pkg.packageName, Integer.valueOf(i2));
        return this.mCurrUid + BUserHandle.AID_APP_START;
    }

    private void loadUidLP() {
        Parcel obtain = Parcel.obtain();
        try {
            byte[] byteArray = FileUtils.toByteArray(BEnvironment.getUidConf());
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            this.mCurrUid = obtain.readInt();
            HashMap readHashMap = obtain.readHashMap(HashMap.class.getClassLoader());
            synchronized (this.mAppIds) {
                this.mAppIds.clear();
                this.mAppIds.putAll(readHashMap);
            }
        } catch (Exception e) {
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
        obtain.recycle();
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

    private BPackageSettings reInstallBySystem(PackageInfo packageInfo, InstallOption installOption) {
        Slog.m20d(TAG, "reInstallBySystem: " + packageInfo.packageName);
        PackageParser.Package parserApk = parserApk(packageInfo.applicationInfo.sourceDir);
        if (parserApk != null) {
            parserApk.applicationInfo = BlackBoxCore.getPackageManager().getPackageInfo(parserApk.packageName, 0).applicationInfo;
            return getPackageLPw(parserApk.packageName, parserApk, installOption);
        }
        throw new RuntimeException("parser apk error.");
    }

    private void saveUidLP() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(BEnvironment.getUidConf());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Set<String> keySet = this.mPackages.keySet();
                Iterator it = new HashSet(this.mAppIds.keySet()).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!keySet.contains(str)) {
                        this.mAppIds.remove(str);
                    }
                }
                obtain.writeInt(this.mCurrUid);
                obtain.writeMap(this.mAppIds);
                fileOutputStream = atomicFile.startWrite();
                FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
            } catch (Exception e) {
                e.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
            }
        } finally {
            obtain.recycle();
        }
    }

    private void updatePackageLP(File file) {
        String name = file.getName();
        Parcel obtain = Parcel.obtain();
        try {
            byte[] byteArray = FileUtils.toByteArray(BEnvironment.getPackageConf(name));
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            BPackageSettings bPackageSettings = new BPackageSettings(obtain);
            bPackageSettings.pkg.mExtras = bPackageSettings;
            if (bPackageSettings.installOption.isFlag(1)) {
                PackageInfo packageInfo = BlackBoxCore.getPackageManager().getPackageInfo(name, 128);
                if (!packageInfo.applicationInfo.sourceDir.equals(bPackageSettings.pkg.baseCodePath)) {
                    BProcessManagerService.get().killAllByPackageName(bPackageSettings.pkg.packageName);
                    bPackageSettings.pkg = reInstallBySystem(packageInfo, bPackageSettings.installOption).pkg;
                }
            } else {
                BPackage bPackage = bPackageSettings.pkg;
                bPackage.applicationInfo = PackageManagerCompat.generateApplicationInfo(bPackage, 0, BPackageUserState.create(), 0);
            }
            bPackageSettings.save();
            this.mPackages.put(bPackageSettings.pkg.packageName, bPackageSettings);
            BPackageManagerService.get().analyzePackageLocked(bPackageSettings);
            Slog.m20d(TAG, "loaded Package: " + name);
        } finally {
            try {
            } finally {
            }
        }
    }

    public BPackageSettings getPackageLPw(String str, PackageParser.Package r4, InstallOption installOption) {
        BPackageSettings bPackageSettings = new BPackageSettings();
        BPackage bPackage = new BPackage(r4);
        bPackageSettings.pkg = bPackage;
        bPackage.installOption = installOption;
        bPackageSettings.installOption = installOption;
        bPackage.mExtras = bPackageSettings;
        bPackage.applicationInfo = PackageManagerCompat.generateApplicationInfo(bPackage, 0, BPackageUserState.create(), 0);
        synchronized (this.mPackages) {
            BPackageSettings bPackageSettings2 = this.mPackages.get(str);
            if (bPackageSettings2 != null) {
                bPackageSettings.appId = bPackageSettings2.appId;
                bPackageSettings.userState = bPackageSettings2.userState;
            } else if (!registerAppIdLPw(bPackageSettings)) {
                throw new RuntimeException("registerAppIdLPw err.");
            }
        }
        return bPackageSettings;
    }

    public boolean registerAppIdLPw(BPackageSettings bPackageSettings) {
        SharedUserSetting sharedUserSetting;
        String str = bPackageSettings.pkg.mSharedUserId;
        if (str != null) {
            sharedUserSetting = this.mSharedUsers.get(str);
            if (sharedUserSetting == null) {
                sharedUserSetting = new SharedUserSetting(str);
                sharedUserSetting.userId = acquireAndRegisterNewAppIdLPw(bPackageSettings);
                this.mSharedUsers.put(str, sharedUserSetting);
            }
        } else {
            sharedUserSetting = null;
        }
        if (sharedUserSetting != null) {
            bPackageSettings.appId = sharedUserSetting.userId;
            Slog.m20d(TAG, bPackageSettings.pkg.packageName + " sharedUserId = " + str + ", setAppId = " + bPackageSettings.appId);
        }
        if (bPackageSettings.appId == 0) {
            bPackageSettings.appId = acquireAndRegisterNewAppIdLPw(bPackageSettings);
        }
        boolean z = bPackageSettings.appId >= 0;
        saveUidLP();
        SharedUserSetting.saveSharedUsers();
        return z;
    }

    public void removePackage(String str) {
        this.mPackages.remove(str);
    }

    public void scanPackage() {
        File[] listFiles;
        synchronized (this.mPackages) {
            File appRootDir = BEnvironment.getAppRootDir();
            FileUtils.mkdirs(appRootDir);
            for (File file : appRootDir.listFiles()) {
                if (file.isDirectory()) {
                    scanPackage(file.getName());
                }
            }
        }
    }

    public void scanPackage(String str) {
        synchronized (this.mPackages) {
            updatePackageLP(BEnvironment.getAppDir(str));
        }
    }
}
