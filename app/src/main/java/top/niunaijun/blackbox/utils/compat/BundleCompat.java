package top.niunaijun.blackbox.utils.compat;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes3.dex */
public class BundleCompat {
    public static IBinder getBinder(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        try {
            Bundle bundleExtra = intent.getBundleExtra(str);
            if (bundleExtra != null) {
                bundleExtra.setClassLoader(BundleCompat.class.getClassLoader());
                return getBinder(bundleExtra, "binder");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static void putBinder(Intent intent, String str, IBinder iBinder) {
        if (intent == null) {
            return;
        }
        Bundle bundle = new Bundle();
        putBinder(bundle, "binder", iBinder);
        intent.putExtra(str, bundle);
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(BundleCompat.class.getClassLoader());
            return bundle.getBinder(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.setClassLoader(BundleCompat.class.getClassLoader());
            bundle.putBinder(str, iBinder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
