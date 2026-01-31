package top.niunaijun.blackbox.fake.service;

import android.content.Context;
import java.lang.reflect.Method;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.utils.Slog;
/* loaded from: classes3.dex */
public class WebViewFactoryProxy extends ClassInvocationStub {
    public static final String TAG = "WebViewFactoryProxy";

    private void probeWebViewFactoryProvider() {
        Object invoke;
        try {
            Class<?> cls = Class.forName("android.webkit.WebViewFactory");
            String[] strArr = {"getProvider", "getFactory", "getProviderClass"};
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                try {
                    Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
                    declaredMethod.setAccessible(true);
                    invoke = declaredMethod.invoke(null, new Object[0]);
                    Slog.m20d(TAG, "Found " + str + ", provider=" + (invoke == null ? "null" : invoke.getClass().getName()));
                } catch (NoSuchMethodException e) {
                }
                if (invoke != null) {
                    return;
                }
            }
        } catch (Throwable th) {
            Slog.m11w(TAG, "probeWebViewFactoryProvider: reflection failed", th);
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        try {
            return Class.forName("android.webkit.WebViewFactory");
        } catch (Throwable th) {
            Slog.m11w(TAG, "getWho: WebViewFactory not found", th);
            return "android.webkit.WebViewFactory";
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        try {
            probeWebViewFactoryProvider();
        } catch (Throwable th) {
            Slog.m11w(TAG, "inject: probe failed", th);
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
