.class public Lcom/topjohnwu/superuser/internal/SerialExecutorService;
.super Ljava/util/concurrent/AbstractExecutorService;
.source "SerialExecutorService.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/AbstractExecutorService;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private isShutdown:Z

.field private mTasks:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private scheduleTask:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->isShutdown:Z

    .line 38
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->mTasks:Ljava/util/ArrayDeque;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->scheduleTask:Ljava/util/concurrent/FutureTask;

    return-void
.end method


# virtual methods
.method public declared-synchronized awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 2
    .param p1, "timeout"    # J
    .param p3, "unit"    # Ljava/util/concurrent/TimeUnit;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    monitor-enter p0

    .line 99
    :try_start_0
    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->scheduleTask:Ljava/util/concurrent/FutureTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 100
    monitor-exit p0

    return v1

    .line 102
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    goto :goto_0

    .end local p0    # "this":Lcom/topjohnwu/superuser/internal/SerialExecutorService;
    :catch_0
    move-exception v0

    .line 106
    :goto_0
    monitor-exit p0

    return v1

    .line 103
    :catch_1
    move-exception v0

    .line 104
    .local v0, "e":Ljava/util/concurrent/TimeoutException;
    monitor-exit p0

    const/4 v1, 0x0

    return v1

    .line 98
    .end local v0    # "e":Ljava/util/concurrent/TimeoutException;
    .end local p1    # "timeout":J
    .end local p3    # "unit":Ljava/util/concurrent/TimeUnit;
    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 34
    invoke-virtual {p0}, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 2

    .line 45
    nop

    :goto_0
    monitor-enter p0

    .line 46
    :try_start_0
    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->mTasks:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    move-object v1, v0

    .local v1, "task":Ljava/lang/Runnable;
    if-nez v0, :cond_0

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->scheduleTask:Ljava/util/concurrent/FutureTask;

    .line 48
    monitor-exit p0

    return-object v0

    .line 50
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 52
    .end local v1    # "task":Ljava/lang/Runnable;
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 3
    .param p1, "r"    # Ljava/lang/Runnable;

    monitor-enter p0

    .line 57
    :try_start_0
    iget-boolean v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->isShutdown:Z

    if-nez v0, :cond_1

    .line 61
    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->mTasks:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 62
    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->scheduleTask:Ljava/util/concurrent/FutureTask;

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Ljava/util/concurrent/FutureTask;

    invoke-direct {v0, p0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->scheduleTask:Ljava/util/concurrent/FutureTask;

    .line 64
    sget-object v0, Lcom/topjohnwu/superuser/Shell;->EXECUTOR:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->scheduleTask:Ljava/util/concurrent/FutureTask;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .end local p0    # "this":Lcom/topjohnwu/superuser/internal/SerialExecutorService;
    :cond_0
    monitor-exit p0

    return-void

    .line 58
    :cond_1
    :try_start_1
    new-instance v0, Ljava/util/concurrent/RejectedExecutionException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Task "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " rejected from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .end local p1    # "r":Ljava/lang/Runnable;
    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized isShutdown()Z
    .locals 1

    monitor-enter p0

    .line 88
    :try_start_0
    iget-boolean v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->isShutdown:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    .line 88
    .end local p0    # "this":Lcom/topjohnwu/superuser/internal/SerialExecutorService;
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized isTerminated()Z
    .locals 1

    monitor-enter p0

    .line 93
    :try_start_0
    iget-boolean v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->isShutdown:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->scheduleTask:Ljava/util/concurrent/FutureTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .end local p0    # "this":Lcom/topjohnwu/superuser/internal/SerialExecutorService;
    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    .line 93
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized shutdown()V
    .locals 1

    monitor-enter p0

    .line 70
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->isShutdown:Z

    .line 71
    iget-object v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->mTasks:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit p0

    return-void

    .line 69
    .end local p0    # "this":Lcom/topjohnwu/superuser/internal/SerialExecutorService;
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized shutdownNow()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 76
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->isShutdown:Z

    .line 77
    iget-object v1, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->scheduleTask:Ljava/util/concurrent/FutureTask;

    if-eqz v1, :cond_0

    .line 78
    invoke-virtual {v1, v0}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 80
    .end local p0    # "this":Lcom/topjohnwu/superuser/internal/SerialExecutorService;
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->mTasks:Ljava/util/ArrayDeque;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :try_start_2
    iget-object v1, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->mTasks:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 80
    monitor-exit p0

    return-object v0

    .line 82
    :catchall_0
    move-exception v0

    :try_start_3
    iget-object v1, p0, Lcom/topjohnwu/superuser/internal/SerialExecutorService;->mTasks:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 83
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method
