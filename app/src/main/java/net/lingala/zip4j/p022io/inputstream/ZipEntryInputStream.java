package net.lingala.zip4j.p022io.inputstream;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: net.lingala.zip4j.io.inputstream.ZipEntryInputStream */
/* loaded from: classes.dex */
class ZipEntryInputStream extends InputStream {
    private static final int MAX_RAW_READ_FULLY_RETRY_ATTEMPTS = 15;
    private long compressedSize;
    private InputStream inputStream;
    private long numberOfBytesRead = 0;
    private byte[] singleByteArray = new byte[1];

    public ZipEntryInputStream(InputStream inputStream, long compressedSize) {
        this.inputStream = inputStream;
        this.compressedSize = compressedSize;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int readLen = read(this.singleByteArray);
        if (readLen == -1) {
            return -1;
        }
        return this.singleByteArray[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        long j = this.compressedSize;
        if (j != -1) {
            long j2 = this.numberOfBytesRead;
            if (j2 >= j) {
                return -1;
            }
            if (len > j - j2) {
                len = (int) (j - j2);
            }
        }
        int readLen = this.inputStream.read(b, off, len);
        if (readLen > 0) {
            this.numberOfBytesRead += readLen;
        }
        return readLen;
    }

    public int readRawFully(byte[] b) throws IOException {
        int readLen = this.inputStream.read(b);
        if (readLen != b.length && (readLen = readUntilBufferIsFull(b, readLen)) != b.length) {
            throw new IOException("Cannot read fully into byte buffer");
        }
        return readLen;
    }

    private int readUntilBufferIsFull(byte[] b, int readLength) throws IOException {
        int remainingLength = b.length - readLength;
        int loopReadLength = 0;
        for (int retryAttempt = 0; readLength < b.length && loopReadLength != -1 && retryAttempt < 15; retryAttempt++) {
            loopReadLength += this.inputStream.read(b, readLength, remainingLength);
            if (loopReadLength > 0) {
                readLength += loopReadLength;
                remainingLength -= loopReadLength;
            }
        }
        return readLength;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
    }

    public long getNumberOfBytesRead() {
        return this.numberOfBytesRead;
    }
}
