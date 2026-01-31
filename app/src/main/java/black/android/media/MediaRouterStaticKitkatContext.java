package black.android.media;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.media.MediaRouter$Static")
/* loaded from: classes.dex */
public interface MediaRouterStaticKitkatContext {
    @BFieldCheckNotProcess
    Field _check_mMediaRouterService();

    @BFieldSetNotProcess
    void _set_mMediaRouterService(Object obj);

    @BFieldNotProcess
    IInterface mMediaRouterService();
}
