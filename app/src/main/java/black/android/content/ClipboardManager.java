package black.android.content;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.content.ClipboardManager")
/* loaded from: classes.dex */
public interface ClipboardManager {
    @BStaticMethod
    IInterface getService();

    @BStaticField
    IInterface sService();
}
