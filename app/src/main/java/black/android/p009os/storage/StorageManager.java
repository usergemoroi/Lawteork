package black.android.p009os.storage;

import android.os.storage.StorageVolume;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.storage.StorageManager")
/* renamed from: black.android.os.storage.StorageManager */
/* loaded from: classes.dex */
public interface StorageManager {
    @BStaticMethod
    StorageVolume[] getVolumeList(int i, int i2);
}
