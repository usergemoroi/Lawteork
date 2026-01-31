package black.android.net;

import android.net.IConnectivityManager;
import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName(IConnectivityManager.Stub.DESCRIPTOR)
/* loaded from: classes.dex */
public interface IConnectivityManager {

    @BClassName("android.net.IConnectivityManager$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
