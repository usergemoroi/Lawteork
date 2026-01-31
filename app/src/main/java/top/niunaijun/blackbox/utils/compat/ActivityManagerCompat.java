package top.niunaijun.blackbox.utils.compat;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import black.android.app.IActivityManagerContext;
import black.android.app.IActivityManagerNContext;
import p007b.AbstractC0565a;
import p007b.AbstractC0566b;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ActivityManagerCompat {
    public static final int INTENT_SENDER_ACTIVITY = 2;
    public static final int INTENT_SENDER_ACTIVITY_RESULT = 3;
    public static final int INTENT_SENDER_BROADCAST = 1;
    public static final int INTENT_SENDER_SERVICE = 4;
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    public static final int START_FLAG_DEBUG = 2;
    public static final int START_FLAG_NATIVE_DEBUGGING = 8;
    public static final int START_FLAG_TRACK_ALLOCATION = 4;
    public static final int USER_OP_SUCCESS = 0;

    public static boolean finishActivity(IBinder iBinder, int i, Intent intent) {
        return ((IActivityManagerNContext) BlackReflection.create(IActivityManagerNContext.class, AbstractC0566b.m166a().getDefault(), false)).finishActivity(iBinder, i, intent, 0).booleanValue();
    }

    public static void setActivityOrientation(Activity activity, int i) {
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            th.printStackTrace();
            Activity mParent = AbstractC0565a.m167a(activity).mParent();
            while (true) {
                Activity mParent2 = AbstractC0565a.m167a(mParent).mParent();
                if (mParent2 == null) {
                    try {
                        ((IActivityManagerContext) BlackReflection.create(IActivityManagerContext.class, AbstractC0566b.m166a().getDefault(), false)).setRequestedOrientation(AbstractC0565a.m167a(mParent).mToken(), i);
                        return;
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        return;
                    }
                }
                mParent = mParent2;
            }
        }
    }
}
