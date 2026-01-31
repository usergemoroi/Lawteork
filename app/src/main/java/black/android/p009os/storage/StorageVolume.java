package black.android.p009os.storage;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.os.storage.StorageVolume")
/* renamed from: black.android.os.storage.StorageVolume */
/* loaded from: classes.dex */
public interface StorageVolume {
    @BField
    File mInternalPath();

    @BField
    File mPath();
}
