package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class MainShell {
    private static BuilderImpl defaultBuilder;
    private static boolean isInitMain;
    private static ShellImpl mainShell;

    private MainShell() {
    }

    public static synchronized ShellImpl get() {
        ShellImpl shell;
        synchronized (MainShell.class) {
            shell = getCached();
            if (shell == null) {
                isInitMain = true;
                shell = getBuilder().build();
                isInitMain = false;
            }
        }
        return shell;
    }

    public static void get(final Executor executor, final Shell.GetShellCallback callback) {
        final Shell shell = getCached();
        if (shell != null) {
            if (executor == null) {
                callback.onShell(shell);
                return;
            } else {
                executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.MainShell$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Shell.GetShellCallback.this.onShell(shell);
                    }
                });
                return;
            }
        }
        Shell.EXECUTOR.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.MainShell$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MainShell.lambda$get$2(executor, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$get$2(Executor executor, final Shell.GetShellCallback callback) {
        final Shell s;
        try {
            synchronized (MainShell.class) {
                isInitMain = true;
                s = getBuilder().build();
                isInitMain = false;
            }
            if (executor == null) {
                callback.onShell(s);
            } else {
                executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.MainShell$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Shell.GetShellCallback.this.onShell(s);
                    }
                });
            }
        } catch (NoShellException e) {
            Utils.m90ex(e);
        }
    }

    public static synchronized ShellImpl getCached() {
        ShellImpl shellImpl;
        synchronized (MainShell.class) {
            ShellImpl shellImpl2 = mainShell;
            if (shellImpl2 != null && shellImpl2.getStatus() < 0) {
                mainShell = null;
            }
            shellImpl = mainShell;
        }
        return shellImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void set(ShellImpl shell) {
        synchronized (MainShell.class) {
            if (isInitMain) {
                mainShell = shell;
            }
        }
    }

    public static synchronized void setBuilder(Shell.Builder builder) {
        synchronized (MainShell.class) {
            defaultBuilder = (BuilderImpl) builder;
        }
    }

    private static BuilderImpl getBuilder() {
        if (defaultBuilder == null) {
            defaultBuilder = new BuilderImpl();
        }
        return defaultBuilder;
    }

    public static Shell.Job newJob(boolean su, InputStream in) {
        return new PendingJob(su).add(in);
    }

    public static Shell.Job newJob(boolean su, String... cmds) {
        return new PendingJob(su).add(cmds);
    }
}
