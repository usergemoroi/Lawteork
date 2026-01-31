package black.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.ActivityManagerNative")
/* loaded from: classes.dex */
public interface ActivityManagerNativeStatic {
    @BFieldCheckNotProcess
    Field _check_gDefault();

    @BMethodCheckNotProcess
    Method _check_getDefault();

    @BFieldSetNotProcess
    void _set_gDefault(Object obj);

    @BFieldNotProcess
    Object gDefault();

    IInterface getDefault();
}
