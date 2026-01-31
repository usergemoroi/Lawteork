package black.android.net.wifi;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.net.wifi.WifiSsid")
/* loaded from: classes.dex */
public interface WifiSsidStatic {
    @BMethodCheckNotProcess
    Method _check_createFromAsciiEncoded(String str);

    Object createFromAsciiEncoded(String str);
}
