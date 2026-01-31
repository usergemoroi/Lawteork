package black.android.p009os;

import android.os.Parcel;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.os.BaseBundle")
/* renamed from: black.android.os.BaseBundle */
/* loaded from: classes.dex */
public interface BaseBundle {
    @BField
    Parcel mParcelledData();
}
