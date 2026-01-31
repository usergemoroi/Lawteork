package black.android.p009os;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.Process")
/* renamed from: black.android.os.ProcessStatic */
/* loaded from: classes.dex */
public interface ProcessStatic {
    @BMethodCheckNotProcess
    Method _check_setArgV0(String str);

    Void setArgV0(String str);
}
