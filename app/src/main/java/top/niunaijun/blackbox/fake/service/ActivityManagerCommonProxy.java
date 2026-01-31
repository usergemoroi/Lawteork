package top.niunaijun.blackbox.fake.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.ComponentUtils;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackbox.utils.compat.StartActivityCompat;
/* loaded from: classes3.dex */
public class ActivityManagerCommonProxy {
    public static final String TAG = "CommonStub";

    @ProxyMethod("activityDestroyed")
    /* loaded from: classes3.dex */
    public static class ActivityDestroyed extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BlackBoxCore.getBActivityManager().onActivityDestroyed((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("activityResumed")
    /* loaded from: classes3.dex */
    public static class ActivityResumed extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BlackBoxCore.getBActivityManager().onActivityResumed((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("finishActivity")
    /* loaded from: classes3.dex */
    public static class FinishActivity extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BlackBoxCore.getBActivityManager().onFinishActivity((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("startActivities")
    /* loaded from: classes3.dex */
    public static class StartActivities extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int i = BuildCompat.isR() ? 3 : 2;
            int i2 = i + 1;
            Intent[] intentArr = (Intent[]) objArr[i];
            int i3 = i2 + 1;
            String[] strArr = (String[]) objArr[i2];
            IBinder iBinder = (IBinder) objArr[i3];
            Bundle bundle = (Bundle) objArr[i3 + 1];
            for (Intent intent : intentArr) {
                intent.setExtrasClassLoader(obj.getClass().getClassLoader());
            }
            return Integer.valueOf(BlackBoxCore.getBActivityManager().startActivities(BActivityThread.getUserId(), intentArr, strArr, iBinder, bundle));
        }
    }

    @ProxyMethod("startActivity")
    /* loaded from: classes3.dex */
    public static class StartActivity extends MethodHook {
        private Intent getIntent(Object[] objArr) {
            for (Object obj : objArr) {
                if (obj instanceof Intent) {
                    return (Intent) obj;
                }
            }
            return null;
        }

        private int startVirtualWebView(Uri uri, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.addFlags(268435456);
                intent.setPackage("mark.via.gp");
                context.startActivity(intent);
                Slog.m20d(ActivityManagerCommonProxy.TAG, "Virtual WebView launched: " + uri);
                return 0;
            } catch (Exception e) {
                Slog.m18e(ActivityManagerCommonProxy.TAG, "Virtual WebView launch failed: " + e);
                return -1;
            }
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            ResolveInfo resolveActivity;
            BlackBoxCore.get();
            Context context = BlackBoxCore.getContext();
            Intent intent = getIntent(objArr);
            if (intent == null) {
                return method.invoke(obj, objArr);
            }
            Uri data = intent.getData();
            if (data != null && data.toString().contains("twitter")) {
                data = Uri.parse(data.toString().replace("https://api.twitter.com/oauth/authorize", "https://api.x.com/oauth/authorize"));
                Slog.m20d(ActivityManagerCommonProxy.TAG, "X FIX applied: " + data);
            }
            String str = intent.getPackage();
            if (str == null && intent.getComponent() != null) {
                str = intent.getComponent().getPackageName();
            }
            if (str == null || !("com.android.chrome".equals(str) || "com.facebook.katana".equals(str) || "abcd".equals(str))) {
                if (intent.getParcelableExtra("_B_|_target_") == null && !ComponentUtils.isRequestInstall(intent) && (resolveActivity = BlackBoxCore.getBPackageManager().resolveActivity(intent, 128, StartActivityCompat.getResolvedType(objArr), BActivityThread.getUserId())) != null) {
                    intent.setExtrasClassLoader(obj.getClass().getClassLoader());
                    ActivityInfo activityInfo = resolveActivity.activityInfo;
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    BlackBoxCore.getBActivityManager().startActivityAms(BActivityThread.getUserId(), StartActivityCompat.getIntent(objArr), StartActivityCompat.getResolvedType(objArr), StartActivityCompat.getResultTo(objArr), StartActivityCompat.getResultWho(objArr), StartActivityCompat.getRequestCode(objArr), StartActivityCompat.getFlags(objArr), StartActivityCompat.getOptions(objArr));
                    return 0;
                }
                return method.invoke(obj, objArr);
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", data);
            intent2.addFlags(268435456);
            String[] strArr = {"com.android.webview", "com.google.android.webview", "com.google.android.webview.dev", "com.google.android.webview.beta", "com.google.android.webview.canary", "com.huawei.webview"};
            for (int i = 0; i < 6; i++) {
                intent2.setPackage(strArr[i]);
                if (intent2.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent2);
                    return 0;
                }
            }
            Slog.m18e(ActivityManagerCommonProxy.TAG, "WebView launch failed");
            return -1;
        }
    }
}
