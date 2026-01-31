package top.niunaijun.blackbox.utils.compat;

import p015e.AbstractC0923b;
/* loaded from: classes3.dex */
public class StrictModeCompat {
    public static int DETECT_VM_FILE_URI_EXPOSURE;
    public static int PENALTY_DEATH_ON_FILE_URI_EXPOSURE;

    static {
        DETECT_VM_FILE_URI_EXPOSURE = AbstractC0923b.m87a().DETECT_VM_FILE_URI_EXPOSURE() == null ? 8192 : AbstractC0923b.m87a().DETECT_VM_FILE_URI_EXPOSURE().intValue();
        PENALTY_DEATH_ON_FILE_URI_EXPOSURE = AbstractC0923b.m87a().PENALTY_DEATH_ON_FILE_URI_EXPOSURE() == null ? 67108864 : AbstractC0923b.m87a().PENALTY_DEATH_ON_FILE_URI_EXPOSURE().intValue();
    }

    public static boolean disableDeathOnFileUriExposure() {
        try {
            AbstractC0923b.m87a().disableDeathOnFileUriExposure();
            return true;
        } catch (Throwable th) {
            try {
                AbstractC0923b.m87a()._set_sVmPolicyMask(Integer.valueOf(AbstractC0923b.m87a().sVmPolicyMask().intValue() & (~(DETECT_VM_FILE_URI_EXPOSURE | PENALTY_DEATH_ON_FILE_URI_EXPOSURE))));
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return false;
            }
        }
    }
}
