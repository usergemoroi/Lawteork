package top.niunaijun.blackbox.proxy.record;

import android.content.Intent;
/* loaded from: classes3.dex */
public class ProxyBroadcastRecord {
    public Intent mIntent;
    public int mUserId;

    public ProxyBroadcastRecord(Intent intent, int i) {
        this.mIntent = intent;
        this.mUserId = i;
    }

    public static ProxyBroadcastRecord create(Intent intent) {
        return new ProxyBroadcastRecord((Intent) intent.getParcelableExtra("_B_|_target_"), intent.getIntExtra("_B_|_user_id_", 0));
    }

    public static void saveStub(Intent intent, Intent intent2, int i) {
        intent.putExtra("_B_|_target_", intent2);
        intent.putExtra("_B_|_user_id_", i);
    }

    public String toString() {
        return "ProxyBroadcastRecord{mIntent=" + this.mIntent + ", mUserId=" + this.mUserId + '}';
    }
}
