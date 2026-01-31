package black.android.p009os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.IDeviceIdleController$Stub")
/* renamed from: black.android.os.IDeviceIdleControllerStubStatic */
/* loaded from: classes.dex */
public interface IDeviceIdleControllerStubStatic {
    @BMethodCheckNotProcess
    Method _check_asInterface(IBinder iBinder);

    IInterface asInterface(IBinder iBinder);
}
