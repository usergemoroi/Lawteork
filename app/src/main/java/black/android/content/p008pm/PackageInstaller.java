package black.android.content.p008pm;

import android.graphics.Bitmap;
import android.net.Uri;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("mirror.android.content.pm.PackageInstaller")
/* renamed from: black.android.content.pm.PackageInstaller */
/* loaded from: classes.dex */
public interface PackageInstaller {

    @BClassName("android.content.pm.PackageInstaller$SessionInfo")
    /* renamed from: black.android.content.pm.PackageInstaller$SessionInfo */
    /* loaded from: classes.dex */
    public interface SessionInfo {
        @BConstructor
        SessionInfo _new();

        @BField
        boolean active();

        @BField
        Bitmap appIcon();

        @BField
        CharSequence appLabel();

        @BField
        String appPackageName();

        @BField
        String installerPackageName();

        @BField
        int mode();

        @BField
        float progress();

        @BField
        String resolvedBaseCodePath();

        @BField
        boolean sealed();

        @BField
        int sessionId();

        @BField
        long sizeBytes();
    }

    @BClassName("android.content.pm.PackageInstaller$SessionParams")
    /* renamed from: black.android.content.pm.PackageInstaller$SessionParamsLOLLIPOP */
    /* loaded from: classes.dex */
    public interface SessionParamsLOLLIPOP {
        @BField
        String abiOverride();

        @BField
        Bitmap appIcon();

        @BField
        long appIconLastModified();

        @BField
        String appLabel();

        @BField
        String appPackageName();

        @BField
        int installFlags();

        @BField
        int installLocation();

        @BField
        int mode();

        @BField
        Uri originatingUri();

        @BField
        Uri referrerUri();

        @BField
        long sizeBytes();
    }

    @BClassName("android.content.pm.PackageInstaller$SessionParams")
    /* renamed from: black.android.content.pm.PackageInstaller$SessionParamsMarshmallow */
    /* loaded from: classes.dex */
    public interface SessionParamsMarshmallow {
        @BField
        String abiOverride();

        @BField
        Bitmap appIcon();

        @BField
        long appIconLastModified();

        @BField
        String appLabel();

        @BField
        String appPackageName();

        @BField
        String[] grantedRuntimePermissions();

        @BField
        int installFlags();

        @BField
        int installLocation();

        @BField
        int mode();

        @BField
        Uri originatingUri();

        @BField
        Uri referrerUri();

        @BField
        long sizeBytes();

        @BField
        String volumeUuid();
    }
}
