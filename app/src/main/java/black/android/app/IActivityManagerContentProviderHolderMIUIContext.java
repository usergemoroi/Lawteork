package black.android.app;

import android.content.pm.ProviderInfo;
import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.IActivityManager$ContentProviderHolder")
/* loaded from: classes.dex */
public interface IActivityManagerContentProviderHolderMIUIContext {
    @BFieldCheckNotProcess
    Field _check_info();

    @BFieldCheckNotProcess
    Field _check_noReleaseNeeded();

    @BFieldCheckNotProcess
    Field _check_provider();

    @BFieldCheckNotProcess
    Field _check_waitProcessStart();

    @BFieldSetNotProcess
    void _set_info(Object obj);

    @BFieldSetNotProcess
    void _set_noReleaseNeeded(Object obj);

    @BFieldSetNotProcess
    void _set_provider(Object obj);

    @BFieldSetNotProcess
    void _set_waitProcessStart(Object obj);

    @BFieldNotProcess
    ProviderInfo info();

    @BFieldNotProcess
    Boolean noReleaseNeeded();

    @BFieldNotProcess
    IInterface provider();

    @BFieldNotProcess
    Boolean waitProcessStart();
}
