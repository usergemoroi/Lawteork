package black.android.app;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.ActivityClient")
/* loaded from: classes.dex */
public interface ActivityClientStatic {
    @BMethodCheckNotProcess
    Method _check_getActivityClientController();

    @BMethodCheckNotProcess
    Method _check_getInstance();

    @BMethodCheckNotProcess
    Method _check_setActivityClientController(Object obj);

    Object getActivityClientController();

    Object getInstance();

    Object setActivityClientController(Object obj);
}
