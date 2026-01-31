package black.android.app;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ActivityThread$H")
/* loaded from: classes.dex */
public interface ActivityThreadHStatic {
    @BFieldNotProcess
    Integer CREATE_SERVICE();

    @BFieldNotProcess
    Integer EXECUTE_TRANSACTION();

    @BFieldNotProcess
    Integer LAUNCH_ACTIVITY();

    @BFieldNotProcess
    Integer SCHEDULE_CRASH();

    @BFieldCheckNotProcess
    Field _check_CREATE_SERVICE();

    @BFieldCheckNotProcess
    Field _check_EXECUTE_TRANSACTION();

    @BFieldCheckNotProcess
    Field _check_LAUNCH_ACTIVITY();

    @BFieldCheckNotProcess
    Field _check_SCHEDULE_CRASH();

    @BFieldSetNotProcess
    void _set_CREATE_SERVICE(Object obj);

    @BFieldSetNotProcess
    void _set_EXECUTE_TRANSACTION(Object obj);

    @BFieldSetNotProcess
    void _set_LAUNCH_ACTIVITY(Object obj);

    @BFieldSetNotProcess
    void _set_SCHEDULE_CRASH(Object obj);
}
