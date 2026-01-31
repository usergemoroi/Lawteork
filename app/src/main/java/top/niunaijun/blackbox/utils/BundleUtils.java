package top.niunaijun.blackbox.utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes3.dex */
public class BundleUtils {
    public static IBinder getBinder(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        if (bundleExtra != null) {
            return bundleExtra.getBinder("binder");
        }
        return null;
    }

    public static void putBinder(Intent intent, String str, IBinder iBinder) {
        Bundle bundle = new Bundle();
        bundle.putBinder("binder", iBinder);
        intent.putExtra(str, bundle);
    }
}
