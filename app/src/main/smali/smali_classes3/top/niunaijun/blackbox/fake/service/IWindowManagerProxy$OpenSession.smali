.class public Ltop/niunaijun/blackbox/fake/service/IWindowManagerProxy$OpenSession;
.super Ltop/niunaijun/blackbox/fake/hook/MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/fake/service/IWindowManagerProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OpenSession"
.end annotation

.annotation runtime Ltop/niunaijun/blackbox/fake/hook/ProxyMethod;
    value = "openSession"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public hook(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/IInterface;

    new-instance p2, Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy;

    invoke-direct {p2, p1}, Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy;-><init>(Landroid/os/IInterface;)V

    invoke-virtual {p2}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->injectHook()V

    invoke-virtual {p2}, Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy;->getProxyInvocation()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
