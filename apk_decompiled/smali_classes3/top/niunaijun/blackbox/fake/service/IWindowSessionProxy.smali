.class public Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy$AddToDisplayAsUser;,
        Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy$AddToDisplay;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "WindowSessionStub"


# instance fields
.field private mSession:Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IInterface;)V
    .locals 1

    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    iput-object p1, p0, Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy;->mSession:Landroid/os/IInterface;

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
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy;->mSession:Landroid/os/IInterface;

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
