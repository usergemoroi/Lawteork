package black.android.p009os;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.StrictMode")
/* renamed from: black.android.os.StrictMode */
/* loaded from: classes.dex */
public interface StrictMode {
    @BStaticField
    int DETECT_VM_FILE_URI_EXPOSURE();

    @BStaticField
    int PENALTY_DEATH_ON_FILE_URI_EXPOSURE();

    @BStaticMethod
    void disableDeathOnFileUriExposure();

    @BStaticField
    int sVmPolicyMask();
}
