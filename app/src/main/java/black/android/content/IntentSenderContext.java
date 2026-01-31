package black.android.content;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.IntentSender")
/* loaded from: classes.dex */
public interface IntentSenderContext {
    @BFieldCheckNotProcess
    Field _check_mTarget();

    @BFieldSetNotProcess
    void _set_mTarget(Object obj);

    @BFieldNotProcess
    IInterface mTarget();
}
