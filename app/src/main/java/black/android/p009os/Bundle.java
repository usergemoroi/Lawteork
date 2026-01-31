package black.android.p009os;

import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.os.Bundle")
/* renamed from: black.android.os.Bundle */
/* loaded from: classes.dex */
public interface Bundle {
    @BMethod
    IBinder getIBinder(String str);

    @BMethod
    void putIBinder(String str, IBinder iBinder);
}
