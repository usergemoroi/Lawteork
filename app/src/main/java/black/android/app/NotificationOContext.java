package black.android.app;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.Notification")
/* loaded from: classes.dex */
public interface NotificationOContext {
    @BFieldCheckNotProcess
    Field _check_mChannelId();

    @BFieldCheckNotProcess
    Field _check_mGroupKey();

    @BFieldSetNotProcess
    void _set_mChannelId(Object obj);

    @BFieldSetNotProcess
    void _set_mGroupKey(Object obj);

    @BFieldNotProcess
    String mChannelId();

    @BFieldNotProcess
    String mGroupKey();
}
