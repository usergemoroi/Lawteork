package black.android.content.p008pm;

import android.content.p001pm.PackageParser;
import java.io.File;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser")
/* renamed from: black.android.content.pm.PackageParserTiramisuContext */
/* loaded from: classes.dex */
public interface PackageParserTiramisuContext {
    @BMethodCheckNotProcess
    Method _check_parsePackage(File file, int i);

    PackageParser.Package parsePackage(File file, int i);
}
