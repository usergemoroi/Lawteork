package top.niunaijun.blackbox.core.system;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
/* loaded from: classes3.dex */
public class DaemonService extends Service {
    private static final int NOTIFY_ID = BlackBoxCore.getHostPkg().hashCode();
    public static final String TAG = "DaemonService";

    /* loaded from: classes3.dex */
    public static class DaemonInnerService extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            Log.i(DaemonService.TAG, "DaemonInnerService -> onCreate");
            super.onCreate();
        }

        @Override // android.app.Service
        public void onDestroy() {
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            Log.i(DaemonService.TAG, "DaemonInnerService -> onStartCommand");
            ((NotificationManager) getSystemService("notification")).cancel(DaemonService.NOTIFY_ID);
            stopSelf();
            return super.onStartCommand(intent, i, i2);
        }
    }

    private void showNotification() {
        startForeground(NOTIFY_ID, new NotificationCompat.Builder(getApplicationContext(), getPackageName() + ".blackbox_core").setPriority(2).build());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        FileUtils.deleteTmp(BlackBoxCore.getContext());
        Log.d(TAG, "onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        startService(new Intent(this, DaemonInnerService.class));
        if (BuildCompat.isOreo()) {
            showNotification();
            return 1;
        }
        return 1;
    }
}
