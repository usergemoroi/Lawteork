package top.niunaijun.blackbox.core.system.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.Binder;
import black.android.app.NotificationChannelContext;
import black.android.app.NotificationChannelGroupContext;
import black.android.app.NotificationOContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.BProcessManagerService;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.ProcessRecord;
import top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class BNotificationManagerService extends IBNotificationManagerService.Stub implements ISystemService {
    public static final String CHANNEL_BLACK = "@black-";
    public static final String GROUP_BLACK = "@black-group-";
    private static final BNotificationManagerService sService = new BNotificationManagerService();
    private NotificationChannelManager mNotificationChannelManager;
    private final Map<String, NotificationRecord> mNotificationRecords = new HashMap();
    private final NotificationManager mRealNotificationManager = (NotificationManager) BlackBoxCore.getContext().getSystemService("notification");

    public static BNotificationManagerService get() {
        return sService;
    }

    private String getBlackChannelId(String str, int i) {
        return (str == null || str.contains(CHANNEL_BLACK)) ? str : str + CHANNEL_BLACK + i;
    }

    private String getBlackGroupId(String str, int i) {
        return (str == null || str.contains(GROUP_BLACK)) ? str : str + GROUP_BLACK + i;
    }

    public static int getNotificationId(int i, int i2, String str) {
        return (str + i + i2).hashCode();
    }

    private NotificationRecord getNotificationRecord(String str, int i) {
        NotificationRecord notificationRecord;
        String str2 = str + "-" + i;
        synchronized (this.mNotificationRecords) {
            notificationRecord = this.mNotificationRecords.get(str2);
            if (notificationRecord == null) {
                notificationRecord = new NotificationRecord();
                this.mNotificationRecords.put(str2, notificationRecord);
            }
        }
        return notificationRecord;
    }

    private String getRealChannelId(String str) {
        return (str == null || !str.contains(CHANNEL_BLACK)) ? str : str.split(CHANNEL_BLACK)[0];
    }

    private String getRealGroupId(String str) {
        return (str == null || !str.contains(GROUP_BLACK)) ? str : str.split(GROUP_BLACK)[0];
    }

    private void handleNotificationChannel(NotificationChannel notificationChannel, int i) {
        NotificationChannelContext notificationChannelContext = (NotificationChannelContext) BlackReflection.create(NotificationChannelContext.class, notificationChannel, false);
        notificationChannelContext._set_mId(getBlackChannelId(notificationChannelContext.mId(), i));
        notificationChannel.setGroup(getBlackGroupId(notificationChannel.getGroup(), i));
    }

    private void handleNotificationGroup(NotificationChannelGroup notificationChannelGroup, int i) {
        NotificationChannelGroupContext notificationChannelGroupContext = (NotificationChannelGroupContext) BlackReflection.create(NotificationChannelGroupContext.class, notificationChannelGroup, false);
        notificationChannelGroupContext._set_mId(getBlackGroupId(notificationChannelGroupContext.mId(), i));
        List<NotificationChannel> mChannels = notificationChannelGroupContext.mChannels();
        if (mChannels != null) {
            for (NotificationChannel notificationChannel : mChannels) {
                createNotificationChannel(notificationChannel, i);
            }
        }
    }

    private void removeNotificationRecord(String str, int i) {
        String str2 = str + "-" + i;
        synchronized (this.mNotificationRecords) {
            this.mNotificationRecords.remove(str2);
        }
    }

    private void resetNotificationChannel(NotificationChannel notificationChannel) {
        NotificationChannelContext notificationChannelContext = (NotificationChannelContext) BlackReflection.create(NotificationChannelContext.class, notificationChannel, false);
        notificationChannelContext._set_mId(getRealChannelId(notificationChannelContext.mId()));
    }

    private void resetNotificationGroup(NotificationChannelGroup notificationChannelGroup) {
        NotificationChannelGroupContext notificationChannelGroupContext = (NotificationChannelGroupContext) BlackReflection.create(NotificationChannelGroupContext.class, notificationChannelGroup, false);
        notificationChannelGroupContext._set_mId(getRealGroupId(notificationChannelGroupContext.mId()));
        List<NotificationChannel> mChannels = notificationChannelGroupContext.mChannels();
        if (mChannels != null) {
            for (NotificationChannel notificationChannel : mChannels) {
                resetNotificationChannel(notificationChannel);
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public void cancelNotificationWithTag(int i, String str, int i2) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        int notificationId = getNotificationId(i2, i, findProcessByPid.getPackageName());
        this.mRealNotificationManager.cancel(notificationId);
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i2);
        synchronized (notificationRecord.mIds) {
            notificationRecord.mIds.remove(Integer.valueOf(notificationId));
        }
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public void createNotificationChannel(NotificationChannel notificationChannel, int i) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        handleNotificationChannel(notificationChannel, i);
        this.mRealNotificationManager.createNotificationChannel(notificationChannel);
        resetNotificationChannel(notificationChannel);
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannels) {
            notificationRecord.mNotificationChannels.put(notificationChannel.getId(), notificationChannel);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup, int i) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        handleNotificationGroup(notificationChannelGroup, i);
        this.mRealNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        resetNotificationGroup(notificationChannelGroup);
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannelGroups) {
            notificationRecord.mNotificationChannelGroups.put(notificationChannelGroup.getId(), notificationChannelGroup);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public void deleteNotificationChannel(String str, int i) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannels) {
            NotificationChannel remove = notificationRecord.mNotificationChannels.remove(str);
            if (remove != null) {
                this.mRealNotificationManager.deleteNotificationChannel(getBlackChannelId(remove.getId(), i));
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public void deleteNotificationChannelGroup(String str, int i) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannelGroups) {
            NotificationChannelGroup remove = notificationRecord.mNotificationChannelGroups.remove(str);
            if (remove != null) {
                this.mRealNotificationManager.deleteNotificationChannelGroup(getBlackGroupId(remove.getId(), i));
            }
        }
    }

    public void deletePackageNotification(String str, int i) {
        NotificationRecord notificationRecord = getNotificationRecord(str, i);
        if (BuildCompat.isOreo()) {
            for (NotificationChannelGroup notificationChannelGroup : notificationRecord.mNotificationChannelGroups.values()) {
                this.mRealNotificationManager.deleteNotificationChannelGroup(getBlackGroupId(notificationChannelGroup.getId(), i));
            }
            for (NotificationChannel notificationChannel : notificationRecord.mNotificationChannels.values()) {
                this.mRealNotificationManager.deleteNotificationChannel(getBlackChannelId(notificationChannel.getId(), i));
            }
        }
        for (Integer num : notificationRecord.mIds) {
            this.mRealNotificationManager.cancel(num.intValue());
        }
        removeNotificationRecord(str, i);
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public void enqueueNotificationWithTag(int i, String str, Notification notification, int i2) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        int notificationId = getNotificationId(i2, i, findProcessByPid.getPackageName());
        if (BuildCompat.isOreo()) {
            NotificationOContext notificationOContext = (NotificationOContext) BlackReflection.create(NotificationOContext.class, notification, false);
            if (notificationOContext._check_mChannelId() != null) {
                notificationOContext._set_mChannelId(getBlackChannelId(notificationOContext.mChannelId(), i2));
            }
            if (notificationOContext._check_mGroupKey() != null) {
                notificationOContext._set_mGroupKey(getBlackGroupId(notificationOContext.mGroupKey(), i2));
            }
        }
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i2);
        synchronized (notificationRecord.mIds) {
            notificationRecord.mIds.add(Integer.valueOf(notificationId));
        }
        this.mRealNotificationManager.notify(notificationId, notification);
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public NotificationChannel getNotificationChannel(String str, int i) {
        NotificationChannel notificationChannel;
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return null;
        }
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannels) {
            notificationChannel = notificationRecord.mNotificationChannels.get(str);
        }
        return notificationChannel;
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public List<NotificationChannelGroup> getNotificationChannelGroups(String str, int i) {
        ArrayList arrayList;
        NotificationRecord notificationRecord = getNotificationRecord(str, i);
        synchronized (notificationRecord.mNotificationChannelGroups) {
            arrayList = new ArrayList(notificationRecord.mNotificationChannelGroups.values());
        }
        return arrayList;
    }

    @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
    public List<NotificationChannel> getNotificationChannels(String str, int i) {
        ArrayList arrayList;
        NotificationRecord notificationRecord = getNotificationRecord(str, i);
        synchronized (notificationRecord.mNotificationChannels) {
            arrayList = new ArrayList(notificationRecord.mNotificationChannels.values());
        }
        return arrayList;
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
        this.mNotificationChannelManager = NotificationChannelManager.get();
    }
}
