package black.android.content.p008pm;

import android.content.p001pm.PackageParser;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.SigningInfo")
/* renamed from: black.android.content.pm.SigningInfoContext */
/* loaded from: classes.dex */
public interface SigningInfoContext {
    @BFieldCheckNotProcess
    Field _check_mSigningDetails();

    @BFieldSetNotProcess
    void _set_mSigningDetails(Object obj);

    @BFieldNotProcess
    PackageParser.SigningDetails mSigningDetails();
}
