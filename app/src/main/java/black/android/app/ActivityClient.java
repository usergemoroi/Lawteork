package black.android.app;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.app.ActivityClient")
/* loaded from: classes.dex */
public interface ActivityClient {

    @BClassName("android.app.ActivityClient$ActivityClientControllerSingleton")
    /* loaded from: classes.dex */
    public interface ActivityClientControllerSingleton {
        @BField
        IInterface mKnownInstance();
    }

    @BField
    Object INTERFACE_SINGLETON();

    @BStaticMethod
    Object getActivityClientController();

    @BStaticMethod
    Object getInstance();

    @BStaticMethod
    Object setActivityClientController(Object obj);
}
