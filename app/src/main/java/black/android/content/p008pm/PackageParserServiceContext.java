package black.android.content.p008pm;

import android.content.pm.ServiceInfo;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser$Service")
/* renamed from: black.android.content.pm.PackageParserServiceContext */
/* loaded from: classes.dex */
public interface PackageParserServiceContext {
    @BFieldCheckNotProcess
    Field _check_info();

    @BFieldSetNotProcess
    void _set_info(Object obj);

    @BFieldNotProcess
    ServiceInfo info();
}
