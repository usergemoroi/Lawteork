package black.android.content;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.ContentResolver")
/* loaded from: classes.dex */
public interface ContentResolverStatic {
    @BFieldCheckNotProcess
    Field _check_sContentService();

    @BFieldSetNotProcess
    void _set_sContentService(Object obj);

    @BFieldNotProcess
    IInterface sContentService();
}
