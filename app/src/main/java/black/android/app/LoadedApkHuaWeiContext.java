package black.android.app;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.LoadedApk")
/* loaded from: classes.dex */
public interface LoadedApkHuaWeiContext {
    @BFieldCheckNotProcess
    Field _check_mReceiverResource();

    @BFieldSetNotProcess
    void _set_mReceiverResource(Object obj);

    @BFieldNotProcess
    Object mReceiverResource();
}
