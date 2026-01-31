package black.android.rms.resource;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.rms.resource.ReceiverResource")
/* loaded from: classes.dex */
public interface ReceiverResourceMContext {
    @BFieldCheckNotProcess
    Field _check_mWhiteList();

    @BFieldSetNotProcess
    void _set_mWhiteList(Object obj);

    @BFieldNotProcess
    String[] mWhiteList();
}
