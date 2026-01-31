package black.android.content.p008pm;

import android.content.pm.Signature;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser$Package")
/* renamed from: black.android.content.pm.PackageParserPackageContext */
/* loaded from: classes.dex */
public interface PackageParserPackageContext {
    @BFieldCheckNotProcess
    Field _check_activities();

    @BFieldCheckNotProcess
    Field _check_mAppMetaData();

    @BFieldCheckNotProcess
    Field _check_mSharedUserId();

    @BFieldCheckNotProcess
    Field _check_mSignatures();

    @BFieldCheckNotProcess
    Field _check_mSigningDetails();

    @BFieldCheckNotProcess
    Field _check_mVersionCode();

    @BFieldCheckNotProcess
    Field _check_packageName();

    @BFieldCheckNotProcess
    Field _check_permissionGroups();

    @BFieldCheckNotProcess
    Field _check_permissions();

    @BFieldCheckNotProcess
    Field _check_protectedBroadcasts();

    @BFieldCheckNotProcess
    Field _check_providers();

    @BFieldCheckNotProcess
    Field _check_receivers();

    @BFieldCheckNotProcess
    Field _check_requestedPermissions();

    @BFieldCheckNotProcess
    Field _check_services();

    @BFieldSetNotProcess
    void _set_activities(Object obj);

    @BFieldSetNotProcess
    void _set_mAppMetaData(Object obj);

    @BFieldSetNotProcess
    void _set_mSharedUserId(Object obj);

    @BFieldSetNotProcess
    void _set_mSignatures(Object obj);

    @BFieldSetNotProcess
    void _set_mSigningDetails(Object obj);

    @BFieldSetNotProcess
    void _set_mVersionCode(Object obj);

    @BFieldSetNotProcess
    void _set_packageName(Object obj);

    @BFieldSetNotProcess
    void _set_permissionGroups(Object obj);

    @BFieldSetNotProcess
    void _set_permissions(Object obj);

    @BFieldSetNotProcess
    void _set_protectedBroadcasts(Object obj);

    @BFieldSetNotProcess
    void _set_providers(Object obj);

    @BFieldSetNotProcess
    void _set_receivers(Object obj);

    @BFieldSetNotProcess
    void _set_requestedPermissions(Object obj);

    @BFieldSetNotProcess
    void _set_services(Object obj);

    @BFieldNotProcess
    List activities();

    @BFieldNotProcess
    Bundle mAppMetaData();

    @BFieldNotProcess
    String mSharedUserId();

    @BFieldNotProcess
    Signature[] mSignatures();

    @BFieldNotProcess
    Object mSigningDetails();

    @BFieldNotProcess
    Integer mVersionCode();

    @BFieldNotProcess
    String packageName();

    @BFieldNotProcess
    List permissionGroups();

    @BFieldNotProcess
    List permissions();

    @BFieldNotProcess
    List<String> protectedBroadcasts();

    @BFieldNotProcess
    List providers();

    @BFieldNotProcess
    List receivers();

    @BFieldNotProcess
    List<String> requestedPermissions();

    @BFieldNotProcess
    List services();
}
