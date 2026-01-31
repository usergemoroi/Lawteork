package black.android.telephony;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.telephony.CellInfoCdma")
/* loaded from: classes.dex */
public interface CellInfoCdma {
    @BConstructor
    CellInfoCdma _new();

    @BField
    android.telephony.CellIdentityCdma mCellIdentityCdma();

    @BField
    android.telephony.CellSignalStrengthCdma mCellSignalStrengthCdma();
}
