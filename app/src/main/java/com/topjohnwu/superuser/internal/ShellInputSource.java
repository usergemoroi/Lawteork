package com.topjohnwu.superuser.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
interface ShellInputSource extends Closeable {
    public static final String TAG = "SHELL_IN";

    void serve(OutputStream outputStream) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }
}
