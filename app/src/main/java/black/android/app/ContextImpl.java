package black.android.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.app.ContextImpl")
/* loaded from: classes.dex */
public interface ContextImpl {
    @BStaticMethod
    Object createAppContext();

    @BMethod
    Object getAttributionSource();

    @BMethod
    Context getReceiverRestrictedContext();

    @BField
    String mBasePackageName();

    @BField
    ContentResolver mContentResolver();

    @BField
    Object mPackageInfo();

    @BField
    PackageManager mPackageManager();

    @BMethod
    void setOuterContext(Context context);
}
