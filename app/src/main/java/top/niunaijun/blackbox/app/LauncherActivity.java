package top.niunaijun.blackbox.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.C1061R;
import top.niunaijun.blackbox.utils.Slog;
/* loaded from: classes3.dex */
public class LauncherActivity extends Activity {
    public static final String KEY_INTENT = "launch_intent";
    public static final String KEY_PKG = "launch_pkg";
    public static final String KEY_USER_ID = "launch_user_id";
    public static final String TAG = "SplashScreen";
    private boolean isRunning = false;

    public static void launch(Intent intent, int i) {
        Intent intent2 = new Intent();
        intent2.setClass(BlackBoxCore.getContext(), LauncherActivity.class);
        intent2.addFlags(268435456);
        intent2.putExtra(KEY_INTENT, intent);
        intent2.putExtra(KEY_PKG, intent.getPackage());
        intent2.putExtra(KEY_USER_ID, i);
        BlackBoxCore.getContext().startActivity(intent2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        final Intent intent2 = (Intent) intent.getParcelableExtra(KEY_INTENT);
        String stringExtra = intent.getStringExtra(KEY_PKG);
        final int intExtra = intent.getIntExtra(KEY_USER_ID, 0);
        PackageInfo packageInfo = BlackBoxCore.getBPackageManager().getPackageInfo(stringExtra, 0, intExtra);
        if (packageInfo == null) {
            Slog.m18e(TAG, stringExtra + " not installed!");
            finish();
            return;
        }
        Drawable loadIcon = packageInfo.applicationInfo.loadIcon(BlackBoxCore.getPackageManager());
        setContentView(C1061R.layout.activity_launcher);
        findViewById(C1061R.C1063id.iv_icon).setBackgroundDrawable(loadIcon);
        new Thread(new Runnable() { // from class: top.niunaijun.blackbox.app.LauncherActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BlackBoxCore.getBActivityManager().startActivity(intent2, intExtra);
            }
        }).start();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.isRunning = true;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isRunning) {
            finish();
        }
    }
}
