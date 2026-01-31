package net.lingala.zip4j.crypto;

import kotlin.UByte;
import net.lingala.zip4j.crypto.engine.ZipCryptoEngine;
import net.lingala.zip4j.exception.ZipException;
/* loaded from: classes.dex */
public class StandardDecrypter implements Decrypter {
    private ZipCryptoEngine zipCryptoEngine = new ZipCryptoEngine();

    public StandardDecrypter(char[] password, long crc, long lastModifiedFileTime, byte[] headerBytes) throws ZipException {
        init(headerBytes, password, lastModifiedFileTime, crc);
    }

    @Override // net.lingala.zip4j.crypto.Decrypter
    public int decryptData(byte[] buff, int start, int len) throws ZipException {
        if (start < 0 || len < 0) {
            throw new ZipException("one of the input parameters were null in standard decrypt data");
        }
        for (int i = start; i < start + len; i++) {
            int val = (this.zipCryptoEngine.decryptByte() ^ (buff[i] & UByte.MAX_VALUE)) & 255;
            this.zipCryptoEngine.updateKeys((byte) val);
            buff[i] = (byte) val;
        }
        return len;
    }

    private void init(byte[] headerBytes, char[] password, long lastModifiedFileTime, long crc) throws ZipException {
        byte verificationByte;
        if (password == null || password.length <= 0) {
            throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
        }
        this.zipCryptoEngine.initKeys(password);
        int result = headerBytes[0];
        for (int i = 0; i < 12; i++) {
            if (i + 1 == 12 && (verificationByte = (byte) (this.zipCryptoEngine.decryptByte() ^ result)) != ((byte) (crc >> 24)) && verificationByte != ((byte) (lastModifiedFileTime >> 8))) {
                throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
            }
            ZipCryptoEngine zipCryptoEngine = this.zipCryptoEngine;
            zipCryptoEngine.updateKeys((byte) (zipCryptoEngine.decryptByte() ^ result));
            if (i + 1 != 12) {
                result = headerBytes[i + 1];
            }
        }
    }
}
