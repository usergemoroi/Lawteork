package net.lingala.zip4j.crypto;

import java.security.SecureRandom;
import kotlin.UByte;
import net.lingala.zip4j.crypto.engine.ZipCryptoEngine;
import net.lingala.zip4j.exception.ZipException;
/* loaded from: classes.dex */
public class StandardEncrypter implements Encrypter {
    private byte[] headerBytes;
    private final ZipCryptoEngine zipCryptoEngine = new ZipCryptoEngine();

    public StandardEncrypter(char[] password, long key) throws ZipException {
        init(password, key);
    }

    private void init(char[] password, long key) throws ZipException {
        if (password == null || password.length <= 0) {
            throw new ZipException("input password is null or empty, cannot initialize standard encrypter");
        }
        this.zipCryptoEngine.initKeys(password);
        this.headerBytes = generateRandomBytes();
        this.zipCryptoEngine.initKeys(password);
        byte[] bArr = this.headerBytes;
        bArr[11] = (byte) (key >>> 24);
        bArr[10] = (byte) (key >>> 16);
        encryptData(bArr);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] buff) throws ZipException {
        if (buff == null) {
            throw new NullPointerException();
        }
        return encryptData(buff, 0, buff.length);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] buff, int start, int len) throws ZipException {
        if (len < 0) {
            throw new ZipException("invalid length specified to decrpyt data");
        }
        for (int i = start; i < start + len; i++) {
            buff[i] = encryptByte(buff[i]);
        }
        return len;
    }

    protected byte encryptByte(byte val) {
        byte temp_val = (byte) ((this.zipCryptoEngine.decryptByte() & UByte.MAX_VALUE) ^ val);
        this.zipCryptoEngine.updateKeys(val);
        return temp_val;
    }

    protected byte[] generateRandomBytes() {
        byte[] buff = new byte[12];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < buff.length; i++) {
            buff[i] = encryptByte((byte) random.nextInt(256));
        }
        return buff;
    }

    public byte[] getHeaderBytes() {
        return this.headerBytes;
    }
}
