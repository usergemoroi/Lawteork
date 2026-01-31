package black.android.telephony;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.telephony.CellInfoCdma")
/* loaded from: classes.dex */
public interface CellInfoCdmaContext {
    @BFieldCheckNotProcess
    Field _check_mCellIdentityCdma();

    @BFieldCheckNotProcess
    Field _check_mCellSignalStrengthCdma();

    @BFieldSetNotProcess
    void _set_mCellIdentityCdma(Object obj);

    @BFieldSetNotProcess
    void _set_mCellSignalStrengthCdma(Object obj);

    @BFieldNotProcess
    android.telephony.CellIdentityCdma mCellIdentityCdma();

    @BFieldNotProcess
    android.telephony.CellSignalStrengthCdma mCellSignalStrengthCdma();
}
