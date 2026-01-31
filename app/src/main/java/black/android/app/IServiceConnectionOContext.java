package black.android.app;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess(IServiceConnection.Stub.DESCRIPTOR)
/* loaded from: classes.dex */
public interface IServiceConnectionOContext {
    @BMethodCheckNotProcess
    Method _check_connected(ComponentName componentName, IBinder iBinder, boolean z);

    Void connected(ComponentName componentName, IBinder iBinder, boolean z);
}
