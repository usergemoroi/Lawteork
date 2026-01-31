package black.android.net;

import android.net.NetworkInfo;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.net.NetworkInfo")
/* loaded from: classes.dex */
public interface NetworkInfo {
    @BConstructor
    NetworkInfo _new(int i);

    @BConstructor
    NetworkInfo _new(int i, int i2, String str, String str2);

    @BField
    NetworkInfo.DetailedState mDetailedState();

    @BField
    boolean mIsAvailable();

    @BField
    int mNetworkType();

    @BField
    NetworkInfo.State mState();

    @BField
    String mTypeName();
}
