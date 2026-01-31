package top.niunaijun.blackbox.utils;

import java.util.Arrays;
import java.util.HashSet;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
/* loaded from: classes3.dex */
public class MethodParameterUtils {
    public static Class<?>[] getAllInterface(Class cls) {
        HashSet hashSet = new HashSet();
        getAllInterfaces(cls, hashSet);
        Class<?>[] clsArr = new Class[hashSet.size()];
        hashSet.toArray(clsArr);
        return clsArr;
    }

    public static void getAllInterfaces(Class cls, HashSet<Class<?>> hashSet) {
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length != 0) {
            hashSet.addAll(Arrays.asList(interfaces));
        }
        if (cls.getSuperclass() != Object.class) {
            getAllInterfaces(cls.getSuperclass(), hashSet);
        }
    }

    public static <T> T getFirstParam(Object[] objArr, Class<T> cls) {
        int indexOfFirst;
        if (objArr == null || (indexOfFirst = ArrayUtils.indexOfFirst(objArr, cls)) == -1) {
            return null;
        }
        return (T) objArr[indexOfFirst];
    }

    public static int getIndex(Object[] objArr, Class<?> cls) {
        return getIndex(objArr, cls, 0);
    }

    public static int getParamsIndex(Class[] clsArr, Class<?> cls) {
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i].equals(cls)) {
                return i;
            }
        }
        return -1;
    }

    public static void replaceAllAppPkg(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof String)) {
                if (BlackBoxCore.get().isInstalled((String) obj, BActivityThread.getUserId())) {
                    objArr[i] = BlackBoxCore.getHostPkg();
                }
            }
        }
    }

    public static String replaceFirstAppPkg(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                String str = (String) obj;
                if (BlackBoxCore.get().isInstalled(str, BActivityThread.getUserId())) {
                    objArr[i] = BlackBoxCore.getHostPkg();
                    return str;
                }
            }
        }
        return null;
    }

    public static void replaceFirstUid(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == BActivityThread.getBUid()) {
                objArr[i] = Integer.valueOf(BlackBoxCore.getHostUid());
            }
        }
    }

    public static String replaceLastAppPkg(Object[] objArr) {
        int indexOfLast = ArrayUtils.indexOfLast(objArr, String.class);
        if (indexOfLast != -1) {
            String str = (String) objArr[indexOfLast];
            if (BlackBoxCore.get().isInstalled(str, BActivityThread.getUserId())) {
                objArr[indexOfLast] = BlackBoxCore.getHostPkg();
            }
            return str;
        }
        return null;
    }

    public static void replaceLastUid(Object[] objArr) {
        int indexOfLast = ArrayUtils.indexOfLast(objArr, Integer.class);
        if (indexOfLast == -1 || ((Integer) objArr[indexOfLast]).intValue() != BActivityThread.getBUid()) {
            return;
        }
        objArr[indexOfLast] = Integer.valueOf(BlackBoxCore.getHostUid());
    }

    public static void replaceLastUserId(Object[] objArr) {
        int length = objArr.length - 1;
        if (length < 0 || !(objArr[length] instanceof Integer)) {
            return;
        }
        objArr[length] = Integer.valueOf(BlackBoxCore.getHostUserId());
    }

    public static String replaceSequenceAppPkg(Object[] objArr, int i) {
        int indexOf = ArrayUtils.indexOf(objArr, String.class, i);
        if (indexOf != -1) {
            String str = (String) objArr[indexOf];
            if (BlackBoxCore.get().isInstalled(str, BActivityThread.getUserId())) {
                objArr[indexOf] = BlackBoxCore.getHostPkg();
            }
            return str;
        }
        return null;
    }

    public static int toInt(Object obj) {
        return obj instanceof Long ? ((Long) obj).intValue() : ((Integer) obj).intValue();
    }

    public static int getIndex(Object[] objArr, Class<?> cls, int i) {
        while (i < objArr.length) {
            Object obj = objArr[i];
            if ((obj != null && obj.getClass() == cls) || cls.isInstance(obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
