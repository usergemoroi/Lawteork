package black.android.net.wifi;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.net.wifi.WifiScanner")
/* loaded from: classes.dex */
public interface WifiScannerStatic {
    @BFieldNotProcess
    String GET_AVAILABLE_CHANNELS_EXTRA();

    @BFieldCheckNotProcess
    Field _check_GET_AVAILABLE_CHANNELS_EXTRA();

    @BFieldSetNotProcess
    void _set_GET_AVAILABLE_CHANNELS_EXTRA(Object obj);
}
