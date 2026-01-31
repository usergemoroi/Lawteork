package black.android.p009os;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.INetworkManagementService")
/* renamed from: black.android.os.INetworkManagementService */
/* loaded from: classes.dex */
public interface INetworkManagementService {

    @BClassName("android.os.INetworkManagementService$Stub")
    /* renamed from: black.android.os.INetworkManagementService$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
