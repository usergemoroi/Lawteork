package black.android.app;

import java.io.File;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ContextImpl")
/* loaded from: classes.dex */
public interface ContextImplICSContext {
    @BFieldCheckNotProcess
    Field _check_mExternalCacheDir();

    @BFieldCheckNotProcess
    Field _check_mExternalFilesDir();

    @BFieldSetNotProcess
    void _set_mExternalCacheDir(Object obj);

    @BFieldSetNotProcess
    void _set_mExternalFilesDir(Object obj);

    @BFieldNotProcess
    File mExternalCacheDir();

    @BFieldNotProcess
    File mExternalFilesDir();
}
