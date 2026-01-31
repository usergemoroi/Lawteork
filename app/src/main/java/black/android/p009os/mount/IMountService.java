package black.android.p009os.mount;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.storage.IMountService")
/* renamed from: black.android.os.mount.IMountService */
/* loaded from: classes.dex */
public interface IMountService {

    @BClassName("android.os.storage.IMountService$Stub")
    /* renamed from: black.android.os.mount.IMountService$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
