.class public final Lcom/topjohnwu/superuser/internal/MainShell;
.super Ljava/lang/Object;
.source "MainShell.java"


# static fields
.field private static defaultBuilder:Lcom/topjohnwu/superuser/internal/BuilderImpl;

.field private static isInitMain:Z

.field private static mainShell:Lcom/topjohnwu/superuser/internal/ShellImpl;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized get()Lcom/topjohnwu/superuser/internal/ShellImpl;
    .locals 3

    const-class v0, Lcom/topjohnwu/superuser/internal/MainShell;

    monitor-enter v0

    .line 40
    :try_start_0
    invoke-static {}, Lcom/topjohnwu/superuser/internal/MainShell;->getCached()Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v1

    .line 41
    .local v1, "shell":Lcom/topjohnwu/superuser/internal/ShellImpl;
    if-nez v1, :cond_0

    .line 42
    const/4 v2, 0x1

    sput-boolean v2, Lcom/topjohnwu/superuser/internal/MainShell;->isInitMain:Z

    .line 43
    invoke-static {}, Lcom/topjohnwu/superuser/internal/MainShell;->getBuilder()Lcom/topjohnwu/superuser/internal/BuilderImpl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->build()Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v2

    move-object v1, v2

    .line 44
    const/4 v2, 0x0

    sput-boolean v2, Lcom/topjohnwu/superuser/internal/MainShell;->isInitMain:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :cond_0
    monitor-exit v0

    return-object v1

    .line 39
    .end local v1    # "shell":Lcom/topjohnwu/superuser/internal/ShellImpl;
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static get(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$GetShellCallback;)V
    .locals 3
    .param p0, "executor"    # Ljava/util/concurrent/Executor;
    .param p1, "callback"    # Lcom/topjohnwu/superuser/Shell$GetShellCallback;

    .line 50
    invoke-static {}, Lcom/topjohnwu/superuser/internal/MainShell;->getCached()Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v0

    .line 51
    .local v0, "shell":Lcom/topjohnwu/superuser/Shell;
    if-eqz v0, :cond_1

    .line 52
    if-nez p0, :cond_0

    .line 53
    invoke-interface {p1, v0}, Lcom/topjohnwu/superuser/Shell$GetShellCallback;->onShell(Lcom/topjohnwu/superuser/Shell;)V

    goto :goto_0

    .line 55
    :cond_0
    new-instance v1, Lcom/topjohnwu/superuser/internal/MainShell$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1, v0}, Lcom/topjohnwu/superuser/internal/MainShell$$ExternalSyntheticLambda0;-><init>(Lcom/topjohnwu/superuser/Shell$GetShellCallback;Lcom/topjohnwu/superuser/Shell;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 58
    :cond_1
    sget-object v1, Lcom/topjohnwu/superuser/Shell;->EXECUTOR:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/topjohnwu/superuser/internal/MainShell$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0, p1}, Lcom/topjohnwu/superuser/internal/MainShell$$ExternalSyntheticLambda1;-><init>(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$GetShellCallback;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 76
    :goto_0
    return-void
.end method

.method private static getBuilder()Lcom/topjohnwu/superuser/internal/BuilderImpl;
    .locals 1

    .line 94
    sget-object v0, Lcom/topjohnwu/superuser/internal/MainShell;->defaultBuilder:Lcom/topjohnwu/superuser/internal/BuilderImpl;

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Lcom/topjohnwu/superuser/internal/BuilderImpl;

    invoke-direct {v0}, Lcom/topjohnwu/superuser/internal/BuilderImpl;-><init>()V

    sput-object v0, Lcom/topjohnwu/superuser/internal/MainShell;->defaultBuilder:Lcom/topjohnwu/superuser/internal/BuilderImpl;

    .line 96
    :cond_0
    sget-object v0, Lcom/topjohnwu/superuser/internal/MainShell;->defaultBuilder:Lcom/topjohnwu/superuser/internal/BuilderImpl;

    return-object v0
.end method

.method public static declared-synchronized getCached()Lcom/topjohnwu/superuser/internal/ShellImpl;
    .locals 2

    const-class v0, Lcom/topjohnwu/superuser/internal/MainShell;

    monitor-enter v0

    .line 79
    :try_start_0
    sget-object v1, Lcom/topjohnwu/superuser/internal/MainShell;->mainShell:Lcom/topjohnwu/superuser/internal/ShellImpl;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/topjohnwu/superuser/internal/ShellImpl;->getStatus()I

    move-result v1

    if-gez v1, :cond_0

    .line 80
    const/4 v1, 0x0

    sput-object v1, Lcom/topjohnwu/superuser/internal/MainShell;->mainShell:Lcom/topjohnwu/superuser/internal/ShellImpl;

    .line 81
    :cond_0
    sget-object v1, Lcom/topjohnwu/superuser/internal/MainShell;->mainShell:Lcom/topjohnwu/superuser/internal/ShellImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 78
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method static synthetic lambda$get$0(Lcom/topjohnwu/superuser/Shell$GetShellCallback;Lcom/topjohnwu/superuser/Shell;)V
    .locals 0
    .param p0, "callback"    # Lcom/topjohnwu/superuser/Shell$GetShellCallback;
    .param p1, "shell"    # Lcom/topjohnwu/superuser/Shell;

    .line 55
    invoke-interface {p0, p1}, Lcom/topjohnwu/superuser/Shell$GetShellCallback;->onShell(Lcom/topjohnwu/superuser/Shell;)V

    return-void
.end method

.method static synthetic lambda$get$2(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$GetShellCallback;)V
    .locals 3
    .param p0, "executor"    # Ljava/util/concurrent/Executor;
    .param p1, "callback"    # Lcom/topjohnwu/superuser/Shell$GetShellCallback;

    .line 61
    :try_start_0
    const-class v0, Lcom/topjohnwu/superuser/internal/MainShell;

    monitor-enter v0
    :try_end_0
    .catch Lcom/topjohnwu/superuser/NoShellException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lcom/topjohnwu/superuser/internal/MainShell;->isInitMain:Z

    .line 63
    invoke-static {}, Lcom/topjohnwu/superuser/internal/MainShell;->getBuilder()Lcom/topjohnwu/superuser/internal/BuilderImpl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->build()Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v1

    .line 64
    .local v1, "s":Lcom/topjohnwu/superuser/Shell;
    const/4 v2, 0x0

    sput-boolean v2, Lcom/topjohnwu/superuser/internal/MainShell;->isInitMain:Z

    .line 65
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    nop

    .line 70
    if-nez p0, :cond_0

    .line 71
    invoke-interface {p1, v1}, Lcom/topjohnwu/superuser/Shell$GetShellCallback;->onShell(Lcom/topjohnwu/superuser/Shell;)V

    goto :goto_0

    .line 73
    :cond_0
    new-instance v0, Lcom/topjohnwu/superuser/internal/MainShell$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1, v1}, Lcom/topjohnwu/superuser/internal/MainShell$$ExternalSyntheticLambda2;-><init>(Lcom/topjohnwu/superuser/Shell$GetShellCallback;Lcom/topjohnwu/superuser/Shell;)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 74
    :goto_0
    return-void

    .line 65
    .end local v1    # "s":Lcom/topjohnwu/superuser/Shell;
    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .end local p0    # "executor":Ljava/util/concurrent/Executor;
    .end local p1    # "callback":Lcom/topjohnwu/superuser/Shell$GetShellCallback;
    :try_start_3
    throw v1
    :try_end_3
    .catch Lcom/topjohnwu/superuser/NoShellException; {:try_start_3 .. :try_end_3} :catch_0

    .line 66
    .restart local p0    # "executor":Ljava/util/concurrent/Executor;
    .restart local p1    # "callback":Lcom/topjohnwu/superuser/Shell$GetShellCallback;
    :catch_0
    move-exception v0

    .line 67
    .local v0, "e":Lcom/topjohnwu/superuser/NoShellException;
    invoke-static {v0}, Lcom/topjohnwu/superuser/internal/Utils;->ex(Ljava/lang/Throwable;)V

    .line 68
    return-void
.end method

.method static synthetic lambda$null$1(Lcom/topjohnwu/superuser/Shell$GetShellCallback;Lcom/topjohnwu/superuser/Shell;)V
    .locals 0
    .param p0, "callback"    # Lcom/topjohnwu/superuser/Shell$GetShellCallback;
    .param p1, "s"    # Lcom/topjohnwu/superuser/Shell;

    .line 73
    invoke-interface {p0, p1}, Lcom/topjohnwu/superuser/Shell$GetShellCallback;->onShell(Lcom/topjohnwu/superuser/Shell;)V

    return-void
.end method

.method public static newJob(ZLjava/io/InputStream;)Lcom/topjohnwu/superuser/Shell$Job;
    .locals 1
    .param p0, "su"    # Z
    .param p1, "in"    # Ljava/io/InputStream;

    .line 100
    new-instance v0, Lcom/topjohnwu/superuser/internal/PendingJob;

    invoke-direct {v0, p0}, Lcom/topjohnwu/superuser/internal/PendingJob;-><init>(Z)V

    invoke-virtual {v0, p1}, Lcom/topjohnwu/superuser/internal/PendingJob;->add(Ljava/io/InputStream;)Lcom/topjohnwu/superuser/Shell$Job;

    move-result-object v0

    return-object v0
.end method

.method public static varargs newJob(Z[Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell$Job;
    .locals 1
    .param p0, "su"    # Z
    .param p1, "cmds"    # [Ljava/lang/String;

    .line 104
    new-instance v0, Lcom/topjohnwu/superuser/internal/PendingJob;

    invoke-direct {v0, p0}, Lcom/topjohnwu/superuser/internal/PendingJob;-><init>(Z)V

    invoke-virtual {v0, p1}, Lcom/topjohnwu/superuser/internal/PendingJob;->add([Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell$Job;

    move-result-object v0

    return-object v0
.end method

.method static declared-synchronized set(Lcom/topjohnwu/superuser/internal/ShellImpl;)V
    .locals 2
    .param p0, "shell"    # Lcom/topjohnwu/superuser/internal/ShellImpl;

    const-class v0, Lcom/topjohnwu/superuser/internal/MainShell;

    monitor-enter v0

    .line 85
    :try_start_0
    sget-boolean v1, Lcom/topjohnwu/superuser/internal/MainShell;->isInitMain:Z

    if-eqz v1, :cond_0

    .line 86
    sput-object p0, Lcom/topjohnwu/superuser/internal/MainShell;->mainShell:Lcom/topjohnwu/superuser/internal/ShellImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    :cond_0
    monitor-exit v0

    return-void

    .line 84
    .end local p0    # "shell":Lcom/topjohnwu/superuser/internal/ShellImpl;
    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized setBuilder(Lcom/topjohnwu/superuser/Shell$Builder;)V
    .locals 2
    .param p0, "builder"    # Lcom/topjohnwu/superuser/Shell$Builder;

    const-class v0, Lcom/topjohnwu/superuser/internal/MainShell;

    monitor-enter v0

    .line 90
    :try_start_0
    move-object v1, p0

    check-cast v1, Lcom/topjohnwu/superuser/internal/BuilderImpl;

    sput-object v1, Lcom/topjohnwu/superuser/internal/MainShell;->defaultBuilder:Lcom/topjohnwu/superuser/internal/BuilderImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    monitor-exit v0

    return-void

    .line 89
    .end local p0    # "builder":Lcom/topjohnwu/superuser/Shell$Builder;
    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
