package black.android.p009os;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.IVibratorManagerService")
/* renamed from: black.android.os.IVibratorManagerService */
/* loaded from: classes.dex */
public interface IVibratorManagerService {

    @BClassName("android.os.IVibratorManagerService$Stub")
    /* renamed from: black.android.os.IVibratorManagerService$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
