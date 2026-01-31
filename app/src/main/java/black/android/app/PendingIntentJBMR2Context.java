package black.android.app;

import android.content.Intent;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.PendingIntent")
/* loaded from: classes.dex */
public interface PendingIntentJBMR2Context {
    @BMethodCheckNotProcess
    Method _check_getIntent();

    Intent getIntent();
}
