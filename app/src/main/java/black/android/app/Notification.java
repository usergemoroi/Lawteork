package black.android.app;

import android.app.PendingIntent;
import android.content.Context;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.app.Notification")
/* loaded from: classes.dex */
public interface Notification {
    @BMethod
    void setLatestEventInfo(Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent);
}
