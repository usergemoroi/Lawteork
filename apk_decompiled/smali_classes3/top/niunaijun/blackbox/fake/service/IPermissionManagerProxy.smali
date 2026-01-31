.class public Ltop/niunaijun/blackbox/fake/service/IPermissionManagerProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/IPermissionManagerProxy$checkPermission;,
        Ltop/niunaijun/blackbox/fake/service/IPermissionManagerProxy$shouldShowRequestPermissionRationale;,
        Ltop/niunaijun/blackbox/fake/service/IPermissionManagerProxy$addPermission;,
        Ltop/niunaijun/blackbox/fake/service/IPermissionManagerProxy$removeOnPermissionsChangeListener;,
        Ltop/niunaijun/blackbox/fake/service/IPermissionManagerProxy$addOnPermissionsChangeListener;
    }
.end annotation


# static fields
.field private static final BLUETOOTH_CONNECT:Ljava/lang/String; = "android.permission.BLUETOOTH_CONNECT"

.field private static final BLUETOOTH_SCAN:Ljava/lang/String; = "android.permission.BLUETOOTH_SCAN"

.field private static final P:Ljava/lang/String; = "permissionmgr"

.field private static final READ_MEDIA_AUDIO:Ljava/lang/String; = "android.permission.READ_MEDIA_AUDIO"

.field public static final TAG:Ljava/lang/String; = "IPermissionManagerProxy"

.field private static final WRITE_MEDIA_AUDIO:Ljava/lang/String; = "android.permission.WRITE_MEDIA_AUDIO"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "permissionmgr"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 3

    .line 1
    const-class v0, Lblack/android/permission/IPermissionManagerStubStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/permission/IPermissionManagerStubStatic;

    .line 2
    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v1

    const-string v2, "permissionmgr"

    invoke-interface {v1, v2}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/permission/IPermissionManagerStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    const-string p1, "permissionmgr"

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    .line 1
    const-class p1, Lblack/android/app/ActivityThreadStatic;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/ActivityThreadStatic;

    .line 2
    invoke-interface {p1, p2}, Lblack/android/app/ActivityThreadStatic;->_set_sPermissionManager(Ljava/lang/Object;)V

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

    const-string v1, "mPermissionManager"

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
