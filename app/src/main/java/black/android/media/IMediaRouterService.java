package black.android.media;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.media.IMediaRouterService")
/* loaded from: classes.dex */
public interface IMediaRouterService {

    @BClassName("android.media.IMediaRouterService$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}
