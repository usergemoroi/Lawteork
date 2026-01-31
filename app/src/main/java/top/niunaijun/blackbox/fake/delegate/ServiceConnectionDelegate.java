package top.niunaijun.blackbox.fake.delegate;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import black.android.app.IServiceConnectionOContext;
import java.util.HashMap;
import java.util.Map;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ServiceConnectionDelegate extends IServiceConnection.Stub {
    private static final Map<IBinder, ServiceConnectionDelegate> sServiceConnectDelegate = new HashMap();
    private final ComponentName mComponentName;
    private final IServiceConnection mConn;

    private ServiceConnectionDelegate(IServiceConnection iServiceConnection, ComponentName componentName) {
        this.mConn = iServiceConnection;
        this.mComponentName = componentName;
    }

    public static IServiceConnection createProxy(IServiceConnection iServiceConnection, Intent intent) {
        final IBinder asBinder = iServiceConnection.asBinder();
        ServiceConnectionDelegate serviceConnectionDelegate = sServiceConnectDelegate.get(asBinder);
        if (serviceConnectionDelegate == null) {
            try {
                asBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: top.niunaijun.blackbox.fake.delegate.ServiceConnectionDelegate.1
                    @Override // android.os.IBinder.DeathRecipient
                    public void binderDied() {
                        ServiceConnectionDelegate.sServiceConnectDelegate.remove(asBinder);
                        asBinder.unlinkToDeath(this, 0);
                    }
                }, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            ServiceConnectionDelegate serviceConnectionDelegate2 = new ServiceConnectionDelegate(iServiceConnection, intent.getComponent());
            sServiceConnectDelegate.put(asBinder, serviceConnectionDelegate2);
            return serviceConnectionDelegate2;
        }
        return serviceConnectionDelegate;
    }

    public static ServiceConnectionDelegate getDelegate(IBinder iBinder) {
        return sServiceConnectDelegate.get(iBinder);
    }

    @Override // android.app.IServiceConnection
    public void connected(ComponentName componentName, IBinder iBinder) {
        connected(componentName, iBinder, false);
    }

    public void connected(ComponentName componentName, IBinder iBinder, boolean z) {
        if (BuildCompat.isOreo()) {
            ((IServiceConnectionOContext) BlackReflection.create(IServiceConnectionOContext.class, this.mConn, false)).connected(this.mComponentName, iBinder, z);
        } else {
            this.mConn.connected(componentName, iBinder);
        }
    }
}
