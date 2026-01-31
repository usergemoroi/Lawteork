package net.lingala.zip4j.p022io.outputstream;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: net.lingala.zip4j.io.outputstream.CompressedOutputStream */
/* loaded from: classes.dex */
abstract class CompressedOutputStream extends OutputStream {
    private CipherOutputStream cipherOutputStream;

    public CompressedOutputStream(CipherOutputStream cipherOutputStream) {
        this.cipherOutputStream = cipherOutputStream;
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
        this.cipherOutputStream.write(b, off, len);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void closeEntry() throws IOException {
        this.cipherOutputStream.closeEntry();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cipherOutputStream.close();
    }

    public long getCompressedSize() {
        return this.cipherOutputStream.getNumberOfBytesWrittenForThisEntry();
    }
}
