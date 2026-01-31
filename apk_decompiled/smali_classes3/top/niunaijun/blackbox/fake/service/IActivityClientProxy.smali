.class public Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;
.super Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy$SetTaskDescription;,
        Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy$ActivityDestroyed;,
        Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy$ActivityResumed;,
        Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy$FinishActivity;
    }
.end annotation

.annotation runtime Ltop/niunaijun/blackbox/fake/hook/ScanClass;
    value = {
        Ltop/niunaijun/blackbox/fake/service/ActivityManagerCommonProxy;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "IActivityClientProxy"


# instance fields
.field private final who:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;->who:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getProxyInvocation()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getWho()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;->who:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    .line 1
    :cond_0
    const-class v0, Lblack/android/app/ActivityClientStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityClientStatic;

    .line 2
    invoke-interface {v0}, Lblack/android/app/ActivityClientStatic;->getInstance()Ljava/lang/Object;

    move-result-object v0

    .line 3
    const-class v1, Lblack/android/app/ActivityClientContext;

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityClientContext;

    .line 4
    invoke-interface {v0}, Lblack/android/app/ActivityClientContext;->INTERFACE_SINGLETON()Ljava/lang/Object;

    move-result-object v0

    .line 5
    const-class v1, Lblack/android/util/SingletonContext;

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/util/SingletonContext;

    .line 6
    invoke-interface {v0}, Lblack/android/util/SingletonContext;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-class p1, Lblack/android/app/ActivityClientStatic;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/ActivityClientStatic;

    .line 2
    invoke-interface {p1}, Lblack/android/app/ActivityClientStatic;->getInstance()Ljava/lang/Object;

    move-result-object p1

    .line 3
    const-class v0, Lblack/android/app/ActivityClientContext;

    invoke-static {v0, p1, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/ActivityClientContext;

    .line 4
    invoke-interface {p1}, Lblack/android/app/ActivityClientContext;->INTERFACE_SINGLETON()Ljava/lang/Object;

    move-result-object p1

    .line 5
    const-class v0, Lblack/android/util/SingletonContext;

    invoke-static {v0, p1, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/util/SingletonContext;

    .line 6
    invoke-interface {p1, p2}, Lblack/android/util/SingletonContext;->_set_mInstance(Ljava/lang/Object;)V

    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onlyProxy(Z)V
    .locals 0

    invoke-super {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->onlyProxy(Z)V

    return-void
.end method
