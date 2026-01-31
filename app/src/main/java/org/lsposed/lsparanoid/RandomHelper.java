package org.lsposed.lsparanoid;

import okhttp3.internal.p024ws.WebSocketProtocol;
/* loaded from: classes.dex */
public class RandomHelper {
    private RandomHelper() {
    }

    public static long seed(long x) {
        long z = ((x >>> 33) ^ x) * 7109453100751455733L;
        return (((z >>> 28) ^ z) * (-3808689974395783757L)) >>> 32;
    }

    public static long next(long state) {
        short s0 = (short) (state & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        short s1 = (short) (WebSocketProtocol.PAYLOAD_SHORT_MAX & (state >>> 16));
        short next = (short) (s0 + s1);
        short s12 = (short) (s1 ^ s0);
        long result = (short) (rotl(next, 9) + s0);
        return (((result << 16) | rotl(s12, 10)) << 16) | ((short) ((s12 << 5) ^ ((short) (rotl(s0, 13) ^ s12))));
    }

    private static short rotl(short x, int k) {
        return (short) ((x << k) | (x >>> (32 - k)));
    }
}
