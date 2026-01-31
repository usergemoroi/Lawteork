package black.android.app;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.app.ActivityTaskManager")
/* loaded from: classes.dex */
public interface ActivityTaskManager {
    @BStaticField
    Object IActivityTaskManagerSingleton();

    @BStaticMethod
    Object getService();
}
