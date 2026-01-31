package black.android.content.p008pm;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.content.pm.ApplicationInfo")
/* renamed from: black.android.content.pm.ApplicationInfoP */
/* loaded from: classes.dex */
public interface ApplicationInfoP {
    @BMethod
    void setHiddenApiEnforcementPolicy(int i);

    @BField
    String[] splitClassLoaderNames();
}
