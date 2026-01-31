package black.android.telephony;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.telephony.TelephonyManager")
/* loaded from: classes.dex */
public interface TelephonyManagerStatic {
    @BMethodCheckNotProcess
    Method _check_getSubscriberInfoService();

    @BFieldCheckNotProcess
    Field _check_sIPhoneSubInfo();

    @BFieldCheckNotProcess
    Field _check_sServiceHandleCacheEnabled();

    @BFieldSetNotProcess
    void _set_sIPhoneSubInfo(Object obj);

    @BFieldSetNotProcess
    void _set_sServiceHandleCacheEnabled(Object obj);

    Object getSubscriberInfoService();

    @BFieldNotProcess
    IInterface sIPhoneSubInfo();

    @BFieldNotProcess
    Boolean sServiceHandleCacheEnabled();
}
