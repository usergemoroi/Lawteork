package black.android.net.wifi;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.net.wifi.WifiManager")
/* loaded from: classes.dex */
public interface WifiManagerStatic {
    @BFieldCheckNotProcess
    Field _check_sService();

    @BFieldSetNotProcess
    void _set_sService(Object obj);

    @BFieldNotProcess
    IInterface sService();
}
