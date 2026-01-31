package top.niunaijun.blackbox.core.system.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import androidx.core.internal.view.SupportMenu;
import top.niunaijun.blackbox.BlackBoxCore;
/* loaded from: classes3.dex */
public class NotificationChannelManager {
    public static NotificationChannel APP_CHANNEL;
    private static final NotificationChannelManager sManager = new NotificationChannelManager();

    public NotificationChannelManager() {
        if (Build.VERSION.SDK_INT >= 26) {
            registerAppChannel();
        }
    }

    public static NotificationChannelManager get() {
        return sManager;
    }

    private void registerAppChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(BlackBoxCore.getContext().getPackageName(), "black-box-app", 4);
        APP_CHANNEL = notificationChannel;
        notificationChannel.enableLights(true);
        APP_CHANNEL.setLightColor(SupportMenu.CATEGORY_MASK);
        APP_CHANNEL.setShowBadge(true);
        APP_CHANNEL.setLockscreenVisibility(1);
        ((NotificationManager) BlackBoxCore.getContext().getSystemService("notification")).createNotificationChannel(APP_CHANNEL);
    }
}
