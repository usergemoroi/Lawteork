package black.android.location.provider;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.location.provider.ProviderProperties")
/* loaded from: classes.dex */
public interface ProviderPropertiesContext {
    @BFieldCheckNotProcess
    Field _check_mHasAltitudeSupport();

    @BFieldCheckNotProcess
    Field _check_mHasBearingSupport();

    @BFieldCheckNotProcess
    Field _check_mHasCellRequirement();

    @BFieldCheckNotProcess
    Field _check_mHasMonetaryCost();

    @BFieldCheckNotProcess
    Field _check_mHasNetworkRequirement();

    @BFieldCheckNotProcess
    Field _check_mHasSatelliteRequirement();

    @BFieldCheckNotProcess
    Field _check_mHasSpeedSupport();

    @BFieldSetNotProcess
    void _set_mHasAltitudeSupport(Object obj);

    @BFieldSetNotProcess
    void _set_mHasBearingSupport(Object obj);

    @BFieldSetNotProcess
    void _set_mHasCellRequirement(Object obj);

    @BFieldSetNotProcess
    void _set_mHasMonetaryCost(Object obj);

    @BFieldSetNotProcess
    void _set_mHasNetworkRequirement(Object obj);

    @BFieldSetNotProcess
    void _set_mHasSatelliteRequirement(Object obj);

    @BFieldSetNotProcess
    void _set_mHasSpeedSupport(Object obj);

    @BFieldNotProcess
    Boolean mHasAltitudeSupport();

    @BFieldNotProcess
    Boolean mHasBearingSupport();

    @BFieldNotProcess
    Boolean mHasCellRequirement();

    @BFieldNotProcess
    Boolean mHasMonetaryCost();

    @BFieldNotProcess
    Boolean mHasNetworkRequirement();

    @BFieldNotProcess
    Boolean mHasSatelliteRequirement();

    @BFieldNotProcess
    Boolean mHasSpeedSupport();
}
