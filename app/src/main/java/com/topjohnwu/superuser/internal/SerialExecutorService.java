package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class SerialExecutorService extends AbstractExecutorService implements Callable<Void> {
    private boolean isShutdown = false;
    private ArrayDeque<Runnable> mTasks = new ArrayDeque<>();
    private FutureTask<Void> scheduleTask = null;

    @Override // java.util.concurrent.Callable
    public Void call() {
        Runnable task;
        while (true) {
            synchronized (this) {
                task = this.mTasks.poll();
                if (task == null) {
                    this.scheduleTask = null;
                    return null;
                }
            }
            task.run();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable r) {
        if (this.isShutdown) {
            throw new RejectedExecutionException("Task " + r.toString() + " rejected from " + toString());
        }
        this.mTasks.offer(r);
        if (this.scheduleTask == null) {
            this.scheduleTask = new FutureTask<>(this);
            Shell.EXECUTOR.execute(this.scheduleTask);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized void shutdown() {
        this.isShutdown = true;
        this.mTasks.clear();
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized List<Runnable> shutdownNow() {
        ArrayList arrayList;
        this.isShutdown = true;
        FutureTask<Void> futureTask = this.scheduleTask;
        if (futureTask != null) {
            futureTask.cancel(true);
        }
        arrayList = new ArrayList(this.mTasks);
        this.mTasks.clear();
        return arrayList;
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean isShutdown() {
        return this.isShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean isTerminated() {
        boolean z;
        if (this.isShutdown) {
            z = this.scheduleTask == null;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public synchronized boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        FutureTask<Void> futureTask = this.scheduleTask;
        if (futureTask == null) {
            return true;
        }
        try {
            futureTask.get(timeout, unit);
        } catch (ExecutionException e) {
        } catch (TimeoutException e2) {
            return false;
        }
        return true;
    }
}
