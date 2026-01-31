package black.android.app;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.app.ActivityThread$CreateServiceData")
/* loaded from: classes.dex */
public interface ActivityThreadCreateServiceDataContext {
    @BFieldCheckNotProcess
    Field _check_compatInfo();

    @BFieldCheckNotProcess
    Field _check_info();

    @BFieldCheckNotProcess
    Field _check_intent();

    @BFieldCheckNotProcess
    Field _check_token();

    @BFieldSetNotProcess
    void _set_compatInfo(Object obj);

    @BFieldSetNotProcess
    void _set_info(Object obj);

    @BFieldSetNotProcess
    void _set_intent(Object obj);

    @BFieldSetNotProcess
    void _set_token(Object obj);

    @BFieldNotProcess
    Object compatInfo();

    @BFieldNotProcess
    ServiceInfo info();

    @BFieldNotProcess
    Intent intent();

    @BFieldNotProcess
    IBinder token();
}
