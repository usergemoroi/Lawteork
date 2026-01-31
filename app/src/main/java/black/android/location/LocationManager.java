package black.android.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IInterface;
import java.util.HashMap;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.location.LocationManager")
/* loaded from: classes.dex */
public interface LocationManager {

    @BClassName("android.location.LocationManager$GnssStatusListenerTransport")
    /* loaded from: classes.dex */
    public interface GnssStatusListenerTransport {
        @BField
        Object mGpsListener();

        @BField
        Object mGpsNmeaListener();

        @BMethod
        void onFirstFix(int i);

        @BMethod
        void onGnssStarted();

        @BMethod
        void onNmeaReceived(long j, String str);

        @BField
        Object this$0();
    }

    @BClassName("android.location.LocationManager$GnssStatusListenerTransport")
    /* loaded from: classes.dex */
    public interface GnssStatusListenerTransportO {
    }

    @BClassName("android.location.LocationManager$GpsStatusListenerTransport")
    /* loaded from: classes.dex */
    public interface GpsStatusListenerTransport {
        @BField
        Object mListener();

        @BField
        Object mNmeaListener();

        @BMethod
        void onFirstFix(int i);

        @BMethod
        void onGpsStarted();

        @BMethod
        void onNmeaReceived(long j, String str);

        @BField
        Object this$0();
    }

    @BClassName("android.location.LocationManager$GpsStatusListenerTransport")
    /* loaded from: classes.dex */
    public interface GpsStatusListenerTransportOPPO_R815T {
    }

    @BClassName("android.location.LocationManager$GpsStatusListenerTransport")
    /* loaded from: classes.dex */
    public interface GpsStatusListenerTransportSumsungS5 {
    }

    @BClassName("android.location.LocationManager$GnssStatusListenerTransport")
    /* loaded from: classes.dex */
    public interface GpsStatusListenerTransportVIVO {
        @BMethod
        void onSvStatusChanged(int i, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, int i2, int i3, int i4, long[] jArr);
    }

    @BClassName("android.location.LocationManager$GnssStatusListenerTransport")
    /* loaded from: classes.dex */
    public interface ListenerTransport {
        @BField
        LocationListener mListener();

        @BMethod
        void onLocationChanged(Location location);

        @BMethod
        void onProviderDisabled(String str);

        @BMethod
        void onProviderEnabled(String str);

        @BMethod
        void onStatusChanged(String str, int i, Bundle bundle);

        @BField
        Object this$0();
    }

    @BField
    HashMap mGnssNmeaListeners();

    @BField
    HashMap mGnssStatusListeners();

    @BField
    HashMap mGpsNmeaListeners();

    @BField
    HashMap mGpsStatusListeners();

    @BField
    HashMap mListeners();

    @BField
    HashMap mNmeaListeners();

    @BField
    IInterface mService();
}
