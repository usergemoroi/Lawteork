package black.android.app.job;

import android.content.ComponentName;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.job.JobInfo")
/* loaded from: classes.dex */
public interface JobInfoContext {
    @BFieldCheckNotProcess
    Field _check_flexMillis();

    @BFieldCheckNotProcess
    Field _check_intervalMillis();

    @BFieldCheckNotProcess
    Field _check_jobId();

    @BFieldCheckNotProcess
    Field _check_service();

    @BFieldSetNotProcess
    void _set_flexMillis(Object obj);

    @BFieldSetNotProcess
    void _set_intervalMillis(Object obj);

    @BFieldSetNotProcess
    void _set_jobId(Object obj);

    @BFieldSetNotProcess
    void _set_service(Object obj);

    @BFieldNotProcess
    Long flexMillis();

    @BFieldNotProcess
    Long intervalMillis();

    @BFieldNotProcess
    Integer jobId();

    @BFieldNotProcess
    ComponentName service();
}
