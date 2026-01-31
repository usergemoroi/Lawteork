package top.niunaijun.blackbox.core.system.p025am;

import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
/* renamed from: top.niunaijun.blackbox.core.system.am.UserSpace */
/* loaded from: classes3.dex */
public class UserSpace {
    public final ActiveServices mActiveServices = new ActiveServices();
    public final ActivityStack mStack = new ActivityStack();
    public final Map<IBinder, PendingIntentRecord> mIntentSenderRecords = new HashMap();
}
