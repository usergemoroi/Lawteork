package top.niunaijun.blackbox.app.configuration;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
/* loaded from: classes3.dex */
public class AppLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    public static AppLifecycleCallback EMPTY = new AppLifecycleCallback() { // from class: top.niunaijun.blackbox.app.configuration.AppLifecycleCallback.1
    };

    public void afterApplicationOnCreate(String str, String str2, Application application, int i) {
    }

    public void afterMainActivityOnCreate(Activity activity) {
    }

    public void afterMainApplicationAttach(Application application, Context context) {
    }

    public void beforeApplicationOnCreate(String str, String str2, Application application, int i) {
    }

    public void beforeCreateApplication(String str, String str2, Context context, int i) {
    }

    public void beforeMainActivityOnCreate(Activity activity) {
    }

    public void beforeMainApplicationAttach(Application application, Context context) {
    }

    public void beforeMainLaunchApk(String str, int i) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
