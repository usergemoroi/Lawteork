package black.com.android.internal.content;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BParamClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("com.android.internal.content.NativeLibraryHelper")
/* loaded from: classes.dex */
public interface NativeLibraryHelper {

    @BClassName("com.android.internal.content.NativeLibraryHelper$Handle")
    /* loaded from: classes.dex */
    public interface Handle {
        @BStaticMethod
        Object create(File file);

        @BField
        boolean extractNativeLibs();
    }

    @BStaticMethod
    Integer copyNativeBinaries(Handle handle, File file, String str);

    @BStaticMethod
    Integer findSupportedAbi(Handle handle, @BParamClassName("[Ljava.lang.String;") String[] strArr);
}
