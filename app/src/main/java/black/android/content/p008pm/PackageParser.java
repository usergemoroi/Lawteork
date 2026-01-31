package black.android.content.p008pm;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.p001pm.PackageParser;
import android.content.pm.ActivityInfo;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.content.pm.PackageParser")
/* renamed from: black.android.content.pm.PackageParser */
/* loaded from: classes.dex */
public interface PackageParser {

    @BClassName("android.content.pm.PackageParser$Activity")
    /* renamed from: black.android.content.pm.PackageParser$Activity */
    /* loaded from: classes.dex */
    public interface Activity {
        @BField
        ActivityInfo info();
    }

    @BClassName("android.content.pm.PackageParser$Component")
    /* renamed from: black.android.content.pm.PackageParser$Component */
    /* loaded from: classes.dex */
    public interface InterfaceC0571Component {
        @BField
        String className();

        @BField
        ComponentName componentName();

        @BField
        List<IntentFilter> intents();
    }

    @BClassName("android.content.pm.PackageParser$Package")
    /* renamed from: black.android.content.pm.PackageParser$Package */
    /* loaded from: classes.dex */
    public interface Package {
        @BField
        List activities();

        @BField
        Bundle mAppMetaData();

        @BField
        String mSharedUserId();

        @BField
        Signature[] mSignatures();

        @BField
        Object mSigningDetails();

        @BField
        Integer mVersionCode();

        @BField
        String packageName();

        @BField
        List permissionGroups();

        @BField
        List permissions();

        @BField
        List<String> protectedBroadcasts();

        @BField
        List providers();

        @BField
        List receivers();

        @BField
        List<String> requestedPermissions();

        @BField
        List services();
    }

    @BClassName("android.content.pm.PackageParser$Permission")
    /* renamed from: black.android.content.pm.PackageParser$Permission */
    /* loaded from: classes.dex */
    public interface Permission {
        @BField
        PermissionInfo info();
    }

    @BClassName("android.content.pm.PackageParser$PermissionGroup")
    /* renamed from: black.android.content.pm.PackageParser$PermissionGroup */
    /* loaded from: classes.dex */
    public interface PermissionGroup {
        @BField
        PermissionGroupInfo info();
    }

    @BClassName("android.content.pm.PackageParser$Provider")
    /* renamed from: black.android.content.pm.PackageParser$Provider */
    /* loaded from: classes.dex */
    public interface Provider {
        @BField
        ProviderInfo info();
    }

    @BClassName("android.content.pm.PackageParser$Service")
    /* renamed from: black.android.content.pm.PackageParser$Service */
    /* loaded from: classes.dex */
    public interface Service {
        @BField
        ServiceInfo info();
    }

    @BClassName("android.content.pm.PackageParser$SigningDetails")
    /* renamed from: black.android.content.pm.PackageParser$SigningDetails */
    /* loaded from: classes.dex */
    public interface SigningDetails {
        @BMethod
        Boolean hasPastSigningCertificates();

        @BMethod
        Boolean hasSignatures();

        @BField
        Signature[] pastSigningCertificates();

        @BField
        Signature[] signatures();
    }

    @BConstructor
    android.content.p001pm.PackageParser _new(String str);

    @BMethod
    void collectCertificates(PackageParser.Package r1, int i);

    @BMethod
    PackageParser.Package parsePackage(File file, String str, DisplayMetrics displayMetrics, int i);
}
