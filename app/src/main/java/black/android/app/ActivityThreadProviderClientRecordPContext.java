package black.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ActivityThread$ProviderClientRecord")
/* loaded from: classes.dex */
public interface ActivityThreadProviderClientRecordPContext {
    @BFieldCheckNotProcess
    Field _check_mNames();

    @BFieldCheckNotProcess
    Field _check_mProvider();

    @BFieldSetNotProcess
    void _set_mNames(Object obj);

    @BFieldSetNotProcess
    void _set_mProvider(Object obj);

    @BFieldNotProcess
    String[] mNames();

    @BFieldNotProcess
    IInterface mProvider();
}
