package black.android.app;

import android.content.Intent;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.app.ServiceStartArgs")
/* loaded from: classes.dex */
public interface ServiceStartArgs {
    @BConstructor
    ServiceStartArgs _new(boolean z, int i, int i2, Intent intent);

    @BField
    Intent args();

    @BField
    int flags();

    @BField
    int startId();

    @BField
    boolean taskRemoved();
}
