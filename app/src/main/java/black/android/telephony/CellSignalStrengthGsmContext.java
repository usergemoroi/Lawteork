package black.android.telephony;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.telephony.CellSignalStrengthGsm")
/* loaded from: classes.dex */
public interface CellSignalStrengthGsmContext {
    @BFieldCheckNotProcess
    Field _check_mBitErrorRate();

    @BFieldCheckNotProcess
    Field _check_mSignalStrength();

    @BFieldSetNotProcess
    void _set_mBitErrorRate(Object obj);

    @BFieldSetNotProcess
    void _set_mSignalStrength(Object obj);

    @BFieldNotProcess
    Integer mBitErrorRate();

    @BFieldNotProcess
    Integer mSignalStrength();
}
