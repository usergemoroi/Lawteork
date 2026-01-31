package black.android.p009os;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.Message")
/* renamed from: black.android.os.MessageStatic */
/* loaded from: classes.dex */
public interface MessageStatic {
    @BMethodCheckNotProcess
    Method _check_updateCheckRecycle(int i);

    Void updateCheckRecycle(int i);
}
