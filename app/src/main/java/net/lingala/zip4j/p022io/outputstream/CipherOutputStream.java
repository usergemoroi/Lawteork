package net.lingala.zip4j.p022io.outputstream;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.crypto.Encrypter;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
/* renamed from: net.lingala.zip4j.io.outputstream.CipherOutputStream */
/* loaded from: classes.dex */
abstract class CipherOutputStream<T extends Encrypter> extends OutputStream {
    private T encrypter;
    private ZipEntryOutputStream zipEntryOutputStream;

    protected abstract T initializeEncrypter(OutputStream outputStream, ZipParameters zipParameters, char[] cArr) throws IOException, ZipException;

    public CipherOutputStream(ZipEntryOutputStream zipEntryOutputStream, ZipParameters zipParameters, char[] password) throws IOException, ZipException {
        this.zipEntryOutputStream = zipEntryOutputStream;
        this.encrypter = initializeEncrypter(zipEntryOutputStream, zipParameters, password);
    }

    @Override // java.io.OutputStream
    public void write(int b) throws IOException {
        this.zipEntryOutputStream.write(b);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b) throws IOException {
        this.zipEntryOutputStream.write(b);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b, int off, int len) throws IOException {
        this.encrypter.encryptData(b, off, len);
        this.zipEntryOutputStream.write(b, off, len);
    }

    public void writeHeaders(byte[] b) throws IOException {
        this.zipEntryOutputStream.write(b);
    }

    public void closeEntry() throws IOException {
        this.zipEntryOutputStream.closeEntry();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zipEntryOutputStream.close();
    }

    public long getNumberOfBytesWrittenForThisEntry() {
        return this.zipEntryOutputStream.getNumberOfBytesWrittenForThisEntry();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T getEncrypter() {
        return this.encrypter;
    }
}
