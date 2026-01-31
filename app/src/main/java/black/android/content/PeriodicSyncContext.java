package black.android.content;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.PeriodicSync")
/* loaded from: classes.dex */
public interface PeriodicSyncContext {
    @BFieldCheckNotProcess
    Field _check_flexTime();

    @BFieldSetNotProcess
    void _set_flexTime(Object obj);

    @BFieldNotProcess
    Long flexTime();
}
