package black.android.app.servertransaction;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.servertransaction.TopResumedActivityChangeItem")
/* loaded from: classes.dex */
public interface TopResumedActivityChangeItemContext {
    @BFieldCheckNotProcess
    Field _check_mOnTop();

    @BFieldSetNotProcess
    void _set_mOnTop(Object obj);

    @BFieldNotProcess
    Boolean mOnTop();
}
