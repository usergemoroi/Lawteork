package black.android.app.usage;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.app.usage.IStorageStatsManager")
/* loaded from: classes.dex */
public interface IStorageStatsManager {

    @BClassName("android.app.usage.IStorageStatsManager$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
