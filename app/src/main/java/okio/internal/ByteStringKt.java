package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Platform;
import okio.Util;
import top.niunaijun.blackbox.utils.ShellUtils;
/* compiled from: ByteString.kt */
@Metadata(m72bv = {1, 0, 3}, m71d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0080\b\u001a\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a\r\u0010\u0011\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a\u0015\u0010\u0012\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0080\b\u001a\u000f\u0010\u0014\u001a\u0004\u0018\u00010\n*\u00020\u0010H\u0080\b\u001a\r\u0010\u0015\u001a\u00020\n*\u00020\u0010H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\n*\u00020\u0010H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0080\b\u001a\u0017\u0010\u001a\u001a\u00020\u0018*\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001bH\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u001d*\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0005H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0005*\u00020\nH\u0080\b\u001a\r\u0010 \u001a\u00020\u0005*\u00020\nH\u0080\b\u001a\r\u0010!\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a\u001d\u0010\"\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a\r\u0010$\u001a\u00020\u0007*\u00020\nH\u0080\b\u001a\u001d\u0010%\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a\u001d\u0010%\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a-\u0010&\u001a\u00020\u0018*\u00020\n2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0080\b\u001a-\u0010&\u001a\u00020\u0018*\u00020\n2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010*\u001a\u00020\u0018*\u00020\n2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010*\u001a\u00020\u0018*\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0080\b\u001a\u001d\u0010,\u001a\u00020\n*\u00020\n2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0080\b\u001a\r\u0010/\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u00100\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u00101\u001a\u00020\u0007*\u00020\nH\u0080\b\u001a\u001d\u00102\u001a\u00020\n*\u00020\u00072\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0080\b\u001a\r\u00103\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\nH\u0080\b\u001a$\u00105\u001a\u000206*\u00020\n2\u0006\u00107\u001a\u0002082\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u00069"}, m70d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", "s", "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "offset", "otherOffset", "byteCount", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "", "buffer", "Lokio/Buffer;", "okio"}, m69k = 2, m68mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class ByteStringKt {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final String commonUtf8(ByteString commonUtf8) {
        Intrinsics.checkNotNullParameter(commonUtf8, "$this$commonUtf8");
        String result = commonUtf8.getUtf8$okio();
        if (result == null) {
            String result2 = Platform.toUtf8String(commonUtf8.internalArray$okio());
            commonUtf8.setUtf8$okio(result2);
            return result2;
        }
        return result;
    }

    public static final String commonBase64(ByteString commonBase64) {
        Intrinsics.checkNotNullParameter(commonBase64, "$this$commonBase64");
        return Base64.encodeBase64$default(commonBase64.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(ByteString commonBase64Url) {
        Intrinsics.checkNotNullParameter(commonBase64Url, "$this$commonBase64Url");
        return Base64.encodeBase64(commonBase64Url.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final String commonHex(ByteString commonHex) {
        byte[] data$okio;
        Intrinsics.checkNotNullParameter(commonHex, "$this$commonHex");
        char[] result = new char[commonHex.getData$okio().length * 2];
        int c = 0;
        for (byte b : commonHex.getData$okio()) {
            int c2 = c + 1;
            int other$iv = b >> 4;
            result[c] = getHEX_DIGIT_CHARS()[other$iv & 15];
            c = c2 + 1;
            int other$iv2 = 15 & b;
            result[c2] = getHEX_DIGIT_CHARS()[other$iv2];
        }
        return new String(result);
    }

    public static final ByteString commonToAsciiLowercase(ByteString commonToAsciiLowercase) {
        byte b;
        Intrinsics.checkNotNullParameter(commonToAsciiLowercase, "$this$commonToAsciiLowercase");
        for (int i = 0; i < commonToAsciiLowercase.getData$okio().length; i++) {
            byte c = commonToAsciiLowercase.getData$okio()[i];
            byte b2 = (byte) 65;
            if (c >= b2 && c <= (b = (byte) 90)) {
                byte[] data$okio = commonToAsciiLowercase.getData$okio();
                byte[] lowercase = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(lowercase, "java.util.Arrays.copyOf(this, size)");
                int i2 = i + 1;
                lowercase[i] = (byte) (c + 32);
                while (i2 < lowercase.length) {
                    byte c2 = lowercase[i2];
                    if (c2 < b2 || c2 > b) {
                        i2++;
                    } else {
                        lowercase[i2] = (byte) (c2 + 32);
                        i2++;
                    }
                }
                return new ByteString(lowercase);
            }
        }
        return commonToAsciiLowercase;
    }

    public static final ByteString commonToAsciiUppercase(ByteString commonToAsciiUppercase) {
        byte b;
        Intrinsics.checkNotNullParameter(commonToAsciiUppercase, "$this$commonToAsciiUppercase");
        for (int i = 0; i < commonToAsciiUppercase.getData$okio().length; i++) {
            byte c = commonToAsciiUppercase.getData$okio()[i];
            byte b2 = (byte) 97;
            if (c >= b2 && c <= (b = (byte) 122)) {
                byte[] data$okio = commonToAsciiUppercase.getData$okio();
                byte[] lowercase = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(lowercase, "java.util.Arrays.copyOf(this, size)");
                int i2 = i + 1;
                lowercase[i] = (byte) (c - 32);
                while (i2 < lowercase.length) {
                    byte c2 = lowercase[i2];
                    if (c2 < b2 || c2 > b) {
                        i2++;
                    } else {
                        lowercase[i2] = (byte) (c2 - 32);
                        i2++;
                    }
                }
                return new ByteString(lowercase);
            }
        }
        return commonToAsciiUppercase;
    }

    public static final ByteString commonSubstring(ByteString commonSubstring, int beginIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(commonSubstring, "$this$commonSubstring");
        if (beginIndex >= 0) {
            if (!(endIndex <= commonSubstring.getData$okio().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + commonSubstring.getData$okio().length + ')').toString());
            }
            int subLen = endIndex - beginIndex;
            if (subLen >= 0) {
                if (beginIndex == 0 && endIndex == commonSubstring.getData$okio().length) {
                    return commonSubstring;
                }
                return new ByteString(ArraysKt.copyOfRange(commonSubstring.getData$okio(), beginIndex, endIndex));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public static final byte commonGetByte(ByteString commonGetByte, int pos) {
        Intrinsics.checkNotNullParameter(commonGetByte, "$this$commonGetByte");
        return commonGetByte.getData$okio()[pos];
    }

    public static final int commonGetSize(ByteString commonGetSize) {
        Intrinsics.checkNotNullParameter(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getData$okio().length;
    }

    public static final byte[] commonToByteArray(ByteString commonToByteArray) {
        Intrinsics.checkNotNullParameter(commonToByteArray, "$this$commonToByteArray");
        byte[] data$okio = commonToByteArray.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final byte[] commonInternalArray(ByteString commonInternalArray) {
        Intrinsics.checkNotNullParameter(commonInternalArray, "$this$commonInternalArray");
        return commonInternalArray.getData$okio();
    }

    public static final boolean commonRangeEquals(ByteString commonRangeEquals, int offset, ByteString other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(commonRangeEquals, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(otherOffset, commonRangeEquals.getData$okio(), offset, byteCount);
    }

    public static final boolean commonRangeEquals(ByteString commonRangeEquals, int offset, byte[] other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(commonRangeEquals, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        return offset >= 0 && offset <= commonRangeEquals.getData$okio().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && Util.arrayRangeEquals(commonRangeEquals.getData$okio(), offset, other, otherOffset, byteCount);
    }

    public static final boolean commonStartsWith(ByteString commonStartsWith, ByteString prefix) {
        Intrinsics.checkNotNullParameter(commonStartsWith, "$this$commonStartsWith");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean commonStartsWith(ByteString commonStartsWith, byte[] prefix) {
        Intrinsics.checkNotNullParameter(commonStartsWith, "$this$commonStartsWith");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.length);
    }

    public static final boolean commonEndsWith(ByteString commonEndsWith, ByteString suffix) {
        Intrinsics.checkNotNullParameter(commonEndsWith, "$this$commonEndsWith");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEndsWith(ByteString commonEndsWith, byte[] suffix) {
        Intrinsics.checkNotNullParameter(commonEndsWith, "$this$commonEndsWith");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonIndexOf(ByteString commonIndexOf, byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(commonIndexOf, "$this$commonIndexOf");
        Intrinsics.checkNotNullParameter(other, "other");
        int limit = commonIndexOf.getData$okio().length - other.length;
        int i = Math.max(fromIndex, 0);
        if (i <= limit) {
            while (!Util.arrayRangeEquals(commonIndexOf.getData$okio(), i, other, 0, other.length)) {
                if (i == limit) {
                    return -1;
                }
                i++;
            }
            return i;
        }
        return -1;
    }

    public static final int commonLastIndexOf(ByteString commonLastIndexOf, ByteString other, int fromIndex) {
        Intrinsics.checkNotNullParameter(commonLastIndexOf, "$this$commonLastIndexOf");
        Intrinsics.checkNotNullParameter(other, "other");
        return commonLastIndexOf.lastIndexOf(other.internalArray$okio(), fromIndex);
    }

    public static final int commonLastIndexOf(ByteString commonLastIndexOf, byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(commonLastIndexOf, "$this$commonLastIndexOf");
        Intrinsics.checkNotNullParameter(other, "other");
        int limit = commonLastIndexOf.getData$okio().length - other.length;
        for (int i = Math.min(fromIndex, limit); i >= 0; i--) {
            if (Util.arrayRangeEquals(commonLastIndexOf.getData$okio(), i, other, 0, other.length)) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean commonEquals(ByteString commonEquals, Object other) {
        Intrinsics.checkNotNullParameter(commonEquals, "$this$commonEquals");
        if (other == commonEquals) {
            return true;
        }
        if (other instanceof ByteString) {
            return ((ByteString) other).size() == commonEquals.getData$okio().length && ((ByteString) other).rangeEquals(0, commonEquals.getData$okio(), 0, commonEquals.getData$okio().length);
        }
        return false;
    }

    public static final int commonHashCode(ByteString commonHashCode) {
        Intrinsics.checkNotNullParameter(commonHashCode, "$this$commonHashCode");
        int result = commonHashCode.getHashCode$okio();
        if (result != 0) {
            return result;
        }
        int it = Arrays.hashCode(commonHashCode.getData$okio());
        commonHashCode.setHashCode$okio(it);
        return it;
    }

    public static final int commonCompareTo(ByteString commonCompareTo, ByteString other) {
        Intrinsics.checkNotNullParameter(commonCompareTo, "$this$commonCompareTo");
        Intrinsics.checkNotNullParameter(other, "other");
        int sizeA = commonCompareTo.size();
        int sizeB = other.size();
        int size = Math.min(sizeA, sizeB);
        for (int i = 0; i < size; i++) {
            byte $this$and$iv = commonCompareTo.getByte(i);
            int byteA = $this$and$iv & UByte.MAX_VALUE;
            byte $this$and$iv2 = other.getByte(i);
            int byteB = $this$and$iv2 & UByte.MAX_VALUE;
            if (byteA != byteB) {
                return byteA < byteB ? -1 : 1;
            }
        }
        if (sizeA == sizeB) {
            return 0;
        }
        return sizeA < sizeB ? -1 : 1;
    }

    public static final ByteString commonOf(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final ByteString commonToByteString(byte[] commonToByteString, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(commonToByteString, "$this$commonToByteString");
        Util.checkOffsetAndCount(commonToByteString.length, offset, byteCount);
        return new ByteString(ArraysKt.copyOfRange(commonToByteString, offset, offset + byteCount));
    }

    public static final ByteString commonEncodeUtf8(String commonEncodeUtf8) {
        Intrinsics.checkNotNullParameter(commonEncodeUtf8, "$this$commonEncodeUtf8");
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(commonEncodeUtf8));
        byteString.setUtf8$okio(commonEncodeUtf8);
        return byteString;
    }

    public static final ByteString commonDecodeBase64(String commonDecodeBase64) {
        Intrinsics.checkNotNullParameter(commonDecodeBase64, "$this$commonDecodeBase64");
        byte[] decoded = Base64.decodeBase64ToArray(commonDecodeBase64);
        if (decoded != null) {
            return new ByteString(decoded);
        }
        return null;
    }

    public static final ByteString commonDecodeHex(String commonDecodeHex) {
        Intrinsics.checkNotNullParameter(commonDecodeHex, "$this$commonDecodeHex");
        if (!(commonDecodeHex.length() % 2 == 0)) {
            throw new IllegalArgumentException(("Unexpected hex string: " + commonDecodeHex).toString());
        }
        byte[] result = new byte[commonDecodeHex.length() / 2];
        int length = result.length;
        for (int i = 0; i < length; i++) {
            int d1 = decodeHexDigit(commonDecodeHex.charAt(i * 2)) << 4;
            int d2 = decodeHexDigit(commonDecodeHex.charAt((i * 2) + 1));
            result[i] = (byte) (d1 + d2);
        }
        return new ByteString(result);
    }

    public static final void commonWrite(ByteString commonWrite, Buffer buffer, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(commonWrite.getData$okio(), offset, byteCount);
    }

    public static final int decodeHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        if ('a' <= c && 'f' >= c) {
            return (c - 'a') + 10;
        }
        if ('A' > c || 'F' < c) {
            throw new IllegalArgumentException("Unexpected hex digit: " + c);
        }
        return (c - 'A') + 10;
    }

    public static final String commonToString(ByteString commonToString) {
        Intrinsics.checkNotNullParameter(commonToString, "$this$commonToString");
        if (commonToString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int i = codePointIndexToCharIndex(commonToString.getData$okio(), 64);
        if (i == -1) {
            if (commonToString.getData$okio().length <= 64) {
                return "[hex=" + commonToString.hex() + ']';
            }
            StringBuilder append = new StringBuilder().append("[size=").append(commonToString.getData$okio().length).append(" hex=");
            ByteString $this$commonSubstring$iv = commonToString;
            if (!(64 <= $this$commonSubstring$iv.getData$okio().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + $this$commonSubstring$iv.getData$okio().length + ')').toString());
            }
            int subLen$iv = 64 - 0;
            if (subLen$iv >= 0) {
                if (64 != $this$commonSubstring$iv.getData$okio().length) {
                    $this$commonSubstring$iv = new ByteString(ArraysKt.copyOfRange($this$commonSubstring$iv.getData$okio(), 0, 64));
                }
                return append.append($this$commonSubstring$iv.hex()).append("…]").toString();
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        String text = commonToString.utf8();
        if (text == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = text.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String safeText = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), ShellUtils.COMMAND_LINE_END, "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
        if (i < text.length()) {
            return "[size=" + commonToString.getData$okio().length + " text=" + safeText + "…]";
        }
        return "[text=" + safeText + ']';
    }

    /* JADX WARN: Code restructure failed: missing block: B:1001:0x025b, code lost:
        if ((r10 == 128) == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1021:0x029b, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1028:0x02a7, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1029:0x02a9, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1055:0x02fb, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1062:0x0307, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1063:0x0309, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1086:0x0358, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1093:0x0364, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1094:0x0366, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1120:0x03a8, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1127:0x03b4, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1128:0x03b6, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1135:0x03c3, code lost:
        if (65533(0xfffd, float:9.1831E-41) < 65536(0x10000, float:9.1835E-41)) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1147:0x03e1, code lost:
        if (31 >= r4) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1154:0x03ed, code lost:
        if (159 < r4) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1155:0x03ef, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1162:0x03fc, code lost:
        if (r4 < 65536) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1163:0x03fe, code lost:
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1164:0x0400, code lost:
        r1 = r1 + r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1234:0x04cd, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1241:0x04d9, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1242:0x04db, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1268:0x052b, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1275:0x0537, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1276:0x0539, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1303:0x058c, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1310:0x0598, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1311:0x059a, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1333:0x05ee, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1340:0x05fa, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1341:0x05fc, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1367:0x0640, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1374:0x064c, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1375:0x064e, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1382:0x065b, code lost:
        if (65533(0xfffd, float:9.1831E-41) < 65536(0x10000, float:9.1835E-41)) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1383:0x065d, code lost:
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1384:0x065f, code lost:
        r1 = r1 + r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1397:0x0684, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1404:0x0690, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1405:0x0692, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1412:0x069f, code lost:
        if (65533(0xfffd, float:9.1831E-41) < 65536(0x10000, float:9.1835E-41)) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1424:0x06bd, code lost:
        if (31 >= r3) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1431:0x06c9, code lost:
        if (159 < r3) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1432:0x06cb, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1439:0x06d8, code lost:
        if (r3 < 65536) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x012d, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x0139, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x013b, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x0185, code lost:
        if (31 >= 65533(0xfffd, float:9.1831E-41)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x0191, code lost:
        if (159(0x9f, float:2.23E-43) < 65533(0xfffd, float:9.1831E-41)) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:922:0x0193, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:943:0x01c8, code lost:
        if (31 >= r3) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:950:0x01d4, code lost:
        if (159 < r3) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:951:0x01d6, code lost:
        r16 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int codePointIndexToCharIndex(byte[] s, int codePointCount) {
        int beginIndex$iv;
        int j;
        int j2;
        int j3;
        int j4;
        int j5;
        int charCount = 0;
        int j6 = 0;
        int beginIndex$iv2 = 0;
        int endIndex$iv = s.length;
        int c = 0;
        while (c < endIndex$iv) {
            byte b0$iv = s[c];
            int i = 127;
            if (b0$iv >= 0) {
                int j7 = j6 + 1;
                if (j6 == codePointCount) {
                    return charCount;
                }
                if (b0$iv != 10 && b0$iv != 13) {
                    int $i$f$isIsoControl = ((b0$iv < 0 || 31 < b0$iv) && (Byte.MAX_VALUE > b0$iv || 159 < b0$iv)) ? 0 : 1;
                    if ($i$f$isIsoControl != 0) {
                        return -1;
                    }
                }
                if (b0$iv == 65533) {
                    return -1;
                }
                charCount += b0$iv < 65536 ? 1 : 2;
                c++;
                j6 = j7;
                while (c < endIndex$iv && s[c] >= 0) {
                    int index$iv = c + 1;
                    int c2 = s[c];
                    int j8 = j6 + 1;
                    if (j6 == codePointCount) {
                        return charCount;
                    }
                    if (c2 != 10 && c2 != 13) {
                        int $i$f$isIsoControl2 = ((c2 < 0 || 31 < c2) && (i > c2 || 159 < c2)) ? 0 : 1;
                        if ($i$f$isIsoControl2 != 0) {
                            return -1;
                        }
                    }
                    if (c2 == 65533) {
                        return -1;
                    }
                    charCount += c2 < 65536 ? 1 : 2;
                    c = index$iv;
                    j6 = j8;
                    i = 127;
                }
                beginIndex$iv = beginIndex$iv2;
            } else {
                int other$iv$iv = b0$iv >> 5;
                if (other$iv$iv == -2) {
                    if (endIndex$iv <= c + 1) {
                        j5 = j6 + 1;
                        if (j6 == codePointCount) {
                            return charCount;
                        }
                        if (65533 != 10 && 65533 != 13) {
                            if ((65533 >= 0 && 31 >= 65533) || (127 <= 65533 && 159 >= 65533)) {
                                r16 = true;
                            }
                            if (r16) {
                                return -1;
                            }
                        }
                        if (65533 == 65533) {
                            return -1;
                        }
                        charCount += 65533 < 65536 ? 1 : 2;
                        Unit unit = Unit.INSTANCE;
                        beginIndex$iv = beginIndex$iv2;
                        r17 = 1;
                    } else {
                        byte b0$iv$iv = s[c];
                        byte b1$iv$iv = s[c + 1];
                        if ((b1$iv$iv & 192) == 128) {
                            beginIndex$iv = beginIndex$iv2;
                            int codePoint$iv$iv = (b1$iv$iv ^ ByteCompanionObject.MIN_VALUE) ^ (b0$iv$iv << 6);
                            if (codePoint$iv$iv < 128) {
                                int j9 = j6 + 1;
                                if (j6 == codePointCount) {
                                    return charCount;
                                }
                                if (65533 != 10 && 65533 != 13) {
                                    if (65533 < 0) {
                                    }
                                    if (127 <= 65533) {
                                    }
                                    if (r16) {
                                        return -1;
                                    }
                                }
                                if (65533 == 65533) {
                                    return -1;
                                }
                                charCount += 65533 >= 65536 ? 2 : 1;
                                Unit unit2 = Unit.INSTANCE;
                                j5 = j9;
                            } else {
                                int j10 = j6 + 1;
                                if (j6 == codePointCount) {
                                    return charCount;
                                }
                                if (codePoint$iv$iv != 10 && codePoint$iv$iv != 13) {
                                    if (codePoint$iv$iv < 0) {
                                    }
                                    if (127 <= codePoint$iv$iv) {
                                    }
                                    if (r16) {
                                        return -1;
                                    }
                                }
                                if (codePoint$iv$iv == 65533) {
                                    return -1;
                                }
                                charCount += codePoint$iv$iv >= 65536 ? 2 : 1;
                                Unit unit3 = Unit.INSTANCE;
                                j5 = j10;
                            }
                        } else {
                            int j11 = j6 + 1;
                            if (j6 == codePointCount) {
                                return charCount;
                            }
                            beginIndex$iv = beginIndex$iv2;
                            if (65533 != 10 && 65533 != 13) {
                                if (65533 < 0) {
                                }
                                if (127 <= 65533) {
                                }
                                if (r16) {
                                    return -1;
                                }
                            }
                            if (65533 == 65533) {
                                return -1;
                            }
                            charCount += 65533 < 65536 ? 1 : 2;
                            Unit unit4 = Unit.INSTANCE;
                            r17 = 1;
                            j5 = j11;
                        }
                    }
                    c += r17;
                    j6 = j5;
                } else {
                    beginIndex$iv = beginIndex$iv2;
                    int other$iv$iv2 = b0$iv >> 4;
                    if (other$iv$iv2 == -2) {
                        if (endIndex$iv <= c + 2) {
                            j4 = j6 + 1;
                            if (j6 == codePointCount) {
                                return charCount;
                            }
                            if (65533 != 10 && 65533 != 13) {
                                int $i$f$isIsoControl3 = ((65533 < 0 || 31 < 65533) && (127 > 65533 || 159 < 65533)) ? 0 : 1;
                                if ($i$f$isIsoControl3 != 0) {
                                    return -1;
                                }
                            }
                            if (65533 == 65533) {
                                return -1;
                            }
                            charCount += 65533 < 65536 ? 1 : 2;
                            Unit unit5 = Unit.INSTANCE;
                            if (endIndex$iv > c + 1) {
                                byte byte$iv$iv$iv = s[c + 1];
                                int other$iv$iv$iv$iv = 192 & byte$iv$iv$iv;
                            }
                            r17 = 1;
                        } else {
                            byte b0$iv$iv2 = s[c];
                            byte b1$iv$iv2 = s[c + 1];
                            if ((b1$iv$iv2 & 192) == 128) {
                                byte b2$iv$iv = s[c + 2];
                                int other$iv$iv$iv$iv2 = b2$iv$iv & 192;
                                if (other$iv$iv$iv$iv2 == 128) {
                                    int codePoint$iv$iv2 = (((-123008) ^ b2$iv$iv) ^ (b1$iv$iv2 << 6)) ^ (b0$iv$iv2 << 12);
                                    if (codePoint$iv$iv2 < 2048) {
                                        j3 = j6 + 1;
                                        if (j6 == codePointCount) {
                                            return charCount;
                                        }
                                        if (65533 != 10 && 65533 != 13) {
                                            if (65533 < 0) {
                                            }
                                            if (127 <= 65533) {
                                            }
                                            if (r16) {
                                                return -1;
                                            }
                                        }
                                        if (65533 == 65533) {
                                            return -1;
                                        }
                                        charCount += 65533 < 65536 ? 1 : 2;
                                    } else if (55296 <= codePoint$iv$iv2 && 57343 >= codePoint$iv$iv2) {
                                        j3 = j6 + 1;
                                        if (j6 == codePointCount) {
                                            return charCount;
                                        }
                                        if (65533 != 10 && 65533 != 13) {
                                            if (65533 < 0) {
                                            }
                                            if (127 <= 65533) {
                                            }
                                            if (r16) {
                                                return -1;
                                            }
                                        }
                                        if (65533 == 65533) {
                                            return -1;
                                        }
                                    } else {
                                        j3 = j6 + 1;
                                        if (j6 == codePointCount) {
                                            return charCount;
                                        }
                                        if (codePoint$iv$iv2 != 10 && codePoint$iv$iv2 != 13) {
                                            if (codePoint$iv$iv2 < 0) {
                                            }
                                            if (127 <= codePoint$iv$iv2) {
                                            }
                                            if (r16) {
                                                return -1;
                                            }
                                        }
                                        if (codePoint$iv$iv2 == 65533) {
                                            return -1;
                                        }
                                    }
                                    Unit unit6 = Unit.INSTANCE;
                                    j4 = j3;
                                    r17 = 3;
                                } else {
                                    int j12 = j6 + 1;
                                    if (j6 == codePointCount) {
                                        return charCount;
                                    }
                                    if (65533 != 10 && 65533 != 13) {
                                        if (65533 < 0) {
                                        }
                                        if (127 <= 65533) {
                                        }
                                        if (r16) {
                                            return -1;
                                        }
                                    }
                                    if (65533 == 65533) {
                                        return -1;
                                    }
                                    charCount += 65533 >= 65536 ? 2 : 1;
                                    Unit unit7 = Unit.INSTANCE;
                                    j4 = j12;
                                }
                            } else {
                                int j13 = j6 + 1;
                                if (j6 == codePointCount) {
                                    return charCount;
                                }
                                if (65533 != 10 && 65533 != 13) {
                                    if (65533 < 0) {
                                    }
                                    if (127 <= 65533) {
                                    }
                                    if (r16) {
                                        return -1;
                                    }
                                }
                                if (65533 == 65533) {
                                    return -1;
                                }
                                charCount += 65533 < 65536 ? 1 : 2;
                                Unit unit8 = Unit.INSTANCE;
                                r17 = 1;
                                j4 = j13;
                            }
                        }
                        c += r17;
                        j6 = j4;
                    } else {
                        int other$iv$iv3 = b0$iv >> 3;
                        if (other$iv$iv3 == -2) {
                            if (endIndex$iv <= c + 3) {
                                j2 = j6 + 1;
                                if (j6 == codePointCount) {
                                    return charCount;
                                }
                                if (65533 != 10 && 65533 != 13) {
                                    int $i$f$isIsoControl4 = ((65533 < 0 || 31 < 65533) && (127 > 65533 || 159 < 65533)) ? 0 : 1;
                                    if ($i$f$isIsoControl4 != 0) {
                                        return -1;
                                    }
                                }
                                if (65533 == 65533) {
                                    return -1;
                                }
                                charCount += 65533 < 65536 ? 1 : 2;
                                Unit unit9 = Unit.INSTANCE;
                                if (endIndex$iv > c + 1) {
                                    byte byte$iv$iv$iv2 = s[c + 1];
                                    int other$iv$iv$iv$iv3 = 192 & byte$iv$iv$iv2;
                                    if (other$iv$iv$iv$iv3 == 128) {
                                        if (endIndex$iv > c + 2) {
                                            byte byte$iv$iv$iv3 = s[c + 2];
                                            int other$iv$iv$iv$iv4 = 192 & byte$iv$iv$iv3;
                                            if (other$iv$iv$iv$iv4 == 128) {
                                                r17 = 3;
                                            }
                                        }
                                    }
                                }
                                r17 = 1;
                            } else {
                                byte b0$iv$iv3 = s[c];
                                byte b1$iv$iv3 = s[c + 1];
                                int other$iv$iv$iv$iv5 = 192 & b1$iv$iv3;
                                if (other$iv$iv$iv$iv5 == 128) {
                                    byte b2$iv$iv2 = s[c + 2];
                                    int other$iv$iv$iv$iv6 = 192 & b2$iv$iv2;
                                    if (other$iv$iv$iv$iv6 == 128) {
                                        byte b3$iv$iv = s[c + 3];
                                        int other$iv$iv$iv$iv7 = b3$iv$iv & 192;
                                        if (other$iv$iv$iv$iv7 == 128) {
                                            int codePoint$iv$iv3 = (((3678080 ^ b3$iv$iv) ^ (b2$iv$iv2 << 6)) ^ (b1$iv$iv3 << 12)) ^ (b0$iv$iv3 << 18);
                                            if (codePoint$iv$iv3 > 1114111) {
                                                j = j6 + 1;
                                                if (j6 == codePointCount) {
                                                    return charCount;
                                                }
                                                if (65533 != 10 && 65533 != 13) {
                                                    if (65533 < 0) {
                                                    }
                                                    if (127 <= 65533) {
                                                    }
                                                    if (r16) {
                                                        return -1;
                                                    }
                                                }
                                                if (65533 == 65533) {
                                                    return -1;
                                                }
                                                charCount += 65533 < 65536 ? 1 : 2;
                                            } else if (55296 <= codePoint$iv$iv3 && 57343 >= codePoint$iv$iv3) {
                                                j = j6 + 1;
                                                if (j6 == codePointCount) {
                                                    return charCount;
                                                }
                                                if (65533 != 10 && 65533 != 13) {
                                                    if (65533 < 0) {
                                                    }
                                                    if (127 <= 65533) {
                                                    }
                                                    if (r16) {
                                                        return -1;
                                                    }
                                                }
                                                if (65533 == 65533) {
                                                    return -1;
                                                }
                                            } else if (codePoint$iv$iv3 < 65536) {
                                                j = j6 + 1;
                                                if (j6 == codePointCount) {
                                                    return charCount;
                                                }
                                                if (65533 != 10 && 65533 != 13) {
                                                    if (65533 < 0) {
                                                    }
                                                    if (127 <= 65533) {
                                                    }
                                                    if (r16) {
                                                        return -1;
                                                    }
                                                }
                                                if (65533 == 65533) {
                                                    return -1;
                                                }
                                            } else {
                                                j = j6 + 1;
                                                if (j6 == codePointCount) {
                                                    return charCount;
                                                }
                                                if (codePoint$iv$iv3 != 10 && codePoint$iv$iv3 != 13) {
                                                    if (codePoint$iv$iv3 < 0) {
                                                    }
                                                    if (127 <= codePoint$iv$iv3) {
                                                    }
                                                    if (r16) {
                                                        return -1;
                                                    }
                                                }
                                                if (codePoint$iv$iv3 == 65533) {
                                                    return -1;
                                                }
                                            }
                                            Unit unit10 = Unit.INSTANCE;
                                            j2 = j;
                                            r17 = 4;
                                        } else {
                                            int j14 = j6 + 1;
                                            if (j6 == codePointCount) {
                                                return charCount;
                                            }
                                            if (65533 != 10 && 65533 != 13) {
                                                if (65533 < 0) {
                                                }
                                                if (127 <= 65533) {
                                                }
                                                if (r16) {
                                                    return -1;
                                                }
                                            }
                                            if (65533 == 65533) {
                                                return -1;
                                            }
                                            charCount += 65533 < 65536 ? 1 : 2;
                                            Unit unit11 = Unit.INSTANCE;
                                            j2 = j14;
                                            r17 = 3;
                                        }
                                    } else {
                                        int j15 = j6 + 1;
                                        if (j6 == codePointCount) {
                                            return charCount;
                                        }
                                        if (65533 != 10 && 65533 != 13) {
                                            if (65533 < 0) {
                                            }
                                            if (127 <= 65533) {
                                            }
                                            if (r16) {
                                                return -1;
                                            }
                                        }
                                        if (65533 == 65533) {
                                            return -1;
                                        }
                                        charCount += 65533 >= 65536 ? 2 : 1;
                                        Unit unit12 = Unit.INSTANCE;
                                        j2 = j15;
                                    }
                                } else {
                                    int j16 = j6 + 1;
                                    if (j6 == codePointCount) {
                                        return charCount;
                                    }
                                    if (65533 != 10 && 65533 != 13) {
                                        if (65533 < 0) {
                                        }
                                        if (127 <= 65533) {
                                        }
                                        if (r16) {
                                            return -1;
                                        }
                                    }
                                    if (65533 == 65533) {
                                        return -1;
                                    }
                                    charCount += 65533 < 65536 ? 1 : 2;
                                    Unit unit13 = Unit.INSTANCE;
                                    r17 = 1;
                                    j2 = j16;
                                }
                            }
                            c += r17;
                            j6 = j2;
                        } else {
                            int j17 = j6 + 1;
                            if (j6 == codePointCount) {
                                return charCount;
                            }
                            if (65533 != 10 && 65533 != 13) {
                                if ((65533 >= 0 && 31 >= 65533) || (127 <= 65533 && 159 >= 65533)) {
                                    r16 = true;
                                }
                                if (r16) {
                                    return -1;
                                }
                            }
                            if (65533 == 65533) {
                                return -1;
                            }
                            charCount += 65533 < 65536 ? 1 : 2;
                            c++;
                            j6 = j17;
                        }
                    }
                }
            }
            beginIndex$iv2 = beginIndex$iv;
        }
        return charCount;
    }
}
