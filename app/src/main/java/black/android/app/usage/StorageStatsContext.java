package black.android.app.usage;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.usage.StorageStats")
/* loaded from: classes.dex */
public interface StorageStatsContext {
    @BFieldCheckNotProcess
    Field _check_cacheBytes();

    @BFieldCheckNotProcess
    Field _check_codeBytes();

    @BFieldCheckNotProcess
    Field _check_dataBytes();

    @BFieldSetNotProcess
    void _set_cacheBytes(Object obj);

    @BFieldSetNotProcess
    void _set_codeBytes(Object obj);

    @BFieldSetNotProcess
    void _set_dataBytes(Object obj);

    @BFieldNotProcess
    Long cacheBytes();

    @BFieldNotProcess
    Long codeBytes();

    @BFieldNotProcess
    Long dataBytes();
}
