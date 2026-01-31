package black.android.app;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BParamClassName;
@BClassNameNotProcess("android.app.ActivityThread")
/* loaded from: classes.dex */
public interface ActivityThreadContext {
    @BMethodCheckNotProcess
    Method _check_getActivityClient(IBinder iBinder);

    @BMethodCheckNotProcess
    Method _check_getApplicationThread();

    @BMethodCheckNotProcess
    Method _check_getHandler();

    @BMethodCheckNotProcess
    Method _check_getLaunchingActivity(IBinder iBinder);

    @BMethodCheckNotProcess
    Method _check_getPackageInfo(ApplicationInfo applicationInfo, @BParamClassName("android.content.res.CompatibilityInfo") Object obj, int i);

    @BMethodCheckNotProcess
    Method _check_getProcessName();

    @BMethodCheckNotProcess
    Method _check_getSystemContext();

    @BFieldCheckNotProcess
    Field _check_mActivities();

    @BFieldCheckNotProcess
    Field _check_mAppThread();

    @BFieldCheckNotProcess
    Field _check_mBoundApplication();

    @BFieldCheckNotProcess
    Field _check_mH();

    @BFieldCheckNotProcess
    Field _check_mInitialApplication();

    @BFieldCheckNotProcess
    Field _check_mInstrumentation();

    @BFieldCheckNotProcess
    Field _check_mLocalProvidersByName();

    @BFieldCheckNotProcess
    Field _check_mPackages();

    @BFieldCheckNotProcess
    Field _check_mProviderMap();

    @BMethodCheckNotProcess
    Method _check_performNewIntents(IBinder iBinder, List list);

    @BMethodCheckNotProcess
    Method _check_sendActivityResult(IBinder iBinder, String str, int i, int i2, Intent intent);

    @BFieldSetNotProcess
    void _set_mActivities(Object obj);

    @BFieldSetNotProcess
    void _set_mAppThread(Object obj);

    @BFieldSetNotProcess
    void _set_mBoundApplication(Object obj);

    @BFieldSetNotProcess
    void _set_mH(Object obj);

    @BFieldSetNotProcess
    void _set_mInitialApplication(Object obj);

    @BFieldSetNotProcess
    void _set_mInstrumentation(Object obj);

    @BFieldSetNotProcess
    void _set_mLocalProvidersByName(Object obj);

    @BFieldSetNotProcess
    void _set_mPackages(Object obj);

    @BFieldSetNotProcess
    void _set_mProviderMap(Object obj);

    Object getActivityClient(IBinder iBinder);

    IBinder getApplicationThread();

    Handler getHandler();

    Object getLaunchingActivity(IBinder iBinder);

    Object getPackageInfo(ApplicationInfo applicationInfo, @BParamClassName("android.content.res.CompatibilityInfo") Object obj, int i);

    String getProcessName();

    Object getSystemContext();

    @BFieldNotProcess
    Map<IBinder, Object> mActivities();

    @BFieldNotProcess
    Object mAppThread();

    @BFieldNotProcess
    Object mBoundApplication();

    @BFieldNotProcess
    /* renamed from: mH */
    Handler m160mH();

    @BFieldNotProcess
    Application mInitialApplication();

    @BFieldNotProcess
    android.app.Instrumentation mInstrumentation();

    @BFieldNotProcess
    Map<?, ?> mLocalProvidersByName();

    @BFieldNotProcess
    Map<String, WeakReference<?>> mPackages();

    @BFieldNotProcess
    Map<?, ?> mProviderMap();

    Void performNewIntents(IBinder iBinder, List list);

    Void sendActivityResult(IBinder iBinder, String str, int i, int i2, Intent intent);
}
