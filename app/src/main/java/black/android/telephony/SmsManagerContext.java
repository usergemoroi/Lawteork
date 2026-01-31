package black.android.telephony;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.telephony.SmsManager")
/* loaded from: classes.dex */
public interface SmsManagerContext {
    @BMethodCheckNotProcess
    Method _check_getAutoPersisting();

    @BMethodCheckNotProcess
    Method _check_setAutoPersisting(boolean z);

    Boolean getAutoPersisting();

    Void setAutoPersisting(boolean z);
}
