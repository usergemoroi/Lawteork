package top.niunaijun.blackbox.proxy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.hook.HookManager;
import top.niunaijun.blackbox.fake.service.HCallbackProxy;
import top.niunaijun.blackbox.proxy.record.ProxyActivityRecord;
/* loaded from: classes3.dex */
public class ProxyActivity extends Activity {
    public static final String TAG = "ProxyActivity";

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P0 */
    /* loaded from: classes3.dex */
    public static class ActivityC1120P0 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P1 */
    /* loaded from: classes3.dex */
    public static class ActivityC1121P1 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P10 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P11 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P12 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P13 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P14 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P15 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P16 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P17 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P18 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P19 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P2 */
    /* loaded from: classes3.dex */
    public static class ActivityC1122P2 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P20 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P21 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P22 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P23 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P24 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P25 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P26 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P27 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P28 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P29 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P3 */
    /* loaded from: classes3.dex */
    public static class ActivityC1123P3 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P30 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P31 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P32 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P33 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P34 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P35 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P36 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P37 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P38 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P39 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P4 */
    /* loaded from: classes3.dex */
    public static class ActivityC1124P4 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P40 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P41 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P42 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P43 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P44 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P45 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P46 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P47 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P48 extends ProxyActivity {
    }

    /* loaded from: classes3.dex */
    public static class P49 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P5 */
    /* loaded from: classes3.dex */
    public static class ActivityC1125P5 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P6 */
    /* loaded from: classes3.dex */
    public static class ActivityC1126P6 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P7 */
    /* loaded from: classes3.dex */
    public static class ActivityC1127P7 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P8 */
    /* loaded from: classes3.dex */
    public static class ActivityC1128P8 extends ProxyActivity {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyActivity$P9 */
    /* loaded from: classes3.dex */
    public static class ActivityC1129P9 extends ProxyActivity {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d(TAG, "onCreate");
        finish();
        HookManager.get().checkEnv(HCallbackProxy.class);
        ProxyActivityRecord create = ProxyActivityRecord.create(getIntent());
        Intent intent = create.mTarget;
        if (intent != null) {
            intent.setExtrasClassLoader(BActivityThread.getApplication().getClassLoader());
            startActivity(create.mTarget);
        }
    }
}
