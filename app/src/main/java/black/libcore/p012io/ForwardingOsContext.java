package black.libcore.p012io;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("libcore.io.ForwardingOs")
/* renamed from: black.libcore.io.ForwardingOsContext */
/* loaded from: classes.dex */
public interface ForwardingOsContext {
    @BFieldCheckNotProcess
    Field _check_os();

    @BFieldSetNotProcess
    void _set_os(Object obj);

    @BFieldNotProcess
    /* renamed from: os */
    Object m154os();
}
