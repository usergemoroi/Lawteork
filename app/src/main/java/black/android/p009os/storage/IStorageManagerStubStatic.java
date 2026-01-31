package black.android.p009os.storage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.storage.IStorageManager$Stub")
/* renamed from: black.android.os.storage.IStorageManagerStubStatic */
/* loaded from: classes.dex */
public interface IStorageManagerStubStatic {
    @BMethodCheckNotProcess
    Method _check_asInterface(IBinder iBinder);

    IInterface asInterface(IBinder iBinder);
}
