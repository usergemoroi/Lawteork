package black.android.p009os;

import android.os.Handler;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.os.Handler")
/* renamed from: black.android.os.Handler */
/* loaded from: classes.dex */
public interface Handler {
    @BField
    Handler.Callback mCallback();
}
