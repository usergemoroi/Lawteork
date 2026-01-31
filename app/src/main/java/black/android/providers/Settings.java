package black.android.providers;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BStaticField;
@BClassName("android.provider.Settings")
/* loaded from: classes.dex */
public interface Settings {

    @BClassName("android.provider.Settings$ContentProviderHolder")
    /* loaded from: classes.dex */
    public interface ContentProviderHolder {
        @BField
        IInterface mContentProvider();
    }

    @BClassName("android.provider.Settings$Global")
    /* loaded from: classes.dex */
    public interface Global {
        @BStaticField
        Object sNameValueCache();
    }

    @BClassName("android.provider.Settings$NameValueCache")
    /* loaded from: classes.dex */
    public interface NameValueCache {
        @BField
        Object mContentProvider();
    }

    @BClassName("android.provider.Settings$NameValueCache")
    /* loaded from: classes.dex */
    public interface NameValueCacheOreo {
        @BField
        Object mProviderHolder();
    }

    @BClassName("android.provider.Settings$Secure")
    /* loaded from: classes.dex */
    public interface Secure {
        @BStaticField
        Object sNameValueCache();
    }

    @BClassName("android.provider.Settings$System")
    /* loaded from: classes.dex */
    public interface System {
        @BStaticField
        Object sNameValueCache();
    }
}
