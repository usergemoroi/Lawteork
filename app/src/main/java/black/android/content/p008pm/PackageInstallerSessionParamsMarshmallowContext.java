package black.android.content.p008pm;

import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.PackageInstaller$SessionParams")
/* renamed from: black.android.content.pm.PackageInstallerSessionParamsMarshmallowContext */
/* loaded from: classes.dex */
public interface PackageInstallerSessionParamsMarshmallowContext {
    @BFieldCheckNotProcess
    Field _check_abiOverride();

    @BFieldCheckNotProcess
    Field _check_appIcon();

    @BFieldCheckNotProcess
    Field _check_appIconLastModified();

    @BFieldCheckNotProcess
    Field _check_appLabel();

    @BFieldCheckNotProcess
    Field _check_appPackageName();

    @BFieldCheckNotProcess
    Field _check_grantedRuntimePermissions();

    @BFieldCheckNotProcess
    Field _check_installFlags();

    @BFieldCheckNotProcess
    Field _check_installLocation();

    @BFieldCheckNotProcess
    Field _check_mode();

    @BFieldCheckNotProcess
    Field _check_originatingUri();

    @BFieldCheckNotProcess
    Field _check_referrerUri();

    @BFieldCheckNotProcess
    Field _check_sizeBytes();

    @BFieldCheckNotProcess
    Field _check_volumeUuid();

    @BFieldSetNotProcess
    void _set_abiOverride(Object obj);

    @BFieldSetNotProcess
    void _set_appIcon(Object obj);

    @BFieldSetNotProcess
    void _set_appIconLastModified(Object obj);

    @BFieldSetNotProcess
    void _set_appLabel(Object obj);

    @BFieldSetNotProcess
    void _set_appPackageName(Object obj);

    @BFieldSetNotProcess
    void _set_grantedRuntimePermissions(Object obj);

    @BFieldSetNotProcess
    void _set_installFlags(Object obj);

    @BFieldSetNotProcess
    void _set_installLocation(Object obj);

    @BFieldSetNotProcess
    void _set_mode(Object obj);

    @BFieldSetNotProcess
    void _set_originatingUri(Object obj);

    @BFieldSetNotProcess
    void _set_referrerUri(Object obj);

    @BFieldSetNotProcess
    void _set_sizeBytes(Object obj);

    @BFieldSetNotProcess
    void _set_volumeUuid(Object obj);

    @BFieldNotProcess
    String abiOverride();

    @BFieldNotProcess
    Bitmap appIcon();

    @BFieldNotProcess
    Long appIconLastModified();

    @BFieldNotProcess
    String appLabel();

    @BFieldNotProcess
    String appPackageName();

    @BFieldNotProcess
    String[] grantedRuntimePermissions();

    @BFieldNotProcess
    Integer installFlags();

    @BFieldNotProcess
    Integer installLocation();

    @BFieldNotProcess
    Integer mode();

    @BFieldNotProcess
    Uri originatingUri();

    @BFieldNotProcess
    Uri referrerUri();

    @BFieldNotProcess
    Long sizeBytes();

    @BFieldNotProcess
    String volumeUuid();
}
