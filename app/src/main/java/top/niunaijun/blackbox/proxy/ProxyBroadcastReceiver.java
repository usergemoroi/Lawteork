package top.niunaijun.blackbox.proxy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.entity.p028am.PendingResultData;
import top.niunaijun.blackbox.proxy.record.ProxyBroadcastRecord;
/* loaded from: classes3.dex */
public class ProxyBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "ProxyBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.setExtrasClassLoader(context.getClassLoader());
        ProxyBroadcastRecord create = ProxyBroadcastRecord.create(intent);
        if (create.mIntent == null) {
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        try {
            BlackBoxCore.getBActivityManager().scheduleBroadcastReceiver(create.mIntent, new PendingResultData(goAsync), create.mUserId);
        } catch (RemoteException e) {
            goAsync.finish();
        }
    }
}
