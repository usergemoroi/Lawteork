package black.android.app;

import android.content.Intent;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ServiceStartArgs")
/* loaded from: classes.dex */
public interface ServiceStartArgsContext {
    @BFieldCheckNotProcess
    Field _check_args();

    @BFieldCheckNotProcess
    Field _check_flags();

    @BFieldCheckNotProcess
    Field _check_startId();

    @BFieldCheckNotProcess
    Field _check_taskRemoved();

    @BFieldSetNotProcess
    void _set_args(Object obj);

    @BFieldSetNotProcess
    void _set_flags(Object obj);

    @BFieldSetNotProcess
    void _set_startId(Object obj);

    @BFieldSetNotProcess
    void _set_taskRemoved(Object obj);

    @BFieldNotProcess
    Intent args();

    @BFieldNotProcess
    Integer flags();

    @BFieldNotProcess
    Integer startId();

    @BFieldNotProcess
    Boolean taskRemoved();
}
