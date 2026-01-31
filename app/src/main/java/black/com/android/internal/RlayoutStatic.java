package black.com.android.internal;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("com.android.internal.R$layout")
/* loaded from: classes.dex */
public interface RlayoutStatic {
    @BFieldCheckNotProcess
    Field _check_resolver_list();

    @BFieldSetNotProcess
    void _set_resolver_list(Object obj);

    @BFieldNotProcess
    Integer resolver_list();
}
