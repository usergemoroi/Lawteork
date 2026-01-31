package black.android.p009os.storage;

import android.os.storage.StorageVolume;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.os.storage.StorageManager")
/* renamed from: black.android.os.storage.StorageManagerStatic */
/* loaded from: classes.dex */
public interface StorageManagerStatic {
    @BMethodCheckNotProcess
    Method _check_getVolumeList(int i, int i2);

    StorageVolume[] getVolumeList(int i, int i2);
}
