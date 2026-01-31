package black.android.app;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.WallpaperManager")
/* loaded from: classes.dex */
public interface WallpaperManagerStatic {
    @BFieldCheckNotProcess
    Field _check_sGlobals();

    @BFieldSetNotProcess
    void _set_sGlobals(Object obj);

    @BFieldNotProcess
    Object sGlobals();
}
