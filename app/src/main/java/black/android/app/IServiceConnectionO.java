package black.android.app;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName(IServiceConnection.Stub.DESCRIPTOR)
/* loaded from: classes.dex */
public interface IServiceConnectionO {
    @BMethod
    void connected(ComponentName componentName, IBinder iBinder, boolean z);
}
