package top.niunaijun.blackbox.fake.delegate;

import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import black.android.content.IIntentReceiverContext;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.proxy.record.ProxyBroadcastRecord;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class InnerReceiverDelegate extends IIntentReceiver.Stub {
    public static final String TAG = "InnerReceiverDelegate";
    private static final Map<IBinder, InnerReceiverDelegate> sInnerReceiverDelegate = new HashMap();
    private final WeakReference<IIntentReceiver> mIntentReceiver;

    private InnerReceiverDelegate(IIntentReceiver iIntentReceiver) {
        this.mIntentReceiver = new WeakReference<>(iIntentReceiver);
    }

    public static IIntentReceiver createProxy(IIntentReceiver iIntentReceiver) {
        if (iIntentReceiver instanceof InnerReceiverDelegate) {
            return iIntentReceiver;
        }
        final IBinder asBinder = iIntentReceiver.asBinder();
        InnerReceiverDelegate innerReceiverDelegate = sInnerReceiverDelegate.get(asBinder);
        if (innerReceiverDelegate == null) {
            try {
                asBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: top.niunaijun.blackbox.fake.delegate.InnerReceiverDelegate.1
                    @Override // android.os.IBinder.DeathRecipient
                    public void binderDied() {
                        InnerReceiverDelegate.sInnerReceiverDelegate.remove(asBinder);
                        asBinder.unlinkToDeath(this, 0);
                    }
                }, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            InnerReceiverDelegate innerReceiverDelegate2 = new InnerReceiverDelegate(iIntentReceiver);
            sInnerReceiverDelegate.put(asBinder, innerReceiverDelegate2);
            return innerReceiverDelegate2;
        }
        return innerReceiverDelegate;
    }

    public static InnerReceiverDelegate getDelegate(IBinder iBinder) {
        return sInnerReceiverDelegate.get(iBinder);
    }

    @Override // android.content.IIntentReceiver
    public void performReceive(Intent intent, int i, String str, Bundle bundle, boolean z, boolean z2, int i2) {
        intent.setExtrasClassLoader(BActivityThread.getApplication().getClassLoader());
        ProxyBroadcastRecord create = ProxyBroadcastRecord.create(intent);
        Intent intent2 = create.mIntent;
        if (intent2 != null) {
            intent2.setExtrasClassLoader(BActivityThread.getApplication().getClassLoader());
            intent = create.mIntent;
        }
        Intent intent3 = intent;
        IIntentReceiver iIntentReceiver = this.mIntentReceiver.get();
        if (iIntentReceiver != null) {
            ((IIntentReceiverContext) BlackReflection.create(IIntentReceiverContext.class, iIntentReceiver, false)).performReceive(intent3, i, str, bundle, z, z2, i2);
        }
    }
}
