package black.android.location;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.location.LocationManager$GpsStatusListenerTransport")
/* loaded from: classes.dex */
public interface LocationManagerGpsStatusListenerTransportContext {
    @BFieldCheckNotProcess
    Field _check_mListener();

    @BFieldCheckNotProcess
    Field _check_mNmeaListener();

    @BMethodCheckNotProcess
    Method _check_onFirstFix(int i);

    @BMethodCheckNotProcess
    Method _check_onGpsStarted();

    @BMethodCheckNotProcess
    Method _check_onNmeaReceived(long j, String str);

    @BFieldCheckNotProcess
    Field _check_this$0();

    @BFieldSetNotProcess
    void _set_mListener(Object obj);

    @BFieldSetNotProcess
    void _set_mNmeaListener(Object obj);

    @BFieldSetNotProcess
    void _set_this$0(Object obj);

    @BFieldNotProcess
    Object mListener();

    @BFieldNotProcess
    Object mNmeaListener();

    Void onFirstFix(int i);

    Void onGpsStarted();

    Void onNmeaReceived(long j, String str);

    @BFieldNotProcess
    Object this$0();
}
