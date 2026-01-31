package black.android.view;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.view.WindowManagerGlobal")
/* loaded from: classes.dex */
public interface WindowManagerGlobalStatic {
    @BFieldNotProcess
    Integer ADD_PERMISSION_DENIED();

    @BFieldCheckNotProcess
    Field _check_ADD_PERMISSION_DENIED();

    @BFieldCheckNotProcess
    Field _check_sWindowManagerService();

    @BFieldSetNotProcess
    void _set_ADD_PERMISSION_DENIED(Object obj);

    @BFieldSetNotProcess
    void _set_sWindowManagerService(Object obj);

    @BFieldNotProcess
    IInterface sWindowManagerService();
}
