package net.lingala.zip4j.p022io.outputstream;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.crypto.Encrypter;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
/* renamed from: net.lingala.zip4j.io.outputstream.NoCipherOutputStream */
/* loaded from: classes.dex */
class NoCipherOutputStream extends CipherOutputStream<NoEncrypter> {
    public NoCipherOutputStream(ZipEntryOutputStream zipEntryOutputStream, ZipParameters zipParameters, char[] password) throws IOException, ZipException {
        super(zipEntryOutputStream, zipParameters, password);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.p022io.outputstream.CipherOutputStream
    public NoEncrypter initializeEncrypter(OutputStream outputStream, ZipParameters zipParameters, char[] password) {
        return new NoEncrypter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.lingala.zip4j.io.outputstream.NoCipherOutputStream$NoEncrypter */
    /* loaded from: classes.dex */
    public static class NoEncrypter implements Encrypter {
        NoEncrypter() {
        }

        @Override // net.lingala.zip4j.crypto.Encrypter
        public int encryptData(byte[] buff) {
            return encryptData(buff, 0, buff.length);
        }

        @Override // net.lingala.zip4j.crypto.Encrypter
        public int encryptData(byte[] buff, int start, int len) {
            return len;
        }
    }
}
