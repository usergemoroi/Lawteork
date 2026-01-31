package p007b;

import black.android.app.ContextImplContext;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: b.d */
/* loaded from: classes.dex */
public abstract class AbstractC0568d {
    /* renamed from: a */
    public static ContextImplContext m163a(Object obj) {
        return (ContextImplContext) BlackReflection.create(ContextImplContext.class, obj, false);
    }
}
