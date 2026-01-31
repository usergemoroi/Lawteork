package black.android.content;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.ContentProviderClient")
/* loaded from: classes.dex */
public interface ContentProviderClientContext {
    @BFieldCheckNotProcess
    Field _check_mContentProvider();

    @BFieldSetNotProcess
    void _set_mContentProvider(Object obj);

    @BFieldNotProcess
    IInterface mContentProvider();
}
