package black.android.p009os;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.StrictMode")
/* renamed from: black.android.os.StrictModeStatic */
/* loaded from: classes.dex */
public interface StrictModeStatic {
    @BFieldNotProcess
    Integer DETECT_VM_FILE_URI_EXPOSURE();

    @BFieldNotProcess
    Integer PENALTY_DEATH_ON_FILE_URI_EXPOSURE();

    @BFieldCheckNotProcess
    Field _check_DETECT_VM_FILE_URI_EXPOSURE();

    @BFieldCheckNotProcess
    Field _check_PENALTY_DEATH_ON_FILE_URI_EXPOSURE();

    @BMethodCheckNotProcess
    Method _check_disableDeathOnFileUriExposure();

    @BFieldCheckNotProcess
    Field _check_sVmPolicyMask();

    @BFieldSetNotProcess
    void _set_DETECT_VM_FILE_URI_EXPOSURE(Object obj);

    @BFieldSetNotProcess
    void _set_PENALTY_DEATH_ON_FILE_URI_EXPOSURE(Object obj);

    @BFieldSetNotProcess
    void _set_sVmPolicyMask(Object obj);

    Void disableDeathOnFileUriExposure();

    @BFieldNotProcess
    Integer sVmPolicyMask();
}
