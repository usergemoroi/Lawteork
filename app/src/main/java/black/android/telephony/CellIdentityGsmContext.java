package black.android.telephony;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.telephony.CellIdentityGsm")
/* loaded from: classes.dex */
public interface CellIdentityGsmContext {
    @BFieldCheckNotProcess
    Field _check_mCid();

    @BFieldCheckNotProcess
    Field _check_mLac();

    @BFieldCheckNotProcess
    Field _check_mMcc();

    @BFieldCheckNotProcess
    Field _check_mMnc();

    @BFieldSetNotProcess
    void _set_mCid(Object obj);

    @BFieldSetNotProcess
    void _set_mLac(Object obj);

    @BFieldSetNotProcess
    void _set_mMcc(Object obj);

    @BFieldSetNotProcess
    void _set_mMnc(Object obj);

    @BFieldNotProcess
    Integer mCid();

    @BFieldNotProcess
    Integer mLac();

    @BFieldNotProcess
    Integer mMcc();

    @BFieldNotProcess
    Integer mMnc();
}
