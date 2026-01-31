package black.android.view;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.renderscript.RenderScript")
/* loaded from: classes.dex */
public interface RenderScript {
    @BStaticMethod
    void setupDiskCache(File file);
}
