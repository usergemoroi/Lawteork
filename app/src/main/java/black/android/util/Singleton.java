package black.android.util;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.util.Singleton")
/* loaded from: classes.dex */
public interface Singleton {
    @BMethod
    Object get();

    @BField
    Object mInstance();
}
