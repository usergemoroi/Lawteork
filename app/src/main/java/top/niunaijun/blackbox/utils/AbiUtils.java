package top.niunaijun.blackbox.utils;

import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import top.niunaijun.blackbox.BlackBoxCore;
/* loaded from: classes3.dex */
public class AbiUtils {
    private static final Map<File, AbiUtils> sAbiUtilsMap = new HashMap();
    private final Set<String> mLibs = new HashSet();

    public AbiUtils(File file) {
        ZipFile zipFile;
        Set<String> set;
        String str;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            zipFile = zipFile2;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                if (name.startsWith("lib/arm64-v8a")) {
                    set = this.mLibs;
                    str = "arm64-v8a";
                } else if (name.startsWith("lib/armeabi")) {
                    set = this.mLibs;
                    str = "armeabi";
                } else if (name.startsWith("lib/armeabi-v7a")) {
                    set = this.mLibs;
                    str = "armeabi-v7a";
                }
                set.add(str);
            }
            CloseUtils.close(zipFile);
        } catch (Exception e2) {
            e = e2;
            zipFile2 = zipFile;
            e.printStackTrace();
            CloseUtils.close(zipFile2);
        } catch (Throwable th2) {
            th = th2;
            CloseUtils.close(zipFile);
            throw th;
        }
    }

    public static boolean isSupport(File file) {
        Map<File, AbiUtils> map = sAbiUtilsMap;
        AbiUtils abiUtils = map.get(file);
        if (abiUtils == null) {
            abiUtils = new AbiUtils(file);
            map.put(file, abiUtils);
        }
        if (abiUtils.isEmptyAib()) {
            return true;
        }
        return BlackBoxCore.is64Bit() ? abiUtils.is64Bit() : abiUtils.is32Bit();
    }

    public boolean is32Bit() {
        return this.mLibs.contains("armeabi") || this.mLibs.contains("armeabi-v7a");
    }

    public boolean is64Bit() {
        return this.mLibs.contains("arm64-v8a");
    }

    public boolean isEmptyAib() {
        return this.mLibs.isEmpty();
    }
}
