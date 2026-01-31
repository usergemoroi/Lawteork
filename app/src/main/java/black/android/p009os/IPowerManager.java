package black.android.p009os;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.IPowerManager")
/* renamed from: black.android.os.IPowerManager */
/* loaded from: classes.dex */
public interface IPowerManager {

    @BClassName("android.os.IPowerManager$Stub")
    /* renamed from: black.android.os.IPowerManager$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
