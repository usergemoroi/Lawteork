package black.android.app.servertransaction;

import android.os.IBinder;
import java.lang.reflect.Field;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.servertransaction.ClientTransaction")
/* loaded from: classes.dex */
public interface ClientTransactionContext {
    @BFieldCheckNotProcess
    Field _check_mActivityCallbacks();

    @BFieldCheckNotProcess
    Field _check_mActivityToken();

    @BFieldCheckNotProcess
    Field _check_mLifecycleStateRequest();

    @BFieldSetNotProcess
    void _set_mActivityCallbacks(Object obj);

    @BFieldSetNotProcess
    void _set_mActivityToken(Object obj);

    @BFieldSetNotProcess
    void _set_mLifecycleStateRequest(Object obj);

    @BFieldNotProcess
    List<Object> mActivityCallbacks();

    @BFieldNotProcess
    IBinder mActivityToken();

    @BFieldNotProcess
    Object mLifecycleStateRequest();
}
