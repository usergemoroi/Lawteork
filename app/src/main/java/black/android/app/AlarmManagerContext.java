package black.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.AlarmManager")
/* loaded from: classes.dex */
public interface AlarmManagerContext {
    @BFieldCheckNotProcess
    Field _check_mService();

    @BFieldCheckNotProcess
    Field _check_mTargetSdkVersion();

    @BFieldSetNotProcess
    void _set_mService(Object obj);

    @BFieldSetNotProcess
    void _set_mTargetSdkVersion(Object obj);

    @BFieldNotProcess
    IInterface mService();

    @BFieldNotProcess
    Integer mTargetSdkVersion();
}
