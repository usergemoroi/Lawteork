package black.android.content;

import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess(IIntentReceiver.Stub.DESCRIPTOR)
/* loaded from: classes.dex */
public interface IIntentReceiverContext {
    @BMethodCheckNotProcess
    Method _check_performReceive(Intent intent, int i, String str, Bundle bundle, boolean z, boolean z2, int i2);

    Void performReceive(Intent intent, int i, String str, Bundle bundle, boolean z, boolean z2, int i2);
}
