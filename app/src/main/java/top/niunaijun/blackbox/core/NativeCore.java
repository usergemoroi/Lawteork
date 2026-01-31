package top.niunaijun.blackbox.core;

import android.util.Log;
import java.io.File;
import top.niunaijun.blackbox.BlackBoxCore;
/* loaded from: classes3.dex */
public class NativeCore {
    public static final String TAG = "NativeCore";

    static {
        StringBuilder append;
        try {
            File filesDir = BlackBoxCore.getContext().getFilesDir();
            File file = new File(filesDir, "libbgmi.so");
            File file2 = new File(filesDir, "libpubgm.so");
            if (file.exists()) {
                System.load(file.getAbsolutePath());
                append = new StringBuilder("Loaded: ").append(file.getName());
            } else if (!file2.exists()) {
                Log.w(TAG, "No native lib found (libbgmi.so or libpubgm.so).");
                return;
            } else {
                System.load(file2.getAbsolutePath());
                append = new StringBuilder("Loaded: ").append(file2.getName());
            }
            Log.d(TAG, append.toString());
        } catch (Throwable th) {
            Log.e(TAG, "Failed to load native library", th);
        }
    }
}
