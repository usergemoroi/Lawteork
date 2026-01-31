package black.java.lang;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("java.lang.ThreadGroup")
/* loaded from: classes.dex */
public interface ThreadGroupNContext {
    @BFieldCheckNotProcess
    Field _check_groups();

    @BFieldCheckNotProcess
    Field _check_ngroups();

    @BFieldCheckNotProcess
    Field _check_parent();

    @BFieldSetNotProcess
    void _set_groups(Object obj);

    @BFieldSetNotProcess
    void _set_ngroups(Object obj);

    @BFieldSetNotProcess
    void _set_parent(Object obj);

    @BFieldNotProcess
    java.lang.ThreadGroup[] groups();

    @BFieldNotProcess
    Integer ngroups();

    @BFieldNotProcess
    java.lang.ThreadGroup parent();
}
