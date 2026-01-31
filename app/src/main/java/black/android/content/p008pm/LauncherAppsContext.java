package black.android.content.p008pm;

import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.UserManager;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.LauncherApps")
/* renamed from: black.android.content.pm.LauncherAppsContext */
/* loaded from: classes.dex */
public interface LauncherAppsContext {
    @BFieldCheckNotProcess
    Field _check_mPm();

    @BFieldCheckNotProcess
    Field _check_mService();

    @BFieldCheckNotProcess
    Field _check_mUserManager();

    @BFieldSetNotProcess
    void _set_mPm(Object obj);

    @BFieldSetNotProcess
    void _set_mService(Object obj);

    @BFieldSetNotProcess
    void _set_mUserManager(Object obj);

    @BFieldNotProcess
    PackageManager mPm();

    @BFieldNotProcess
    IInterface mService();

    @BFieldNotProcess
    UserManager mUserManager();
}
