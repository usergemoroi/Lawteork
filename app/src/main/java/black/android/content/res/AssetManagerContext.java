package black.android.content.res;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.res.AssetManager")
/* loaded from: classes.dex */
public interface AssetManagerContext {
    @BMethodCheckNotProcess
    Method _check_addAssetPath(String str);

    @BMethodCheckNotProcess
    Method _check_getConfiguration();

    @BMethodCheckNotProcess
    Method _check_getDisplayMetrics();

    Integer addAssetPath(String str);

    Configuration getConfiguration();

    DisplayMetrics getDisplayMetrics();
}
