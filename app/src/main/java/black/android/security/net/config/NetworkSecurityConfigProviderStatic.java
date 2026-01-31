package black.android.security.net.config;

import android.content.Context;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.security.net.config.NetworkSecurityConfigProvider")
/* loaded from: classes.dex */
public interface NetworkSecurityConfigProviderStatic {
    @BMethodCheckNotProcess
    Method _check_install(Context context);

    Void install(Context context);
}
