package top.niunaijun.blackreflection;

import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import top.niunaijun.blackreflection.annotation.BClass;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BParamClass;
import top.niunaijun.blackreflection.annotation.BParamClassName;
import top.niunaijun.blackreflection.utils.Reflector;
/* loaded from: classes3.dex */
public class BlackReflection {
    public static boolean DEBUG = false;
    public static boolean CACHE = false;
    private static final Map<Class<?>, Object> sProxyCache = new HashMap();
    private static final Map<Class<?>, Object> sProxyWithExceptionCache = new HashMap();
    private static final WeakHashMap<Object, Map<Class<?>, Object>> sCallerProxyCache = new WeakHashMap<>();

    public static <T> T create(Class<T> clazz, Object caller, final boolean withException) {
        try {
            T proxy = (T) getProxy(clazz, caller, withException);
            if (proxy != null) {
                return proxy;
            }
            final WeakReference<Object> weakCaller = caller == null ? null : new WeakReference<>(caller);
            final Class<?> aClass = getClassNameByBlackClass(clazz);
            T t = (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandler() { // from class: top.niunaijun.blackreflection.BlackReflection.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object proxy2, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    Class<?> returnType = method.getReturnType();
                    try {
                        WeakReference weakReference = weakCaller;
                        boolean isStatic = weakReference == null;
                        Object callerByWeak = isStatic ? null : weakReference.get();
                        BField bField = (BField) method.getAnnotation(BField.class);
                        BFieldNotProcess bFieldNotProcess = (BFieldNotProcess) method.getAnnotation(BFieldNotProcess.class);
                        if (bField == null && bFieldNotProcess == null) {
                            BFieldSetNotProcess bFieldSetNotProcess = (BFieldSetNotProcess) method.getAnnotation(BFieldSetNotProcess.class);
                            if (bFieldSetNotProcess != null) {
                                Reflector on = Reflector.m8on(aClass).field(name.substring("_set_".length()));
                                if (isStatic) {
                                    on.set(args[0]);
                                } else if (callerByWeak == null) {
                                    return 0;
                                } else {
                                    on.set(callerByWeak, args[0]);
                                }
                                return 0;
                            }
                            BFieldCheckNotProcess bFieldCheckNotProcess = (BFieldCheckNotProcess) method.getAnnotation(BFieldCheckNotProcess.class);
                            if (bFieldCheckNotProcess == null) {
                                Class<?>[] paramClass = BlackReflection.getParamClass(method);
                                BMethodCheckNotProcess bMethodCheckNotProcess = (BMethodCheckNotProcess) method.getAnnotation(BMethodCheckNotProcess.class);
                                if (bMethodCheckNotProcess != null) {
                                    try {
                                        return Reflector.m8on(aClass).method(name.substring("_check_".length()), paramClass).getMethod();
                                    } catch (Throwable th) {
                                        return null;
                                    }
                                }
                                BConstructor bConstructor = (BConstructor) method.getAnnotation(BConstructor.class);
                                BConstructorNotProcess bConstructorNotProcess = (BConstructorNotProcess) method.getAnnotation(BConstructorNotProcess.class);
                                if (bConstructor == null && bConstructorNotProcess == null) {
                                    Reflector on2 = Reflector.m8on(aClass).method(name, paramClass);
                                    if (isStatic) {
                                        Object call = on2.call(args);
                                        return call;
                                    } else if (callerByWeak == null) {
                                        return BlackReflection.generateNullValue(returnType);
                                    } else {
                                        Object call2 = on2.callByCaller(callerByWeak, args);
                                        return call2;
                                    }
                                }
                                return Reflector.m8on(aClass).constructor(paramClass).newInstance(args);
                            }
                            try {
                                return Reflector.m8on(aClass).field(name.substring("_check_".length())).getField();
                            } catch (Throwable th2) {
                                return null;
                            }
                        }
                        Reflector on3 = Reflector.m8on(aClass).field(name);
                        if (isStatic) {
                            Object call3 = on3.get();
                            return call3;
                        } else if (callerByWeak == null) {
                            return BlackReflection.generateNullValue(returnType);
                        } else {
                            Object call4 = on3.get(callerByWeak);
                            return call4;
                        }
                    } catch (Throwable throwable) {
                        if (BlackReflection.DEBUG) {
                            if (throwable.getCause() != null) {
                                throwable.getCause().printStackTrace();
                            } else {
                                throwable.printStackTrace();
                            }
                        }
                        if (throwable instanceof BlackNullPointerException) {
                            throw new NullPointerException(throwable.getMessage());
                        }
                        if (!withException) {
                            return BlackReflection.generateNullValue(returnType);
                        }
                        throw throwable;
                    }
                }
            });
            if (caller == null) {
                if (withException) {
                    sProxyWithExceptionCache.put(clazz, t);
                } else {
                    sProxyCache.put(clazz, t);
                }
            }
            return t;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static <T> T getProxy(Class<T> clazz, Object caller, boolean withException) {
        Object o;
        if (caller == null) {
            try {
                if (withException) {
                    o = (T) sProxyWithExceptionCache.get(clazz);
                } else {
                    o = (T) sProxyCache.get(clazz);
                }
                if (o != null) {
                    return (T) o;
                }
                return null;
            } catch (Throwable th) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class<?>[] getParamClass(Method method) throws Throwable {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] param = new Class[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Annotation[] parameterAnnotation = parameterAnnotations[i];
            boolean found = false;
            int length = parameterAnnotation.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Annotation annotation = parameterAnnotation[i2];
                if (annotation instanceof BParamClassName) {
                    found = true;
                    param[i] = Class.forName(((BParamClassName) annotation).value());
                    break;
                } else if (!(annotation instanceof BParamClass)) {
                    i2++;
                } else {
                    found = true;
                    param[i] = ((BParamClass) annotation).value();
                    break;
                }
            }
            if (!found) {
                param[i] = parameterTypes[i];
            }
        }
        return param;
    }

    private static Class<?> getClassNameByBlackClass(Class<?> clazz) throws ClassNotFoundException {
        BClass bClass = (BClass) clazz.getAnnotation(BClass.class);
        BClassName bClassName = (BClassName) clazz.getAnnotation(BClassName.class);
        BClassNameNotProcess bClassNameNotProcess = (BClassNameNotProcess) clazz.getAnnotation(BClassNameNotProcess.class);
        if (bClass == null && bClassName == null && bClassNameNotProcess == null) {
            throw new RuntimeException("Not found @BlackClass or @BlackStrClass");
        }
        if (bClass != null) {
            return bClass.value();
        }
        if (bClassName != null) {
            return Class.forName(bClassName.value());
        }
        return Class.forName(bClassNameNotProcess.value());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object generateNullValue(Class<?> returnType) {
        if (returnType == Void.TYPE) {
            return 0;
        }
        if (returnType.isPrimitive()) {
            throw new BlackNullPointerException("value is null!");
        }
        return null;
    }
}
