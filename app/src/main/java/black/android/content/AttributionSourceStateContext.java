package black.android.content;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.AttributionSourceState")
/* loaded from: classes.dex */
public interface AttributionSourceStateContext {
    @BFieldCheckNotProcess
    Field _check_packageName();

    @BFieldCheckNotProcess
    Field _check_pid();

    @BFieldCheckNotProcess
    Field _check_uid();

    @BFieldSetNotProcess
    void _set_packageName(Object obj);

    @BFieldSetNotProcess
    void _set_pid(Object obj);

    @BFieldSetNotProcess
    void _set_uid(Object obj);

    @BFieldNotProcess
    String packageName();

    @BFieldNotProcess
    Integer pid();

    @BFieldNotProcess
    Integer uid();
}
