package net.lingala.zip4j.crypto.PBKDF2;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public class MacBasedPRF implements PRF {
    private int hLen;
    private Mac mac;
    private String macAlgorithm;

    public MacBasedPRF(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
        try {
            Mac mac = Mac.getInstance(macAlgorithm);
            this.mac = mac;
            this.hLen = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public byte[] doFinal(byte[] M) {
        return this.mac.doFinal(M);
    }

    public byte[] doFinal() {
        return this.mac.doFinal();
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public int getHLen() {
        return this.hLen;
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public void init(byte[] P) {
        try {
            this.mac.init(new SecretKeySpec(P, this.macAlgorithm));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(byte[] U) {
        try {
            this.mac.update(U);
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(byte[] U, int start, int len) {
        try {
            this.mac.update(U, start, len);
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }
}
