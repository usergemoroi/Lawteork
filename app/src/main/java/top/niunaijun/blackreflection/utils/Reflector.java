package top.niunaijun.blackreflection.utils;

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
    protected Constructor<?> mConstructor;
    protected Field mField;
    protected Method mMethod;
    protected Class<?> mType;

    /* renamed from: on */
    public static Reflector m7on(String name) throws Exception {
        return m5on(name, true, Reflector.class.getClassLoader());
    }

    /* renamed from: on */
    public static Reflector m6on(String name, boolean initialize) throws Exception {
        return m5on(name, initialize, Reflector.class.getClassLoader());
    }

    /* renamed from: on */
    public static Reflector m5on(String name, boolean initialize, ClassLoader loader) throws Exception {
        try {
            return m8on(Class.forName(name, initialize, loader));
        } catch (Throwable e) {
            throw new Exception("Oops!", e);
        }
    }

    /* renamed from: on */
    public static Reflector m8on(Class<?> type) {
        Reflector reflector = new Reflector();
        reflector.mType = type;
        return reflector;
    }

    public static Reflector with(Object caller) throws Exception {
        return m8on(caller.getClass()).bind(caller);
    }

    protected Reflector() {
    }

    public Reflector constructor(Class<?>... parameterTypes) throws Exception {
        try {
            Constructor<?> declaredConstructor = this.mType.getDeclaredConstructor(parameterTypes);
            this.mConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            this.mField = null;
            this.mMethod = null;
            return this;
        } catch (Throwable e) {
            throw new Exception("Oops!", e);
        }
    }

    public <R> R newInstance(Object... initargs) throws Exception {
        Constructor<?> constructor = this.mConstructor;
        if (constructor == null) {
            throw new Exception("Constructor was null!");
        }
        try {
            return (R) constructor.newInstance(initargs);
        } catch (InvocationTargetException e) {
            throw new Exception("Oops!", e.getTargetException());
        } catch (Throwable e2) {
            throw new Exception("Oops!", e2);
        }
    }

    protected Object checked(Object caller) throws Exception {
        if (caller == null || this.mType.isInstance(caller)) {
            return caller;
        }
        throw new Exception("Caller [" + caller + "] is not a instance of type [" + this.mType + "]!");
    }

    protected void check(Object caller, Member member, String name) throws Exception {
        if (member == null) {
            throw new Exception(name + " was null!");
        }
        if (caller == null && !Modifier.isStatic(member.getModifiers())) {
            throw new Exception("Need a caller!");
        }
        checked(caller);
    }

    public Reflector bind(Object caller) throws Exception {
        this.mCaller = checked(caller);
        return this;
    }

    public Reflector unbind() {
        this.mCaller = null;
        return this;
    }

    public Reflector field(String name) throws Exception {
        try {
            Field findField = findField(name);
            this.mField = findField;
            findField.setAccessible(true);
            this.mConstructor = null;
            this.mMethod = null;
            return this;
        } catch (Throwable e) {
            throw new Exception("Oops!", e);
        }
    }

    public Field getField() {
        return this.mField;
    }

    protected Field findField(String name) throws NoSuchFieldException {
        try {
            return this.mType.getField(name);
        } catch (NoSuchFieldException e) {
            for (Class<?> cls = this.mType; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredField(name);
                } catch (NoSuchFieldException e2) {
                }
            }
            throw e;
        }
    }

    public <R> R get() throws Exception {
        return (R) get(this.mCaller);
    }

    public <R> R get(Object caller) throws Exception {
        check(caller, this.mField, "Field");
        try {
            return (R) this.mField.get(caller);
        } catch (Throwable e) {
            throw new Exception("Oops!", e);
        }
    }

    public Reflector set(Object value) throws Exception {
        return set(this.mCaller, value);
    }

    public Reflector set(Object caller, Object value) throws Exception {
        check(caller, this.mField, "Field");
        try {
            this.mField.set(caller, value);
            return this;
        } catch (Throwable e) {
            throw new Exception("Oops!", e);
        }
    }

    public Reflector method(String name, Class<?>... parameterTypes) throws Exception {
        try {
            Method findMethod = findMethod(name, parameterTypes);
            this.mMethod = findMethod;
            findMethod.setAccessible(true);
            this.mConstructor = null;
            this.mField = null;
            return this;
        } catch (NoSuchMethodException e) {
            throw new Exception("Oops!", e);
        }
    }

    public Method getMethod() {
        return this.mMethod;
    }

    protected Method findMethod(String name, Class<?>... parameterTypes) throws NoSuchMethodException {
        try {
            return this.mType.getMethod(name, parameterTypes);
        } catch (NoSuchMethodException e) {
            for (Class<?> cls = this.mType; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredMethod(name, parameterTypes);
                } catch (NoSuchMethodException e2) {
                }
            }
            throw e;
        }
    }

    public <R> R call(Object... args) throws Exception {
        return (R) callByCaller(this.mCaller, args);
    }

    public <R> R callByCaller(Object caller, Object... args) throws Exception {
        check(caller, this.mMethod, "Method");
        try {
            return (R) this.mMethod.invoke(caller, args);
        } catch (InvocationTargetException e) {
            throw new Exception("Oops!", e.getTargetException());
        } catch (Throwable e2) {
            throw new Exception("Oops!", e2);
        }
    }

    /* loaded from: classes3.dex */
    public static class QuietReflector extends Reflector {
        protected Throwable mIgnored;

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public /* bridge */ /* synthetic */ Reflector constructor(Class[] clsArr) throws Exception {
            return constructor((Class<?>[]) clsArr);
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public /* bridge */ /* synthetic */ Reflector method(String str, Class[] clsArr) throws Exception {
            return method(str, (Class<?>[]) clsArr);
        }

        /* renamed from: on */
        public static QuietReflector m2on(String name) {
            return m0on(name, true, QuietReflector.class.getClassLoader());
        }

        /* renamed from: on */
        public static QuietReflector m1on(String name, boolean initialize) {
            return m0on(name, initialize, QuietReflector.class.getClassLoader());
        }

        /* renamed from: on */
        public static QuietReflector m0on(String name, boolean initialize, ClassLoader loader) {
            Class<?> cls = null;
            try {
                cls = Class.forName(name, initialize, loader);
                return m3on(cls, (Throwable) null);
            } catch (Throwable e) {
                return m3on(cls, e);
            }
        }

        /* renamed from: on */
        public static QuietReflector m4on(Class<?> type) {
            return m3on(type, type == null ? new Exception("Type was null!") : null);
        }

        /* renamed from: on */
        private static QuietReflector m3on(Class<?> type, Throwable ignored) {
            QuietReflector reflector = new QuietReflector();
            reflector.mType = type;
            reflector.mIgnored = ignored;
            return reflector;
        }

        public static QuietReflector with(Object caller) {
            if (caller == null) {
                return m4on((Class<?>) null);
            }
            return m4on(caller.getClass()).bind(caller);
        }

        protected QuietReflector() {
        }

        public Throwable getIgnored() {
            return this.mIgnored;
        }

        protected boolean skip() {
            return skipAlways() || this.mIgnored != null;
        }

        protected boolean skipAlways() {
            return this.mType == null;
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public QuietReflector constructor(Class<?>... parameterTypes) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.constructor(parameterTypes);
            } catch (Throwable e) {
                this.mIgnored = e;
            }
            return this;
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public <R> R newInstance(Object... initargs) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.newInstance(initargs);
            } catch (Throwable e) {
                this.mIgnored = e;
                return null;
            }
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public QuietReflector bind(Object obj) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.bind(obj);
            } catch (Throwable e) {
                this.mIgnored = e;
            }
            return this;
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public QuietReflector unbind() {
            super.unbind();
            return this;
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public QuietReflector field(String name) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.field(name);
            } catch (Throwable e) {
                this.mIgnored = e;
            }
            return this;
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public <R> R get() {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get();
            } catch (Throwable e) {
                this.mIgnored = e;
                return null;
            }
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public <R> R get(Object caller) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get(caller);
            } catch (Throwable e) {
                this.mIgnored = e;
                return null;
            }
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public QuietReflector set(Object value) {
            if (skip()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.set(value);
            } catch (Throwable e) {
                this.mIgnored = e;
            }
            return this;
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public QuietReflector set(Object caller, Object value) {
            if (skip()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.set(caller, value);
            } catch (Throwable e) {
                this.mIgnored = e;
            }
            return this;
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public QuietReflector method(String name, Class<?>... parameterTypes) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.method(name, parameterTypes);
            } catch (Throwable e) {
                this.mIgnored = e;
            }
            return this;
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public <R> R call(Object... args) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.call(args);
            } catch (Throwable e) {
                this.mIgnored = e;
                return null;
            }
        }

        @Override // top.niunaijun.blackreflection.utils.Reflector
        public <R> R callByCaller(Object caller, Object... args) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.callByCaller(caller, args);
            } catch (Throwable e) {
                this.mIgnored = e;
                return null;
            }
        }
    }
}
