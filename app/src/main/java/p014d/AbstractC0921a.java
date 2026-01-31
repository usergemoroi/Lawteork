package p014d;

import android.content.pm.ApplicationInfo;
import black.android.content.p008pm.ApplicationInfoNContext;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: d.a */
/* loaded from: classes.dex */
public abstract class AbstractC0921a {
    /* renamed from: a */
    public static ApplicationInfoNContext m89a(ApplicationInfo applicationInfo) {
        return (ApplicationInfoNContext) BlackReflection.create(ApplicationInfoNContext.class, applicationInfo, false);
    }
}
