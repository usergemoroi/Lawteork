package black.android.p009os;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Map;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.os.ServiceManager")
/* renamed from: black.android.os.ServiceManager */
/* loaded from: classes.dex */
public interface ServiceManager {
    @BStaticMethod
    void addService(String str, IBinder iBinder);

    @BStaticMethod
    IBinder checkService();

    @BStaticMethod
    IInterface getIServiceManager();

    @BStaticMethod
    IBinder getService(String str);

    @BStaticMethod
    String[] listServices();

    @BStaticField
    Map<String, IBinder> sCache();

    @BStaticField
    IInterface sServiceManager();
}
