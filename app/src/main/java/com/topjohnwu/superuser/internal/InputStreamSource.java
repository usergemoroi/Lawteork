package com.topjohnwu.superuser.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShellInputSource.java */
/* loaded from: classes.dex */
public class InputStreamSource implements ShellInputSource {

    /* renamed from: in */
    private final InputStream f158in;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputStreamSource(InputStream in) {
        this.f158in = in;
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource
    public void serve(OutputStream out) throws IOException {
        Utils.pump(this.f158in, out);
        this.f158in.close();
        out.write(10);
        Utils.log(ShellInputSource.TAG, "<InputStream>");
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f158in.close();
        } catch (IOException e) {
        }
    }
}
