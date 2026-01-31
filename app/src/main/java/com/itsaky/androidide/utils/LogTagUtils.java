package com.itsaky.androidide.utils;
/* loaded from: classes.dex */
public class LogTagUtils {
    public static String trimTagIfNeeded(String tag, int maxLength) {
        StringBuilder sb = new StringBuilder(tag);
        int length = tag.length();
        if (length > maxLength) {
            int start = length - maxLength;
            sb.delete(0, start);
            sb.setCharAt(0, '.');
            sb.setCharAt(1, '.');
        }
        return sb.toString();
    }
}
