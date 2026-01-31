package top.niunaijun.jnihook.jni;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public final class JniHook {
    public static final int NATIVE_OFFSET = 0;
    public static final int NATIVE_OFFSET_2 = 0;

    public static native void nativeOffset();

    public static native void nativeOffset2();

    public static native void setAccessible(Class<?> cls, Field field);

    public static native void setAccessible(Class<?> cls, Method method);
}
