package top.niunaijun.blackbox.proxy.record;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import top.niunaijun.blackbox.utils.compat.BundleCompat;
/* loaded from: classes3.dex */
public class ProxyServiceRecord {
    public ServiceInfo mServiceInfo;
    public Intent mServiceIntent;
    public int mStartId;
    public IBinder mToken;
    public int mUserId;

    public ProxyServiceRecord(Intent intent, ServiceInfo serviceInfo, IBinder iBinder, int i, int i2) {
        this.mServiceIntent = intent;
        this.mServiceInfo = serviceInfo;
        this.mUserId = i;
        this.mStartId = i2;
        this.mToken = iBinder;
    }

    public static ProxyServiceRecord create(Intent intent) {
        return new ProxyServiceRecord((Intent) intent.getParcelableExtra("_B_|_target_"), (ServiceInfo) intent.getParcelableExtra("_B_|_service_info_"), BundleCompat.getBinder(intent, "_B_|_token_"), intent.getIntExtra("_B_|_user_id_", 0), intent.getIntExtra("_B_|_start_id_", 0));
    }

    public static void saveStub(Intent intent, Intent intent2, ServiceInfo serviceInfo, IBinder iBinder, int i, int i2) {
        intent.putExtra("_B_|_target_", intent2);
        intent.putExtra("_B_|_service_info_", serviceInfo);
        intent.putExtra("_B_|_user_id_", i);
        intent.putExtra("_B_|_start_id_", i2);
        BundleCompat.putBinder(intent, "_B_|_token_", iBinder);
    }
}
