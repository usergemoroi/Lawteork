package top.niunaijun.blackbox.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.p025am.IRequestPermissionsResult;
import top.niunaijun.blackbox.utils.BundleUtils;
/* loaded from: classes3.dex */
public class RequestPermissionsActivity extends Activity {
    private static final int REQUEST_PERMISSION_CODE = 996;
    private IRequestPermissionsResult mCallBack;

    public static void request(Context context, String[] strArr, IRequestPermissionsResult iRequestPermissionsResult) {
        Intent intent = new Intent();
        intent.setClassName(BlackBoxCore.getContext(), RequestPermissionsActivity.class.getName());
        intent.setFlags(268435456);
        intent.putExtra("permissions", strArr);
        BundleUtils.putBinder(intent, "callback", iRequestPermissionsResult.asBinder());
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        } else if (BlackBoxCore.orgCallingUid <= 10000) {
            finish();
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("permissions");
            IBinder binder = BundleUtils.getBinder(intent, "callback");
            if (binder == null || stringArrayExtra == null) {
                finish();
                return;
            }
            this.mCallBack = IRequestPermissionsResult.Stub.asInterface(binder);
            requestPermissions(stringArrayExtra, REQUEST_PERMISSION_CODE);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        IRequestPermissionsResult iRequestPermissionsResult = this.mCallBack;
        if (iRequestPermissionsResult != null) {
            try {
                if (!iRequestPermissionsResult.onResult(i, strArr, iArr)) {
                    runOnUiThread(new Runnable() { // from class: top.niunaijun.blackbox.app.RequestPermissionsActivity.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(RequestPermissionsActivity.this, "Request permission failed.", 0).show();
                        }
                    });
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        finish();
    }
}
