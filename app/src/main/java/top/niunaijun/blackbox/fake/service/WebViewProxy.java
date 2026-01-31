package top.niunaijun.blackbox.fake.service;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.utils.Slog;
/* loaded from: classes3.dex */
public class WebViewProxy extends ClassInvocationStub {
    public static final String TAG = "WebViewProxy";

    private String buildDataDirectorySuffix() {
        try {
            int myUid = Process.myUid();
            return "blackbox_u" + myUid + "_p" + Process.myPid();
        } catch (Throwable th) {
            return null;
        }
    }

    private void ensureWebViewDataDirectorySuffix() {
        String buildDataDirectorySuffix;
        if (Build.VERSION.SDK_INT < 28 || (buildDataDirectorySuffix = buildDataDirectorySuffix()) == null || buildDataDirectorySuffix.isEmpty()) {
            return;
        }
        try {
            Class.forName("android.webkit.WebView").getMethod("setDataDirectorySuffix", String.class).invoke(null, buildDataDirectorySuffix);
            Slog.m20d(TAG, "Applied WebView suffix=".concat(buildDataDirectorySuffix));
        } catch (Throwable th) {
            Slog.m11w(TAG, "Failed to set WebView suffix", th);
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        try {
            return Class.forName("android.webkit.WebView");
        } catch (Throwable th) {
            Slog.m11w(TAG, "getWho: WebView class not found", th);
            return "android.webkit.WebView";
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        try {
            ensureWebViewDataDirectorySuffix();
        } catch (Throwable th) {
            Slog.m11w(TAG, "inject: ensureWebViewDataDirectorySuffix failed", th);
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
            if (context == null) {
                Slog.m12w(TAG, "isBadEnv: BlackBox context is null");
                return true;
            }
            return false;
        } catch (Throwable th) {
            Slog.m11w(TAG, "isBadEnv error", th);
            return true;
        }
    }
}
