package black.android.p009os;

import android.os.Parcel;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.os.Bundle")
/* renamed from: black.android.os.BundleICSContext */
/* loaded from: classes.dex */
public interface BundleICSContext {
    @BFieldCheckNotProcess
    Field _check_mParcelledData();

    @BFieldSetNotProcess
    void _set_mParcelledData(Object obj);

    @BFieldNotProcess
    Parcel mParcelledData();
}
