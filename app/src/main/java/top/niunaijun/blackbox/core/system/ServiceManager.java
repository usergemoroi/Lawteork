package top.niunaijun.blackbox.core.system;

import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.accounts.BAccountManagerService;
import top.niunaijun.blackbox.core.system.location.BLocationManagerService;
import top.niunaijun.blackbox.core.system.notification.BNotificationManagerService;
import top.niunaijun.blackbox.core.system.p025am.BActivityManagerService;
import top.niunaijun.blackbox.core.system.p025am.BJobManagerService;
import top.niunaijun.blackbox.core.system.p026os.BStorageManagerService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.core.system.user.BUserManagerService;
/* loaded from: classes3.dex */
public class ServiceManager {
    public static final String ACCOUNT_MANAGER = "account_manager";
    public static final String ACTIVITY_MANAGER = "activity_manager";
    public static final String JOB_MANAGER = "job_manager";
    public static final String LOCATION_MANAGER = "location_manager";
    public static final String NOTIFICATION_MANAGER = "notification_manager";
    public static final String PACKAGE_MANAGER = "package_manager";
    public static final String STORAGE_MANAGER = "storage_manager";
    public static final String USER_MANAGER = "user_manager";
    private static ServiceManager sServiceManager;
    private final Map<String, IBinder> mCaches;

    private ServiceManager() {
        HashMap hashMap = new HashMap();
        this.mCaches = hashMap;
        hashMap.put(ACTIVITY_MANAGER, BActivityManagerService.get());
        hashMap.put(JOB_MANAGER, BJobManagerService.get());
        hashMap.put(PACKAGE_MANAGER, BPackageManagerService.get());
        hashMap.put(STORAGE_MANAGER, BStorageManagerService.get());
        hashMap.put(USER_MANAGER, BUserManagerService.get());
        hashMap.put(ACCOUNT_MANAGER, BAccountManagerService.get());
        hashMap.put(LOCATION_MANAGER, BLocationManagerService.get());
        hashMap.put(NOTIFICATION_MANAGER, BNotificationManagerService.get());
    }

    public static ServiceManager get() {
        if (sServiceManager == null) {
            synchronized (ServiceManager.class) {
                if (sServiceManager == null) {
                    sServiceManager = new ServiceManager();
                }
            }
        }
        return sServiceManager;
    }

    public static IBinder getService(String str) {
        return get().getServiceInternal(str);
    }

    public static void initBlackManager() {
        BlackBoxCore.get().getService(ACTIVITY_MANAGER);
        BlackBoxCore.get().getService(JOB_MANAGER);
        BlackBoxCore.get().getService(PACKAGE_MANAGER);
        BlackBoxCore.get().getService(STORAGE_MANAGER);
        BlackBoxCore.get().getService(USER_MANAGER);
        BlackBoxCore.get().getService(ACCOUNT_MANAGER);
        BlackBoxCore.get().getService(LOCATION_MANAGER);
        BlackBoxCore.get().getService(NOTIFICATION_MANAGER);
    }

    public IBinder getServiceInternal(String str) {
        return this.mCaches.get(str);
    }
}
