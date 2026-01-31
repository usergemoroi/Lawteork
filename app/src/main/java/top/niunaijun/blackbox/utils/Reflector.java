package top.niunaijun.blackbox.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes3.dex */
public class Reflector {
    public static final String LOG_TAG = "Reflector";
    protected Object mCaller;
    protected Constructor mConstructor;
    protected Field mField;
    protected Method mMethod;
    protected Class<?> mType;

    /* loaded from: classes3.dex */
    public static class QuietReflector extends Reflector {
        protected Throwable mIgnored;

        /* renamed from: on */
        public static QuietReflector m25on(Class<?> cls) {
            return m24on(cls, cls == null ? new Exception("Type was null!") : null);
        }

        public static QuietReflector with(Object obj) {
            return obj == null ? m25on((Class<?>) null) : m25on(obj.getClass()).bind(obj);
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public QuietReflector bind(Object obj) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.bind(obj);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public <R> R call(Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.call(objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public <R> R callByCaller(Object obj, Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.callByCaller(obj, objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public QuietReflector constructor(Class<?>... clsArr) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.constructor(clsArr);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public QuietReflector field(String str) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.field(str);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public <R> R get() {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get();
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        public Throwable getIgnored() {
            return this.mIgnored;
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public QuietReflector method(String str, Class<?>... clsArr) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.method(str, clsArr);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public <R> R newInstance(Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.newInstance(objArr);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public QuietReflector set(Object obj) {
            if (skip()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.set(obj);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        public boolean skip() {
            return skipAlways() || this.mIgnored != null;
        }

        public boolean skipAlways() {
            return this.mType == null;
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public QuietReflector unbind() {
            super.unbind();
            return this;
        }

        /* renamed from: on */
        private static QuietReflector m24on(Class<?> cls, Throwable th) {
            QuietReflector quietReflector = new QuietReflector();
            quietReflector.mType = cls;
            quietReflector.mIgnored = th;
            return quietReflector;
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public /* bridge */ /* synthetic */ Reflector constructor(Class[] clsArr) {
            return constructor((Class<?>[]) clsArr);
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public <R> R get(Object obj) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get(obj);
            } catch (Throwable th) {
                this.mIgnored = th;
                return null;
            }
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public /* bridge */ /* synthetic */ Reflector method(String str, Class[] clsArr) {
            return method(str, (Class<?>[]) clsArr);
        }

        @Override // top.niunaijun.blackbox.utils.Reflector
        public QuietReflector set(Object obj, Object obj2) {
            if (skip()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.set(obj, obj2);
            } catch (Throwable th) {
                this.mIgnored = th;
            }
            return this;
        }

        /* renamed from: on */
        public static QuietReflector m23on(String str) {
            return m21on(str, true, QuietReflector.class.getClassLoader());
        }

        /* renamed from: on */
        public static QuietReflector m22on(String str, boolean z) {
            return m21on(str, z, QuietReflector.class.getClassLoader());
        }

        /* renamed from: on */
        public static QuietReflector m21on(String str, boolean z, ClassLoader classLoader) {
            Class cls;
            Class cls2 = null;
            try {
                try {
                    return m24on(Class.forName(str, z, classLoader), (Throwable) null);
                } catch (Throwable th) {
                    th = th;
                    cls2 = cls;
                    return m24on(cls2, th);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static Method findMethodByFirstName(Class<?> cls, String str) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            if (str.equals(method.getName())) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: on */
    public static Reflector m29on(Class<?> cls) {
        Reflector reflector = new Reflector();
        reflector.mType = cls;
        return reflector;
    }

    public static Reflector with(Object obj) {
        return m29on(obj.getClass()).bind(obj);
    }

    public Reflector bind(Object obj) {
        this.mCaller = checked(obj);
        return this;
    }

    public <R> R call(Object... objArr) {
        return (R) callByCaller(this.mCaller, objArr);
    }

    public <R> R callByCaller(Object obj, Object... objArr) {
        check(obj, this.mMethod, "Method");
        try {
            return (R) this.mMethod.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw new Exception("Oops!", e.getTargetException());
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public void check(Object obj, Member member, String str) {
        if (member == null) {
            throw new Exception(str + " was null!");
        }
        if (obj == null && !Modifier.isStatic(member.getModifiers())) {
            throw new Exception("Need a caller!");
        }
        checked(obj);
    }

    public Object checked(Object obj) {
        if (obj == null || this.mType.isInstance(obj)) {
            return obj;
        }
        throw new Exception("Caller [" + obj + "] is not a instance of type [" + this.mType + "]!");
    }

    public Reflector constructor(Class<?>... clsArr) {
        try {
            Constructor<?> declaredConstructor = this.mType.getDeclaredConstructor(clsArr);
            this.mConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            this.mField = null;
            this.mMethod = null;
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public Reflector field(String str) {
        try {
            Field findField = findField(str);
            this.mField = findField;
            findField.setAccessible(true);
            this.mConstructor = null;
            this.mMethod = null;
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public Field findField(String str) {
        try {
            return this.mType.getField(str);
        } catch (NoSuchFieldException e) {
            for (Class<?> cls = this.mType; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException e2) {
                }
            }
            throw e;
        }
    }

    public Method findMethod(String str, Class<?>... clsArr) {
        try {
            return this.mType.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            for (Class<?> cls = this.mType; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException e2) {
                }
            }
            throw e;
        }
    }

    public <R> R get() {
        return (R) get(this.mCaller);
    }

    public Reflector method(String str, Class<?>... clsArr) {
        try {
            Method findMethod = findMethod(str, clsArr);
            this.mMethod = findMethod;
            findMethod.setAccessible(true);
            this.mConstructor = null;
            this.mField = null;
            return this;
        } catch (NoSuchMethodException e) {
            throw new Exception("Oops!", e);
        }
    }

    public <R> R newInstance(Object... objArr) {
        Constructor constructor = this.mConstructor;
        if (constructor != null) {
            try {
                return (R) constructor.newInstance(objArr);
            } catch (InvocationTargetException e) {
                throw new Exception("Oops!", e.getTargetException());
            } catch (Throwable th) {
                throw new Exception("Oops!", th);
            }
        }
        throw new Exception("Constructor was null!");
    }

    public Reflector set(Object obj) {
        return set(this.mCaller, obj);
    }

    public Reflector unbind() {
        this.mCaller = null;
        return this;
    }

    /* renamed from: on */
    public static Reflector m28on(String str) {
        return m26on(str, true, Reflector.class.getClassLoader());
    }

    public <R> R get(Object obj) {
        check(obj, this.mField, "Field");
        try {
            return (R) this.mField.get(obj);
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    public Reflector set(Object obj, Object obj2) {
        check(obj, this.mField, "Field");
        try {
            this.mField.set(obj, obj2);
            return this;
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }

    /* renamed from: on */
    public static Reflector m27on(String str, boolean z) {
        return m26on(str, z, Reflector.class.getClassLoader());
    }

    /* renamed from: on */
    public static Reflector m26on(String str, boolean z, ClassLoader classLoader) {
        try {
            return m29on(Class.forName(str, z, classLoader));
        } catch (Throwable th) {
            throw new Exception("Oops!", th);
        }
    }
}
