package black.android.p009os;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.os.Parcel")
/* renamed from: black.android.os.ParcelStatic */
/* loaded from: classes.dex */
public interface ParcelStatic {
    @BFieldNotProcess
    Integer VAL_PARCELABLE();

    @BFieldNotProcess
    Integer VAL_PARCELABLEARRAY();

    @BFieldCheckNotProcess
    Field _check_VAL_PARCELABLE();

    @BFieldCheckNotProcess
    Field _check_VAL_PARCELABLEARRAY();

    @BFieldSetNotProcess
    void _set_VAL_PARCELABLE(Object obj);

    @BFieldSetNotProcess
    void _set_VAL_PARCELABLEARRAY(Object obj);
}
