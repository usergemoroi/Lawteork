package black.android.app;

import java.lang.reflect.Field;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.NotificationChannelGroup")
/* loaded from: classes.dex */
public interface NotificationChannelGroupContext {
    @BFieldCheckNotProcess
    Field _check_mChannels();

    @BFieldCheckNotProcess
    Field _check_mId();

    @BFieldSetNotProcess
    void _set_mChannels(Object obj);

    @BFieldSetNotProcess
    void _set_mId(Object obj);

    @BFieldNotProcess
    List<android.app.NotificationChannel> mChannels();

    @BFieldNotProcess
    String mId();
}
