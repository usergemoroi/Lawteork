package top.niunaijun.blackbox.fake.service;

import android.content.Context;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.utils.Slog;
/* loaded from: classes3.dex */
public class IWebViewUpdateServiceProxy extends ClassInvocationStub {
    public static final String TAG = "IWebViewUpdateServiceProxy";

    private void createSafeFallback() {
        try {
            Class<?> cls = Class.forName("android.webkit.IWebViewUpdateService");
            Slog.m20d(TAG, "Safe IWebViewUpdateService proxy created: ".concat(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: top.niunaijun.blackbox.fake.service.IWebViewUpdateServiceProxy.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getReturnType().isArray()) {
                        return Array.newInstance(method.getReturnType().getComponentType(), 0);
                    }
                    if (method.getReturnType() == Boolean.TYPE || method.getReturnType() == Boolean.class) {
                        return Boolean.FALSE;
                    }
                    return null;
                }
            }).getClass().getName()));
        } catch (Throwable th) {
            Slog.m11w(TAG, "createSafeFallback failed", th);
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        try {
            return Class.forName("android.webkit.IWebViewUpdateService");
        } catch (Throwable th) {
            Slog.m11w(TAG, "getWho: IWebViewUpdateService not found", th);
            return "android.webkit.IWebViewUpdateService";
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        try {
            createSafeFallback();
        } catch (Throwable th) {
            Slog.m11w(TAG, "inject: fallback failed", th);
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        Context context;
        try {
            if (BlackBoxCore.get() != null) {
                BlackBoxCore.get();
                context = BlackBoxCore.getContext();
            } else {
                context = null;
            }
            return context == null;
        } catch (Throwable th) {
            return true;
        }
    }
}
