package com.topjohnwu.superuser.internal;

import android.text.TextUtils;
import com.itsaky.androidide.utils.ILogger;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.ShellUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ShellImpl extends Shell {
    private static final String TAG = "SHELLIMPL";
    private final NoCloseInputStream STDERR;
    private final NoCloseOutputStream STDIN;
    private final NoCloseInputStream STDOUT;
    final ExecutorService executor;
    private final Process process;
    final boolean redirect;
    private int status;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class NoCloseInputStream extends FilterInputStream {
        NoCloseInputStream(InputStream in) {
            super(in);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        void close0() throws IOException {
            this.in.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class NoCloseOutputStream extends FilterOutputStream {
        NoCloseOutputStream(OutputStream out) {
            super(out instanceof BufferedOutputStream ? out : new BufferedOutputStream(out));
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] b, int off, int len) throws IOException {
            this.out.write(b, off, len);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.out.flush();
        }

        void close0() throws IOException {
            super.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShellImpl(long timeout, boolean redirect, String... cmd) throws IOException {
        this.status = -1;
        this.redirect = redirect;
        Utils.log(TAG, "exec " + TextUtils.join(ILogger.MSG_SEPARATOR, cmd));
        Process exec = Runtime.getRuntime().exec(cmd);
        this.process = exec;
        this.STDIN = new NoCloseOutputStream(exec.getOutputStream());
        this.STDOUT = new NoCloseInputStream(exec.getInputStream());
        this.STDERR = new NoCloseInputStream(exec.getErrorStream());
        SerialExecutorService serialExecutorService = new SerialExecutorService();
        this.executor = serialExecutorService;
        if (cmd.length >= 2 && TextUtils.equals(cmd[1], "--mount-master")) {
            this.status = 2;
        }
        Future<Void> check = serialExecutorService.submit(new Callable() { // from class: com.topjohnwu.superuser.internal.ShellImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void shellCheck;
                shellCheck = ShellImpl.this.shellCheck();
                return shellCheck;
            }
        });
        try {
            try {
                try {
                    try {
                        check.get(timeout, TimeUnit.SECONDS);
                    } catch (TimeoutException e) {
                        throw new IOException("Shell timeout", e);
                    }
                } catch (InterruptedException e2) {
                    throw new IOException("Shell initialization interrupted", e2);
                }
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException("Unknown ExecutionException", cause);
            }
        } catch (IOException e4) {
            this.executor.shutdownNow();
            release();
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void shellCheck() throws IOException {
        ShellUtils.cleanInputStream(this.STDOUT);
        ShellUtils.cleanInputStream(this.STDERR);
        BufferedReader br = new BufferedReader(new InputStreamReader(this.STDOUT));
        try {
            this.STDIN.write("echo SHELL_TEST\n".getBytes(Utils.UTF_8));
            this.STDIN.flush();
            String s = br.readLine();
            if (TextUtils.isEmpty(s) || !s.contains("SHELL_TEST")) {
                throw new IOException("Created process is not a shell");
            }
            int status = 0;
            this.STDIN.write("id\n".getBytes(Utils.UTF_8));
            this.STDIN.flush();
            String s2 = br.readLine();
            if (!TextUtils.isEmpty(s2) && s2.contains("uid=0")) {
                status = 1;
            }
            if (status == 1 && this.status == 2) {
                status = 2;
            }
            this.status = status;
            br.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    br.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void release() {
        this.status = -1;
        try {
            this.STDIN.close0();
        } catch (IOException e) {
        }
        try {
            this.STDERR.close0();
        } catch (IOException e2) {
        }
        try {
            this.STDOUT.close0();
        } catch (IOException e3) {
        }
        this.process.destroy();
    }

    @Override // com.topjohnwu.superuser.Shell
    public boolean waitAndClose(long timeout, TimeUnit unit) throws InterruptedException {
        if (this.status < 0) {
            return true;
        }
        this.executor.shutdown();
        if (this.executor.awaitTermination(timeout, unit)) {
            release();
            return true;
        }
        this.status = -1;
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.status < 0) {
            return;
        }
        this.executor.shutdownNow();
        release();
    }

    @Override // com.topjohnwu.superuser.Shell
    public int getStatus() {
        return this.status;
    }

    @Override // com.topjohnwu.superuser.Shell
    public boolean isAlive() {
        if (this.status < 0) {
            return false;
        }
        try {
            this.process.exitValue();
            return false;
        } catch (IllegalThreadStateException e) {
            return true;
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public synchronized void execTask(Shell.Task task) throws IOException {
        if (this.status < 0) {
            throw new ShellTerminatedException();
        }
        ShellUtils.cleanInputStream(this.STDOUT);
        ShellUtils.cleanInputStream(this.STDERR);
        try {
            this.STDIN.write(10);
            this.STDIN.flush();
            task.run(this.STDIN, this.STDOUT, this.STDERR);
        } catch (IOException e) {
            release();
            throw new ShellTerminatedException();
        }
    }

    @Override // com.topjohnwu.superuser.Shell
    public Shell.Job newJob() {
        return new JobImpl(this);
    }
}
