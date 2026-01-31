package black.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ActivityThread$ProviderClientRecord")
/* loaded from: classes.dex */
public interface ActivityThreadProviderClientRecordJBContext {
    @BFieldCheckNotProcess
    Field _check_mHolder();

    @BFieldCheckNotProcess
    Field _check_mProvider();

    @BFieldSetNotProcess
    void _set_mHolder(Object obj);

    @BFieldSetNotProcess
    void _set_mProvider(Object obj);

    @BFieldNotProcess
    Object mHolder();

    @BFieldNotProcess
    IInterface mProvider();
}
