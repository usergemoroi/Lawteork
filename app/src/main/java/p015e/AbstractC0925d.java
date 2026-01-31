package p015e;

import android.util.Log;
import java.lang.reflect.Method;
import p000a.C0000a;
import p000a.C0002c;
/* renamed from: e.d */
/* loaded from: classes.dex */
public abstract class AbstractC0925d {

    /* renamed from: a */
    public static final C0002c f161a;

    /* renamed from: b */
    public static final C0000a f162b;

    /* renamed from: c */
    public static final C0000a f163c;

    /* renamed from: d */
    public static final C0000a f164d;

    /* renamed from: e */
    public static final C0000a f165e;

    /* renamed from: f */
    public static final C0000a f166f;

    /* renamed from: g */
    public static final C0000a f167g;

    /* renamed from: h */
    public static final C0000a f168h;

    static {
        Class<?> cls;
        Method method = null;
        try {
            cls = Class.forName("android.os.Build");
        } catch (ClassNotFoundException e) {
            Log.e("Reflector", e.getMessage());
            cls = null;
        }
        C0002c c0002c = new C0002c(cls);
        f161a = c0002c;
        c0002c.m213a("BOARD");
        f162b = c0002c.m213a("BRAND");
        c0002c.m213a("DEVICE");
        c0002c.m213a("DISPLAY");
        c0002c.m213a("HOST");
        c0002c.m213a("ID");
        c0002c.m213a("MANUFACTURER");
        f163c = c0002c.m213a("MODEL");
        c0002c.m213a("PRODUCT");
        f164d = c0002c.m213a("TAGS");
        f165e = c0002c.m213a("TYPE");
        f166f = c0002c.m213a("USER");
        f167g = c0002c.m213a("FINGERPRINT");
        c0002c.m213a("BOOTLOADER");
        c0002c.m213a("HARDWARE");
        f168h = c0002c.m213a("SERIAL");
        int i = 0;
        try {
            Method declaredMethod = cls.getDeclaredMethod("getRadioVersion", new Class[0]);
            declaredMethod.setAccessible(true);
            method = declaredMethod;
        } catch (NoSuchMethodException e2) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (method2.getName().equals("getRadioVersion")) {
                    method2.setAccessible(true);
                    method = method2;
                    break;
                }
                i++;
            }
        }
        if (method != null) {
            method.setAccessible(true);
        }
    }
}
