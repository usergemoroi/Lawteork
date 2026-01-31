package top.niunaijun.blackbox.utils.compat;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.entity.p029pm.InstalledModule;
import top.niunaijun.blackbox.utils.CloseUtils;
import top.niunaijun.blackbox.utils.ShellUtils;
/* loaded from: classes3.dex */
public class XposedParserCompat {
    private static String getInputStreamContent(InputStream inputStream) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (!readLine.startsWith("#")) {
                            sb.append(readLine).append(ShellUtils.COMMAND_LINE_END);
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        e.printStackTrace();
                        CloseUtils.close(bufferedReader2);
                        return sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        CloseUtils.close(bufferedReader);
                        throw th;
                    }
                }
                CloseUtils.close(bufferedReader);
            } catch (Exception e2) {
                e = e2;
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
    }

    public static boolean isXPModule(String str) {
        try {
            return readMain(str) != null;
        } catch (Throwable th) {
            return false;
        }
    }

    public static InstalledModule parseModule(ApplicationInfo applicationInfo) {
        try {
            PackageManager packageManager = BlackBoxCore.getPackageManager();
            InstalledModule installedModule = new InstalledModule();
            installedModule.packageName = applicationInfo.packageName;
            installedModule.enable = false;
            installedModule.desc = applicationInfo.metaData.getString("xposeddescription");
            installedModule.name = applicationInfo.loadLabel(packageManager).toString();
            installedModule.main = readMain(applicationInfo.sourceDir);
            return installedModule;
        } catch (RuntimeException e) {
            return null;
        }
    }

    private static String readMain(String str) {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        try {
            zipFile = new ZipFile(new File(str));
        } catch (IOException e) {
            e = e;
            zipFile = null;
        } catch (Throwable th) {
            th = th;
            zipFile = zipFile2;
            CloseUtils.close(zipFile);
            throw th;
        }
        try {
            ZipEntry entry = zipFile.getEntry("assets/xposed_init");
            if (entry != null) {
                String trim = getInputStreamContent(zipFile.getInputStream(entry)).trim();
                CloseUtils.close(zipFile);
                return trim;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            e = e2;
            try {
                e.printStackTrace();
                CloseUtils.close(zipFile);
                return null;
            } catch (Throwable th2) {
                th = th2;
                zipFile2 = zipFile;
                zipFile = zipFile2;
                CloseUtils.close(zipFile);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CloseUtils.close(zipFile);
            throw th;
        }
    }
}
