package black.android.app;

import android.graphics.drawable.Icon;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.Notification")
/* loaded from: classes.dex */
public interface NotificationMContext {
    @BFieldCheckNotProcess
    Field _check_mLargeIcon();

    @BFieldCheckNotProcess
    Field _check_mSmallIcon();

    @BFieldSetNotProcess
    void _set_mLargeIcon(Object obj);

    @BFieldSetNotProcess
    void _set_mSmallIcon(Object obj);

    @BFieldNotProcess
    Icon mLargeIcon();

    @BFieldNotProcess
    Icon mSmallIcon();
}
