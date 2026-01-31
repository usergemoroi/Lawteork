package black.android.content.p008pm;

import android.content.p001pm.PackageParser;
import android.util.DisplayMetrics;
import java.io.File;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser")
/* renamed from: black.android.content.pm.PackageParserContext */
/* loaded from: classes.dex */
public interface PackageParserContext {
    @BMethodCheckNotProcess
    Method _check_collectCertificates(PackageParser.Package r1, int i);

    @BMethodCheckNotProcess
    Method _check_parsePackage(File file, String str, DisplayMetrics displayMetrics, int i);

    Void collectCertificates(PackageParser.Package r1, int i);

    PackageParser.Package parsePackage(File file, String str, DisplayMetrics displayMetrics, int i);
}
