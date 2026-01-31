package black.android.p009os;

import android.os.Handler;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.os.Handler")
/* renamed from: black.android.os.HandlerContext */
/* loaded from: classes.dex */
public interface HandlerContext {
    @BFieldCheckNotProcess
    Field _check_mCallback();

    @BFieldSetNotProcess
    void _set_mCallback(Object obj);

    @BFieldNotProcess
    Handler.Callback mCallback();
}
