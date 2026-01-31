package black.android.content.p008pm;

import android.content.p001pm.PackageParser;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser")
/* renamed from: black.android.content.pm.PackageParserNougatStatic */
/* loaded from: classes.dex */
public interface PackageParserNougatStatic {
    @BMethodCheckNotProcess
    Method _check_collectCertificates(PackageParser.Package r1, int i);

    Void collectCertificates(PackageParser.Package r1, int i);
}
