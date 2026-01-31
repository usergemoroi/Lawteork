package top.niunaijun.blackreflection.utils;

import top.niunaijun.blackreflection.annotation.BClass;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
/* loaded from: classes3.dex */
public class ClassUtil {
    public static Class<?> classReady(Class<?> clazz) {
        BClassNameNotProcess bClassNameNotProcess = (BClassNameNotProcess) clazz.getAnnotation(BClassNameNotProcess.class);
        if (bClassNameNotProcess != null) {
            return classReady(bClassNameNotProcess.value());
        }
        BClass annotation = (BClass) clazz.getAnnotation(BClass.class);
        if (annotation != null) {
            return annotation.value();
        }
        BClassName bClassName = (BClassName) clazz.getAnnotation(BClassName.class);
        if (bClassName != null) {
            return classReady(bClassName.value());
        }
        return null;
    }

    private static Class<?> classReady(String clazz) {
        try {
            return Class.forName(clazz);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
