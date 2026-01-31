package black.android.app;

import android.app.Application;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.ActivityThread")
/* loaded from: classes.dex */
public interface ActivityThreadStatic {
    @BMethodCheckNotProcess
    Method _check_currentActivityThread();

    @BMethodCheckNotProcess
    Method _check_currentApplication();

    @BMethodCheckNotProcess
    Method _check_currentPackageName();

    @BFieldCheckNotProcess
    Field _check_sPackageManager();

    @BFieldCheckNotProcess
    Field _check_sPermissionManager();

    @BFieldSetNotProcess
    void _set_sPackageManager(Object obj);

    @BFieldSetNotProcess
    void _set_sPermissionManager(Object obj);

    Object currentActivityThread();

    Application currentApplication();

    String currentPackageName();

    @BFieldNotProcess
    IInterface sPackageManager();

    @BFieldNotProcess
    IInterface sPermissionManager();
}
