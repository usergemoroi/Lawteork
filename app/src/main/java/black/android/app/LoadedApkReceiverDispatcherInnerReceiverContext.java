package black.android.app;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.LoadedApk$ReceiverDispatcher$InnerReceiver")
/* loaded from: classes.dex */
public interface LoadedApkReceiverDispatcherInnerReceiverContext {
    @BFieldCheckNotProcess
    Field _check_mDispatcher();

    @BFieldSetNotProcess
    void _set_mDispatcher(Object obj);

    @BFieldNotProcess
    WeakReference<?> mDispatcher();
}
