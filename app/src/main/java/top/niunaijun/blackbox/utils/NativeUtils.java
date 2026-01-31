package top.niunaijun.blackbox.utils;

import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.lingala.zip4j.util.InternalZipConstants;
/* loaded from: classes3.dex */
public class NativeUtils {
    public static final String TAG = "VirtualM";

    public static void copyNativeLib(File file, File file2) {
        StringBuilder sb;
        long currentTimeMillis = System.currentTimeMillis();
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(file.getAbsolutePath());
            if (findAndCopyNativeLib(zipFile, Build.CPU_ABI, file2)) {
                zipFile.close();
                sb = new StringBuilder("Done! +");
            } else {
                findAndCopyNativeLib(zipFile, "armeabi", file2);
                zipFile.close();
                sb = new StringBuilder("Done! +");
            }
            Log.d(TAG, sb.append(System.currentTimeMillis() - currentTimeMillis).append("ms").toString());
        } catch (Throwable th) {
            Log.d(TAG, "Done! +" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            throw th;
        }
    }

    private static void copySo(byte[] bArr, InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read <= 0) {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                outputStream.close();
                bufferedInputStream.close();
                inputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, read);
        }
    }

    private static boolean findAndCopyNativeLib(ZipFile zipFile, String str, File file) {
        Log.d(TAG, "Try to copy plugin's cup arch: " + str);
        String str2 = "lib/" + str + InternalZipConstants.ZIP_FILE_SEPARATOR;
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        boolean z = false;
        byte[] bArr = null;
        boolean z2 = false;
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (z || name.startsWith("lib/")) {
                if (name.endsWith(".so") && name.startsWith(str2)) {
                    if (bArr == null) {
                        Log.d(TAG, "Found plugin's cup arch dir: " + str);
                        bArr = new byte[8192];
                        z2 = true;
                    }
                    String substring = name.substring(name.lastIndexOf(47) + 1);
                    Log.d(TAG, "verify so " + substring);
                    File file2 = new File(file, substring);
                    if (file2.exists() && file2.length() == nextElement.getSize()) {
                        Log.d(TAG, substring + " skip copy");
                    } else {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        Log.d(TAG, "copy so " + nextElement.getName() + " of " + str);
                        copySo(bArr, zipFile.getInputStream(nextElement), fileOutputStream);
                    }
                }
                z = true;
            }
        }
        if (z) {
            return z2;
        }
        Log.d(TAG, "Fast skip all!");
        return true;
    }
}
