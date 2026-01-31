package black.android.content.p008pm;

import android.content.pm.ActivityInfo;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser$Activity")
/* renamed from: black.android.content.pm.PackageParserActivityContext */
/* loaded from: classes.dex */
public interface PackageParserActivityContext {
    @BFieldCheckNotProcess
    Field _check_info();

    @BFieldSetNotProcess
    void _set_info(Object obj);

    @BFieldNotProcess
    ActivityInfo info();
}
