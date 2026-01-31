package black.com.android.internal.app;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("com.android.internal.app.IBatteryStats")
/* loaded from: classes.dex */
public interface IBatteryStats {

    @BClassName("com.android.internal.app.IBatteryStats$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
