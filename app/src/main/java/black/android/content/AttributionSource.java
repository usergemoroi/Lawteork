package black.android.content;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.content.AttributionSource")
/* loaded from: classes.dex */
public interface AttributionSource {
    @BConstructor
    Object _new(int i, int i2, String str, String str2);

    @BConstructor
    Object _new(int i, String str, String str2);

    @BMethod
    Object getNext();

    @BField
    Object mAttributionSourceState();
}
