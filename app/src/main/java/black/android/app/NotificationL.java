package black.android.app;

import android.content.Context;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.app.Notification")
/* loaded from: classes.dex */
public interface NotificationL {

    @BClassName("android.app.Notification$Builder")
    /* loaded from: classes.dex */
    public interface Builder {
        @BStaticMethod
        android.app.Notification rebuild(Context context, android.app.Notification notification);
    }
}
