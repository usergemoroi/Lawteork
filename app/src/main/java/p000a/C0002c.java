package p000a;

import java.lang.reflect.Field;
/* renamed from: a.c */
/* loaded from: classes.dex */
public final class C0002c {

    /* renamed from: a */
    public final Class f1a;

    public C0002c(Class cls) {
        this.f1a = cls;
    }

    /* renamed from: a */
    public final C0000a m213a(String str) {
        return new C0000a(m214a(this.f1a, str));
    }

    /* renamed from: a */
    public static Field m214a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return m214a(superclass, str);
            }
            return null;
        }
    }
}
