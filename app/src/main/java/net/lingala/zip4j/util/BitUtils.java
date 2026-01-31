package net.lingala.zip4j.util;
/* loaded from: classes.dex */
public class BitUtils {
    public static boolean isBitSet(byte b, int pos) {
        return (((long) b) & (1 << pos)) != 0;
    }

    public static byte setBit(byte b, int pos) {
        return (byte) ((1 << pos) | b);
    }

    public static byte unsetBit(byte b, int pos) {
        return (byte) ((~(1 << pos)) & b);
    }
}
