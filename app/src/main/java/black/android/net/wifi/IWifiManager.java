package black.android.net.wifi;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.net.wifi.IWifiManager")
/* loaded from: classes.dex */
public interface IWifiManager {

    @BClassName("android.net.wifi.IWifiManager$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
