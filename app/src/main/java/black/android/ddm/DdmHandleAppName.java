package black.android.ddm;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.ddm.DdmHandleAppName")
/* loaded from: classes.dex */
public interface DdmHandleAppName {
    @BStaticMethod
    void setAppName(String str, int i);
}
