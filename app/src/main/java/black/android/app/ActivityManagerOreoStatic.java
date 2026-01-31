package black.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.ActivityManager")
/* loaded from: classes.dex */
public interface ActivityManagerOreoStatic {
    @BFieldNotProcess
    Object IActivityManagerSingleton();

    @BFieldCheckNotProcess
    Field _check_IActivityManagerSingleton();

    @BMethodCheckNotProcess
    Method _check_getService();

    @BFieldSetNotProcess
    void _set_IActivityManagerSingleton(Object obj);

    IInterface getService();
}
