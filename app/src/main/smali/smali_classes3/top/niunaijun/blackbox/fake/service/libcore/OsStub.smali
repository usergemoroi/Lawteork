.class public Ltop/niunaijun/blackbox/fake/service/libcore/OsStub;
.super Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/libcore/OsStub$stat;,
        Ltop/niunaijun/blackbox/fake/service/libcore/OsStub$getuid;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "OsStub"


# instance fields
.field private mBase:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;-><init>()V

    invoke-static {}, Lh/a;->a()Lblack/libcore/io/LibcoreStatic;

    move-result-object v0

    invoke-interface {v0}, Lblack/libcore/io/LibcoreStatic;->os()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/fake/service/libcore/OsStub;->mBase:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic access$000(I)I
    .locals 0

    invoke-static {p0}, Ltop/niunaijun/blackbox/fake/service/libcore/OsStub;->getFakeUid(I)I

    move-result p0

    return p0
.end method

.method private static getFakeUid(I)I
    .locals 1

    if-lez p0, :cond_0

    const/16 v0, 0x2710

    if-gt p0, v0, :cond_0

    return p0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->isThreadInit()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object p0

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/app/BActivityThread;->isInit()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getBAppId()I

    move-result p0

    return p0

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostUid()I

    move-result p0

    return p0
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/libcore/OsStub;->mBase:Ljava/lang/Object;

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {}, Lh/a;->a()Lblack/libcore/io/LibcoreStatic;

    move-result-object p1

    invoke-interface {p1, p2}, Lblack/libcore/io/LibcoreStatic;->_set_os(Ljava/lang/Object;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    if-eqz p3, :cond_2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p3

    if-ge v0, v1, :cond_2

    aget-object v1, p3, v0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/String;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    aget-object v1, p3, v0

    check-cast v1, Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/core/IOCore;->get()Ltop/niunaijun/blackbox/core/IOCore;

    move-result-object v2

    invoke-virtual {v2, v1}, Ltop/niunaijun/blackbox/core/IOCore;->redirectPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p3, v0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-super {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isBadEnv()Z
    .locals 2

    invoke-static {}, Lh/a;->a()Lblack/libcore/io/LibcoreStatic;

    move-result-object v0

    invoke-interface {v0}, Lblack/libcore/io/LibcoreStatic;->os()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onBindMethod()V
    .locals 0

    return-void
.end method
