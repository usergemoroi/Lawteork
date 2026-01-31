package black.android.app;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
@BClassNameNotProcess("android.app.SharedPreferencesImpl")
/* loaded from: classes.dex */
public interface SharedPreferencesImplStatic {
    @BConstructorNotProcess
    SharedPreferencesImpl _new(File file, int i);
}
