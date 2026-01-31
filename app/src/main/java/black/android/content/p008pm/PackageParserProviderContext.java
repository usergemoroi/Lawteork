package black.android.content.p008pm;

import android.content.pm.ProviderInfo;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser$Provider")
/* renamed from: black.android.content.pm.PackageParserProviderContext */
/* loaded from: classes.dex */
public interface PackageParserProviderContext {
    @BFieldCheckNotProcess
    Field _check_info();

    @BFieldSetNotProcess
    void _set_info(Object obj);

    @BFieldNotProcess
    ProviderInfo info();
}
