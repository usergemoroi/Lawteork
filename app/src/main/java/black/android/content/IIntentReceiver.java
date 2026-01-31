package black.android.content;

import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName(IIntentReceiver.Stub.DESCRIPTOR)
/* loaded from: classes.dex */
public interface IIntentReceiver {
    @BMethod
    void performReceive(Intent intent, int i, String str, Bundle bundle, boolean z, boolean z2, int i2);
}
