package black.android.content;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BStaticField;
@BClassName("android.content.ClipboardManager")
/* loaded from: classes.dex */
public interface ClipboardManagerOreo {
    @BField
    IInterface mService();

    @BStaticField
    IInterface sService();
}
