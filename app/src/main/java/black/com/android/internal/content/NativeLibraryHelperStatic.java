package black.com.android.internal.content;

import black.com.android.internal.content.NativeLibraryHelper;
import java.io.File;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BParamClassName;
@BClassNameNotProcess("com.android.internal.content.NativeLibraryHelper")
/* loaded from: classes.dex */
public interface NativeLibraryHelperStatic {
    @BMethodCheckNotProcess
    Method _check_copyNativeBinaries(NativeLibraryHelper.Handle handle, File file, String str);

    @BMethodCheckNotProcess
    Method _check_findSupportedAbi(NativeLibraryHelper.Handle handle, @BParamClassName("[Ljava.lang.String;") String[] strArr);

    Integer copyNativeBinaries(NativeLibraryHelper.Handle handle, File file, String str);

    Integer findSupportedAbi(NativeLibraryHelper.Handle handle, @BParamClassName("[Ljava.lang.String;") String[] strArr);
}
