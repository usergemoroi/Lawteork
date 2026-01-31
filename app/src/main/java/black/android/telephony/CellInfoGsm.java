package black.android.telephony;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.telephony.CellInfoGsm")
/* loaded from: classes.dex */
public interface CellInfoGsm {
    @BConstructor
    CellInfoGsm _new();

    @BField
    android.telephony.CellIdentityGsm mCellIdentityGsm();

    @BField
    android.telephony.CellSignalStrengthGsm mCellSignalStrengthGsm();
}
