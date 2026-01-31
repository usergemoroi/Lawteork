package black.android.app;

import android.os.IBinder;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.ClientTransactionHandler")
/* loaded from: classes.dex */
public interface ClientTransactionHandlerContext {
    @BMethodCheckNotProcess
    Method _check_getActivityClient(IBinder iBinder);

    Object getActivityClient(IBinder iBinder);
}
