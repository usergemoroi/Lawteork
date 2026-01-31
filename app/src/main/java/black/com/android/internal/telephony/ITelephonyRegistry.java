package black.com.android.internal.telephony;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("com.android.internal.telephony.ITelephonyRegistry")
/* loaded from: classes.dex */
public interface ITelephonyRegistry {

    @BClassName("com.android.internal.telephony.ITelephonyRegistry$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
