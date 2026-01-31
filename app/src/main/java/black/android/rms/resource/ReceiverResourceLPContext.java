package black.android.rms.resource;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.rms.resource.ReceiverResource")
/* loaded from: classes.dex */
public interface ReceiverResourceLPContext {
    @BFieldCheckNotProcess
    Field _check_mResourceConfig();

    @BFieldSetNotProcess
    void _set_mResourceConfig(Object obj);

    @BFieldNotProcess
    Object mResourceConfig();
}
