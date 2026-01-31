package black.android.content.p008pm;

import android.os.Parcelable;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BStaticField;
@BClassName("android.content.pm.ParceledListSlice")
/* renamed from: black.android.content.pm.ParceledListSlice */
/* loaded from: classes.dex */
public interface ParceledListSlice {
    @BStaticField
    Parcelable.Creator CREATOR();

    @BConstructor
    Object _new();

    @BConstructor
    Object _new(List<?> list);

    @BMethod
    Boolean append(Object obj);

    @BMethod
    List<?> getList();

    @BMethod
    Boolean isLastSlice();

    @BMethod
    Parcelable populateList();

    @BMethod
    void setLastSlice(boolean z);
}
