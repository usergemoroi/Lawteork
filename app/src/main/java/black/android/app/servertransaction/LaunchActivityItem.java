package black.android.app.servertransaction;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.app.servertransaction.LaunchActivityItem")
/* loaded from: classes.dex */
public interface LaunchActivityItem {
    @BField
    ActivityInfo mInfo();

    @BField
    Intent mIntent();
}
