package black.android.app;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.NotificationChannel")
/* loaded from: classes.dex */
public interface NotificationChannelContext {
    @BFieldCheckNotProcess
    Field _check_mId();

    @BFieldSetNotProcess
    void _set_mId(Object obj);

    @BFieldNotProcess
    String mId();
}
