package black.android.app;

import android.app.Application;
import android.app.IServiceConnection;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.IInterface;
import java.io.File;
import java.lang.ref.WeakReference;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
@BClassName("android.app.LoadedApk")
/* loaded from: classes.dex */
public interface LoadedApk {

    @BClassName("android.app.LoadedApk$ReceiverDispatcher")
    /* loaded from: classes.dex */
    public interface ReceiverDispatcher {

        @BClassName("android.app.LoadedApk$ReceiverDispatcher$InnerReceiver")
        /* loaded from: classes.dex */
        public interface InnerReceiver {
            @BField
            WeakReference<?> mDispatcher();
        }

        @BMethod
        IInterface getIIntentReceiver();

        @BField
        IIntentReceiver mIIntentReceiver();

        @BField
        BroadcastReceiver mReceiver();
    }

    @BClassName("android.app.LoadedApk$ServiceDispatcher")
    /* loaded from: classes.dex */
    public interface ServiceDispatcher {

        @BClassName("android.app.LoadedApk$ServiceDispatcher$InnerConnection")
        /* loaded from: classes.dex */
        public interface InnerConnection {
            @BField
            WeakReference<?> mDispatcher();
        }

        @BField
        ServiceConnection mConnection();

        @BField
        Context mContext();
    }

    @BMethod
    IServiceConnection forgetServiceDispatcher(Context context, ServiceConnection serviceConnection);

    @BMethod
    ClassLoader getClassLoader();

    @BMethod
    Object getResources();

    @BMethod
    IServiceConnection getServiceDispatcher(ServiceConnection serviceConnection, Context context, Handler handler, int i);

    @BField
    Application mApplication();

    @BField
    ApplicationInfo mApplicationInfo();

    @BField
    File mCredentialProtectedDataDirFile();

    @BField
    String mDataDir();

    @BField
    File mDataDirFile();

    @BField
    File mDeviceProtectedDataDirFile();

    @BField
    String mLibDir();

    @BField
    boolean mPackageName();

    @BField
    boolean mSecurityViolation();

    @BMethod
    Application makeApplication(boolean z, android.app.Instrumentation instrumentation);
}
