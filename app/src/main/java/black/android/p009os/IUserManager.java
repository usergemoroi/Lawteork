package black.android.p009os;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.IUserManager")
/* renamed from: black.android.os.IUserManager */
/* loaded from: classes.dex */
public interface IUserManager {

    @BClassName("android.os.IUserManager$Stub")
    /* renamed from: black.android.os.IUserManager$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
