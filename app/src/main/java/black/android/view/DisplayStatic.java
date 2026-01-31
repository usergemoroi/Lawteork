package black.android.view;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.view.Display")
/* loaded from: classes.dex */
public interface DisplayStatic {
    @BFieldCheckNotProcess
    Field _check_sWindowManager();

    @BFieldSetNotProcess
    void _set_sWindowManager(Object obj);

    @BFieldNotProcess
    IInterface sWindowManager();
}
