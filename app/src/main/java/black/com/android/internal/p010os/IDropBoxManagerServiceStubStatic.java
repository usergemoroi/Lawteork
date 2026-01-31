package black.com.android.internal.p010os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("com.android.internal.os.IDropBoxManagerService$Stub")
/* renamed from: black.com.android.internal.os.IDropBoxManagerServiceStubStatic */
/* loaded from: classes.dex */
public interface IDropBoxManagerServiceStubStatic {
    @BMethodCheckNotProcess
    Method _check_asInterface(IBinder iBinder);

    IInterface asInterface(IBinder iBinder);
}
