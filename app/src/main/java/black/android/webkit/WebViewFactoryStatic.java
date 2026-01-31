package black.android.webkit;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.webkit.WebViewFactory")
/* loaded from: classes.dex */
public interface WebViewFactoryStatic {
    @BMethodCheckNotProcess
    Method _check_getUpdateService();

    @BFieldCheckNotProcess
    Field _check_sWebViewSupported();

    @BFieldSetNotProcess
    void _set_sWebViewSupported(Object obj);

    Object getUpdateService();

    @BFieldNotProcess
    Boolean sWebViewSupported();
}
