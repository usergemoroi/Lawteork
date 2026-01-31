package black.android.app;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.WallpaperManager$Globals")
/* loaded from: classes.dex */
public interface WallpaperManagerGlobalsContext {
    @BFieldCheckNotProcess
    Field _check_mService();

    @BFieldSetNotProcess
    void _set_mService(Object obj);

    @BFieldNotProcess
    Object mService();
}
