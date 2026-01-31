package black.libcore.p012io;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("libcore.io.Libcore")
/* renamed from: black.libcore.io.LibcoreStatic */
/* loaded from: classes.dex */
public interface LibcoreStatic {
    @BFieldCheckNotProcess
    Field _check_os();

    @BFieldSetNotProcess
    void _set_os(Object obj);

    @BFieldNotProcess
    /* renamed from: os */
    Object m152os();
}
