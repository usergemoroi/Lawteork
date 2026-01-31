package black.android.app;

import android.app.Application;
import android.content.Context;
import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BParamClass;
@BClassName("android.app.Service")
/* loaded from: classes.dex */
public interface Service {
    @BMethod
    void attach(Context context, @BParamClass(android.app.ActivityThread.class) Object obj, String str, IBinder iBinder, Application application, Object obj2);
}
