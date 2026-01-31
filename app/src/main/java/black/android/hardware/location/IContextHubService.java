package black.android.hardware.location;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.hardware.location.IContextHubService")
/* loaded from: classes.dex */
public interface IContextHubService {

    @BClassName("android.hardware.location.IContextHubService$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
