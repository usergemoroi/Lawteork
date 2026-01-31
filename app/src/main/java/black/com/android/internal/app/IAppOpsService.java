package black.com.android.internal.app;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("com.android.internal.app.IAppOpsService")
/* loaded from: classes.dex */
public interface IAppOpsService {

    @BClassName("com.android.internal.app.IAppOpsService$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
