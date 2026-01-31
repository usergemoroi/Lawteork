package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class PendingJob extends JobImpl {
    private final boolean isSU;
    private boolean retry = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingJob(boolean su) {
        this.isSU = su;
        mo92to(NOPList.getInstance());
    }

    @Override // com.topjohnwu.superuser.internal.JobImpl, com.topjohnwu.superuser.Shell.Job
    public Shell.Result exec() {
        try {
            this.shell = MainShell.get();
            if (this.isSU && !this.shell.isRoot()) {
                close();
                return ResultImpl.INSTANCE;
            }
            if (this.out instanceof NOPList) {
                this.out = new ArrayList();
            }
            Shell.Result res = super.exec();
            if (this.retry && res == ResultImpl.SHELL_ERR) {
                this.retry = false;
                return exec();
            }
            return res;
        } catch (NoShellException e) {
            close();
            return ResultImpl.INSTANCE;
        }
    }

    @Override // com.topjohnwu.superuser.internal.JobImpl, com.topjohnwu.superuser.Shell.Job
    public void submit(final Executor executor, final Shell.ResultCallback cb) {
        MainShell.get(null, new Shell.GetShellCallback() { // from class: com.topjohnwu.superuser.internal.PendingJob$$ExternalSyntheticLambda1
            @Override // com.topjohnwu.superuser.Shell.GetShellCallback
            public final void onShell(Shell shell) {
                PendingJob.this.m243lambda$submit$1$comtopjohnwusuperuserinternalPendingJob(executor, cb, shell);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$submit$1$com-topjohnwu-superuser-internal-PendingJob  reason: not valid java name */
    public /* synthetic */ void m243lambda$submit$1$comtopjohnwusuperuserinternalPendingJob(final Executor executor, final Shell.ResultCallback cb, Shell s) {
        if (this.isSU && !s.isRoot()) {
            close();
            ResultImpl.INSTANCE.callback(executor, cb);
            return;
        }
        if (this.out instanceof NOPList) {
            this.out = cb == null ? null : new ArrayList();
        }
        this.shell = (ShellImpl) s;
        super.submit(executor, new Shell.ResultCallback() { // from class: com.topjohnwu.superuser.internal.PendingJob$$ExternalSyntheticLambda0
            @Override // com.topjohnwu.superuser.Shell.ResultCallback
            public final void onResult(Shell.Result result) {
                PendingJob.this.m242lambda$null$0$comtopjohnwusuperuserinternalPendingJob(executor, cb, result);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$null$0$com-topjohnwu-superuser-internal-PendingJob  reason: not valid java name */
    public /* synthetic */ void m242lambda$null$0$comtopjohnwusuperuserinternalPendingJob(Executor executor, Shell.ResultCallback cb, Shell.Result res) {
        if (this.retry && res == ResultImpl.SHELL_ERR) {
            this.retry = false;
            submit(executor, cb);
        } else if (cb != null) {
            cb.onResult(res);
        }
    }
}
