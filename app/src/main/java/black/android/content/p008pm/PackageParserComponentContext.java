package black.android.content.p008pm;

import android.content.ComponentName;
import android.content.IntentFilter;
import java.lang.reflect.Field;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.PackageParser$Component")
/* renamed from: black.android.content.pm.PackageParserComponentContext */
/* loaded from: classes.dex */
public interface PackageParserComponentContext {
    @BFieldCheckNotProcess
    Field _check_className();

    @BFieldCheckNotProcess
    Field _check_componentName();

    @BFieldCheckNotProcess
    Field _check_intents();

    @BFieldSetNotProcess
    void _set_className(Object obj);

    @BFieldSetNotProcess
    void _set_componentName(Object obj);

    @BFieldSetNotProcess
    void _set_intents(Object obj);

    @BFieldNotProcess
    String className();

    @BFieldNotProcess
    ComponentName componentName();

    @BFieldNotProcess
    List<IntentFilter> intents();
}
