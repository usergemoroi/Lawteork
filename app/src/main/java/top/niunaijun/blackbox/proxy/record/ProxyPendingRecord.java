package top.niunaijun.blackbox.proxy.record;

import android.content.Intent;
/* loaded from: classes3.dex */
public class ProxyPendingRecord {
    public Intent mTarget;
    public int mUserId;

    public ProxyPendingRecord(Intent intent, int i) {
        this.mUserId = i;
        this.mTarget = intent;
    }

    public static ProxyPendingRecord create(Intent intent) {
        return new ProxyPendingRecord((Intent) intent.getParcelableExtra("_B_|_P_target_"), intent.getIntExtra("_B_|_P_user_id_", 0));
    }

    public static void saveStub(Intent intent, Intent intent2, int i) {
        intent.putExtra("_B_|_P_user_id_", i);
        intent.putExtra("_B_|_P_target_", intent2);
    }

    public String toString() {
        return "ProxyPendingActivityRecord{mUserId=" + this.mUserId + ", mTarget=" + this.mTarget + '}';
    }
}
