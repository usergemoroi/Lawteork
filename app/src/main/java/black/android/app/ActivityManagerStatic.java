package black.android.app;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ActivityManager")
/* loaded from: classes.dex */
public interface ActivityManagerStatic {
    @BFieldNotProcess
    Integer START_INTENT_NOT_RESOLVED();

    @BFieldNotProcess
    Integer START_NOT_CURRENT_USER_ACTIVITY();

    @BFieldNotProcess
    Integer START_SUCCESS();

    @BFieldNotProcess
    Integer START_TASK_TO_FRONT();

    @BFieldCheckNotProcess
    Field _check_START_INTENT_NOT_RESOLVED();

    @BFieldCheckNotProcess
    Field _check_START_NOT_CURRENT_USER_ACTIVITY();

    @BFieldCheckNotProcess
    Field _check_START_SUCCESS();

    @BFieldCheckNotProcess
    Field _check_START_TASK_TO_FRONT();

    @BFieldSetNotProcess
    void _set_START_INTENT_NOT_RESOLVED(Object obj);

    @BFieldSetNotProcess
    void _set_START_NOT_CURRENT_USER_ACTIVITY(Object obj);

    @BFieldSetNotProcess
    void _set_START_SUCCESS(Object obj);

    @BFieldSetNotProcess
    void _set_START_TASK_TO_FRONT(Object obj);
}
