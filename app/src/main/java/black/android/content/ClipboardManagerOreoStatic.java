package black.android.content;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.ClipboardManager")
/* loaded from: classes.dex */
public interface ClipboardManagerOreoStatic {
    @BFieldCheckNotProcess
    Field _check_sService();

    @BFieldSetNotProcess
    void _set_sService(Object obj);

    @BFieldNotProcess
    IInterface sService();
}
