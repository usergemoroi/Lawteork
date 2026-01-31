package top.niunaijun.blackbox.fake.delegate;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import java.lang.reflect.Field;
import p007b.AbstractC0565a;
import p007b.AbstractC0567c;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.HookManager;
import top.niunaijun.blackbox.fake.hook.IInjectHook;
import top.niunaijun.blackbox.fake.service.HCallbackProxy;
import top.niunaijun.blackbox.fake.service.IActivityClientProxy;
import top.niunaijun.blackbox.utils.HackAppUtils;
import top.niunaijun.blackbox.utils.compat.ActivityCompat;
import top.niunaijun.blackbox.utils.compat.ActivityManagerCompat;
import top.niunaijun.blackbox.utils.compat.ContextCompat;
/* loaded from: classes3.dex */
public final class AppInstrumentation extends BaseInstrumentationDelegate implements IInjectHook {
    static final boolean $assertionsDisabled = false;
    private static final String TAG = "AppInstrumentation";
    private static volatile AppInstrumentation sAppInstrumentation;

    private void checkActivity(Activity activity) {
        Log.d(TAG, "callActivityOnCreate: ".concat(activity.getClass().getName()));
        HackAppUtils.enableQQLogOutput(activity.getPackageName(), activity.getClassLoader());
        checkHCallback();
        HookManager.get().checkEnv(IActivityClientProxy.class);
        ActivityInfo mActivityInfo = AbstractC0565a.m167a(activity).mActivityInfo();
        ContextCompat.fix(activity);
        ActivityCompat.fix(activity);
        if (mActivityInfo.theme != 0) {
            activity.getTheme().applyStyle(mActivityInfo.theme, true);
        }
        ActivityManagerCompat.setActivityOrientation(activity, mActivityInfo.screenOrientation);
    }

    private void checkHCallback() {
        HookManager.get().checkEnv(HCallbackProxy.class);
    }

    private boolean checkInstrumentation(Instrumentation instrumentation) {
        Field[] declaredFields;
        if (instrumentation instanceof AppInstrumentation) {
            return true;
        }
        Class<?> cls = instrumentation.getClass();
        if (Instrumentation.class.equals(cls)) {
            return false;
        }
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (Instrumentation.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    try {
                        if (field.get(instrumentation) instanceof AppInstrumentation) {
                            return true;
                        }
                    } catch (Exception e) {
                        return false;
                    }
                }
            }
            cls = cls.getSuperclass();
            if (Instrumentation.class.equals(cls)) {
                return false;
            }
        }
        throw new AssertionError();
    }

    public static AppInstrumentation get() {
        if (sAppInstrumentation == null) {
            synchronized (AppInstrumentation.class) {
                if (sAppInstrumentation == null) {
                    sAppInstrumentation = new AppInstrumentation();
                }
            }
        }
        return sAppInstrumentation;
    }

    private Instrumentation getCurrInstrumentation() {
        return AbstractC0567c.m164a(BlackBoxCore.mainThread()).mInstrumentation();
    }

    @Override // top.niunaijun.blackbox.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        checkActivity(activity);
        super.callActivityOnCreate(activity, bundle);
    }

    @Override // top.niunaijun.blackbox.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        checkHCallback();
        super.callApplicationOnCreate(application);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public void injectHook() {
        try {
            Instrumentation currInstrumentation = getCurrInstrumentation();
            if (currInstrumentation == this || checkInstrumentation(currInstrumentation)) {
                return;
            }
            this.mBaseInstrumentation = currInstrumentation;
            AbstractC0567c.m164a(BlackBoxCore.mainThread())._set_mInstrumentation(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return !checkInstrumentation(getCurrInstrumentation());
    }

    @Override // top.niunaijun.blackbox.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        try {
            return super.newActivity(classLoader, str, intent);
        } catch (ClassNotFoundException e) {
            return this.mBaseInstrumentation.newActivity(classLoader, str, intent);
        }
    }

    @Override // top.niunaijun.blackbox.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) {
        ContextCompat.fix(context);
        return super.newApplication(classLoader, str, context);
    }

    @Override // top.niunaijun.blackbox.fake.delegate.BaseInstrumentationDelegate, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        checkActivity(activity);
        super.callActivityOnCreate(activity, bundle, persistableBundle);
    }
}
