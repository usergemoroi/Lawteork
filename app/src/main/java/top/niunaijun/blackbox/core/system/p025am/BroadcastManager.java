package top.niunaijun.blackbox.core.system.p025am;

import android.content.BroadcastReceiver;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.p027pm.BPackage;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageSettings;
import top.niunaijun.blackbox.core.system.p027pm.PackageMonitor;
import top.niunaijun.blackbox.entity.p028am.PendingResultData;
import top.niunaijun.blackbox.proxy.ProxyBroadcastReceiver;
import top.niunaijun.blackbox.utils.Slog;
/* renamed from: top.niunaijun.blackbox.core.system.am.BroadcastManager */
/* loaded from: classes3.dex */
public class BroadcastManager implements PackageMonitor {
    public static final int MSG_TIME_OUT = 1;
    public static final String TAG = "BroadcastManager";
    public static final int TIMEOUT = 9000;
    private static BroadcastManager sBroadcastManager;
    private final BActivityManagerService mAms;
    private final BPackageManagerService mPms;
    private final Map<String, List<BroadcastReceiver>> mReceivers = new HashMap();
    private final Map<String, PendingResultData> mReceiversData = new HashMap();
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: top.niunaijun.blackbox.core.system.am.BroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                PendingResultData pendingResultData = (PendingResultData) message.obj;
                pendingResultData.build().finish();
                Slog.m20d(BroadcastManager.TAG, "Timeout Receiver: " + pendingResultData);
            } catch (Throwable th) {
            }
        }
    };

    public BroadcastManager(BActivityManagerService bActivityManagerService, BPackageManagerService bPackageManagerService) {
        this.mAms = bActivityManagerService;
        this.mPms = bPackageManagerService;
    }

    private void addReceiver(String str, BroadcastReceiver broadcastReceiver) {
        List<BroadcastReceiver> list = this.mReceivers.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.mReceivers.put(str, list);
        }
        list.add(broadcastReceiver);
    }

    private void registerPackage(BPackage bPackage) {
        synchronized (this.mReceivers) {
            Slog.m20d(TAG, "register: " + bPackage.packageName + ", size: " + bPackage.receivers.size());
            Iterator<BPackage.Activity> it = bPackage.receivers.iterator();
            while (it.hasNext()) {
                for (BPackage.ActivityIntentInfo activityIntentInfo : it.next().intents) {
                    ProxyBroadcastReceiver proxyBroadcastReceiver = new ProxyBroadcastReceiver();
                    if (Build.VERSION.SDK_INT >= 26) {
                        BlackBoxCore.getContext().registerReceiver(proxyBroadcastReceiver, activityIntentInfo.intentFilter, 2);
                    } else {
                        BlackBoxCore.getContext().registerReceiver(proxyBroadcastReceiver, activityIntentInfo.intentFilter);
                    }
                    addReceiver(bPackage.packageName, proxyBroadcastReceiver);
                }
            }
        }
    }

    public static BroadcastManager startSystem(BActivityManagerService bActivityManagerService, BPackageManagerService bPackageManagerService) {
        if (sBroadcastManager == null) {
            synchronized (BroadcastManager.class) {
                if (sBroadcastManager == null) {
                    sBroadcastManager = new BroadcastManager(bActivityManagerService, bPackageManagerService);
                }
            }
        }
        return sBroadcastManager;
    }

    public void finishBroadcast(PendingResultData pendingResultData) {
        synchronized (this.mReceiversData) {
            this.mHandler.removeMessages(1, this.mReceiversData.get(pendingResultData.mBToken));
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.PackageMonitor
    public void onPackageInstalled(String str, int i) {
        synchronized (this.mReceivers) {
            this.mReceivers.remove(str);
            BPackageSettings bPackageSetting = this.mPms.getBPackageSetting(str);
            if (bPackageSetting != null) {
                registerPackage(bPackageSetting.pkg);
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.PackageMonitor
    public void onPackageUninstalled(String str, boolean z, int i) {
        if (z) {
            synchronized (this.mReceivers) {
                List<BroadcastReceiver> list = this.mReceivers.get(str);
                if (list != null) {
                    Slog.m20d(TAG, "unregisterReceiver Package: " + str + ", size: " + list.size());
                    for (BroadcastReceiver broadcastReceiver : list) {
                        try {
                            BlackBoxCore.getContext().unregisterReceiver(broadcastReceiver);
                        } catch (Throwable th) {
                        }
                    }
                }
                this.mReceivers.remove(str);
            }
        }
    }

    public void sendBroadcast(PendingResultData pendingResultData) {
        synchronized (this.mReceiversData) {
            this.mReceiversData.put(pendingResultData.mBToken, pendingResultData);
            this.mHandler.sendMessageDelayed(Message.obtain(this.mHandler, 1, pendingResultData), 9000L);
        }
    }

    public void startup() {
        this.mPms.addPackageMonitor(this);
        for (BPackageSettings bPackageSettings : this.mPms.getBPackageSettings()) {
            registerPackage(bPackageSettings.pkg);
        }
    }
}
