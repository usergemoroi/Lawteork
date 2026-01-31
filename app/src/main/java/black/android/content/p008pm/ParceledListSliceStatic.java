package black.android.content.p008pm;

import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.ParceledListSlice")
/* renamed from: black.android.content.pm.ParceledListSliceStatic */
/* loaded from: classes.dex */
public interface ParceledListSliceStatic {
    @BFieldNotProcess
    Parcelable.Creator CREATOR();

    @BFieldCheckNotProcess
    Field _check_CREATOR();

    @BConstructorNotProcess
    Object _new();

    @BConstructorNotProcess
    Object _new(List<?> list);

    @BFieldSetNotProcess
    void _set_CREATOR(Object obj);
}
