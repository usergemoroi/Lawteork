package black.android.app;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.app.IApplicationThread")
/* loaded from: classes.dex */
public interface IApplicationThreadOreo {

    @BClassName("android.app.IApplicationThread$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }

    @BMethod
    void scheduleServiceArgs();
}
