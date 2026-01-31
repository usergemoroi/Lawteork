package black.android.app;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.LoadedApk$ServiceDispatcher$InnerConnection")
/* loaded from: classes.dex */
public interface LoadedApkServiceDispatcherInnerConnectionContext {
    @BFieldCheckNotProcess
    Field _check_mDispatcher();

    @BFieldSetNotProcess
    void _set_mDispatcher(Object obj);

    @BFieldNotProcess
    WeakReference<?> mDispatcher();
}
