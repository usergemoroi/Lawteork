package black.android.security.net.config;

import android.content.Context;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.security.net.config.NetworkSecurityConfigProvider")
/* loaded from: classes.dex */
public interface NetworkSecurityConfigProvider {
    @BStaticMethod
    void install(Context context);
}
