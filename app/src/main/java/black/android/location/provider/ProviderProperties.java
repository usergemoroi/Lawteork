package black.android.location.provider;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.location.provider.ProviderProperties")
/* loaded from: classes.dex */
public interface ProviderProperties {
    @BField
    boolean mHasAltitudeSupport();

    @BField
    boolean mHasBearingSupport();

    @BField
    boolean mHasCellRequirement();

    @BField
    boolean mHasMonetaryCost();

    @BField
    boolean mHasNetworkRequirement();

    @BField
    boolean mHasSatelliteRequirement();

    @BField
    boolean mHasSpeedSupport();
}
