package black.dalvik.system;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("dalvik.system.BaseDexClassLoader")
/* loaded from: classes.dex */
public interface BaseDexClassLoaderContext {
    @BFieldCheckNotProcess
    Field _check_sharedLibraryLoaders();

    @BFieldSetNotProcess
    void _set_sharedLibraryLoaders(Object obj);

    @BFieldNotProcess
    Object sharedLibraryLoaders();
}
