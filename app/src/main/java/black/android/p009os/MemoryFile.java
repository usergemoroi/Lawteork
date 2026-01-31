package black.android.p009os;

import java.io.FileDescriptor;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.os.MemoryFile")
/* renamed from: black.android.os.MemoryFile */
/* loaded from: classes.dex */
public interface MemoryFile {
    @BMethod
    FileDescriptor getFileDescriptor();
}
