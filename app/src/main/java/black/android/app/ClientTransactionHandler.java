package black.android.app;

import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.app.ClientTransactionHandler")
/* loaded from: classes.dex */
public interface ClientTransactionHandler {
    @BMethod
    Object getActivityClient(IBinder iBinder);
}
