package black.android.location;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.location.LocationManager$GnssStatusListenerTransport")
/* loaded from: classes.dex */
public interface LocationManagerGnssStatusListenerTransportContext {
    @BFieldCheckNotProcess
    Field _check_mGpsListener();

    @BFieldCheckNotProcess
    Field _check_mGpsNmeaListener();

    @BMethodCheckNotProcess
    Method _check_onFirstFix(int i);

    @BMethodCheckNotProcess
    Method _check_onGnssStarted();

    @BMethodCheckNotProcess
    Method _check_onNmeaReceived(long j, String str);

    @BFieldCheckNotProcess
    Field _check_this$0();

    @BFieldSetNotProcess
    void _set_mGpsListener(Object obj);

    @BFieldSetNotProcess
    void _set_mGpsNmeaListener(Object obj);

    @BFieldSetNotProcess
    void _set_this$0(Object obj);

    @BFieldNotProcess
    Object mGpsListener();

    @BFieldNotProcess
    Object mGpsNmeaListener();

    Void onFirstFix(int i);

    Void onGnssStarted();

    Void onNmeaReceived(long j, String str);

    @BFieldNotProcess
    Object this$0();
}
