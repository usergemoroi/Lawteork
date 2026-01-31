package black.android.app;

import android.app.Application;
import android.app.IServiceConnection;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.LoadedApk")
/* loaded from: classes.dex */
public interface LoadedApkContext {
    @BMethodCheckNotProcess
    Method _check_forgetServiceDispatcher(Context context, ServiceConnection serviceConnection);

    @BMethodCheckNotProcess
    Method _check_getClassLoader();

    @BMethodCheckNotProcess
    Method _check_getResources();

    @BMethodCheckNotProcess
    Method _check_getServiceDispatcher(ServiceConnection serviceConnection, Context context, Handler handler, int i);

    @BFieldCheckNotProcess
    Field _check_mApplication();

    @BFieldCheckNotProcess
    Field _check_mApplicationInfo();

    @BFieldCheckNotProcess
    Field _check_mCredentialProtectedDataDirFile();

    @BFieldCheckNotProcess
    Field _check_mDataDir();

    @BFieldCheckNotProcess
    Field _check_mDataDirFile();

    @BFieldCheckNotProcess
    Field _check_mDeviceProtectedDataDirFile();

    @BFieldCheckNotProcess
    Field _check_mLibDir();

    @BFieldCheckNotProcess
    Field _check_mPackageName();

    @BFieldCheckNotProcess
    Field _check_mSecurityViolation();

    @BMethodCheckNotProcess
    Method _check_makeApplication(boolean z, android.app.Instrumentation instrumentation);

    @BFieldSetNotProcess
    void _set_mApplication(Object obj);

    @BFieldSetNotProcess
    void _set_mApplicationInfo(Object obj);

    @BFieldSetNotProcess
    void _set_mCredentialProtectedDataDirFile(Object obj);

    @BFieldSetNotProcess
    void _set_mDataDir(Object obj);

    @BFieldSetNotProcess
    void _set_mDataDirFile(Object obj);

    @BFieldSetNotProcess
    void _set_mDeviceProtectedDataDirFile(Object obj);

    @BFieldSetNotProcess
    void _set_mLibDir(Object obj);

    @BFieldSetNotProcess
    void _set_mPackageName(Object obj);

    @BFieldSetNotProcess
    void _set_mSecurityViolation(Object obj);

    IServiceConnection forgetServiceDispatcher(Context context, ServiceConnection serviceConnection);

    ClassLoader getClassLoader();

    Object getResources();

    IServiceConnection getServiceDispatcher(ServiceConnection serviceConnection, Context context, Handler handler, int i);

    @BFieldNotProcess
    Application mApplication();

    @BFieldNotProcess
    ApplicationInfo mApplicationInfo();

    @BFieldNotProcess
    File mCredentialProtectedDataDirFile();

    @BFieldNotProcess
    String mDataDir();

    @BFieldNotProcess
    File mDataDirFile();

    @BFieldNotProcess
    File mDeviceProtectedDataDirFile();

    @BFieldNotProcess
    String mLibDir();

    @BFieldNotProcess
    Boolean mPackageName();

    @BFieldNotProcess
    Boolean mSecurityViolation();

    Application makeApplication(boolean z, android.app.Instrumentation instrumentation);
}
