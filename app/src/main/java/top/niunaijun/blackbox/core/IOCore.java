package top.niunaijun.blackbox.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.lsposed.lsparanoid.DeobfuscatorHelper;
import p019i.AbstractC0929a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.TrieTree;
/* loaded from: classes3.dex */
public class IOCore {
    private final Map<String, String> mRedirectMap = new LinkedHashMap();
    public static final String TAG = DeobfuscatorHelper.getString(6981698999491866383L, AbstractC0929a.f169a);
    private static final IOCore sIOCore = new IOCore();
    private static final TrieTree mTrieTree = new TrieTree();
    private static final TrieTree sBlackTree = new TrieTree();
    private static final Map<String, Map<String, String>> sCachePackageRedirect = new HashMap();

    public static IOCore get() {
        return sIOCore;
    }

    private void hideRoot(Map<String, String> map) {
        String[] strArr = AbstractC0929a.f169a;
        map.put(DeobfuscatorHelper.getString(6981700902162378511L, strArr), DeobfuscatorHelper.getString(6981700790493228815L, strArr));
        map.put(DeobfuscatorHelper.getString(6981700657349242639L, strArr), DeobfuscatorHelper.getString(6981700618694536975L, strArr));
        map.put(DeobfuscatorHelper.getString(6981700558564994831L, strArr), DeobfuscatorHelper.getString(6981700494140485391L, strArr));
        map.put(DeobfuscatorHelper.getString(6981700408241139471L, strArr), DeobfuscatorHelper.getString(6981700339521662735L, strArr));
        map.put(DeobfuscatorHelper.getString(6981700249327349519L, strArr), DeobfuscatorHelper.getString(6981700163428003599L, strArr));
        map.put(DeobfuscatorHelper.getString(6981700056053821199L, strArr), DeobfuscatorHelper.getString(6981699974449442575L, strArr));
        map.put(DeobfuscatorHelper.getString(6981699871370227471L, strArr), DeobfuscatorHelper.getString(6981699789765848847L, strArr));
        map.put(DeobfuscatorHelper.getString(6981699686686633743L, strArr), DeobfuscatorHelper.getString(6981699583607418639L, strArr));
        map.put(DeobfuscatorHelper.getString(6981699459053367055L, strArr), DeobfuscatorHelper.getString(6981699394628857615L, strArr));
        map.put(DeobfuscatorHelper.getString(6981699308729511695L, strArr), DeobfuscatorHelper.getString(6981699261484871439L, strArr));
    }

    private void proc(Map<String, String> map) {
        int appPid = BActivityThread.getAppPid();
        int myPid = Process.myPid();
        String[] strArr = AbstractC0929a.f169a;
        String string = DeobfuscatorHelper.getString(6981699192765394703L, strArr);
        String absolutePath = new File(BEnvironment.getProcDir(appPid), DeobfuscatorHelper.getString(6981699102571081487L, strArr)).getAbsolutePath();
        map.put((DeobfuscatorHelper.getString(6981699141225787151L, strArr) + myPid + DeobfuscatorHelper.getString(6981699111161016079L, strArr)) + DeobfuscatorHelper.getString(6981699068211343119L, strArr), absolutePath);
        map.put(string + DeobfuscatorHelper.getString(6981699033851604751L, strArr), absolutePath);
    }

    public void addRedirect(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.mRedirectMap.get(str) != null) {
            return;
        }
        mTrieTree.add(str);
        this.mRedirectMap.put(str, str2);
        if (!new File(str2).exists()) {
            FileUtils.mkdirs(str2);
        }
        BlackBoxCore.addIORule(str, str2);
    }

    public void enableRedirect(Context context) {
        String absolutePath;
        String[] strArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String packageName = context.getPackageName();
        try {
            ApplicationInfo applicationInfo = BlackBoxCore.getBPackageManager().getApplicationInfo(packageName, 128, BActivityThread.getUserId());
            int hostUserId = BlackBoxCore.getHostUserId();
            String[] strArr2 = AbstractC0929a.f169a;
            linkedHashMap.put(String.format(DeobfuscatorHelper.getString(6981701808400477967L, strArr2), packageName), applicationInfo.nativeLibraryDir);
            linkedHashMap.put(String.format(DeobfuscatorHelper.getString(6981701731091066639L, strArr2), Integer.valueOf(hostUserId), packageName), applicationInfo.nativeLibraryDir);
            linkedHashMap.put(String.format(DeobfuscatorHelper.getString(6981701640896753423L, strArr2), packageName), applicationInfo.dataDir);
            linkedHashMap.put(String.format(DeobfuscatorHelper.getString(6981701580767211279L, strArr2), Integer.valueOf(hostUserId), packageName), applicationInfo.dataDir);
            if (BlackBoxCore.getContext().getExternalCacheDir() != null && context.getExternalCacheDir() != null) {
                File externalUserDir = BEnvironment.getExternalUserDir(BActivityThread.getUserId());
                File file = new File(DeobfuscatorHelper.getString(6981701507752767247L, strArr2));
                String format = String.format(DeobfuscatorHelper.getString(6981701439033290511L, strArr2), Integer.valueOf(hostUserId));
                if (!file.exists()) {
                    file = new File(format);
                }
                if (file.exists()) {
                    File[] listFiles = file.listFiles(new FileFilter() { // from class: top.niunaijun.blackbox.core.IOCore$$ExternalSyntheticLambda0
                        @Override // java.io.FileFilter
                        public final boolean accept(File file2) {
                            boolean isDirectory;
                            isDirectory = file2.isDirectory();
                            return isDirectory;
                        }
                    });
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            Log.d(DeobfuscatorHelper.getString(6981701314479238927L, AbstractC0929a.f169a), file2.getAbsolutePath());
                            linkedHashMap.put(DeobfuscatorHelper.getString(6981701284414467855L, strArr) + file2.getName(), externalUserDir.getAbsolutePath() + DeobfuscatorHelper.getString(6981701211400023823L, strArr) + file2.getName());
                            linkedHashMap.put(format + DeobfuscatorHelper.getString(6981701168450350863L, strArr) + file2.getName(), externalUserDir.getAbsolutePath() + DeobfuscatorHelper.getString(6981701159860416271L, strArr) + file2.getName());
                        }
                    } else {
                        linkedHashMap.put(DeobfuscatorHelper.getString(6981701116910743311L, strArr2), externalUserDir.getAbsolutePath() + DeobfuscatorHelper.getString(6981701048191266575L, strArr2));
                        absolutePath = externalUserDir.getAbsolutePath() + DeobfuscatorHelper.getString(6981701009536560911L, strArr2);
                    }
                } else {
                    linkedHashMap.put(DeobfuscatorHelper.getString(6981700970881855247L, strArr2), externalUserDir.getAbsolutePath());
                    absolutePath = externalUserDir.getAbsolutePath();
                }
                linkedHashMap.put(format, absolutePath);
            }
            if (BlackBoxCore.get().isHideRoot()) {
                hideRoot(linkedHashMap);
            }
            proc(linkedHashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str : linkedHashMap.keySet()) {
            get().addRedirect(str, (String) linkedHashMap.get(str));
        }
        BlackBoxCore.enableIO();
    }

    public File redirectPath(File file) {
        if (file == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        String redirectPath = redirectPath(absolutePath);
        return absolutePath.equals(redirectPath) ? file : new File(redirectPath);
    }

    public File redirectPath(File file, Map<String, String> map) {
        if (file == null) {
            return null;
        }
        return new File(redirectPath(file.getAbsolutePath(), map));
    }

    public String redirectPath(String str) {
        if (TextUtils.isEmpty(str) || str.contains(DeobfuscatorHelper.getString(6981701855645118223L, AbstractC0929a.f169a))) {
            return str;
        }
        String search = mTrieTree.search(str);
        return !TextUtils.isEmpty(search) ? str.replace(search, (CharSequence) Objects.requireNonNull(this.mRedirectMap.get(search))) : str;
    }

    public String redirectPath(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String search = mTrieTree.search(str);
        return !TextUtils.isEmpty(search) ? str.replace(search, (CharSequence) Objects.requireNonNull(map.get(search))) : str;
    }
}
