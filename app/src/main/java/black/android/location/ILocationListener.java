package black.android.location;

import android.location.ILocationListener;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName(ILocationListener.Stub.DESCRIPTOR)
/* loaded from: classes.dex */
public interface ILocationListener {

    @BClassName("android.location.ILocationListener$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }

    @BMethod
    void onLocationChanged(Location location);
}
