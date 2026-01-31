package black.android.app.job;

import android.content.Intent;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.app.job.JobWorkItem")
/* loaded from: classes.dex */
public interface JobWorkItem {
    @BConstructor
    JobWorkItem _new(Intent intent);

    @BMethod
    Intent getIntent();

    @BField
    int mDeliveryCount();

    @BField
    Object mGrants();

    @BField
    int mWorkId();
}
