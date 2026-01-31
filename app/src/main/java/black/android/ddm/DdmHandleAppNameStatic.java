package black.android.ddm;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.ddm.DdmHandleAppName")
/* loaded from: classes.dex */
public interface DdmHandleAppNameStatic {
    @BMethodCheckNotProcess
    Method _check_setAppName(String str, int i);

    Void setAppName(String str, int i);
}
