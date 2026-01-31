.class public Ltop/niunaijun/blackbox/fake/service/IAppOpsManagerProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/IAppOpsManagerProxy$NoteOperation;,
        Ltop/niunaijun/blackbox/fake/service/IAppOpsManagerProxy$CheckOperation;,
        Ltop/niunaijun/blackbox/fake/service/IAppOpsManagerProxy$CheckPackage;,
        Ltop/niunaijun/blackbox/fake/service/IAppOpsManagerProxy$NoteProxyOperation;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "appops"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 4

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "appops"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    .line 1
    const-class v1, Lblack/com/android/internal/app/IAppOpsServiceStubStatic;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lblack/com/android/internal/app/IAppOpsServiceStubStatic;

    .line 2
    invoke-interface {v1, v0}, Lblack/com/android/internal/app/IAppOpsServiceStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-class p1, Lblack/android/app/AppOpsManagerContext;

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/AppOpsManagerContext;

    .line 2
    invoke-interface {p1}, Lblack/android/app/AppOpsManagerContext;->_check_mService()Ljava/lang/reflect/Field;

    move-result-object p1

    const-string p2, "appops"

    if-eqz p1, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/AppOpsManager;

    .line 3
    :try_start_0
    const-class v1, Lblack/android/app/AppOpsManagerContext;

    invoke-static {v1, p1, v0}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/AppOpsManagerContext;

    .line 4
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lblack/android/app/AppOpsManagerContext;->_set_mService(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {p0, p2}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p3}, Ltop/niunaijun/blackbox/utils/MethodParameterUtils;->replaceFirstAppPkg([Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p3}, Ltop/niunaijun/blackbox/utils/MethodParameterUtils;->replaceLastUid([Ljava/lang/Object;)V

    invoke-super {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
