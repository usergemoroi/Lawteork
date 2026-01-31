package black.dalvik.system;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("dalvik.system.VMRuntime")
/* loaded from: classes.dex */
public interface VMRuntimeStatic {
    @BMethodCheckNotProcess
    Method _check_getCurrentInstructionSet();

    @BMethodCheckNotProcess
    Method _check_getRuntime();

    @BMethodCheckNotProcess
    Method _check_is64BitAbi(String str);

    String getCurrentInstructionSet();

    Object getRuntime();

    Boolean is64BitAbi(String str);
}
