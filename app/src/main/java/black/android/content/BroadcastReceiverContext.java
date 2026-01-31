package black.android.content;

import android.content.BroadcastReceiver;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BParamClassName;
@BClassNameNotProcess("android.content.BroadcastReceiver")
/* loaded from: classes.dex */
public interface BroadcastReceiverContext {
    @BMethodCheckNotProcess
    Method _check_getPendingResult();

    @BMethodCheckNotProcess
    Method _check_setPendingResult(@BParamClassName("android.content.BroadcastReceiver$PendingResult") Object obj);

    BroadcastReceiver.PendingResult getPendingResult();

    Void setPendingResult(@BParamClassName("android.content.BroadcastReceiver$PendingResult") Object obj);
}
