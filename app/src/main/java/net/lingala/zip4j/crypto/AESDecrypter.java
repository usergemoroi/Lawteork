package net.lingala.zip4j.crypto;

import java.util.Arrays;
import net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF;
import net.lingala.zip4j.crypto.engine.AESEngine;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.AESExtraDataRecord;
import net.lingala.zip4j.model.enums.AesKeyStrength;
/* loaded from: classes.dex */
public class AESDecrypter implements Decrypter {
    private AESEngine aesEngine;
    private MacBasedPRF mac;
    private int nonce = 1;

    /* renamed from: iv */
    private byte[] f234iv = new byte[16];
    private byte[] counterBlock = new byte[16];

    public AESDecrypter(AESExtraDataRecord aesExtraDataRecord, char[] password, byte[] salt, byte[] passwordVerifier) throws ZipException {
        init(salt, passwordVerifier, password, aesExtraDataRecord);
    }

    private void init(byte[] salt, byte[] passwordVerifier, char[] password, AESExtraDataRecord aesExtraDataRecord) throws ZipException {
        if (password == null || password.length <= 0) {
            throw new ZipException("empty or null password provided for AES decryption");
        }
        AesKeyStrength aesKeyStrength = aesExtraDataRecord.getAesKeyStrength();
        byte[] derivedKey = AesCipherUtil.derivePasswordBasedKey(salt, password, aesKeyStrength);
        byte[] derivedPasswordVerifier = AesCipherUtil.derivePasswordVerifier(derivedKey, aesKeyStrength);
        if (!Arrays.equals(passwordVerifier, derivedPasswordVerifier)) {
            throw new ZipException("Wrong Password", ZipException.Type.WRONG_PASSWORD);
        }
        this.aesEngine = AesCipherUtil.getAESEngine(derivedKey, aesKeyStrength);
        this.mac = AesCipherUtil.getMacBasedPRF(derivedKey, aesKeyStrength);
    }

    @Override // net.lingala.zip4j.crypto.Decrypter
    public int decryptData(byte[] buff, int start, int len) throws ZipException {
        for (int j = start; j < start + len; j += 16) {
            int loopCount = j + 16 <= start + len ? 16 : (start + len) - j;
            this.mac.update(buff, j, loopCount);
            AesCipherUtil.prepareBuffAESIVBytes(this.f234iv, this.nonce);
            this.aesEngine.processBlock(this.f234iv, this.counterBlock);
            for (int k = 0; k < loopCount; k++) {
                buff[j + k] = (byte) (buff[j + k] ^ this.counterBlock[k]);
            }
            int k2 = this.nonce;
            this.nonce = k2 + 1;
        }
        return len;
    }

    public byte[] getCalculatedAuthenticationBytes() {
        return this.mac.doFinal();
    }
}
