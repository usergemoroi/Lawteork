package net.lingala.zip4j.crypto.engine;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.lang.reflect.Array;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import net.lingala.zip4j.exception.ZipException;
import okio.Utf8;
/* loaded from: classes.dex */
public class AESEngine {

    /* renamed from: C0 */
    private int f238C0;

    /* renamed from: C1 */
    private int f239C1;

    /* renamed from: C2 */
    private int f240C2;

    /* renamed from: C3 */
    private int f241C3;
    private int rounds;
    private int[][] workingKey = null;

    /* renamed from: S */
    private static final byte[] f236S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ByteCompanionObject.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 239, 197, 145};

    /* renamed from: T0 */
    private static final int[] f237T0 = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};

    public AESEngine(byte[] key) throws ZipException {
        init(key);
    }

    private void init(byte[] key) throws ZipException {
        this.workingKey = generateWorkingKey(key);
    }

    private int[][] generateWorkingKey(byte[] key) throws ZipException {
        int kc = key.length / 4;
        if ((kc != 4 && kc != 6 && kc != 8) || kc * 4 != key.length) {
            throw new ZipException("invalid key length (not 128/192/256)");
        }
        int i = kc + 6;
        this.rounds = i;
        int[][] W = (int[][]) Array.newInstance(Integer.TYPE, i + 1, 4);
        int t = 0;
        int i2 = 0;
        while (i2 < key.length) {
            W[t >> 2][t & 3] = (key[i2] & UByte.MAX_VALUE) | ((key[i2 + 1] & UByte.MAX_VALUE) << 8) | ((key[i2 + 2] & UByte.MAX_VALUE) << 16) | (key[i2 + 3] << 24);
            i2 += 4;
            t++;
        }
        int k = (this.rounds + 1) << 2;
        for (int i3 = kc; i3 < k; i3++) {
            int temp = W[(i3 - 1) >> 2][(i3 - 1) & 3];
            if (i3 % kc == 0) {
                temp = subWord(shift(temp, 8)) ^ rcon[(i3 / kc) - 1];
            } else if (kc > 6 && i3 % kc == 4) {
                temp = subWord(temp);
            }
            W[i3 >> 2][i3 & 3] = W[(i3 - kc) >> 2][(i3 - kc) & 3] ^ temp;
        }
        return W;
    }

    public int processBlock(byte[] in, byte[] out) throws ZipException {
        return processBlock(in, 0, out, 0);
    }

    public int processBlock(byte[] in, int inOff, byte[] out, int outOff) throws ZipException {
        if (this.workingKey == null) {
            throw new ZipException("AES engine not initialised");
        }
        if (inOff + 16 > in.length) {
            throw new ZipException("input buffer too short");
        }
        if (outOff + 16 > out.length) {
            throw new ZipException("output buffer too short");
        }
        stateIn(in, inOff);
        encryptBlock(this.workingKey);
        stateOut(out, outOff);
        return 16;
    }

    private void stateIn(byte[] bytes, int off) {
        int index = off + 1;
        int i = bytes[off] & 255;
        this.f238C0 = i;
        int index2 = index + 1;
        int i2 = i | ((bytes[index] & 255) << 8);
        this.f238C0 = i2;
        int index3 = index2 + 1;
        int i3 = i2 | ((bytes[index2] & 255) << 16);
        this.f238C0 = i3;
        int index4 = index3 + 1;
        this.f238C0 = i3 | (bytes[index3] << 24);
        int index5 = index4 + 1;
        int i4 = bytes[index4] & UByte.MAX_VALUE;
        this.f239C1 = i4;
        int index6 = index5 + 1;
        int i5 = ((bytes[index5] & 255) << 8) | i4;
        this.f239C1 = i5;
        int index7 = index6 + 1;
        int i6 = i5 | ((bytes[index6] & 255) << 16);
        this.f239C1 = i6;
        int index8 = index7 + 1;
        this.f239C1 = i6 | (bytes[index7] << 24);
        int index9 = index8 + 1;
        int i7 = bytes[index8] & UByte.MAX_VALUE;
        this.f240C2 = i7;
        int index10 = index9 + 1;
        int i8 = ((bytes[index9] & 255) << 8) | i7;
        this.f240C2 = i8;
        int index11 = index10 + 1;
        int i9 = i8 | ((bytes[index10] & 255) << 16);
        this.f240C2 = i9;
        int index12 = index11 + 1;
        this.f240C2 = i9 | (bytes[index11] << 24);
        int index13 = index12 + 1;
        int i10 = bytes[index12] & UByte.MAX_VALUE;
        this.f241C3 = i10;
        int index14 = index13 + 1;
        int i11 = ((bytes[index13] & 255) << 8) | i10;
        this.f241C3 = i11;
        int index15 = index14 + 1;
        int i12 = i11 | ((bytes[index14] & 255) << 16);
        this.f241C3 = i12;
        int i13 = index15 + 1;
        this.f241C3 = i12 | (bytes[index15] << 24);
    }

    private void stateOut(byte[] bytes, int off) {
        int index = off + 1;
        int i = this.f238C0;
        bytes[off] = (byte) i;
        int index2 = index + 1;
        bytes[index] = (byte) (i >> 8);
        int index3 = index2 + 1;
        bytes[index2] = (byte) (i >> 16);
        int index4 = index3 + 1;
        bytes[index3] = (byte) (i >> 24);
        int index5 = index4 + 1;
        int i2 = this.f239C1;
        bytes[index4] = (byte) i2;
        int index6 = index5 + 1;
        bytes[index5] = (byte) (i2 >> 8);
        int index7 = index6 + 1;
        bytes[index6] = (byte) (i2 >> 16);
        int index8 = index7 + 1;
        bytes[index7] = (byte) (i2 >> 24);
        int index9 = index8 + 1;
        int i3 = this.f240C2;
        bytes[index8] = (byte) i3;
        int index10 = index9 + 1;
        bytes[index9] = (byte) (i3 >> 8);
        int index11 = index10 + 1;
        bytes[index10] = (byte) (i3 >> 16);
        int index12 = index11 + 1;
        bytes[index11] = (byte) (i3 >> 24);
        int index13 = index12 + 1;
        int i4 = this.f241C3;
        bytes[index12] = (byte) i4;
        int index14 = index13 + 1;
        bytes[index13] = (byte) (i4 >> 8);
        int index15 = index14 + 1;
        bytes[index14] = (byte) (i4 >> 16);
        int i5 = index15 + 1;
        bytes[index15] = (byte) (i4 >> 24);
    }

    private void encryptBlock(int[][] KW) {
        this.f238C0 ^= KW[0][0];
        this.f239C1 ^= KW[0][1];
        this.f240C2 ^= KW[0][2];
        this.f241C3 ^= KW[0][3];
        int r3 = 1;
        while (r3 < this.rounds - 1) {
            int[] iArr = f237T0;
            int r0 = (((iArr[this.f238C0 & 255] ^ shift(iArr[(this.f239C1 >> 8) & 255], 24)) ^ shift(iArr[(this.f240C2 >> 16) & 255], 16)) ^ shift(iArr[(this.f241C3 >> 24) & 255], 8)) ^ KW[r3][0];
            int r1 = (((iArr[this.f239C1 & 255] ^ shift(iArr[(this.f240C2 >> 8) & 255], 24)) ^ shift(iArr[(this.f241C3 >> 16) & 255], 16)) ^ shift(iArr[(this.f238C0 >> 24) & 255], 8)) ^ KW[r3][1];
            int r2 = (((iArr[this.f240C2 & 255] ^ shift(iArr[(this.f241C3 >> 8) & 255], 24)) ^ shift(iArr[(this.f238C0 >> 16) & 255], 16)) ^ shift(iArr[(this.f239C1 >> 24) & 255], 8)) ^ KW[r3][2];
            int r = r3 + 1;
            int r32 = KW[r3][3] ^ (((iArr[this.f241C3 & 255] ^ shift(iArr[(this.f238C0 >> 8) & 255], 24)) ^ shift(iArr[(this.f239C1 >> 16) & 255], 16)) ^ shift(iArr[(this.f240C2 >> 24) & 255], 8));
            this.f238C0 = (((iArr[r0 & 255] ^ shift(iArr[(r1 >> 8) & 255], 24)) ^ shift(iArr[(r2 >> 16) & 255], 16)) ^ shift(iArr[(r32 >> 24) & 255], 8)) ^ KW[r][0];
            this.f239C1 = (((iArr[r1 & 255] ^ shift(iArr[(r2 >> 8) & 255], 24)) ^ shift(iArr[(r32 >> 16) & 255], 16)) ^ shift(iArr[(r0 >> 24) & 255], 8)) ^ KW[r][1];
            this.f240C2 = (((iArr[r2 & 255] ^ shift(iArr[(r32 >> 8) & 255], 24)) ^ shift(iArr[(r0 >> 16) & 255], 16)) ^ shift(iArr[(r1 >> 24) & 255], 8)) ^ KW[r][2];
            this.f241C3 = (shift(iArr[(r2 >> 24) & 255], 8) ^ (shift(iArr[(r1 >> 16) & 255], 16) ^ (shift(iArr[(r0 >> 8) & 255], 24) ^ iArr[r32 & 255]))) ^ KW[r][3];
            r3 = r + 1;
        }
        int[] iArr2 = f237T0;
        int r02 = (((iArr2[this.f238C0 & 255] ^ shift(iArr2[(this.f239C1 >> 8) & 255], 24)) ^ shift(iArr2[(this.f240C2 >> 16) & 255], 16)) ^ shift(iArr2[(this.f241C3 >> 24) & 255], 8)) ^ KW[r3][0];
        int r12 = (((iArr2[this.f239C1 & 255] ^ shift(iArr2[(this.f240C2 >> 8) & 255], 24)) ^ shift(iArr2[(this.f241C3 >> 16) & 255], 16)) ^ shift(iArr2[(this.f238C0 >> 24) & 255], 8)) ^ KW[r3][1];
        int r22 = (((iArr2[this.f240C2 & 255] ^ shift(iArr2[(this.f241C3 >> 8) & 255], 24)) ^ shift(iArr2[(this.f238C0 >> 16) & 255], 16)) ^ shift(iArr2[(this.f239C1 >> 24) & 255], 8)) ^ KW[r3][2];
        int r4 = r3 + 1;
        int r33 = KW[r3][3] ^ (shift(iArr2[(this.f240C2 >> 24) & 255], 8) ^ ((iArr2[this.f241C3 & 255] ^ shift(iArr2[(this.f238C0 >> 8) & 255], 24)) ^ shift(iArr2[(this.f239C1 >> 16) & 255], 16)));
        byte[] bArr = f236S;
        this.f238C0 = KW[r4][0] ^ ((((bArr[r02 & 255] & UByte.MAX_VALUE) ^ ((bArr[(r12 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(r22 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(r33 >> 24) & 255] << 24));
        this.f239C1 = ((((bArr[r12 & 255] & UByte.MAX_VALUE) ^ ((bArr[(r22 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(r33 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(r02 >> 24) & 255] << 24)) ^ KW[r4][1];
        this.f240C2 = ((((bArr[r22 & 255] & UByte.MAX_VALUE) ^ ((bArr[(r33 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(r02 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(r12 >> 24) & 255] << 24)) ^ KW[r4][2];
        this.f241C3 = ((((bArr[r33 & 255] & UByte.MAX_VALUE) ^ ((bArr[(r02 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(r12 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(r22 >> 24) & 255] << 24)) ^ KW[r4][3];
    }

    private int shift(int r, int shift) {
        return (r >>> shift) | (r << (-shift));
    }

    private int subWord(int x) {
        byte[] bArr = f236S;
        return (bArr[(x >> 24) & 255] << 24) | (bArr[x & 255] & UByte.MAX_VALUE) | ((bArr[(x >> 8) & 255] & UByte.MAX_VALUE) << 8) | ((bArr[(x >> 16) & 255] & UByte.MAX_VALUE) << 16);
    }
}
