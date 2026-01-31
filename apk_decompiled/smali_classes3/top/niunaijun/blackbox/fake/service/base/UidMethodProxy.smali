.class public Ltop/niunaijun/blackbox/fake/service/base/UidMethodProxy;
.super Ltop/niunaijun/blackbox/fake/hook/MethodHook;
.source "SourceFile"


# instance fields
.field private final index:I

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/MethodHook;-><init>()V

    iput p2, p0, Ltop/niunaijun/blackbox/fake/service/base/UidMethodProxy;->index:I

    iput-object p1, p0, Ltop/niunaijun/blackbox/fake/service/base/UidMethodProxy;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMethodName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/base/UidMethodProxy;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hook(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ltop/niunaijun/blackbox/fake/service/base/UidMethodProxy;->index:I

    aget-object v0, p3, v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getBUid()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ltop/niunaijun/blackbox/fake/service/base/UidMethodProxy;->index:I

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostUid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p3, v0

    :cond_0
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
