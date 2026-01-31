package com.topjohnwu.superuser;

import android.content.Context;
import com.topjohnwu.superuser.internal.BuilderImpl;
import com.topjohnwu.superuser.internal.MainShell;
import com.topjohnwu.superuser.internal.UiThreadHandler;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class Shell implements Closeable {
    public static final int FLAG_MOUNT_MASTER = 2;
    public static final int FLAG_NON_ROOT_SHELL = 1;
    public static final int FLAG_REDIRECT_STDERR = 8;
    public static final int NON_ROOT_SHELL = 0;
    public static final int ROOT_MOUNT_MASTER = 2;
    public static final int ROOT_SHELL = 1;
    public static final int UNKNOWN = -1;
    public static ExecutorService EXECUTOR = Executors.newCachedThreadPool();
    public static boolean enableVerboseLogging = false;

    /* loaded from: classes.dex */
    public interface GetShellCallback {
        void onShell(Shell shell);
    }

    /* loaded from: classes.dex */
    public interface ResultCallback {
        void onResult(Result result);
    }

    /* loaded from: classes.dex */
    public interface Task {
        void run(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) throws IOException;
    }

    public abstract void execTask(Task task) throws IOException;

    public abstract int getStatus();

    public abstract boolean isAlive();

    public abstract Job newJob();

    public abstract boolean waitAndClose(long j, TimeUnit timeUnit) throws IOException, InterruptedException;

    public static void setDefaultBuilder(Builder builder) {
        MainShell.setBuilder(builder);
    }

    public static Shell getShell() {
        return MainShell.get();
    }

    public static void getShell(GetShellCallback callback) {
        MainShell.get(UiThreadHandler.executor, callback);
    }

    public static void getShell(Executor executor, GetShellCallback callback) {
        MainShell.get(executor, callback);
    }

    public static Shell getCachedShell() {
        return MainShell.getCached();
    }

    public static boolean rootAccess() {
        try {
            return getShell().isRoot();
        } catch (NoShellException e) {
            return false;
        }
    }

    /* renamed from: su */
    public static Job m93su(String... commands) {
        return MainShell.newJob(true, commands);
    }

    /* renamed from: sh */
    public static Job m95sh(String... commands) {
        return MainShell.newJob(false, commands);
    }

    /* renamed from: su */
    public static Job m94su(InputStream in) {
        return MainShell.newJob(true, in);
    }

    /* renamed from: sh */
    public static Job m96sh(InputStream in) {
        return MainShell.newJob(false, in);
    }

    public boolean isRoot() {
        return getStatus() >= 1;
    }

    public void waitAndClose() throws IOException {
        while (!waitAndClose(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Builder {
        protected int flags = 0;
        protected long timeout = 20;
        protected Class<? extends Initializer>[] initClasses = null;

        public abstract Shell build();

        public abstract Shell build(String... strArr);

        public static Builder create() {
            return new BuilderImpl();
        }

        @SafeVarargs
        public final Builder setInitializers(Class<? extends Initializer>... classes) {
            this.initClasses = classes;
            return this;
        }

        public final Builder setFlags(int flags) {
            this.flags = flags;
            return this;
        }

        public final Builder setTimeout(long timeout) {
            this.timeout = timeout;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Result {
        public static final int JOB_NOT_EXECUTED = -1;

        public abstract int getCode();

        public abstract List<String> getErr();

        public abstract List<String> getOut();

        public boolean isSuccess() {
            return getCode() == 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Job {
        public abstract Job add(InputStream inputStream);

        public abstract Job add(String... strArr);

        public abstract Result exec();

        public abstract void submit(Executor executor, ResultCallback resultCallback);

        /* renamed from: to */
        public abstract Job mo92to(List<String> list);

        /* renamed from: to */
        public abstract Job mo91to(List<String> list, List<String> list2);

        public void submit() {
            submit(null);
        }

        public void submit(ResultCallback cb) {
            submit(UiThreadHandler.executor, cb);
        }
    }

    /* loaded from: classes.dex */
    public static class Initializer {
        public boolean onInit(Context context, Shell shell) {
            return true;
        }
    }
}
