package black.android.app;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.ContextImpl")
/* loaded from: classes.dex */
public interface ContextImplStatic {
    @BMethodCheckNotProcess
    Method _check_createAppContext();

    Object createAppContext();
}
