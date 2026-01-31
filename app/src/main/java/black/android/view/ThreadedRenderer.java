package black.android.view;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.view.ThreadedRenderer")
/* loaded from: classes.dex */
public interface ThreadedRenderer {
    @BStaticMethod
    void setupDiskCache(File file);
}
