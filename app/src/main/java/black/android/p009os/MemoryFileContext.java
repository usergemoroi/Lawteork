package black.android.p009os;

import java.io.FileDescriptor;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.MemoryFile")
/* renamed from: black.android.os.MemoryFileContext */
/* loaded from: classes.dex */
public interface MemoryFileContext {
    @BMethodCheckNotProcess
    Method _check_getFileDescriptor();

    FileDescriptor getFileDescriptor();
}
