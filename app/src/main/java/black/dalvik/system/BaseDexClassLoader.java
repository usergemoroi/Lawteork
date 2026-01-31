package black.dalvik.system;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("dalvik.system.BaseDexClassLoader")
/* loaded from: classes.dex */
public interface BaseDexClassLoader {
    @BField
    Object sharedLibraryLoaders();
}
