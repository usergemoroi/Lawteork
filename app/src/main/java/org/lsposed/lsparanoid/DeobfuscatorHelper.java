package org.lsposed.lsparanoid;

import net.lingala.zip4j.util.InternalZipConstants;
import okhttp3.internal.p024ws.WebSocketProtocol;
/* loaded from: classes.dex */
public class DeobfuscatorHelper {
    public static final int MAX_CHUNK_LENGTH = 8191;

    private DeobfuscatorHelper() {
    }

    public static String getString(long id, String[] chunks) {
        long state = RandomHelper.next(RandomHelper.seed(id & InternalZipConstants.ZIP_64_SIZE_LIMIT));
        long low = (state >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        long state2 = RandomHelper.next(state);
        long high = (state2 >>> 16) & (-65536);
        int index = (int) (((id >>> 32) ^ low) ^ high);
        long state3 = getCharAt(index, chunks, state2);
        int length = (int) ((state3 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            state3 = getCharAt(index + i + 1, chunks, state3);
            chars[i] = (char) ((state3 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        }
        return new String(chars);
    }

    private static long getCharAt(int charIndex, String[] chunks, long state) {
        long nextState = RandomHelper.next(state);
        String chunk = chunks[charIndex / MAX_CHUNK_LENGTH];
        return (chunk.charAt(charIndex % MAX_CHUNK_LENGTH) << 32) ^ nextState;
    }
}
