package top.niunaijun.blackbox.utils.compat;

import android.content.p001pm.PackageParser;
import android.os.Build;
import android.util.DisplayMetrics;
import black.android.content.p008pm.PackageParserContext;
import black.android.content.p008pm.PackageParserLollipop22Context;
import black.android.content.p008pm.PackageParserLollipop22Static;
import black.android.content.p008pm.PackageParserLollipopContext;
import black.android.content.p008pm.PackageParserLollipopStatic;
import black.android.content.p008pm.PackageParserMarshmallowContext;
import black.android.content.p008pm.PackageParserMarshmallowStatic;
import black.android.content.p008pm.PackageParserNougatStatic;
import black.android.content.p008pm.PackageParserPieStatic;
import java.io.File;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class PackageParserCompat {
    private static final int myUserId = 0;
    public static final int[] GIDS = new int[0];
    private static final int API_LEVEL = Build.VERSION.SDK_INT;

    public static void collectCertificates(PackageParser packageParser, PackageParser.Package r5, int i) {
        if (BuildCompat.isPie()) {
            ((PackageParserPieStatic) BlackReflection.create(PackageParserPieStatic.class, null, true)).collectCertificates(r5, true);
            return;
        }
        int i2 = API_LEVEL;
        if (i2 >= 24) {
            ((PackageParserNougatStatic) BlackReflection.create(PackageParserNougatStatic.class, null, true)).collectCertificates(r5, i);
        } else if (i2 >= 23) {
            ((PackageParserMarshmallowContext) BlackReflection.create(PackageParserMarshmallowContext.class, packageParser, true)).collectCertificates(r5, i);
        } else if (i2 >= 22) {
            ((PackageParserLollipop22Context) BlackReflection.create(PackageParserLollipop22Context.class, packageParser, true)).collectCertificates(r5, i);
        } else if (i2 >= 21) {
            ((PackageParserLollipopContext) BlackReflection.create(PackageParserLollipopContext.class, packageParser, true)).collectCertificates(r5, i);
        } else {
            ((PackageParserContext) BlackReflection.create(PackageParserContext.class, packageParser, false)).collectCertificates(r5, i);
        }
    }

    public static PackageParser createParser(File file) {
        int i = API_LEVEL;
        if (i >= 23) {
            return ((PackageParserMarshmallowStatic) BlackReflection.create(PackageParserMarshmallowStatic.class, null, false))._new();
        }
        if (i >= 22) {
            return ((PackageParserLollipop22Static) BlackReflection.create(PackageParserLollipop22Static.class, null, false))._new();
        }
        if (i >= 21) {
            return ((PackageParserLollipopStatic) BlackReflection.create(PackageParserLollipopStatic.class, null, false))._new();
        }
        return null;
    }

    public static PackageParser.Package parsePackage(PackageParser packageParser, File file, int i) {
        int i2 = API_LEVEL;
        if (i2 >= 23) {
            return ((PackageParserMarshmallowContext) BlackReflection.create(PackageParserMarshmallowContext.class, packageParser, true)).parsePackage(file, i);
        }
        if (i2 >= 22) {
            return ((PackageParserLollipop22Context) BlackReflection.create(PackageParserLollipop22Context.class, packageParser, true)).parsePackage(file, i);
        }
        if (i2 >= 21) {
            return ((PackageParserLollipopContext) BlackReflection.create(PackageParserLollipopContext.class, packageParser, true)).parsePackage(file, i);
        }
        return ((PackageParserContext) BlackReflection.create(PackageParserContext.class, packageParser, true)).parsePackage(file, null, new DisplayMetrics(), i);
    }
}
