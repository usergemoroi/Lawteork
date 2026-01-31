package black.android.content.p008pm;

import android.content.p001pm.PackageParser;
import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.content.pm.PackageParser")
/* renamed from: black.android.content.pm.PackageParserTiramisu */
/* loaded from: classes.dex */
public interface PackageParserTiramisu {
    @BConstructor
    PackageParser _new();

    @BMethod
    PackageParser.Package parsePackage(File file, int i);
}
