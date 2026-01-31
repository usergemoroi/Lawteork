package top.niunaijun.blackbox.fake.frameworks;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.ParameterizedType;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.utils.Reflector;
/* loaded from: classes3.dex */
public abstract class BlackManager<Service extends IInterface> {
    public static final String TAG = "BlackManager";
    private Service mService;

    private Class<Service> getTClass() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Service getService() {
        Service service = this.mService;
        if (service != null && service.asBinder().pingBinder() && this.mService.asBinder().isBinderAlive()) {
            return this.mService;
        }
        try {
            Service service2 = (Service) Reflector.m28on(getTClass().getName().concat("$Stub")).method("asInterface", IBinder.class).call(BlackBoxCore.get().getService(getServiceName()));
            this.mService = service2;
            service2.asBinder().linkToDeath(new IBinder.DeathRecipient() { // from class: top.niunaijun.blackbox.fake.frameworks.BlackManager.1
                @Override // android.os.IBinder.DeathRecipient
                public void binderDied() {
                    BlackManager.this.mService.asBinder().unlinkToDeath(this, 0);
                    BlackManager.this.mService = null;
                }
            }, 0);
            return getService();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public abstract String getServiceName();
}
