package black.android.graphics;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.graphics.Compatibility")
/* loaded from: classes.dex */
public interface CompatibilityStatic {
    @BMethodCheckNotProcess
    Method _check_setTargetSdkVersion(int i);

    Void setTargetSdkVersion(int i);
}
