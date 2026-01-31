package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JobImpl extends Shell.Job implements Closeable {
    protected List<String> err;
    protected List<String> out;
    protected ShellImpl shell;
    private final List<ShellInputSource> sources = new ArrayList();
    private boolean stderrSet = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobImpl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobImpl(ShellImpl s) {
        this.shell = s;
    }

    private ResultImpl exec0() {
        boolean redirect = !this.stderrSet && this.shell.redirect;
        if (redirect) {
            this.err = this.out;
        }
        ResultImpl result = new ResultImpl();
        List<String> list = this.out;
        if (list == null || list != this.err || Utils.isSynchronized(list)) {
            result.out = this.out;
            result.err = this.err;
        } else {
            List<String> list2 = Collections.synchronizedList(this.out);
            result.out = list2;
            result.err = list2;
        }
        try {
            try {
                this.shell.execTask(new TaskImpl(this.sources, result));
                close();
                result.out = this.out;
                result.err = redirect ? null : this.err;
                return result;
            } catch (IOException e) {
                if (e instanceof ShellTerminatedException) {
                    ResultImpl resultImpl = ResultImpl.SHELL_ERR;
                    close();
                    result.out = this.out;
                    result.err = redirect ? null : this.err;
                    return resultImpl;
                }
                Utils.err(e);
                ResultImpl resultImpl2 = ResultImpl.INSTANCE;
                close();
                result.out = this.out;
                result.err = redirect ? null : this.err;
                return resultImpl2;
            }
        } catch (Throwable th) {
            close();
            result.out = this.out;
            result.err = redirect ? null : this.err;
            throw th;
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Result exec() {
        return exec0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$submit$0$com-topjohnwu-superuser-internal-JobImpl  reason: not valid java name */
    public /* synthetic */ void m241lambda$submit$0$comtopjohnwusuperuserinternalJobImpl(Executor executor, Shell.ResultCallback cb) {
        exec0().callback(executor, cb);
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public void submit(final Executor executor, final Shell.ResultCallback cb) {
        this.shell.executor.execute(new Runnable() { // from class: com.topjohnwu.superuser.internal.JobImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                JobImpl.this.m241lambda$submit$0$comtopjohnwusuperuserinternalJobImpl(executor, cb);
            }
        });
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    /* renamed from: to */
    public Shell.Job mo92to(List<String> output) {
        this.out = output;
        this.err = null;
        this.stderrSet = false;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    /* renamed from: to */
    public Shell.Job mo91to(List<String> stdout, List<String> stderr) {
        this.out = stdout;
        this.err = stderr;
        this.stderrSet = true;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job add(InputStream in) {
        if (in != null) {
            this.sources.add(new InputStreamSource(in));
        }
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Job
    public Shell.Job add(String... cmds) {
        if (cmds != null && cmds.length > 0) {
            this.sources.add(new CommandSource(cmds));
        }
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (ShellInputSource src : this.sources) {
            src.close();
        }
    }
}
