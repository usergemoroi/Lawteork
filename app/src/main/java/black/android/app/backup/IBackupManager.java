package black.android.app.backup;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.app.backup.IBackupManager")
/* loaded from: classes.dex */
public interface IBackupManager {

    @BClassName("android.app.backup.IBackupManager$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
