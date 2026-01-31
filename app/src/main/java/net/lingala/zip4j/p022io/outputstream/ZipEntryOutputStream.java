package net.lingala.zip4j.p022io.outputstream;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: net.lingala.zip4j.io.outputstream.ZipEntryOutputStream */
/* loaded from: classes.dex */
class ZipEntryOutputStream extends OutputStream {
    private OutputStream outputStream;
    private long numberOfBytesWrittenForThisEntry = 0;
    private boolean entryClosed = false;

    public ZipEntryOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(int b) throws IOException {
        write(new byte[]{(byte) b});
    }

    @Override // java.io.OutputStream
    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b, int off, int len) throws IOException {
        if (this.entryClosed) {
            throw new IllegalStateException("ZipEntryOutputStream is closed");
        }
        this.outputStream.write(b, off, len);
        this.numberOfBytesWrittenForThisEntry += len;
    }

    public void closeEntry() throws IOException {
        this.entryClosed = true;
    }

    public long getNumberOfBytesWrittenForThisEntry() {
        return this.numberOfBytesWrittenForThisEntry;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
