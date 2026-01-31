.class public abstract Lcom/topjohnwu/superuser/Shell;
.super Ljava/lang/Object;
.source "Shell.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/topjohnwu/superuser/Shell$ResultCallback;,
        Lcom/topjohnwu/superuser/Shell$GetShellCallback;,
        Lcom/topjohnwu/superuser/Shell$Task;,
        Lcom/topjohnwu/superuser/Shell$Initializer;,
        Lcom/topjohnwu/superuser/Shell$Job;,
        Lcom/topjohnwu/superuser/Shell$Result;,
        Lcom/topjohnwu/superuser/Shell$Builder;
    }
.end annotation


# static fields
.field public static EXECUTOR:Ljava/util/concurrent/ExecutorService; = null

.field public static final FLAG_MOUNT_MASTER:I = 0x2

.field public static final FLAG_NON_ROOT_SHELL:I = 0x1

.field public static final FLAG_REDIRECT_STDERR:I = 0x8

.field public static final NON_ROOT_SHELL:I = 0x0

.field public static final ROOT_MOUNT_MASTER:I = 0x2

.field public static final ROOT_SHELL:I = 0x1

.field public static final UNKNOWN:I = -0x1

.field public static enableVerboseLogging:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 126
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/topjohnwu/superuser/Shell;->EXECUTOR:Ljava/util/concurrent/ExecutorService;

    .line 132
    const/4 v0, 0x0

    sput-boolean v0, Lcom/topjohnwu/superuser/Shell;->enableVerboseLogging:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getCachedShell()Lcom/topjohnwu/superuser/Shell;
    .locals 1

    .line 199
    invoke-static {}, Lcom/topjohnwu/superuser/internal/MainShell;->getCached()Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v0

    return-object v0
.end method

.method public static getShell()Lcom/topjohnwu/superuser/Shell;
    .locals 1

    .line 163
    invoke-static {}, Lcom/topjohnwu/superuser/internal/MainShell;->get()Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v0

    return-object v0
.end method

.method public static getShell(Lcom/topjohnwu/superuser/Shell$GetShellCallback;)V
    .locals 1
    .param p0, "callback"    # Lcom/topjohnwu/superuser/Shell$GetShellCallback;

    .line 175
    sget-object v0, Lcom/topjohnwu/superuser/internal/UiThreadHandler;->executor:Ljava/util/concurrent/Executor;

    invoke-static {v0, p0}, Lcom/topjohnwu/superuser/internal/MainShell;->get(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$GetShellCallback;)V

    .line 176
    return-void
.end method

.method public static getShell(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$GetShellCallback;)V
    .locals 0
    .param p0, "executor"    # Ljava/util/concurrent/Executor;
    .param p1, "callback"    # Lcom/topjohnwu/superuser/Shell$GetShellCallback;

    .line 189
    invoke-static {p0, p1}, Lcom/topjohnwu/superuser/internal/MainShell;->get(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$GetShellCallback;)V

    .line 190
    return-void
.end method

.method public static rootAccess()Z
    .locals 2

    .line 209
    :try_start_0
    invoke-static {}, Lcom/topjohnwu/superuser/Shell;->getShell()Lcom/topjohnwu/superuser/Shell;

    move-result-object v0

    invoke-virtual {v0}, Lcom/topjohnwu/superuser/Shell;->isRoot()Z

    move-result v0
    :try_end_0
    .catch Lcom/topjohnwu/superuser/NoShellException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 210
    :catch_0
    move-exception v0

    .line 211
    .local v0, "e":Lcom/topjohnwu/superuser/NoShellException;
    const/4 v1, 0x0

    return v1
.end method

.method public static setDefaultBuilder(Lcom/topjohnwu/superuser/Shell$Builder;)V
    .locals 0
    .param p0, "builder"    # Lcom/topjohnwu/superuser/Shell$Builder;

    .line 141
    invoke-static {p0}, Lcom/topjohnwu/superuser/internal/MainShell;->setBuilder(Lcom/topjohnwu/superuser/Shell$Builder;)V

    .line 142
    return-void
.end method

.method public static sh(Ljava/io/InputStream;)Lcom/topjohnwu/superuser/Shell$Job;
    .locals 1
    .param p0, "in"    # Ljava/io/InputStream;

    .line 274
    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/topjohnwu/superuser/internal/MainShell;->newJob(ZLjava/io/InputStream;)Lcom/topjohnwu/superuser/Shell$Job;

    move-result-object v0

    return-object v0
.end method

.method public static varargs sh([Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell$Job;
    .locals 1
    .param p0, "commands"    # [Ljava/lang/String;

    .line 246
    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/topjohnwu/superuser/internal/MainShell;->newJob(Z[Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell$Job;

    move-result-object v0

    return-object v0
.end method

.method public static su(Ljava/io/InputStream;)Lcom/topjohnwu/superuser/Shell$Job;
    .locals 1
    .param p0, "in"    # Ljava/io/InputStream;

    .line 255
    const/4 v0, 0x1

    invoke-static {v0, p0}, Lcom/topjohnwu/superuser/internal/MainShell;->newJob(ZLjava/io/InputStream;)Lcom/topjohnwu/superuser/Shell$Job;

    move-result-object v0

    return-object v0
.end method

.method public static varargs su([Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell$Job;
    .locals 1
    .param p0, "commands"    # [Ljava/lang/String;

    .line 226
    const/4 v0, 0x1

    invoke-static {v0, p0}, Lcom/topjohnwu/superuser/internal/MainShell;->newJob(Z[Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell$Job;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract execTask(Lcom/topjohnwu/superuser/Shell$Task;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getStatus()I
.end method

.method public abstract isAlive()Z
.end method

.method public isRoot()Z
    .locals 2

    .line 326
    invoke-virtual {p0}, Lcom/topjohnwu/superuser/Shell;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public abstract newJob()Lcom/topjohnwu/superuser/Shell$Job;
.end method

.method public waitAndClose()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 355
    nop

    :goto_0
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {p0, v1, v2, v0}, Lcom/topjohnwu/superuser/Shell;->waitAndClose(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    .line 356
    nop

    .line 359
    return-void

    .line 357
    :catch_0
    move-exception v0

    :cond_0
    goto :goto_0
.end method

.method public abstract waitAndClose(JLjava/util/concurrent/TimeUnit;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation
.end method
