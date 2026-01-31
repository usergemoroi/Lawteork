package black.android.media;

import android.os.IInterface;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.media.MediaRouter$Static")
/* loaded from: classes.dex */
public interface MediaRouterStaticContext {
    @BFieldCheckNotProcess
    Field _check_mAudioService();

    @BFieldSetNotProcess
    void _set_mAudioService(Object obj);

    @BFieldNotProcess
    IInterface mAudioService();
}
