package top.niunaijun.blackbox.core;

import android.content.pm.PackageManager;
import java.util.HashSet;
import java.util.Set;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.entity.p029pm.InstallResult;
/* loaded from: classes3.dex */
public class GmsCore {
    public static final String GMS_PKG = "com.google.android.gms";
    private static final HashSet<String> GOOGLE_APP;
    private static final HashSet<String> GOOGLE_SERVICE;
    public static final String GSF_PKG = "com.google.android.gsf";
    private static final String TAG = "GmsCore";
    public static final String VENDING_PKG = "com.android.vending";

    static {
        HashSet<String> hashSet = new HashSet<>();
        GOOGLE_APP = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        GOOGLE_SERVICE = hashSet2;
        hashSet.add(VENDING_PKG);
        hashSet.add("com.google.android.play.games");
        hashSet.add("com.google.android.wearable.app");
        hashSet.add("com.google.android.wearable.app.cn");
        hashSet2.add(GMS_PKG);
        hashSet2.add(GSF_PKG);
        hashSet2.add("com.google.android.gsf.login");
        hashSet2.add("com.google.android.backuptransport");
        hashSet2.add("com.google.android.backup");
        hashSet2.add("com.google.android.configupdater");
        hashSet2.add("com.google.android.syncadapters.contacts");
        hashSet2.add("com.google.android.feedback");
        hashSet2.add("com.google.android.onetimeinitializer");
        hashSet2.add("com.google.android.partnersetup");
        hashSet2.add("com.google.android.setupwizard");
        hashSet2.add("com.google.android.syncadapters.calendar");
    }

    public static InstallResult installGApps(int i) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(GOOGLE_SERVICE);
        hashSet.addAll(GOOGLE_APP);
        InstallResult installPackages = installPackages(hashSet, i);
        if (!installPackages.success) {
            uninstallGApps(i);
        }
        return installPackages;
    }

    private static InstallResult installPackages(Set<String> set, int i) {
        BlackBoxCore blackBoxCore = BlackBoxCore.get();
        for (String str : set) {
            if (!blackBoxCore.isInstalled(str, i)) {
                try {
                    BlackBoxCore.getContext().getPackageManager().getApplicationInfo(str, 0);
                    InstallResult installPackageAsUser = blackBoxCore.installPackageAsUser(str, i);
                    if (!installPackageAsUser.success) {
                        return installPackageAsUser;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
        return new InstallResult();
    }

    public static boolean isGoogleAppOrService(String str) {
        return GOOGLE_APP.contains(str) || GOOGLE_SERVICE.contains(str);
    }

    public static boolean isGoogleService(String str) {
        return GOOGLE_SERVICE.contains(str);
    }

    public static boolean isInstalledGoogleService(int i) {
        return BlackBoxCore.get().isInstalled(GMS_PKG, i);
    }

    public static boolean isSupportGms() {
        try {
            BlackBoxCore.getPackageManager().getPackageInfo(GMS_PKG, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static void remove(String str) {
        GOOGLE_SERVICE.remove(str);
        GOOGLE_APP.remove(str);
    }

    public static void uninstallGApps(int i) {
        uninstallPackages(GOOGLE_SERVICE, i);
        uninstallPackages(GOOGLE_APP, i);
    }

    private static void uninstallPackages(Set<String> set, int i) {
        BlackBoxCore blackBoxCore = BlackBoxCore.get();
        for (String str : set) {
            blackBoxCore.uninstallPackageAsUser(str, i);
        }
    }
}
