package black.android.location;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.location.LocationRequest")
/* loaded from: classes.dex */
public interface LocationRequestL {
    @BMethod
    String getProvider();

    @BField
    boolean mHideFromAppOps();

    @BField
    String mProvider();

    @BField
    Object mWorkSource();
}
