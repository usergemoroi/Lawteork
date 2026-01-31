package black.android.telephony;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.telephony.CellInfoGsm")
/* loaded from: classes.dex */
public interface CellInfoGsmContext {
    @BFieldCheckNotProcess
    Field _check_mCellIdentityGsm();

    @BFieldCheckNotProcess
    Field _check_mCellSignalStrengthGsm();

    @BFieldSetNotProcess
    void _set_mCellIdentityGsm(Object obj);

    @BFieldSetNotProcess
    void _set_mCellSignalStrengthGsm(Object obj);

    @BFieldNotProcess
    android.telephony.CellIdentityGsm mCellIdentityGsm();

    @BFieldNotProcess
    android.telephony.CellSignalStrengthGsm mCellSignalStrengthGsm();
}
