package net.lingala.zip4j.p022io.inputstream;

import java.io.IOException;
import net.lingala.zip4j.crypto.StandardDecrypter;
import net.lingala.zip4j.model.LocalFileHeader;
/* renamed from: net.lingala.zip4j.io.inputstream.ZipStandardCipherInputStream */
/* loaded from: classes.dex */
class ZipStandardCipherInputStream extends CipherInputStream<StandardDecrypter> {
    public ZipStandardCipherInputStream(ZipEntryInputStream zipEntryInputStream, LocalFileHeader localFileHeader, char[] password, int bufferSize) throws IOException {
        super(zipEntryInputStream, localFileHeader, password, bufferSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.p022io.inputstream.CipherInputStream
    public StandardDecrypter initializeDecrypter(LocalFileHeader localFileHeader, char[] password) throws IOException {
        return new StandardDecrypter(password, localFileHeader.getCrc(), localFileHeader.getLastModifiedTime(), getStandardDecrypterHeaderBytes());
    }

    private byte[] getStandardDecrypterHeaderBytes() throws IOException {
        byte[] headerBytes = new byte[12];
        readRaw(headerBytes);
        return headerBytes;
    }
}
