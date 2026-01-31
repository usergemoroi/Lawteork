package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.StreamGobbler;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TaskImpl implements Shell.Task {
    static final byte[] END_CMD;
    static final String END_UUID;
    static final int UUID_LEN = 36;
    private final ResultImpl res;
    private final List<ShellInputSource> sources;

    static {
        String uuid = UUID.randomUUID().toString();
        END_UUID = uuid;
        END_CMD = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", uuid).getBytes(Utils.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskImpl(List<ShellInputSource> sources, ResultImpl res) {
        this.sources = sources;
        this.res = res;
    }

    @Override // com.topjohnwu.superuser.Shell.Task
    public void run(OutputStream stdin, InputStream stdout, InputStream stderr) throws IOException {
        Future<Integer> out = Shell.EXECUTOR.submit(new StreamGobbler.OUT(stdout, this.res.out));
        Future<Void> err = Shell.EXECUTOR.submit(new StreamGobbler.ERR(stderr, this.res.err));
        for (ShellInputSource src : this.sources) {
            src.serve(stdin);
        }
        stdin.write(END_CMD);
        stdin.flush();
        try {
            this.res.code = out.get().intValue();
            err.get();
        } catch (InterruptedException | ExecutionException e) {
            throw ((InterruptedIOException) new InterruptedIOException().initCause(e));
        }
    }
}
