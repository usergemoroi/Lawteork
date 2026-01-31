package black.android.p009os;

import android.os.IBinder;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.Bundle")
/* renamed from: black.android.os.BundleContext */
/* loaded from: classes.dex */
public interface BundleContext {
    @BMethodCheckNotProcess
    Method _check_getIBinder(String str);

    @BMethodCheckNotProcess
    Method _check_putIBinder(String str, IBinder iBinder);

    IBinder getIBinder(String str);

    Void putIBinder(String str, IBinder iBinder);
}
