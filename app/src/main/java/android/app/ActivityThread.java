package android.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.os.Handler;
import android.os.IBinder;
import android.util.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class ActivityThread {
    public Map<IBinder, ActivityClientRecord> mActivities;
    public AppBindData mBoundApplication;

    /* renamed from: mH */
    public HandlerC0003H f2mH = null;
    public Application mInitialApplication;
    public Instrumentation mInstrumentation;
    public Map<String, WeakReference<?>> mPackages;
    public ArrayMap<ProviderKey, Object> mProviderMap;

    /* loaded from: classes.dex */
    public static final class ActivityClientRecord {
        public Activity activity;
        public ActivityInfo activityInfo;
        public Intent intent;
        public IBinder token;
    }

    /* loaded from: classes.dex */
    public static final class AppBindData {
    }

    /* renamed from: android.app.ActivityThread$H */
    /* loaded from: classes.dex */
    public static class HandlerC0003H extends Handler {
    }

    /* loaded from: classes.dex */
    public static final class ProviderKey {
        public final String authority;
        public final int userId;

        public ProviderKey(String str, int i) {
            this.authority = str;
            this.userId = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ProviderKey) {
                ProviderKey providerKey = (ProviderKey) obj;
                return Objects.equals(this.authority, providerKey.authority) && this.userId == providerKey.userId;
            }
            return false;
        }

        public int hashCode() {
            String str = this.authority;
            return (str != null ? str.hashCode() : 0) ^ this.userId;
        }
    }

    public static ActivityThread currentActivityThread() {
        throw new RuntimeException();
    }

    public Handler getHandler() {
        throw new RuntimeException();
    }

    public String getProcessName() {
        throw new RuntimeException();
    }

    public ContentProviderHolder installProvider(Context context, ContentProviderHolder contentProviderHolder, ProviderInfo providerInfo, boolean z, boolean z2, boolean z3) {
        throw new RuntimeException();
    }
}
