package black.android.net.wifi;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BStaticField;
@BClassName("android.net.wifi.WifiManager")
/* loaded from: classes.dex */
public interface WifiManager {
    @BField
    IInterface mService();

    @BStaticField
    IInterface sService();
}
