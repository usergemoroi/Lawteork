package top.niunaijun.blackbox.utils.compat;

import android.content.Context;
import android.content.ContextWrapper;
import black.android.app.ContextImplKitkatContext;
import black.android.content.AttributionSourceStateContext;
import black.android.content.ContentResolverContext;
import p007b.AbstractC0568d;
import p013c.AbstractC0573a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ContextCompat {
    public static final String TAG = "ContextCompat";

    public static void fix(Context context) {
        int i = 0;
        do {
            try {
                if (!(context instanceof ContextWrapper)) {
                    AbstractC0568d.m163a(context)._set_mPackageManager(null);
                    context.getPackageManager();
                    AbstractC0568d.m163a(context)._set_mBasePackageName(BlackBoxCore.getHostPkg());
                    ((ContextImplKitkatContext) BlackReflection.create(ContextImplKitkatContext.class, context, false))._set_mOpPackageName(BlackBoxCore.getHostPkg());
                    ((ContentResolverContext) BlackReflection.create(ContentResolverContext.class, context.getContentResolver(), false))._set_mPackageName(BlackBoxCore.getHostPkg());
                    if (BuildCompat.isS()) {
                        fixAttributionSourceState(AbstractC0568d.m163a(context).getAttributionSource(), BActivityThread.getBUid());
                        return;
                    }
                    return;
                }
                context = ((ContextWrapper) context).getBaseContext();
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } while (i < 10);
    }

    public static void fixAttributionSourceState(Object obj, int i) {
        if (obj == null || AbstractC0573a.m151a(obj)._check_mAttributionSourceState() == null) {
            return;
        }
        AttributionSourceStateContext attributionSourceStateContext = (AttributionSourceStateContext) BlackReflection.create(AttributionSourceStateContext.class, AbstractC0573a.m151a(obj).mAttributionSourceState(), false);
        attributionSourceStateContext._set_packageName(BlackBoxCore.getHostPkg());
        attributionSourceStateContext._set_uid(Integer.valueOf(i));
        fixAttributionSourceState(AbstractC0573a.m151a(obj).getNext(), i);
    }

    public static void fixAttributionSourceState(Object obj, int i, int i2) {
        if (obj == null || AbstractC0573a.m151a(obj)._check_mAttributionSourceState() == null) {
            AttributionSourceStateContext attributionSourceStateContext = (AttributionSourceStateContext) BlackReflection.create(AttributionSourceStateContext.class, AbstractC0573a.m151a(obj).mAttributionSourceState(), false);
            attributionSourceStateContext._set_packageName(BlackBoxCore.getHostPkg());
            attributionSourceStateContext._set_uid(Integer.valueOf(i));
            attributionSourceStateContext._set_pid(Integer.valueOf(i2));
            fixAttributionSourceState(AbstractC0573a.m151a(obj).getNext(), i, i2);
        }
    }
}
