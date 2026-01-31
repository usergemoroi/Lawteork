package black.android.webkit;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.webkit.WebViewFactory")
/* loaded from: classes.dex */
public interface WebViewFactory {
    @BStaticMethod
    Object getUpdateService();

    @BStaticField
    Boolean sWebViewSupported();
}
