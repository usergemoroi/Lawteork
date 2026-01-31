package black.android.p009os.health;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.os.health.SystemHealthManager")
/* renamed from: black.android.os.health.SystemHealthManagerContext */
/* loaded from: classes.dex */
public interface SystemHealthManagerContext {
    @BFieldCheckNotProcess
    Field _check_mBatteryStats();

    @BFieldSetNotProcess
    void _set_mBatteryStats(Object obj);

    @BFieldNotProcess
    IInterface mBatteryStats();
}
