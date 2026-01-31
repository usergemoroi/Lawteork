package net.lingala.zip4j.crypto;

import java.security.SecureRandom;
import net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF;
import net.lingala.zip4j.crypto.engine.AESEngine;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.AesKeyStrength;
/* loaded from: classes.dex */
public class AESEncrypter implements Encrypter {
    private AESEngine aesEngine;
    private final byte[] counterBlock;
    private byte[] derivedPasswordVerifier;
    private boolean finished;

    /* renamed from: iv */
    private final byte[] f235iv;
    private MacBasedPRF mac;
    private byte[] saltBytes;
    private final SecureRandom random = new SecureRandom();
    private int nonce = 1;
    private int loopCount = 0;

    public AESEncrypter(char[] password, AesKeyStrength aesKeyStrength) throws ZipException {
        if (password == null || password.length == 0) {
            throw new ZipException("input password is empty or null");
        }
        if (aesKeyStrength != AesKeyStrength.KEY_STRENGTH_128 && aesKeyStrength != AesKeyStrength.KEY_STRENGTH_256) {
            throw new ZipException("Invalid AES key strength");
        }
        this.finished = false;
        this.counterBlock = new byte[16];
        this.f235iv = new byte[16];
        init(password, aesKeyStrength);
    }

    private void init(char[] password, AesKeyStrength aesKeyStrength) throws ZipException {
        byte[] generateSalt = generateSalt(aesKeyStrength.getSaltLength());
        this.saltBytes = generateSalt;
        byte[] derivedKey = AesCipherUtil.derivePasswordBasedKey(generateSalt, password, aesKeyStrength);
        this.derivedPasswordVerifier = AesCipherUtil.derivePasswordVerifier(derivedKey, aesKeyStrength);
        this.aesEngine = AesCipherUtil.getAESEngine(derivedKey, aesKeyStrength);
        this.mac = AesCipherUtil.getMacBasedPRF(derivedKey, aesKeyStrength);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] buff) throws ZipException {
        if (buff == null) {
            throw new ZipException("input bytes are null, cannot perform AES encryption");
        }
        return encryptData(buff, 0, buff.length);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] buff, int start, int len) throws ZipException {
        int i;
        if (this.finished) {
            throw new ZipException("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
        }
        if (len % 16 != 0) {
            this.finished = true;
        }
        for (int j = start; j < start + len; j += 16) {
            this.loopCount = j + 16 <= start + len ? 16 : (start + len) - j;
            AesCipherUtil.prepareBuffAESIVBytes(this.f235iv, this.nonce);
            this.aesEngine.processBlock(this.f235iv, this.counterBlock);
            int k = 0;
            while (true) {
                i = this.loopCount;
                if (k < i) {
                    buff[j + k] = (byte) (buff[j + k] ^ this.counterBlock[k]);
                    k++;
                }
            }
            this.mac.update(buff, j, i);
            this.nonce++;
        }
        return len;
    }

    private byte[] generateSalt(int size) throws ZipException {
        int rounds;
        if (size != 8 && size != 16) {
            throw new ZipException("invalid salt size, cannot generate salt");
        }
        if (size == 8) {
            rounds = 2;
        } else {
            rounds = 4;
        }
        byte[] salt = new byte[size];
        for (int j = 0; j < rounds; j++) {
            int i = this.random.nextInt();
            salt[j * 4] = (byte) (i >> 24);
            salt[(j * 4) + 1] = (byte) (i >> 16);
            salt[(j * 4) + 2] = (byte) (i >> 8);
            salt[(j * 4) + 3] = (byte) i;
        }
        return salt;
    }

    public byte[] getFinalMac() {
        byte[] rawMacBytes = this.mac.doFinal();
        byte[] macBytes = new byte[10];
        System.arraycopy(rawMacBytes, 0, macBytes, 0, 10);
        return macBytes;
    }

    public byte[] getDerivedPasswordVerifier() {
        return this.derivedPasswordVerifier;
    }

    public byte[] getSaltBytes() {
        return this.saltBytes;
    }
}
