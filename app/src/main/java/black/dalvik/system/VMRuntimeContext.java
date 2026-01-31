package black.dalvik.system;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("dalvik.system.VMRuntime")
/* loaded from: classes.dex */
public interface VMRuntimeContext {
    @BMethodCheckNotProcess
    Method _check_is64Bit();

    @BMethodCheckNotProcess
    Method _check_isJavaDebuggable();

    @BMethodCheckNotProcess
    Method _check_setTargetSdkVersion(int i);

    Boolean is64Bit();

    Boolean isJavaDebuggable();

    Void setTargetSdkVersion(int i);
}
