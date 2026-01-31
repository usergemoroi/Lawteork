package black.android.content.p008pm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.content.pm.ApplicationInfo")
/* renamed from: black.android.content.pm.ApplicationInfoPContext */
/* loaded from: classes.dex */
public interface ApplicationInfoPContext {
    @BMethodCheckNotProcess
    Method _check_setHiddenApiEnforcementPolicy(int i);

    @BFieldCheckNotProcess
    Field _check_splitClassLoaderNames();

    @BFieldSetNotProcess
    void _set_splitClassLoaderNames(Object obj);

    Void setHiddenApiEnforcementPolicy(int i);

    @BFieldNotProcess
    String[] splitClassLoaderNames();
}
