package black.android.view;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.view.HardwareRenderer")
/* loaded from: classes.dex */
public interface HardwareRenderer {
    @BStaticMethod
    void setupDiskCache(File file);
}
