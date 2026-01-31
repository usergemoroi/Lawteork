package black.android.net;

import android.net.NetworkInfo;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.net.NetworkInfo")
/* loaded from: classes.dex */
public interface NetworkInfoContext {
    @BFieldCheckNotProcess
    Field _check_mDetailedState();

    @BFieldCheckNotProcess
    Field _check_mIsAvailable();

    @BFieldCheckNotProcess
    Field _check_mNetworkType();

    @BFieldCheckNotProcess
    Field _check_mState();

    @BFieldCheckNotProcess
    Field _check_mTypeName();

    @BFieldSetNotProcess
    void _set_mDetailedState(Object obj);

    @BFieldSetNotProcess
    void _set_mIsAvailable(Object obj);

    @BFieldSetNotProcess
    void _set_mNetworkType(Object obj);

    @BFieldSetNotProcess
    void _set_mState(Object obj);

    @BFieldSetNotProcess
    void _set_mTypeName(Object obj);

    @BFieldNotProcess
    NetworkInfo.DetailedState mDetailedState();

    @BFieldNotProcess
    Boolean mIsAvailable();

    @BFieldNotProcess
    Integer mNetworkType();

    @BFieldNotProcess
    NetworkInfo.State mState();

    @BFieldNotProcess
    String mTypeName();
}
