package black.android.p009os;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.IDeviceIdentifiersPolicyService")
/* renamed from: black.android.os.IDeviceIdentifiersPolicyService */
/* loaded from: classes.dex */
public interface IDeviceIdentifiersPolicyService {

    @BClassName("android.os.IDeviceIdentifiersPolicyService$Stub")
    /* renamed from: black.android.os.IDeviceIdentifiersPolicyService$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
