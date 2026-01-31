package black.android.media;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.media.AudioManager")
/* loaded from: classes.dex */
public interface AudioManager {
    @BStaticMethod
    void getService();

    @BStaticField
    IInterface sService();
}
