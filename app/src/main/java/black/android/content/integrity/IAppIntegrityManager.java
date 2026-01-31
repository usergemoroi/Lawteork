package black.android.content.integrity;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.content.integrity.IAppIntegrityManager")
/* loaded from: classes.dex */
public interface IAppIntegrityManager {

    @BClassName("android.content.integrity.IAppIntegrityManager$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
