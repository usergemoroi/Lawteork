package black.android.content;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.ContentResolver")
/* loaded from: classes.dex */
public interface ContentResolverContext {
    @BFieldCheckNotProcess
    Field _check_mPackageName();

    @BFieldSetNotProcess
    void _set_mPackageName(Object obj);

    @BFieldNotProcess
    String mPackageName();
}
