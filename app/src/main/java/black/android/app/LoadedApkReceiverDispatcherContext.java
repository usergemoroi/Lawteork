package black.android.app;

import android.content.BroadcastReceiver;
import android.content.IIntentReceiver;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.LoadedApk$ReceiverDispatcher")
/* loaded from: classes.dex */
public interface LoadedApkReceiverDispatcherContext {
    @BMethodCheckNotProcess
    Method _check_getIIntentReceiver();

    @BFieldCheckNotProcess
    Field _check_mIIntentReceiver();

    @BFieldCheckNotProcess
    Field _check_mReceiver();

    @BFieldSetNotProcess
    void _set_mIIntentReceiver(Object obj);

    @BFieldSetNotProcess
    void _set_mReceiver(Object obj);

    IInterface getIIntentReceiver();

    @BFieldNotProcess
    IIntentReceiver mIIntentReceiver();

    @BFieldNotProcess
    BroadcastReceiver mReceiver();
}
