package top.niunaijun.blackbox.utils;

import android.util.Log;
/* loaded from: classes3.dex */
public final class Slog {
    public static final int LOG_ID_SYSTEM = 3;

    private Slog() {
    }

    /* renamed from: d */
    public static int m20d(String str, String str2) {
        return Log.println(3, str, str2);
    }

    /* renamed from: e */
    public static int m18e(String str, String str2) {
        return Log.println(6, str, str2);
    }

    /* renamed from: i */
    public static int m16i(String str, String str2) {
        return Log.println(4, str, str2);
    }

    public static int println(int i, String str, String str2) {
        return Log.println(i, str, str2);
    }

    /* renamed from: v */
    public static int m14v(String str, String str2) {
        return Log.println(2, str, str2);
    }

    /* renamed from: w */
    public static int m12w(String str, String str2) {
        return Log.println(5, str, str2);
    }

    /* renamed from: d */
    public static int m19d(String str, String str2, Throwable th) {
        return Log.println(3, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: e */
    public static int m17e(String str, String str2, Throwable th) {
        return Log.println(6, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: i */
    public static int m15i(String str, String str2, Throwable th) {
        return Log.println(4, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: v */
    public static int m13v(String str, String str2, Throwable th) {
        return Log.println(2, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: w */
    public static int m11w(String str, String str2, Throwable th) {
        return Log.println(5, str, str2 + '\n' + Log.getStackTraceString(th));
    }

    /* renamed from: w */
    public static int m10w(String str, Throwable th) {
        return Log.println(5, str, Log.getStackTraceString(th));
    }
}
