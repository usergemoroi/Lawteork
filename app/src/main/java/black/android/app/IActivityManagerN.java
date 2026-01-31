package black.android.app;

import android.content.Intent;
import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.app.IActivityManager")
/* loaded from: classes.dex */
public interface IActivityManagerN {
    @BMethod
    Boolean finishActivity(IBinder iBinder, int i, Intent intent, int i2);
}
