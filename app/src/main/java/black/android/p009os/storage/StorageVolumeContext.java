package black.android.p009os.storage;

import java.io.File;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.os.storage.StorageVolume")
/* renamed from: black.android.os.storage.StorageVolumeContext */
/* loaded from: classes.dex */
public interface StorageVolumeContext {
    @BFieldCheckNotProcess
    Field _check_mInternalPath();

    @BFieldCheckNotProcess
    Field _check_mPath();

    @BFieldSetNotProcess
    void _set_mInternalPath(Object obj);

    @BFieldSetNotProcess
    void _set_mPath(Object obj);

    @BFieldNotProcess
    File mInternalPath();

    @BFieldNotProcess
    File mPath();
}
