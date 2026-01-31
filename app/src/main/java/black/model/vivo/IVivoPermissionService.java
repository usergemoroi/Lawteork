package black.model.vivo;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("vivo.app.security.IVivoPermissionService")
/* loaded from: classes.dex */
public interface IVivoPermissionService {

    @BClassName("vivo.app.security.IVivoPermissionService$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
