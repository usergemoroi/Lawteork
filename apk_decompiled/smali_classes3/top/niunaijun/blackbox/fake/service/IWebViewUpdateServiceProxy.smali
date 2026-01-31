.class public Ltop/niunaijun/blackbox/fake/service/IWebViewUpdateServiceProxy;
.super Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "IWebViewUpdateServiceProxy"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;-><init>()V

    return-void
.end method

.method private createSafeFallback()V
    .locals 6

    const-string v0, "IWebViewUpdateServiceProxy"

    const-string v1, "Safe IWebViewUpdateService proxy created: "

    :try_start_0
    const-string v2, "android.webkit.IWebViewUpdateService"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    new-instance v2, Ltop/niunaijun/blackbox/fake/service/IWebViewUpdateServiceProxy$1;

    invoke-direct {v2, p0}, Ltop/niunaijun/blackbox/fake/service/IWebViewUpdateServiceProxy$1;-><init>(Ltop/niunaijun/blackbox/fake/service/IWebViewUpdateServiceProxy;)V

    invoke-static {v3, v4, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v2, "createSafeFallback failed"

    invoke-static {v0, v2, v1}, Ltop/niunaijun/blackbox/utils/Slog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 4

    const-string v0, "android.webkit.IWebViewUpdateService"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    const-string v2, "IWebViewUpdateServiceProxy"

    const-string v3, "getWho: IWebViewUpdateService not found"

    invoke-static {v2, v3, v1}, Ltop/niunaijun/blackbox/utils/Slog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/IWebViewUpdateServiceProxy;->createSafeFallback()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string p2, "IWebViewUpdateServiceProxy"

    const-string v0, "inject: fallback failed"

    invoke-static {p2, v0, p1}, Ltop/niunaijun/blackbox/utils/Slog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public isBadEnv()Z
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :catchall_0
    move-exception v1

    return v0
.end method
