package black.android.content.p008pm;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.ApplicationInfo")
/* renamed from: black.android.content.pm.ApplicationInfoNContext */
/* loaded from: classes.dex */
public interface ApplicationInfoNContext {
    @BFieldCheckNotProcess
    Field _check_credentialEncryptedDataDir();

    @BFieldCheckNotProcess
    Field _check_credentialProtectedDataDir();

    @BFieldCheckNotProcess
    Field _check_deviceEncryptedDataDir();

    @BFieldCheckNotProcess
    Field _check_deviceProtectedDataDir();

    @BFieldSetNotProcess
    void _set_credentialEncryptedDataDir(Object obj);

    @BFieldSetNotProcess
    void _set_credentialProtectedDataDir(Object obj);

    @BFieldSetNotProcess
    void _set_deviceEncryptedDataDir(Object obj);

    @BFieldSetNotProcess
    void _set_deviceProtectedDataDir(Object obj);

    @BFieldNotProcess
    String credentialEncryptedDataDir();

    @BFieldNotProcess
    String credentialProtectedDataDir();

    @BFieldNotProcess
    String deviceEncryptedDataDir();

    @BFieldNotProcess
    String deviceProtectedDataDir();
}
