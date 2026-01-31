package black.android.p009os.storage;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.storage.IStorageManager")
/* renamed from: black.android.os.storage.IStorageManager */
/* loaded from: classes.dex */
public interface IStorageManager {

    @BClassName("android.os.storage.IStorageManager$Stub")
    /* renamed from: black.android.os.storage.IStorageManager$Stub */
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
