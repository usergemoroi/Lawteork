package black.android.app;

import android.content.Context;
import android.content.ServiceConnection;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.LoadedApk$ServiceDispatcher")
/* loaded from: classes.dex */
public interface LoadedApkServiceDispatcherContext {
    @BFieldCheckNotProcess
    Field _check_mConnection();

    @BFieldCheckNotProcess
    Field _check_mContext();

    @BFieldSetNotProcess
    void _set_mConnection(Object obj);

    @BFieldSetNotProcess
    void _set_mContext(Object obj);

    @BFieldNotProcess
    ServiceConnection mConnection();

    @BFieldNotProcess
    Context mContext();
}
