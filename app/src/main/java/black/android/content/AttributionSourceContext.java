package black.android.content;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.AttributionSource")
/* loaded from: classes.dex */
public interface AttributionSourceContext {
    @BMethodCheckNotProcess
    Method _check_getNext();

    @BFieldCheckNotProcess
    Field _check_mAttributionSourceState();

    @BFieldSetNotProcess
    void _set_mAttributionSourceState(Object obj);

    Object getNext();

    @BFieldNotProcess
    Object mAttributionSourceState();
}
