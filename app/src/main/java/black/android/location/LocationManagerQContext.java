package black.android.location;

import android.util.ArrayMap;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.location.LocationManager")
/* loaded from: classes.dex */
public interface LocationManagerQContext {
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

    @BFieldNotProcess
    ArrayMap mGnssNmeaListeners();

    @BFieldNotProcess
    ArrayMap mGnssStatusListeners();

    @BFieldNotProcess
    ArrayMap mGpsNmeaListeners();

    @BFieldNotProcess
    ArrayMap mGpsStatusListeners();

    @BFieldNotProcess
    ArrayMap mListeners();
}
