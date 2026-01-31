package top.niunaijun.blackbox.utils;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;
/* loaded from: classes3.dex */
public class QQUtils {
    public static void hackLog(Context context) {
        try {
            Field declaredField = context.getClassLoader().loadClass("com.tencent.qphone.base.util.QLog").getDeclaredField("UIN_REPORTLOG_LEVEL");
            declaredField.setAccessible(true);
            declaredField.set(null, 1000);
            Log.d("QQUtils", "hackLog: success");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
