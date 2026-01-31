package net.lingala.zip4j.crypto;

import net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF;
import net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine;
import net.lingala.zip4j.crypto.PBKDF2.PBKDF2Parameters;
import net.lingala.zip4j.crypto.engine.AESEngine;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.util.InternalZipConstants;
/* loaded from: classes.dex */
public class AesCipherUtil {
    private static final int START_INDEX = 0;

    public static byte[] derivePasswordBasedKey(byte[] salt, char[] password, AesKeyStrength aesKeyStrength) throws ZipException {
        PBKDF2Parameters parameters = new PBKDF2Parameters(InternalZipConstants.AES_MAC_ALGORITHM, InternalZipConstants.AES_HASH_CHARSET, salt, 1000);
        PBKDF2Engine engine = new PBKDF2Engine(parameters);
        int keyLength = aesKeyStrength.getKeyLength();
        int macLength = aesKeyStrength.getMacLength();
        int derivedKeyLength = keyLength + macLength + 2;
        byte[] derivedKey = engine.deriveKey(password, derivedKeyLength);
        if (derivedKey != null && derivedKey.length == derivedKeyLength) {
            return derivedKey;
        }
        String message = String.format("Derived Key invalid for Key Length [%d] MAC Length [%d]", Integer.valueOf(keyLength), Integer.valueOf(macLength));
        throw new ZipException(message);
    }

    public static byte[] derivePasswordVerifier(byte[] derivedKey, AesKeyStrength aesKeyStrength) {
        byte[] derivedPasswordVerifier = new byte[2];
        int keyMacLength = aesKeyStrength.getKeyLength() + aesKeyStrength.getMacLength();
        System.arraycopy(derivedKey, keyMacLength, derivedPasswordVerifier, 0, 2);
        return derivedPasswordVerifier;
    }

    public static MacBasedPRF getMacBasedPRF(byte[] derivedKey, AesKeyStrength aesKeyStrength) {
        int macLength = aesKeyStrength.getMacLength();
        byte[] macKey = new byte[macLength];
        System.arraycopy(derivedKey, aesKeyStrength.getKeyLength(), macKey, 0, macLength);
        MacBasedPRF macBasedPRF = new MacBasedPRF(InternalZipConstants.AES_MAC_ALGORITHM);
        macBasedPRF.init(macKey);
        return macBasedPRF;
    }

    public static AESEngine getAESEngine(byte[] derivedKey, AesKeyStrength aesKeyStrength) throws ZipException {
        int keyLength = aesKeyStrength.getKeyLength();
        byte[] aesKey = new byte[keyLength];
        System.arraycopy(derivedKey, 0, aesKey, 0, keyLength);
        return new AESEngine(aesKey);
    }

    public static void prepareBuffAESIVBytes(byte[] buff, int nonce) {
        buff[0] = (byte) nonce;
        buff[1] = (byte) (nonce >> 8);
        buff[2] = (byte) (nonce >> 16);
        buff[3] = (byte) (nonce >> 24);
        for (int i = 4; i <= 15; i++) {
            buff[i] = 0;
        }
    }
}
