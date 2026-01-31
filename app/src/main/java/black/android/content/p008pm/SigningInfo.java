package black.android.content.p008pm;

import android.content.p001pm.PackageParser;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.content.pm.SigningInfo")
/* renamed from: black.android.content.pm.SigningInfo */
/* loaded from: classes.dex */
public interface SigningInfo {
    @BConstructor
    android.content.pm.SigningInfo _new(PackageParser.SigningDetails signingDetails);

    @BField
    PackageParser.SigningDetails mSigningDetails();
}
