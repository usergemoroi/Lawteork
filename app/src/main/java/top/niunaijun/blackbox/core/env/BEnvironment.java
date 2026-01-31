package top.niunaijun.blackbox.core.env;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.Locale;
import org.lsposed.lsparanoid.DeobfuscatorHelper;
import p019i.AbstractC0929a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.utils.FileUtils;
/* loaded from: classes3.dex */
public class BEnvironment {
    public static File EMPTY_JAR;
    public static File JUNIT_JAR;
    private static final File ObbDirectory;
    private static final File sExternalVirtualRoot;
    private static final File sVirtualRoot;

    static {
        Context context = BlackBoxCore.getContext();
        String[] strArr = AbstractC0929a.f169a;
        ObbDirectory = context.getExternalFilesDir(DeobfuscatorHelper.getString(6981702130523025167L, strArr));
        sVirtualRoot = new File(BlackBoxCore.getContext().getCacheDir().getParent(), DeobfuscatorHelper.getString(6981702091868319503L, strArr));
        if (Build.VERSION.SDK_INT >= 30) {
            sExternalVirtualRoot = new File(DeobfuscatorHelper.getString(6981702053213613839L, strArr));
        } else {
            sExternalVirtualRoot = new File(DeobfuscatorHelper.getString(6981701980199169807L, strArr));
        }
        JUNIT_JAR = new File(getCacheDir(), DeobfuscatorHelper.getString(6981701941544464143L, strArr));
        EMPTY_JAR = new File(getCacheDir(), DeobfuscatorHelper.getString(6981701898594791183L, strArr));
    }

    public static File getAccountsConf() {
        return new File(getSystemDir(), DeobfuscatorHelper.getString(6981703212854783759L, AbstractC0929a.f169a));
    }

    public static File getAppDir(String str) {
        return new File(sVirtualRoot, DeobfuscatorHelper.getString(6981702358156291855L, AbstractC0929a.f169a) + str);
    }

    public static File getAppLibDir(String str) {
        return new File(getAppDir(str), DeobfuscatorHelper.getString(6981702229307272975L, AbstractC0929a.f169a));
    }

    public static File getAppRootDir() {
        return getAppDir(DeobfuscatorHelper.getString(6981702362451259151L, AbstractC0929a.f169a));
    }

    public static File getBaseApkDir(String str) {
        File file = sVirtualRoot;
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC0929a.f169a;
        return new File(file, sb.append(DeobfuscatorHelper.getString(6981702315206618895L, strArr)).append(str).append(DeobfuscatorHelper.getString(6981702272256945935L, strArr)).toString());
    }

    public static File getCacheDir() {
        return new File(sVirtualRoot, DeobfuscatorHelper.getString(6981703281574260495L, AbstractC0929a.f169a));
    }

    public static File getDataCacheDir(String str, int i) {
        return new File(getDataDir(str, i), DeobfuscatorHelper.getString(6981702448350605071L, AbstractC0929a.f169a));
    }

    public static File getDataDatabasesDir(String str, int i) {
        return new File(getDataDir(str, i), DeobfuscatorHelper.getString(6981702405400932111L, AbstractC0929a.f169a));
    }

    public static File getDataDir(String str, int i) {
        return new File(sVirtualRoot, String.format(Locale.CHINA, DeobfuscatorHelper.getString(6981702607264395023L, AbstractC0929a.f169a), Integer.valueOf(i), str));
    }

    public static File getDataFilesDir(String str, int i) {
        return new File(getDataDir(str, i), DeobfuscatorHelper.getString(6981702499890212623L, AbstractC0929a.f169a));
    }

    public static File getDataLibDir(String str, int i) {
        return new File(getDataDir(str, i), DeobfuscatorHelper.getString(6981702422580801295L, AbstractC0929a.f169a));
    }

    public static File getDeDataDir(String str, int i) {
        return new File(sVirtualRoot, String.format(Locale.CHINA, DeobfuscatorHelper.getString(6981702757588250383L, AbstractC0929a.f169a), Integer.valueOf(i), str));
    }

    public static File getExternalDataCacheDir(String str, int i) {
        return new File(getExternalDataDir(str, i), DeobfuscatorHelper.getString(6981702474120408847L, AbstractC0929a.f169a));
    }

    public static File getExternalDataDir(String str, int i) {
        return new File(getExternalUserDir(i), String.format(Locale.CHINA, DeobfuscatorHelper.getString(6981702675983871759L, AbstractC0929a.f169a), str));
    }

    public static File getExternalDataFilesDir(String str, int i) {
        return new File(getExternalDataDir(str, i), DeobfuscatorHelper.getString(6981702525660016399L, AbstractC0929a.f169a));
    }

    public static File getExternalUserDir(int i) {
        return new File(sExternalVirtualRoot, String.format(Locale.CHINA, DeobfuscatorHelper.getString(6981702822012759823L, AbstractC0929a.f169a), Integer.valueOf(i)));
    }

    public static File getExternalVirtualRoot() {
        return sExternalVirtualRoot;
    }

    public static File getFakeLocationConf() {
        return new File(getSystemDir(), DeobfuscatorHelper.getString(6981702959451713295L, AbstractC0929a.f169a));
    }

    public static File getObbDir(String str) {
        return new File(DeobfuscatorHelper.getString(6981703423308181263L, AbstractC0929a.f169a) + str);
    }

    public static File getPackageConf(String str) {
        return new File(getAppDir(str), DeobfuscatorHelper.getString(6981702877847334671L, AbstractC0929a.f169a));
    }

    public static File getProcDir() {
        return new File(sVirtualRoot, DeobfuscatorHelper.getString(6981703303049096975L, AbstractC0929a.f169a));
    }

    public static File getSharedUserConf() {
        return new File(getSystemDir(), DeobfuscatorHelper.getString(6981703114070535951L, AbstractC0929a.f169a));
    }

    public static File getSystemDir() {
        return new File(sVirtualRoot, DeobfuscatorHelper.getString(6981703333113868047L, AbstractC0929a.f169a));
    }

    public static File getUidConf() {
        return new File(getSystemDir(), DeobfuscatorHelper.getString(6981703152725241615L, AbstractC0929a.f169a));
    }

    public static File getUserDir(int i) {
        return new File(sVirtualRoot, String.format(Locale.CHINA, DeobfuscatorHelper.getString(6981702813422825231L, AbstractC0929a.f169a), Integer.valueOf(i)));
    }

    public static File getUserInfoConf() {
        return new File(getSystemDir(), DeobfuscatorHelper.getString(6981703255804456719L, AbstractC0929a.f169a));
    }

    public static File getVirtualRoot() {
        return sVirtualRoot;
    }

    public static File getXPModuleConf() {
        return new File(getSystemDir(), DeobfuscatorHelper.getString(6981703041056091919L, AbstractC0929a.f169a));
    }

    public static File getXSharedPreferences(String str, String str2) {
        File dataDir = getDataDir(str, BActivityThread.getUserId());
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC0929a.f169a;
        return new File(dataDir, sb.append(DeobfuscatorHelper.getString(6981702212127403791L, strArr)).append(str2).append(DeobfuscatorHelper.getString(6981702151997861647L, strArr)).toString());
    }

    public static void load() {
        FileUtils.mkdirs(sVirtualRoot);
        FileUtils.mkdirs(sExternalVirtualRoot);
        FileUtils.mkdirs(getSystemDir());
        FileUtils.mkdirs(getCacheDir());
        FileUtils.mkdirs(getProcDir());
    }

    public static File getProcDir(int i) {
        File file = new File(getProcDir(), String.format(Locale.CHINA, DeobfuscatorHelper.getString(6981702538544918287L, AbstractC0929a.f169a), Integer.valueOf(i)));
        FileUtils.mkdirs(file);
        return file;
    }
}
