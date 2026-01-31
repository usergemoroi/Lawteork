package net.lingala.zip4j.p022io.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
/* renamed from: net.lingala.zip4j.io.inputstream.DecompressedInputStream */
/* loaded from: classes.dex */
abstract class DecompressedInputStream extends InputStream {
    private CipherInputStream cipherInputStream;
    protected byte[] oneByteBuffer = new byte[1];

    public DecompressedInputStream(CipherInputStream cipherInputStream) {
        this.cipherInputStream = cipherInputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int readLen = read(this.oneByteBuffer);
        if (readLen == -1) {
            return -1;
        }
        return this.oneByteBuffer[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        return this.cipherInputStream.read(b, off, len);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cipherInputStream.close();
    }

    public void endOfEntryReached(InputStream inputStream) throws IOException {
        this.cipherInputStream.endOfEntryReached(inputStream);
    }

    public void pushBackInputStreamIfNecessary(PushbackInputStream pushbackInputStream) throws IOException {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] getLastReadRawDataCache() {
        return this.cipherInputStream.getLastReadRawDataCache();
    }
}
