package black.android.hardware.display;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.hardware.display.DisplayManagerGlobal")
/* loaded from: classes.dex */
public interface DisplayManagerGlobalContext {
    @BFieldCheckNotProcess
    Field _check_mDm();

    @BFieldSetNotProcess
    void _set_mDm(Object obj);

    @BFieldNotProcess
    IInterface mDm();
}
