package black.android.rms;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.rms.HwSysResImpl")
/* loaded from: classes.dex */
public interface HwSysResImplPContext {
    @BFieldCheckNotProcess
    Field _check_mWhiteListMap();

    @BFieldSetNotProcess
    void _set_mWhiteListMap(Object obj);

    @BFieldNotProcess
    Map<Integer, ArrayList<String>> mWhiteListMap();
}
