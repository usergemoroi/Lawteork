package black.android.app;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.IApplicationThread")
/* loaded from: classes.dex */
public interface IApplicationThreadOreoContext {
    @BMethodCheckNotProcess
    Method _check_scheduleServiceArgs();

    Void scheduleServiceArgs();
}
