package black.android.content.res;

import android.content.pm.ApplicationInfo;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BStaticField;
@BClassName("android.content.res.CompatibilityInfo")
/* loaded from: classes.dex */
public interface CompatibilityInfo {
    @BStaticField
    Object DEFAULT_COMPATIBILITY_INFO();

    @BConstructor
    CompatibilityInfo _new(ApplicationInfo applicationInfo, int i, int i2, boolean z);

    @BConstructor
    CompatibilityInfo _new(ApplicationInfo applicationInfo, int i, int i2, boolean z, int i3);
}
