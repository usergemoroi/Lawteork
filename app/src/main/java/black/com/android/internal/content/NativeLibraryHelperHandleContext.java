package black.com.android.internal.content;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("com.android.internal.content.NativeLibraryHelper$Handle")
/* loaded from: classes.dex */
public interface NativeLibraryHelperHandleContext {
    @BFieldCheckNotProcess
    Field _check_extractNativeLibs();

    @BFieldSetNotProcess
    void _set_extractNativeLibs(Object obj);

    @BFieldNotProcess
    Boolean extractNativeLibs();
}
