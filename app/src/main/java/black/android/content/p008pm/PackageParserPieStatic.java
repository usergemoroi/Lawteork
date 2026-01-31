package black.android.content.p008pm;

import android.content.p001pm.PackageParser;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser")
/* renamed from: black.android.content.pm.PackageParserPieStatic */
/* loaded from: classes.dex */
public interface PackageParserPieStatic {
    @BMethodCheckNotProcess
    Method _check_collectCertificates(PackageParser.Package r1, boolean z);

    Void collectCertificates(PackageParser.Package r1, boolean z);
}
