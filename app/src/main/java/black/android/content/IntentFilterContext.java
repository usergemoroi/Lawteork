package black.android.content;

import java.lang.reflect.Field;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.IntentFilter")
/* loaded from: classes.dex */
public interface IntentFilterContext {
    @BFieldCheckNotProcess
    Field _check_mActions();

    @BFieldCheckNotProcess
    Field _check_mCategories();

    @BFieldSetNotProcess
    void _set_mActions(Object obj);

    @BFieldSetNotProcess
    void _set_mCategories(Object obj);

    @BFieldNotProcess
    List<String> mActions();

    @BFieldNotProcess
    List<String> mCategories();
}
