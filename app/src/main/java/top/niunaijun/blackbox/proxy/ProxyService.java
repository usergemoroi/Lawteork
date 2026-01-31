package top.niunaijun.blackbox.proxy;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.dispatcher.AppServiceDispatcher;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
/* loaded from: classes3.dex */
public class ProxyService extends Service {
    public static final String TAG = "StubService";

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P0 */
    /* loaded from: classes3.dex */
    public static class ServiceC1160P0 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P1 */
    /* loaded from: classes3.dex */
    public static class ServiceC1161P1 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P10 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P11 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P12 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P13 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P14 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P15 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P16 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P17 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P18 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P19 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P2 */
    /* loaded from: classes3.dex */
    public static class ServiceC1162P2 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P20 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P21 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P22 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P23 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P24 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P25 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P26 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P27 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P28 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P29 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P3 */
    /* loaded from: classes3.dex */
    public static class ServiceC1163P3 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P30 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P31 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P32 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P33 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P34 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P35 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P36 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P37 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P38 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P39 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P4 */
    /* loaded from: classes3.dex */
    public static class ServiceC1164P4 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P40 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P41 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P42 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P43 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P44 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P45 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P46 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P47 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P48 extends ProxyService {
    }

    /* loaded from: classes3.dex */
    public static class P49 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P5 */
    /* loaded from: classes3.dex */
    public static class ServiceC1165P5 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P6 */
    /* loaded from: classes3.dex */
    public static class ServiceC1166P6 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P7 */
    /* loaded from: classes3.dex */
    public static class ServiceC1167P7 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P8 */
    /* loaded from: classes3.dex */
    public static class ServiceC1168P8 extends ProxyService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyService$P9 */
    /* loaded from: classes3.dex */
    public static class ServiceC1169P9 extends ProxyService {
    }

    private void showNotification() {
        NotificationCompat.Builder priority = new NotificationCompat.Builder(getApplicationContext(), getPackageName() + ".blackbox_proxy").setPriority(2);
        if (BuildCompat.isOreo()) {
            startForeground(BlackBoxCore.getHostPkg().hashCode(), priority.build());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return AppServiceDispatcher.get().onBind(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AppServiceDispatcher.get().onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AppServiceDispatcher.get().onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        AppServiceDispatcher.get().onLowMemory();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        AppServiceDispatcher.get().onStartCommand(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        AppServiceDispatcher.get().onTrimMemory(i);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        AppServiceDispatcher.get().onUnbind(intent);
        return false;
    }
}
