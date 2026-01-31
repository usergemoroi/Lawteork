package com.topjohnwu.superuser.internal;

import java.io.IOException;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShellInputSource.java */
/* loaded from: classes.dex */
public class CommandSource implements ShellInputSource {
    private final String[] cmd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommandSource(String[] cmd) {
        this.cmd = cmd;
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource
    public void serve(OutputStream out) throws IOException {
        String[] strArr;
        for (String command : this.cmd) {
            out.write(command.getBytes(Utils.UTF_8));
            out.write(10);
            Utils.log(ShellInputSource.TAG, command);
        }
    }
}
