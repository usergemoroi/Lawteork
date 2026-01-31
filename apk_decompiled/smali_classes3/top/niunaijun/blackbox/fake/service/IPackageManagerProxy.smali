.class public Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$getComponentEnabledSetting;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetSharedLibraries;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetInstallerPackageName;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetPackagesForUid;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$CanRequestPackageInstalls;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$ResolveContentProvider;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$QueryBroadcastReceivers;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$QueryContentProviders;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetApplicationInfo;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetInstalledPackages;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetInstalledApplications;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetServiceInfo;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetActivityInfo;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetReceiverInfo;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetProviderInfo;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetPackageUid;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$GetPackageInfo;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$SetComponentEnabledSetting;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$ResolveService;,
        Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy$ResolveIntent;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "PackageManagerStub"


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lb/c;->a()Lblack/android/app/ActivityThreadStatic;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadStatic;->sPackageManager()Landroid/os/IInterface;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lb/c;->a()Lblack/android/app/ActivityThreadStatic;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadStatic;->sPackageManager()Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lb/c;->a()Lblack/android/app/ActivityThreadStatic;

    move-result-object p1

    invoke-interface {p1, p2}, Lblack/android/app/ActivityThreadStatic;->_set_sPackageManager(Ljava/lang/Object;)V

    const-string p1, "package"

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object p1

    invoke-interface {p1}, Lblack/android/app/ActivityThreadContext;->getSystemContext()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lb/d;->a(Ljava/lang/Object;)Lblack/android/app/ContextImplContext;

    move-result-object p1

    invoke-interface {p1}, Lblack/android/app/ContextImplContext;->mPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, "android.app.ApplicationPackageManager"

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/Reflector;->on(Ljava/lang/String;)Ltop/niunaijun/blackbox/utils/Reflector;

    move-result-object v0

    const-string v1, "mPM"

    invoke-virtual {v0, v1}, Ltop/niunaijun/blackbox/utils/Reflector;->field(Ljava/lang/String;)Ltop/niunaijun/blackbox/utils/Reflector;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/utils/Reflector;->set(Ljava/lang/Object;Ljava/lang/Object;)Ltop/niunaijun/blackbox/utils/Reflector;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onBindMethod()V
    .locals 3

    invoke-super {p0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->onBindMethod()V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "addOnPermissionsChangeListener"

    invoke-direct {v0, v2, v1}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v2, "removeOnPermissionsChangeListener"

    invoke-direct {v0, v2, v1}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;

    const-string v1, "shouldShowRequestPermissionRationale"

    invoke-direct {v0, v1}, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isT()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;

    const-string v1, "clearPackagePreferredActivities"

    invoke-direct {v0, v1}, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    return-void
.end method
