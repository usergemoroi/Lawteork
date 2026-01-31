package black.android.app.job;

import android.os.IBinder;
import android.os.PersistableBundle;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.job.JobParameters")
/* loaded from: classes.dex */
public interface JobParametersContext {
    @BFieldCheckNotProcess
    Field _check_callback();

    @BFieldCheckNotProcess
    Field _check_extras();

    @BFieldCheckNotProcess
    Field _check_jobId();

    @BFieldSetNotProcess
    void _set_callback(Object obj);

    @BFieldSetNotProcess
    void _set_extras(Object obj);

    @BFieldSetNotProcess
    void _set_jobId(Object obj);

    @BFieldNotProcess
    IBinder callback();

    @BFieldNotProcess
    PersistableBundle extras();

    @BFieldNotProcess
    Integer jobId();
}
