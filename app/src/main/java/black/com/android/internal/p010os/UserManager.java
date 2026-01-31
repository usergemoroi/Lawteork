package black.com.android.internal.p010os;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.UserManager")
/* renamed from: black.com.android.internal.os.UserManager */
/* loaded from: classes.dex */
public interface UserManager {

    @BClassName("android.os.IUserManager$Stub")
    /* renamed from: black.com.android.internal.os.UserManager$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
