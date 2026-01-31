package black.android.app;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ActivityClient")
/* loaded from: classes.dex */
public interface ActivityClientContext {
    @BFieldNotProcess
    Object INTERFACE_SINGLETON();

    @BFieldCheckNotProcess
    Field _check_INTERFACE_SINGLETON();

    @BFieldSetNotProcess
    void _set_INTERFACE_SINGLETON(Object obj);
}
