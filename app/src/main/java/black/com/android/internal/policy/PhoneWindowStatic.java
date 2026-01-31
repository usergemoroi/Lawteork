package black.com.android.internal.policy;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("com.android.internal.policy.PhoneWindow$WindowManagerHolder")
/* loaded from: classes.dex */
public interface PhoneWindowStatic {
    @BFieldCheckNotProcess
    Field _check_sWindowManager();

    @BFieldSetNotProcess
    void _set_sWindowManager(Object obj);

    @BFieldNotProcess
    IInterface sWindowManager();
}
