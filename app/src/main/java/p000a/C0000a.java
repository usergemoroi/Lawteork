package p000a;

import java.lang.reflect.Field;
/* renamed from: a.a */
/* loaded from: classes.dex */
public final class C0000a extends AbstractC0001b {
    public C0000a(Field field) {
        super(field);
    }

    /* renamed from: a */
    public final void m215a(String str) {
        try {
            ((Field) this.f0a).set(null, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
