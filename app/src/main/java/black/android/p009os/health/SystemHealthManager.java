package black.android.p009os.health;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.os.health.SystemHealthManager")
/* renamed from: black.android.os.health.SystemHealthManager */
/* loaded from: classes.dex */
public interface SystemHealthManager {
    @BField
    IInterface mBatteryStats();
}
