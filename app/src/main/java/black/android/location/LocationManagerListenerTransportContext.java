package black.android.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.location.LocationManager$GnssStatusListenerTransport")
/* loaded from: classes.dex */
public interface LocationManagerListenerTransportContext {
    @BFieldCheckNotProcess
    Field _check_mListener();

    @BMethodCheckNotProcess
    Method _check_onLocationChanged(Location location);

    @BMethodCheckNotProcess
    Method _check_onProviderDisabled(String str);

    @BMethodCheckNotProcess
    Method _check_onProviderEnabled(String str);

    @BMethodCheckNotProcess
    Method _check_onStatusChanged(String str, int i, Bundle bundle);

    @BFieldCheckNotProcess
    Field _check_this$0();

    @BFieldSetNotProcess
    void _set_mListener(Object obj);

    @BFieldSetNotProcess
    void _set_this$0(Object obj);

    @BFieldNotProcess
    LocationListener mListener();

    Void onLocationChanged(Location location);

    Void onProviderDisabled(String str);

    Void onProviderEnabled(String str);

    Void onStatusChanged(String str, int i, Bundle bundle);

    @BFieldNotProcess
    Object this$0();
}
