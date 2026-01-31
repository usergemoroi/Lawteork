package net.lingala.zip4j.p022io.outputstream;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.exception.ZipException;
/* renamed from: net.lingala.zip4j.io.outputstream.CountingOutputStream */
/* loaded from: classes.dex */
public class CountingOutputStream extends OutputStream implements OutputStreamWithSplitZipSupport {
    private long numberOfBytesWritten = 0;
    private OutputStream outputStream;

    public CountingOutputStream(OutputStream outputStream) {
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
        this.outputStream.write(b, off, len);
        this.numberOfBytesWritten += len;
    }

    @Override // net.lingala.zip4j.p022io.outputstream.OutputStreamWithSplitZipSupport
    public int getCurrentSplitFileCounter() {
        if (isSplitZipFile()) {
            return ((SplitOutputStream) this.outputStream).getCurrentSplitFileCounter();
        }
        return 0;
    }

    public long getOffsetForNextEntry() throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream instanceof SplitOutputStream) {
            return ((SplitOutputStream) outputStream).getFilePointer();
        }
        return this.numberOfBytesWritten;
    }

    public long getSplitLength() {
        if (isSplitZipFile()) {
            return ((SplitOutputStream) this.outputStream).getSplitLength();
        }
        return 0L;
    }

    public boolean isSplitZipFile() {
        OutputStream outputStream = this.outputStream;
        return (outputStream instanceof SplitOutputStream) && ((SplitOutputStream) outputStream).isSplitZipFile();
    }

    public long getNumberOfBytesWritten() throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream instanceof SplitOutputStream) {
            return ((SplitOutputStream) outputStream).getFilePointer();
        }
        return this.numberOfBytesWritten;
    }

    public boolean checkBuffSizeAndStartNextSplitFile(int bufferSize) throws ZipException {
        if (!isSplitZipFile()) {
            return false;
        }
        return ((SplitOutputStream) this.outputStream).checkBufferSizeAndStartNextSplitFile(bufferSize);
    }

    @Override // net.lingala.zip4j.p022io.outputstream.OutputStreamWithSplitZipSupport
    public long getFilePointer() throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream instanceof SplitOutputStream) {
            return ((SplitOutputStream) outputStream).getFilePointer();
        }
        return this.numberOfBytesWritten;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.outputStream.close();
    }
}
