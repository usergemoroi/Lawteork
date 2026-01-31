package black.android.app.admin;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.app.admin.IDevicePolicyManager")
/* loaded from: classes.dex */
public interface IDevicePolicyManager {

    @BClassName("android.app.admin.IDevicePolicyManager$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
