package net.lingala.zip4j.p022io.inputstream;

import java.io.IOException;
import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.model.LocalFileHeader;
/* renamed from: net.lingala.zip4j.io.inputstream.NoCipherInputStream */
/* loaded from: classes.dex */
class NoCipherInputStream extends CipherInputStream {
    public NoCipherInputStream(ZipEntryInputStream zipEntryInputStream, LocalFileHeader localFileHeader, char[] password, int bufferSize) throws IOException {
        super(zipEntryInputStream, localFileHeader, password, bufferSize);
    }

    @Override // net.lingala.zip4j.p022io.inputstream.CipherInputStream
    protected Decrypter initializeDecrypter(LocalFileHeader localFileHeader, char[] password) {
        return new NoDecrypter();
    }

    /* renamed from: net.lingala.zip4j.io.inputstream.NoCipherInputStream$NoDecrypter */
    /* loaded from: classes.dex */
    static class NoDecrypter implements Decrypter {
        NoDecrypter() {
        }

        @Override // net.lingala.zip4j.crypto.Decrypter
        public int decryptData(byte[] buff, int start, int len) {
            return len;
        }
    }
}
