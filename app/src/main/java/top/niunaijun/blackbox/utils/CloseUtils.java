package top.niunaijun.blackbox.utils;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes3.dex */
public class CloseUtils {
    public static void close(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
