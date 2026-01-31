package black.android.app;

import android.os.IBinder;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.app.ActivityThread")
/* loaded from: classes.dex */
public interface ActivityThreadNMR1 {
    @BMethod
    void performNewIntents(IBinder iBinder, List list, boolean z);
}
