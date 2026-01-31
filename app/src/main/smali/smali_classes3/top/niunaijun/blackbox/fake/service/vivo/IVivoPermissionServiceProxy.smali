.class public Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$isVivoImeiPkg;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$setOnePermissionExt;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$setOnePermission;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$checkDelete;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$isBuildInThirdPartApp;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$noteStartActivityProcess;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$setBlackListApp;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$setWhiteListApp;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$setAppPermission;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$getAppPermission;,
        Ltop/niunaijun/blackbox/fake/service/vivo/IVivoPermissionServiceProxy$checkPermission;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "vivo_permission_service"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 3

    .line 1
    const-class v0, Lblack/model/vivo/IVivoPermissionServiceStubStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/model/vivo/IVivoPermissionServiceStubStatic;

    .line 2
    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v1

    const-string v2, "vivo_permission_service"

    invoke-interface {v1, v2}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/model/vivo/IVivoPermissionServiceStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "vivo_permission_service"

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
