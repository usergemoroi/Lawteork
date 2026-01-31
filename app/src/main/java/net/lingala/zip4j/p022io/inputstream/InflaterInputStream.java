package net.lingala.zip4j.p022io.inputstream;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* renamed from: net.lingala.zip4j.io.inputstream.InflaterInputStream */
/* loaded from: classes.dex */
public class InflaterInputStream extends DecompressedInputStream {
    private byte[] buff;
    private Inflater inflater;
    private int len;
    private byte[] singleByteBuffer;

    public InflaterInputStream(CipherInputStream cipherInputStream, int bufferSize) {
        super(cipherInputStream);
        this.singleByteBuffer = new byte[1];
        this.inflater = new Inflater(true);
        this.buff = new byte[bufferSize];
    }

    @Override // net.lingala.zip4j.p022io.inputstream.DecompressedInputStream, java.io.InputStream
    public int read() throws IOException {
        int readLen = read(this.singleByteBuffer);
        if (readLen == -1) {
            return -1;
        }
        return this.singleByteBuffer[0];
    }

    @Override // net.lingala.zip4j.p022io.inputstream.DecompressedInputStream, java.io.InputStream
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // net.lingala.zip4j.p022io.inputstream.DecompressedInputStream, java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        while (true) {
            try {
                int n = this.inflater.inflate(b, off, len);
                if (n == 0) {
                    if (!this.inflater.finished() && !this.inflater.needsDictionary()) {
                        if (this.inflater.needsInput()) {
                            fill();
                        }
                    }
                    return -1;
                }
                return n;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    @Override // net.lingala.zip4j.p022io.inputstream.DecompressedInputStream
    public void endOfEntryReached(InputStream inputStream) throws IOException {
        Inflater inflater = this.inflater;
        if (inflater != null) {
            inflater.end();
            this.inflater = null;
        }
        super.endOfEntryReached(inputStream);
    }

    @Override // net.lingala.zip4j.p022io.inputstream.DecompressedInputStream
    public void pushBackInputStreamIfNecessary(PushbackInputStream pushbackInputStream) throws IOException {
        int n = this.inflater.getRemaining();
        if (n > 0) {
            byte[] rawDataCache = getLastReadRawDataCache();
            pushbackInputStream.unread(rawDataCache, this.len - n, n);
        }
    }

    @Override // net.lingala.zip4j.p022io.inputstream.DecompressedInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Inflater inflater = this.inflater;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    private void fill() throws IOException {
        byte[] bArr = this.buff;
        int read = super.read(bArr, 0, bArr.length);
        this.len = read;
        if (read == -1) {
            throw new EOFException("Unexpected end of input stream");
        }
        this.inflater.setInput(this.buff, 0, read);
    }
}
