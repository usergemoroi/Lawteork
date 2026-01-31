package black.android.providers;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.provider.Settings$System")
/* loaded from: classes.dex */
public interface SettingsSystemStatic {
    @BFieldCheckNotProcess
    Field _check_sNameValueCache();

    @BFieldSetNotProcess
    void _set_sNameValueCache(Object obj);

    @BFieldNotProcess
    Object sNameValueCache();
}
