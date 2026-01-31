package black.android.content.p008pm;

import android.os.Parcelable;
import java.lang.reflect.Method;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.pm.ParceledListSlice")
/* renamed from: black.android.content.pm.ParceledListSliceContext */
/* loaded from: classes.dex */
public interface ParceledListSliceContext {
    @BMethodCheckNotProcess
    Method _check_append(Object obj);

    @BMethodCheckNotProcess
    Method _check_getList();

    @BMethodCheckNotProcess
    Method _check_isLastSlice();

    @BMethodCheckNotProcess
    Method _check_populateList();

    @BMethodCheckNotProcess
    Method _check_setLastSlice(boolean z);

    Boolean append(Object obj);

    List<?> getList();

    Boolean isLastSlice();

    Parcelable populateList();

    Void setLastSlice(boolean z);
}
