package black.android.p009os;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.UserHandle")
/* renamed from: black.android.os.UserHandleStatic */
/* loaded from: classes.dex */
public interface UserHandleStatic {
    @BMethodCheckNotProcess
    Method _check_myUserId();

    Integer myUserId();
}
