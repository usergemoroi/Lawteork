package p007b;

import black.android.app.ActivityThreadContext;
import black.android.app.ActivityThreadStatic;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: b.c */
/* loaded from: classes.dex */
public abstract class AbstractC0567c {
    /* renamed from: a */
    public static ActivityThreadContext m164a(Object obj) {
        return (ActivityThreadContext) BlackReflection.create(ActivityThreadContext.class, obj, false);
    }

    /* renamed from: a */
    public static ActivityThreadStatic m165a() {
        return (ActivityThreadStatic) BlackReflection.create(ActivityThreadStatic.class, null, false);
    }
}
