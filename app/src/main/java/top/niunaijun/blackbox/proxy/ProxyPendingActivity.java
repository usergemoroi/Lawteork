package top.niunaijun.blackbox.proxy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.proxy.record.ProxyPendingRecord;
import top.niunaijun.blackbox.utils.Slog;
/* loaded from: classes3.dex */
public class ProxyPendingActivity extends Activity {
    public static final String TAG = "ProxyPendingActivity";

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P0 */
    /* loaded from: classes3.dex */
    public static class ActivityC1150P0 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P1 */
    /* loaded from: classes3.dex */
    public static class ActivityC1151P1 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P10 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P11 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P12 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P13 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P14 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P15 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P16 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P17 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P18 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P19 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P2 */
    /* loaded from: classes3.dex */
    public static class ActivityC1152P2 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P20 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P21 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P22 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P23 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P24 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P25 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P26 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P27 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P28 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P29 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P3 */
    /* loaded from: classes3.dex */
    public static class ActivityC1153P3 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P30 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P31 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P32 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P33 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P34 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P35 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P36 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P37 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P38 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P39 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P4 */
    /* loaded from: classes3.dex */
    public static class ActivityC1154P4 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P40 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P41 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P42 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P43 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P44 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P45 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P46 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P47 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P48 extends ProxyPendingActivity {
    }

    /* loaded from: classes3.dex */
    public static class P49 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P5 */
    /* loaded from: classes3.dex */
    public static class ActivityC1155P5 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P6 */
    /* loaded from: classes3.dex */
    public static class ActivityC1156P6 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P7 */
    /* loaded from: classes3.dex */
    public static class ActivityC1157P7 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P8 */
    /* loaded from: classes3.dex */
    public static class ActivityC1158P8 extends ProxyPendingActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyPendingActivity$P9 */
    /* loaded from: classes3.dex */
    public static class ActivityC1159P9 extends ProxyPendingActivity {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        ProxyPendingRecord create = ProxyPendingRecord.create(getIntent());
        Slog.m20d(TAG, "ProxyPendingActivity: " + create);
        Intent intent = create.mTarget;
        if (intent == null) {
            return;
        }
        intent.addFlags(268435456);
        create.mTarget.setExtrasClassLoader(BActivityThread.getApplication().getClassLoader());
        startActivity(create.mTarget);
    }
}
