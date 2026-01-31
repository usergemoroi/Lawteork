package black.android.providers;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.provider.Settings$NameValueCache")
/* loaded from: classes.dex */
public interface SettingsNameValueCacheContext {
    @BFieldCheckNotProcess
    Field _check_mContentProvider();

    @BFieldSetNotProcess
    void _set_mContentProvider(Object obj);

    @BFieldNotProcess
    Object mContentProvider();
}
