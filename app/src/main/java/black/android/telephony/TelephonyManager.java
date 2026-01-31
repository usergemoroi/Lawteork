package black.android.telephony;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.telephony.TelephonyManager")
/* loaded from: classes.dex */
public interface TelephonyManager {
    @BStaticMethod
    Object getSubscriberInfoService();

    @BStaticField
    IInterface sIPhoneSubInfo();

    @BStaticField
    boolean sServiceHandleCacheEnabled();
}
