package black.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ActivityClient$ActivityClientControllerSingleton")
/* loaded from: classes.dex */
public interface ActivityClientActivityClientControllerSingletonContext {
    @BFieldCheckNotProcess
    Field _check_mKnownInstance();

    @BFieldSetNotProcess
    void _set_mKnownInstance(Object obj);

    @BFieldNotProcess
    IInterface mKnownInstance();
}
