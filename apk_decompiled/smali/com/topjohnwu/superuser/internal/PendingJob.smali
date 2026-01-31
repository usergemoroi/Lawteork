.class Lcom/topjohnwu/superuser/internal/PendingJob;
.super Lcom/topjohnwu/superuser/internal/JobImpl;
.source "PendingJob.java"


# instance fields
.field private final isSU:Z

.field private retry:Z


# direct methods
.method constructor <init>(Z)V
    .locals 1
    .param p1, "su"    # Z

    .line 33
    invoke-direct {p0}, Lcom/topjohnwu/superuser/internal/JobImpl;-><init>()V

    .line 34
    iput-boolean p1, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->isSU:Z

    .line 35
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->retry:Z

    .line 36
    invoke-static {}, Lcom/topjohnwu/superuser/internal/NOPList;->getInstance()Lcom/topjohnwu/superuser/internal/NOPList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/topjohnwu/superuser/internal/PendingJob;->to(Ljava/util/List;)Lcom/topjohnwu/superuser/Shell$Job;

    .line 37
    return-void
.end method


# virtual methods
.method public exec()Lcom/topjohnwu/superuser/Shell$Result;
    .locals 2

    .line 43
    :try_start_0
    invoke-static {}, Lcom/topjohnwu/superuser/internal/MainShell;->get()Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v0

    iput-object v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->shell:Lcom/topjohnwu/superuser/internal/ShellImpl;
    :try_end_0
    .catch Lcom/topjohnwu/superuser/NoShellException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    nop

    .line 48
    iget-boolean v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->isSU:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->shell:Lcom/topjohnwu/superuser/internal/ShellImpl;

    invoke-virtual {v0}, Lcom/topjohnwu/superuser/internal/ShellImpl;->isRoot()Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/topjohnwu/superuser/internal/PendingJob;->close()V

    .line 50
    sget-object v0, Lcom/topjohnwu/superuser/internal/ResultImpl;->INSTANCE:Lcom/topjohnwu/superuser/internal/ResultImpl;

    return-object v0

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->out:Ljava/util/List;

    instance-of v0, v0, Lcom/topjohnwu/superuser/internal/NOPList;

    if-eqz v0, :cond_1

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->out:Ljava/util/List;

    .line 54
    :cond_1
    invoke-super {p0}, Lcom/topjohnwu/superuser/internal/JobImpl;->exec()Lcom/topjohnwu/superuser/Shell$Result;

    move-result-object v0

    .line 55
    .local v0, "res":Lcom/topjohnwu/superuser/Shell$Result;
    iget-boolean v1, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->retry:Z

    if-eqz v1, :cond_2

    sget-object v1, Lcom/topjohnwu/superuser/internal/ResultImpl;->SHELL_ERR:Lcom/topjohnwu/superuser/internal/ResultImpl;

    if-ne v0, v1, :cond_2

    .line 57
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->retry:Z

    .line 58
    invoke-virtual {p0}, Lcom/topjohnwu/superuser/internal/PendingJob;->exec()Lcom/topjohnwu/superuser/Shell$Result;

    move-result-object v1

    return-object v1

    .line 60
    :cond_2
    return-object v0

    .line 44
    .end local v0    # "res":Lcom/topjohnwu/superuser/Shell$Result;
    :catch_0
    move-exception v0

    .line 45
    .local v0, "e":Lcom/topjohnwu/superuser/NoShellException;
    invoke-virtual {p0}, Lcom/topjohnwu/superuser/internal/PendingJob;->close()V

    .line 46
    sget-object v1, Lcom/topjohnwu/superuser/internal/ResultImpl;->INSTANCE:Lcom/topjohnwu/superuser/internal/ResultImpl;

    return-object v1
.end method

.method synthetic lambda$null$0$com-topjohnwu-superuser-internal-PendingJob(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$ResultCallback;Lcom/topjohnwu/superuser/Shell$Result;)V
    .locals 1
    .param p1, "executor"    # Ljava/util/concurrent/Executor;
    .param p2, "cb"    # Lcom/topjohnwu/superuser/Shell$ResultCallback;
    .param p3, "res"    # Lcom/topjohnwu/superuser/Shell$Result;

    .line 75
    iget-boolean v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->retry:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/topjohnwu/superuser/internal/ResultImpl;->SHELL_ERR:Lcom/topjohnwu/superuser/internal/ResultImpl;

    if-ne p3, v0, :cond_0

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->retry:Z

    .line 78
    invoke-virtual {p0, p1, p2}, Lcom/topjohnwu/superuser/internal/PendingJob;->submit(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$ResultCallback;)V

    goto :goto_0

    .line 79
    :cond_0
    if-eqz p2, :cond_1

    .line 80
    invoke-interface {p2, p3}, Lcom/topjohnwu/superuser/Shell$ResultCallback;->onResult(Lcom/topjohnwu/superuser/Shell$Result;)V

    .line 82
    :cond_1
    :goto_0
    return-void
.end method

.method synthetic lambda$submit$1$com-topjohnwu-superuser-internal-PendingJob(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$ResultCallback;Lcom/topjohnwu/superuser/Shell;)V
    .locals 1
    .param p1, "executor"    # Ljava/util/concurrent/Executor;
    .param p2, "cb"    # Lcom/topjohnwu/superuser/Shell$ResultCallback;
    .param p3, "s"    # Lcom/topjohnwu/superuser/Shell;

    .line 66
    iget-boolean v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->isSU:Z

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/topjohnwu/superuser/Shell;->isRoot()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    invoke-virtual {p0}, Lcom/topjohnwu/superuser/internal/PendingJob;->close()V

    .line 68
    sget-object v0, Lcom/topjohnwu/superuser/internal/ResultImpl;->INSTANCE:Lcom/topjohnwu/superuser/internal/ResultImpl;

    invoke-virtual {v0, p1, p2}, Lcom/topjohnwu/superuser/internal/ResultImpl;->callback(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$ResultCallback;)V

    .line 69
    return-void

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->out:Ljava/util/List;

    instance-of v0, v0, Lcom/topjohnwu/superuser/internal/NOPList;

    if-eqz v0, :cond_2

    .line 72
    if-nez p2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iput-object v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->out:Ljava/util/List;

    .line 73
    :cond_2
    move-object v0, p3

    check-cast v0, Lcom/topjohnwu/superuser/internal/ShellImpl;

    iput-object v0, p0, Lcom/topjohnwu/superuser/internal/PendingJob;->shell:Lcom/topjohnwu/superuser/internal/ShellImpl;

    .line 74
    new-instance v0, Lcom/topjohnwu/superuser/internal/PendingJob$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1, p2}, Lcom/topjohnwu/superuser/internal/PendingJob$$ExternalSyntheticLambda0;-><init>(Lcom/topjohnwu/superuser/internal/PendingJob;Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$ResultCallback;)V

    invoke-super {p0, p1, v0}, Lcom/topjohnwu/superuser/internal/JobImpl;->submit(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$ResultCallback;)V

    .line 83
    return-void
.end method

.method public submit(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$ResultCallback;)V
    .locals 2
    .param p1, "executor"    # Ljava/util/concurrent/Executor;
    .param p2, "cb"    # Lcom/topjohnwu/superuser/Shell$ResultCallback;

    .line 65
    new-instance v0, Lcom/topjohnwu/superuser/internal/PendingJob$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p1, p2}, Lcom/topjohnwu/superuser/internal/PendingJob$$ExternalSyntheticLambda1;-><init>(Lcom/topjohnwu/superuser/internal/PendingJob;Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$ResultCallback;)V

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/topjohnwu/superuser/internal/MainShell;->get(Ljava/util/concurrent/Executor;Lcom/topjohnwu/superuser/Shell$GetShellCallback;)V

    .line 84
    return-void
.end method
