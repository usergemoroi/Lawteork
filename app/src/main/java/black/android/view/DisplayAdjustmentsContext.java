package black.android.view;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.view.DisplayAdjustments")
/* loaded from: classes.dex */
public interface DisplayAdjustmentsContext {
    @BMethodCheckNotProcess
    Method _check_setCompatibilityInfo();

    Void setCompatibilityInfo();
}
