package black.android.webkit;

import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.webkit.IWebViewUpdateService")
/* loaded from: classes.dex */
public interface IWebViewUpdateServiceContext {
    @BMethodCheckNotProcess
    Method _check_getCurrentWebViewPackageName();

    @BMethodCheckNotProcess
    Method _check_waitForAndGetProvider();

    String getCurrentWebViewPackageName();

    Object waitForAndGetProvider();
}
