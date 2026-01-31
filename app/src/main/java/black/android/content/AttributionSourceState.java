package black.android.content;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.content.AttributionSourceState")
/* loaded from: classes.dex */
public interface AttributionSourceState {
    @BField
    String packageName();

    @BField
    int pid();

    @BField
    int uid();
}
