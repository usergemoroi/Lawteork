package black.android.content.p008pm;

import android.content.pm.Signature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser$SigningDetails")
/* renamed from: black.android.content.pm.PackageParserSigningDetailsContext */
/* loaded from: classes.dex */
public interface PackageParserSigningDetailsContext {
    @BMethodCheckNotProcess
    Method _check_hasPastSigningCertificates();

    @BMethodCheckNotProcess
    Method _check_hasSignatures();

    @BFieldCheckNotProcess
    Field _check_pastSigningCertificates();

    @BFieldCheckNotProcess
    Field _check_signatures();

    @BFieldSetNotProcess
    void _set_pastSigningCertificates(Object obj);

    @BFieldSetNotProcess
    void _set_signatures(Object obj);

    Boolean hasPastSigningCertificates();

    Boolean hasSignatures();

    @BFieldNotProcess
    Signature[] pastSigningCertificates();

    @BFieldNotProcess
    Signature[] signatures();
}
