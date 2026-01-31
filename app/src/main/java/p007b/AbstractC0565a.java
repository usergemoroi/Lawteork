package p007b;

import black.android.app.ActivityContext;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: b.a */
/* loaded from: classes.dex */
public abstract class AbstractC0565a {
    /* renamed from: a */
    public static ActivityContext m167a(Object obj) {
        return (ActivityContext) BlackReflection.create(ActivityContext.class, obj, false);
    }
}
