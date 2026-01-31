package net.lingala.zip4j.p022io.outputstream;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.crypto.AESEncrypter;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
/* renamed from: net.lingala.zip4j.io.outputstream.AesCipherOutputStream */
/* loaded from: classes.dex */
class AesCipherOutputStream extends CipherOutputStream<AESEncrypter> {
    private byte[] pendingBuffer;
    private int pendingBufferLength;

    public AesCipherOutputStream(ZipEntryOutputStream outputStream, ZipParameters zipParameters, char[] password) throws IOException, ZipException {
        super(outputStream, zipParameters, password);
        this.pendingBuffer = new byte[16];
        this.pendingBufferLength = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.lingala.zip4j.p022io.outputstream.CipherOutputStream
    public AESEncrypter initializeEncrypter(OutputStream outputStream, ZipParameters zipParameters, char[] password) throws IOException, ZipException {
        AESEncrypter encrypter = new AESEncrypter(password, zipParameters.getAesKeyStrength());
        writeAesEncryptionHeaderData(encrypter);
        return encrypter;
    }

    private void writeAesEncryptionHeaderData(AESEncrypter encrypter) throws IOException {
        writeHeaders(encrypter.getSaltBytes());
        writeHeaders(encrypter.getDerivedPasswordVerifier());
    }

    @Override // net.lingala.zip4j.p022io.outputstream.CipherOutputStream, java.io.OutputStream
    public void write(int b) throws IOException {
        write(new byte[]{(byte) b});
    }

    @Override // net.lingala.zip4j.p022io.outputstream.CipherOutputStream, java.io.OutputStream
    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    @Override // net.lingala.zip4j.p022io.outputstream.CipherOutputStream, java.io.OutputStream
    public void write(byte[] b, int off, int len) throws IOException {
        int i = this.pendingBufferLength;
        if (len >= 16 - i) {
            System.arraycopy(b, off, this.pendingBuffer, i, 16 - i);
            byte[] bArr = this.pendingBuffer;
            super.write(bArr, 0, bArr.length);
            int off2 = 16 - this.pendingBufferLength;
            int len2 = len - off2;
            this.pendingBufferLength = 0;
            if (len2 != 0 && len2 % 16 != 0) {
                System.arraycopy(b, (len2 + off2) - (len2 % 16), this.pendingBuffer, 0, len2 % 16);
                int i2 = len2 % 16;
                this.pendingBufferLength = i2;
                len2 -= i2;
            }
            super.write(b, off2, len2);
            return;
        }
        System.arraycopy(b, off, this.pendingBuffer, i, len);
        this.pendingBufferLength += len;
    }

    @Override // net.lingala.zip4j.p022io.outputstream.CipherOutputStream
    public void closeEntry() throws IOException {
        int i = this.pendingBufferLength;
        if (i != 0) {
            super.write(this.pendingBuffer, 0, i);
            this.pendingBufferLength = 0;
        }
        writeHeaders(getEncrypter().getFinalMac());
        super.closeEntry();
    }
}
