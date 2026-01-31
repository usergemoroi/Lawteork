package net.lingala.zip4j.crypto.PBKDF2;

import net.lingala.zip4j.util.Zip4jUtil;
/* loaded from: classes.dex */
public class PBKDF2Engine {
    private PBKDF2Parameters parameters;
    private PRF prf;

    public PBKDF2Engine(PBKDF2Parameters parameters) {
        this(parameters, null);
    }

    public PBKDF2Engine(PBKDF2Parameters parameters, PRF prf) {
        this.parameters = parameters;
        this.prf = prf;
    }

    public byte[] deriveKey(char[] inputPassword) {
        return deriveKey(inputPassword, 0);
    }

    public byte[] deriveKey(char[] inputPassword, int dkLen) {
        if (inputPassword == null) {
            throw new NullPointerException();
        }
        byte[] p = Zip4jUtil.convertCharArrayToByteArray(inputPassword);
        assertPRF(p);
        if (dkLen == 0) {
            dkLen = this.prf.getHLen();
        }
        return PBKDF2(this.prf, this.parameters.getSalt(), this.parameters.getIterationCount(), dkLen);
    }

    public boolean verifyKey(char[] inputPassword) {
        byte[] inputKey;
        byte[] referenceKey = getParameters().getDerivedKey();
        if (referenceKey == null || referenceKey.length == 0 || (inputKey = deriveKey(inputPassword, referenceKey.length)) == null || inputKey.length != referenceKey.length) {
            return false;
        }
        for (int i = 0; i < inputKey.length; i++) {
            if (inputKey[i] != referenceKey[i]) {
                return false;
            }
        }
        return true;
    }

    private void assertPRF(byte[] P) {
        if (this.prf == null) {
            this.prf = new MacBasedPRF(this.parameters.getHashAlgorithm());
        }
        this.prf.init(P);
    }

    public PRF getPseudoRandomFunction() {
        return this.prf;
    }

    private byte[] PBKDF2(PRF prf, byte[] S, int c, int dkLen) {
        byte[] S2;
        if (S != null) {
            S2 = S;
        } else {
            S2 = new byte[0];
        }
        int hLen = prf.getHLen();
        int l = ceil(dkLen, hLen);
        int r = dkLen - ((l - 1) * hLen);
        byte[] T = new byte[l * hLen];
        int ti_offset = 0;
        for (int i = 1; i <= l; i++) {
            m47_F(T, ti_offset, prf, S2, c, i);
            ti_offset += hLen;
        }
        if (r < hLen) {
            byte[] DK = new byte[dkLen];
            System.arraycopy(T, 0, DK, 0, dkLen);
            return DK;
        }
        return T;
    }

    private int ceil(int a, int b) {
        int m = 0;
        if (a % b > 0) {
            m = 1;
        }
        return (a / b) + m;
    }

    /* renamed from: _F */
    private void m47_F(byte[] dest, int offset, PRF prf, byte[] S, int c, int blockIndex) {
        int hLen = prf.getHLen();
        byte[] U_r = new byte[hLen];
        byte[] U_i = new byte[S.length + 4];
        System.arraycopy(S, 0, U_i, 0, S.length);
        INT(U_i, S.length, blockIndex);
        for (int i = 0; i < c; i++) {
            U_i = prf.doFinal(U_i);
            xor(U_r, U_i);
        }
        System.arraycopy(U_r, 0, dest, offset, hLen);
    }

    private void xor(byte[] dest, byte[] src) {
        for (int i = 0; i < dest.length; i++) {
            dest[i] = (byte) (dest[i] ^ src[i]);
        }
    }

    protected void INT(byte[] dest, int offset, int i) {
        dest[offset] = (byte) (i / 16777216);
        dest[offset + 1] = (byte) (i / 65536);
        dest[offset + 2] = (byte) (i / 256);
        dest[offset + 3] = (byte) i;
    }

    public PBKDF2Parameters getParameters() {
        return this.parameters;
    }

    public void setParameters(PBKDF2Parameters parameters) {
        this.parameters = parameters;
    }

    public void setPseudoRandomFunction(PRF prf) {
        this.prf = prf;
    }
}
