package black.android.hardware.display;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.hardware.display.DisplayManagerGlobal")
/* loaded from: classes.dex */
public interface DisplayManagerGlobal {
    @BStaticMethod
    Object getInstance();

    @BField
    IInterface mDm();
}
