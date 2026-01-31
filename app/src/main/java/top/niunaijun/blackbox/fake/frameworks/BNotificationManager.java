package top.niunaijun.blackbox.fake.frameworks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.system.ServiceManager;
import top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService;
/* loaded from: classes3.dex */
public class BNotificationManager extends BlackManager<IBNotificationManagerService> {
    private static final BNotificationManager sNotificationManager = new BNotificationManager();

    public static BNotificationManager get() {
        return sNotificationManager;
    }

    public void cancelNotificationWithTag(int i, String str) {
        try {
            getService().cancelNotificationWithTag(i, str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        try {
            getService().createNotificationChannel(notificationChannel, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        try {
            getService().createNotificationChannelGroup(notificationChannelGroup, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void deleteNotificationChannel(String str) {
        try {
            getService().deleteNotificationChannel(str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        try {
            getService().deleteNotificationChannelGroup(str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void enqueueNotificationWithTag(int i, String str, Notification notification) {
        try {
            getService().enqueueNotificationWithTag(i, str, notification, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public NotificationChannel getNotificationChannel(String str) {
        try {
            return getService().getNotificationChannel(str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups(String str) {
        try {
            return getService().getNotificationChannelGroups(str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<NotificationChannel> getNotificationChannels(String str) {
        try {
            return getService().getNotificationChannels(str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    @Override // top.niunaijun.blackbox.fake.frameworks.BlackManager
    public String getServiceName() {
        return ServiceManager.NOTIFICATION_MANAGER;
    }
}
