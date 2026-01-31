.class public final Lcom/topjohnwu/superuser/internal/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "LIBSU"

.field public static final UTF_8:Ljava/nio/charset/Charset;

.field public static context:Landroid/content/Context;

.field private static synchronizedCollectionClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 43
    sput-object v0, Lcom/topjohnwu/superuser/internal/Utils;->UTF_8:Ljava/nio/charset/Charset;

    .line 42
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static err(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "t"    # Ljava/lang/Throwable;

    .line 66
    const-string v0, ""

    invoke-static {p0, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 67
    return-void
.end method

.method public static err(Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "t"    # Ljava/lang/Throwable;

    .line 62
    const-string v0, "LIBSU"

    invoke-static {v0, p0}, Lcom/topjohnwu/superuser/internal/Utils;->err(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    return-void
.end method

.method public static ex(Ljava/lang/Throwable;)V
    .locals 2
    .param p0, "t"    # Ljava/lang/Throwable;

    .line 57
    invoke-static {}, Lcom/topjohnwu/superuser/internal/Utils;->vLog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    const-string v0, "LIBSU"

    const-string v1, ""

    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    :cond_0
    return-void
.end method

.method public static declared-synchronized getContext()Landroid/content/Context;
    .locals 2

    const-class v0, Lcom/topjohnwu/superuser/internal/Utils;

    monitor-enter v0

    .line 75
    :try_start_0
    sget-object v1, Lcom/topjohnwu/superuser/internal/Utils;->context:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 76
    new-instance v1, Lcom/topjohnwu/superuser/internal/Utils$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/topjohnwu/superuser/internal/Utils$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v1}, Lcom/topjohnwu/superuser/internal/UiThreadHandler;->runAndWait(Ljava/lang/Runnable;)V

    .line 87
    :cond_0
    sget-object v1, Lcom/topjohnwu/superuser/internal/Utils;->context:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 74
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static getDeContext(Landroid/content/Context;)Landroid/content/Context;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .line 91
    invoke-virtual {p0}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static isSynchronized(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 95
    .local p0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    sget-object v0, Lcom/topjohnwu/superuser/internal/Utils;->synchronizedCollectionClass:Ljava/lang/Class;

    if-nez v0, :cond_0

    .line 97
    invoke-static {}, Lcom/topjohnwu/superuser/internal/NOPList;->getInstance()Lcom/topjohnwu/superuser/internal/NOPList;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->synchronizedCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/topjohnwu/superuser/internal/Utils;->synchronizedCollectionClass:Ljava/lang/Class;

    .line 99
    :cond_0
    sget-object v0, Lcom/topjohnwu/superuser/internal/Utils;->synchronizedCollectionClass:Ljava/lang/Class;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static synthetic lambda$getContext$0()V
    .locals 4

    .line 78
    :try_start_0
    const-string v0, "android.app.ActivityThread"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "currentApplication"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    .line 79
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 80
    .local v0, "currentApplication":Ljava/lang/reflect/Method;
    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    sput-object v1, Lcom/topjohnwu/superuser/internal/Utils;->context:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .end local v0    # "currentApplication":Ljava/lang/reflect/Method;
    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 83
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lcom/topjohnwu/superuser/internal/Utils;->err(Ljava/lang/Throwable;)V

    .line 85
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

.method public static log(Ljava/lang/Object;)V
    .locals 1
    .param p0, "log"    # Ljava/lang/Object;

    .line 48
    const-string v0, "LIBSU"

    invoke-static {v0, p0}, Lcom/topjohnwu/superuser/internal/Utils;->log(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    return-void
.end method

.method public static log(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "log"    # Ljava/lang/Object;

    .line 52
    invoke-static {}, Lcom/topjohnwu/superuser/internal/Utils;->vLog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    :cond_0
    return-void
.end method

.method public static pump(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 7
    .param p0, "in"    # Ljava/io/InputStream;
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 104
    const-wide/16 v0, 0x0

    .line 105
    .local v0, "total":J
    const/high16 v2, 0x10000

    new-array v2, v2, [B

    .line 106
    .local v2, "buf":[B
    :goto_0
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    move v4, v3

    .local v4, "read":I
    if-lez v3, :cond_0

    .line 107
    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 108
    int-to-long v5, v4

    add-long/2addr v0, v5

    goto :goto_0

    .line 110
    :cond_0
    return-wide v0
.end method

.method public static vLog()Z
    .locals 1

    .line 70
    sget-boolean v0, Lcom/topjohnwu/superuser/Shell;->enableVerboseLogging:Z

    return v0
.end method
