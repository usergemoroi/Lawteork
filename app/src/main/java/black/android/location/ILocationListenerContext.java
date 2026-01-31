package black.android.location;

import android.location.ILocationListener;
import android.location.Location;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess(ILocationListener.Stub.DESCRIPTOR)
/* loaded from: classes.dex */
public interface ILocationListenerContext {
    @BMethodCheckNotProcess
    Method _check_onLocationChanged(Location location);

    Void onLocationChanged(Location location);
}
