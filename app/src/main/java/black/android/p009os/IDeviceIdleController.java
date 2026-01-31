package black.android.p009os;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.IDeviceIdleController")
/* renamed from: black.android.os.IDeviceIdleController */
/* loaded from: classes.dex */
public interface IDeviceIdleController {

    @BClassName("android.os.IDeviceIdleController$Stub")
    /* renamed from: black.android.os.IDeviceIdleController$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
