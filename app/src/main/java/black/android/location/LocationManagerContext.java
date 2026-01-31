package black.android.location;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.HashMap;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.location.LocationManager")
/* loaded from: classes.dex */
public interface LocationManagerContext {
    @BFieldCheckNotProcess
    Field _check_mGnssNmeaListeners();

    @BFieldCheckNotProcess
    Field _check_mGnssStatusListeners();

    @BFieldCheckNotProcess
    Field _check_mGpsNmeaListeners();

    @BFieldCheckNotProcess
    Field _check_mGpsStatusListeners();

    @BFieldCheckNotProcess
    Field _check_mListeners();

    @BFieldCheckNotProcess
    Field _check_mNmeaListeners();

    @BFieldCheckNotProcess
    Field _check_mService();

    @BFieldSetNotProcess
    void _set_mGnssNmeaListeners(Object obj);

    @BFieldSetNotProcess
    void _set_mGnssStatusListeners(Object obj);

    @BFieldSetNotProcess
    void _set_mGpsNmeaListeners(Object obj);

    @BFieldSetNotProcess
    void _set_mGpsStatusListeners(Object obj);

    @BFieldSetNotProcess
    void _set_mListeners(Object obj);

    @BFieldSetNotProcess
    void _set_mNmeaListeners(Object obj);

    @BFieldSetNotProcess
    void _set_mService(Object obj);

    @BFieldNotProcess
    HashMap mGnssNmeaListeners();

    @BFieldNotProcess
    HashMap mGnssStatusListeners();

    @BFieldNotProcess
    HashMap mGpsNmeaListeners();

    @BFieldNotProcess
    HashMap mGpsStatusListeners();

    @BFieldNotProcess
    HashMap mListeners();

    @BFieldNotProcess
    HashMap mNmeaListeners();

    @BFieldNotProcess
    IInterface mService();
}
