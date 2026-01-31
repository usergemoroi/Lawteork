package black.java.p011io;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("java.io.File")
/* renamed from: black.java.io.FileStatic */
/* loaded from: classes.dex */
public interface FileStatic {
    @BFieldCheckNotProcess
    Field _check_fs();

    @BFieldSetNotProcess
    void _set_fs(Object obj);

    @BFieldNotProcess
    /* renamed from: fs */
    Object m156fs();
}
