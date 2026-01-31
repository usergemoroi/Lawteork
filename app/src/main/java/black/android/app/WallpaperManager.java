package black.android.app;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BStaticField;
@BClassName("android.app.WallpaperManager")
/* loaded from: classes.dex */
public interface WallpaperManager {

    @BClassName("android.app.WallpaperManager$Globals")
    /* loaded from: classes.dex */
    public interface Globals {
        @BField
        Object mService();
    }

    @BStaticField
    Object sGlobals();
}
