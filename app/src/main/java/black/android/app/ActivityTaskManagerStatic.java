package black.android.app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.ActivityTaskManager")
/* loaded from: classes.dex */
public interface ActivityTaskManagerStatic {
    @BFieldNotProcess
    Object IActivityTaskManagerSingleton();

    @BFieldCheckNotProcess
    Field _check_IActivityTaskManagerSingleton();

    @BMethodCheckNotProcess
    Method _check_getService();

    @BFieldSetNotProcess
    void _set_IActivityTaskManagerSingleton(Object obj);

    Object getService();
}
