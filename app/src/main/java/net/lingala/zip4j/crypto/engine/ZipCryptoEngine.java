package net.lingala.zip4j.crypto.engine;

import kotlin.UByte;
import net.lingala.zip4j.util.Zip4jUtil;
/* loaded from: classes.dex */
public class ZipCryptoEngine {
    private static final int[] CRC_TABLE = new int[256];
    private final int[] keys = new int[3];

    static {
        for (int i = 0; i < 256; i++) {
            int r = i;
            for (int j = 0; j < 8; j++) {
                if ((r & 1) == 1) {
                    r = (r >>> 1) ^ (-306674912);
                } else {
                    r >>>= 1;
                }
            }
            CRC_TABLE[i] = r;
        }
    }

    public void initKeys(char[] password) {
        int[] iArr = this.keys;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        byte[] bytes = Zip4jUtil.convertCharArrayToByteArray(password);
        for (byte b : bytes) {
            updateKeys((byte) (b & UByte.MAX_VALUE));
        }
    }

    public void updateKeys(byte charAt) {
        int[] iArr = this.keys;
        iArr[0] = crc32(iArr[0], charAt);
        int[] iArr2 = this.keys;
        int i = iArr2[1] + (iArr2[0] & 255);
        iArr2[1] = i;
        int i2 = (i * 134775813) + 1;
        iArr2[1] = i2;
        iArr2[2] = crc32(iArr2[2], (byte) (i2 >> 24));
    }

    private int crc32(int oldCrc, byte charAt) {
        return (oldCrc >>> 8) ^ CRC_TABLE[(oldCrc ^ charAt) & 255];
    }

    public byte decryptByte() {
        int temp = this.keys[2] | 2;
        return (byte) (((temp ^ 1) * temp) >>> 8);
    }
}
