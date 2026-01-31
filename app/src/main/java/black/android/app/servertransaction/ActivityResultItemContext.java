package black.android.app.servertransaction;

import java.lang.reflect.Field;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.servertransaction.ActivityResultItem")
/* loaded from: classes.dex */
public interface ActivityResultItemContext {
    @BFieldCheckNotProcess
    Field _check_mResultInfoList();

    @BFieldSetNotProcess
    void _set_mResultInfoList(Object obj);

    @BFieldNotProcess
    List mResultInfoList();
}
