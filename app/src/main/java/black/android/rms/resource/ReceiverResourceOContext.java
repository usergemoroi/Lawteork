package black.android.rms.resource;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.rms.resource.ReceiverResource")
/* loaded from: classes.dex */
public interface ReceiverResourceOContext {
    @BFieldCheckNotProcess
    Field _check_mWhiteListMap();

    @BFieldSetNotProcess
    void _set_mWhiteListMap(Object obj);

    @BFieldNotProcess
    Map<Integer, List<String>> mWhiteListMap();
}
