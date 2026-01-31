package black.android.content.p008pm;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.UserInfo")
/* renamed from: black.android.content.pm.UserInfoStatic */
/* loaded from: classes.dex */
public interface UserInfoStatic {
    @BFieldNotProcess
    Integer FLAG_PRIMARY();

    @BFieldCheckNotProcess
    Field _check_FLAG_PRIMARY();

    @BConstructorNotProcess
    Object _new(int i, String str, int i2);

    @BFieldSetNotProcess
    void _set_FLAG_PRIMARY(Object obj);
}
