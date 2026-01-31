package black.android.content.p008pm;

import android.content.pm.PermissionGroupInfo;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser$PermissionGroup")
/* renamed from: black.android.content.pm.PackageParserPermissionGroupContext */
/* loaded from: classes.dex */
public interface PackageParserPermissionGroupContext {
    @BFieldCheckNotProcess
    Field _check_info();

    @BFieldSetNotProcess
    void _set_info(Object obj);

    @BFieldNotProcess
    PermissionGroupInfo info();
}
