package black.android.app.job;

import android.content.Intent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;
@BClassNameNotProcess("android.app.job.JobWorkItem")
/* loaded from: classes.dex */
public interface JobWorkItemContext {
    @BMethodCheckNotProcess
    Method _check_getIntent();

    @BFieldCheckNotProcess
    Field _check_mDeliveryCount();

    @BFieldCheckNotProcess
    Field _check_mGrants();

    @BFieldCheckNotProcess
    Field _check_mWorkId();

    @BFieldSetNotProcess
    void _set_mDeliveryCount(Object obj);

    @BFieldSetNotProcess
    void _set_mGrants(Object obj);

    @BFieldSetNotProcess
    void _set_mWorkId(Object obj);

    Intent getIntent();

    @BFieldNotProcess
    Integer mDeliveryCount();

    @BFieldNotProcess
    Object mGrants();

    @BFieldNotProcess
    Integer mWorkId();
}
