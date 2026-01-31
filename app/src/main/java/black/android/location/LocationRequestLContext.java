package black.android.location;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.location.LocationRequest")
/* loaded from: classes.dex */
public interface LocationRequestLContext {
    @BMethodCheckNotProcess
    Method _check_getProvider();

    @BFieldCheckNotProcess
    Field _check_mHideFromAppOps();

    @BFieldCheckNotProcess
    Field _check_mProvider();

    @BFieldCheckNotProcess
    Field _check_mWorkSource();

    @BFieldSetNotProcess
    void _set_mHideFromAppOps(Object obj);

    @BFieldSetNotProcess
    void _set_mProvider(Object obj);

    @BFieldSetNotProcess
    void _set_mWorkSource(Object obj);

    String getProvider();

    @BFieldNotProcess
    Boolean mHideFromAppOps();

    @BFieldNotProcess
    String mProvider();

    @BFieldNotProcess
    Object mWorkSource();
}
