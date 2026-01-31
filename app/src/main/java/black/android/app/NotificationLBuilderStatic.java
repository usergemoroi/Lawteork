package black.android.app;

import android.content.Context;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.Notification$Builder")
/* loaded from: classes.dex */
public interface NotificationLBuilderStatic {
    @BMethodCheckNotProcess
    Method _check_rebuild(Context context, android.app.Notification notification);

    android.app.Notification rebuild(Context context, android.app.Notification notification);
}
