package black.android.renderscript;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.renderscript.RenderScriptCacheDir")
/* loaded from: classes.dex */
public interface RenderScriptCacheDir {
    @BStaticMethod
    void setupDiskCache(File file);
}
