package black.android.content;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.BroadcastReceiver$PendingResult")
/* loaded from: classes.dex */
public interface BroadcastReceiverPendingResultMContext {
    @BFieldCheckNotProcess
    Field _check_mAbortBroadcast();

    @BFieldCheckNotProcess
    Field _check_mFinished();

    @BFieldCheckNotProcess
    Field _check_mFlags();

    @BFieldCheckNotProcess
    Field _check_mInitialStickyHint();

    @BFieldCheckNotProcess
    Field _check_mOrderedHint();

    @BFieldCheckNotProcess
    Field _check_mResultCode();

    @BFieldCheckNotProcess
    Field _check_mResultData();

    @BFieldCheckNotProcess
    Field _check_mResultExtras();

    @BFieldCheckNotProcess
    Field _check_mSendingUser();

    @BFieldCheckNotProcess
    Field _check_mToken();

    @BFieldCheckNotProcess
    Field _check_mType();

    @BFieldSetNotProcess
    void _set_mAbortBroadcast(Object obj);

    @BFieldSetNotProcess
    void _set_mFinished(Object obj);

    @BFieldSetNotProcess
    void _set_mFlags(Object obj);

    @BFieldSetNotProcess
    void _set_mInitialStickyHint(Object obj);

    @BFieldSetNotProcess
    void _set_mOrderedHint(Object obj);

    @BFieldSetNotProcess
    void _set_mResultCode(Object obj);

    @BFieldSetNotProcess
    void _set_mResultData(Object obj);

    @BFieldSetNotProcess
    void _set_mResultExtras(Object obj);

    @BFieldSetNotProcess
    void _set_mSendingUser(Object obj);

    @BFieldSetNotProcess
    void _set_mToken(Object obj);

    @BFieldSetNotProcess
    void _set_mType(Object obj);

    @BFieldNotProcess
    Boolean mAbortBroadcast();

    @BFieldNotProcess
    Boolean mFinished();

    @BFieldNotProcess
    Integer mFlags();

    @BFieldNotProcess
    Boolean mInitialStickyHint();

    @BFieldNotProcess
    Boolean mOrderedHint();

    @BFieldNotProcess
    Integer mResultCode();

    @BFieldNotProcess
    String mResultData();

    @BFieldNotProcess
    Bundle mResultExtras();

    @BFieldNotProcess
    Integer mSendingUser();

    @BFieldNotProcess
    IBinder mToken();

    @BFieldNotProcess
    Integer mType();
}
