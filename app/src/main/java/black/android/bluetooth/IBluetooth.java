package black.android.bluetooth;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.bluetooth.IBluetooth")
/* loaded from: classes.dex */
public interface IBluetooth {

    @BClassName("android.bluetooth.IBluetooth$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
