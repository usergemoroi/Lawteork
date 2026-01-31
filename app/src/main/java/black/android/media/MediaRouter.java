package black.android.media;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BStaticField;
@BClassName("android.media.MediaRouter")
/* loaded from: classes.dex */
public interface MediaRouter {

    @BClassName("android.media.MediaRouter$Static")
    /* loaded from: classes.dex */
    public interface Static {
        @BField
        IInterface mAudioService();
    }

    @BClassName("android.media.MediaRouter$Static")
    /* loaded from: classes.dex */
    public interface StaticKitkat {
        @BField
        IInterface mMediaRouterService();
    }

    @BStaticField
    Object sStatic();
}
