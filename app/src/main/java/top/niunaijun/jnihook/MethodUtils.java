package top.niunaijun.jnihook;

import java.lang.reflect.Method;
import java.util.Objects;
import net.lingala.zip4j.util.InternalZipConstants;
/* loaded from: classes3.dex */
public class MethodUtils {
    public static String getDeclaringClass(Method method) {
        return method.getDeclaringClass().getName().replace(".", InternalZipConstants.ZIP_FILE_SEPARATOR);
    }

    private static String getDesc(Class<?> cls) {
        if (cls.isPrimitive()) {
            return getPrimitiveLetter(cls);
        }
        return (cls.isArray() ? new StringBuilder("[").append(getDesc((Class) Objects.requireNonNull(cls.getComponentType()))) : new StringBuilder("L").append(getType(cls)).append(";")).toString();
    }

    public static String getMethodName(Method method) {
        return method.getName();
    }

    private static String getPrimitiveLetter(Class<?> cls) {
        if (Integer.TYPE.equals(cls)) {
            return "I";
        }
        if (Void.TYPE.equals(cls)) {
            return "V";
        }
        if (Boolean.TYPE.equals(cls)) {
            return "Z";
        }
        if (Character.TYPE.equals(cls)) {
            return "C";
        }
        if (Byte.TYPE.equals(cls)) {
            return "B";
        }
        if (Short.TYPE.equals(cls)) {
            return "S";
        }
        if (Float.TYPE.equals(cls)) {
            return "F";
        }
        if (Long.TYPE.equals(cls)) {
            return "J";
        }
        if (Double.TYPE.equals(cls)) {
            return "D";
        }
        throw new IllegalStateException("Type: " + cls.getCanonicalName() + " is not a primitive type");
    }

    private static String getType(Class<?> cls) {
        return cls.isArray() ? "[" + getDesc((Class) Objects.requireNonNull(cls.getComponentType())) : !cls.isPrimitive() ? cls.getName().replaceAll("\\.", InternalZipConstants.ZIP_FILE_SEPARATOR) : getPrimitiveLetter(cls);
    }

    public static String getDesc(Method method) {
        StringBuilder sb = new StringBuilder("(");
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append(getDesc(cls));
        }
        sb.append(")");
        sb.append(getDesc(method.getReturnType()));
        return sb.toString();
    }
}
