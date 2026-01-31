package net.lingala.zip4j.crypto.PBKDF2;

import kotlin.UByte;
/* loaded from: classes.dex */
class BinTools {
    public static final String hex = "0123456789ABCDEF";

    BinTools() {
    }

    public static String bin2hex(byte[] b) {
        if (b == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer(b.length * 2);
        for (byte b2 : b) {
            int v = (b2 + UByte.MIN_VALUE) % 256;
            sb.append(hex.charAt((v / 16) & 15));
            sb.append(hex.charAt((v % 16) & 15));
        }
        return sb.toString();
    }

    public static byte[] hex2bin(String s) {
        String m = s;
        if (s == null) {
            m = "";
        } else if (s.length() % 2 != 0) {
            m = "0" + s;
        }
        byte[] r = new byte[m.length() / 2];
        int i = 0;
        int n = 0;
        while (i < m.length()) {
            int i2 = i + 1;
            char h = m.charAt(i);
            int i3 = i2 + 1;
            char l = m.charAt(i2);
            r[n] = (byte) ((hex2bin(h) * 16) + hex2bin(l));
            n++;
            i = i3;
        }
        return r;
    }

    public static int hex2bin(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 'A') + 10;
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        throw new IllegalArgumentException("Input string may only contain hex digits, but found '" + c + "'");
    }
}
