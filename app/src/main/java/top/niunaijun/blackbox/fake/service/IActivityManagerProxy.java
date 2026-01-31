package top.niunaijun.blackbox.fake.service;

import android.app.ActivityManager;
import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import black.android.app.ActivityManagerOreoStatic;
import black.android.app.LoadedApkReceiverDispatcherContext;
import black.android.app.LoadedApkReceiverDispatcherInnerReceiverContext;
import black.android.app.LoadedApkServiceDispatcherContext;
import black.android.app.LoadedApkServiceDispatcherInnerConnectionContext;
import black.android.content.ContentProviderNativeStatic;
import black.android.content.p008pm.UserInfoStatic;
import black.android.util.SingletonContext;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p007b.AbstractC0566b;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.env.AppSystemEnv;
import top.niunaijun.blackbox.entity.AppConfig;
import top.niunaijun.blackbox.entity.p028am.RunningAppProcessInfo;
import top.niunaijun.blackbox.entity.p028am.RunningServiceInfo;
import top.niunaijun.blackbox.fake.delegate.ContentProviderDelegate;
import top.niunaijun.blackbox.fake.delegate.InnerReceiverDelegate;
import top.niunaijun.blackbox.fake.delegate.ServiceConnectionDelegate;
import top.niunaijun.blackbox.fake.frameworks.BActivityManager;
import top.niunaijun.blackbox.fake.frameworks.BPackageManager;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.fake.hook.ScanClass;
import top.niunaijun.blackbox.fake.service.base.PkgMethodProxy;
import top.niunaijun.blackbox.fake.service.context.providers.ContentProviderStub;
import top.niunaijun.blackbox.proxy.ProxyManifest;
import top.niunaijun.blackbox.proxy.record.ProxyBroadcastRecord;
import top.niunaijun.blackbox.proxy.record.ProxyPendingRecord;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackbox.utils.Reflector;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackbox.utils.compat.ParceledListSliceCompat;
import top.niunaijun.blackbox.utils.compat.TaskDescriptionCompat;
import top.niunaijun.blackreflection.BlackReflection;
@ScanClass({ActivityManagerCommonProxy.class})
/* loaded from: classes3.dex */
public class IActivityManagerProxy extends ClassInvocationStub {
    static IServiceConnection StartService = null;
    public static final String TAG = "ActivityManagerStub";

    @ProxyMethod("bindIsolatedService")
    /* loaded from: classes3.dex */
    public static class BindIsolatedService extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[6] = null;
            return IActivityManagerProxy.BindServiceCommon(obj, method, objArr, 7);
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public boolean isEnable() {
            return BlackBoxCore.get().isBlackProcess() || BlackBoxCore.get().isServerProcess();
        }
    }

    @ProxyMethod("bindService")
    /* loaded from: classes3.dex */
    public static class BindService extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return IActivityManagerProxy.BindServiceCommon(obj, method, objArr, 6);
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public boolean isEnable() {
            return BlackBoxCore.get().isBlackProcess() || BlackBoxCore.get().isServerProcess();
        }
    }

    @ProxyMethod("broadcastIntent")
    /* loaded from: classes3.dex */
    public static class BroadcastIntent extends MethodHook {
        public int getIntentIndex(Object[] objArr) {
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof Intent) {
                    return i;
                }
            }
            return 1;
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intentIndex = getIntentIndex(objArr);
            Intent intent = (Intent) objArr[intentIndex];
            Intent sendBroadcast = BlackBoxCore.getBActivityManager().sendBroadcast(intent, (String) objArr[intentIndex + 1], BActivityThread.getUserId());
            if (sendBroadcast != null) {
                sendBroadcast.setExtrasClassLoader(BActivityThread.getApplication().getClassLoader());
                ProxyBroadcastRecord.saveStub(sendBroadcast, intent, BActivityThread.getUserId());
                objArr[intentIndex] = sendBroadcast;
            }
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof String[]) {
                    objArr[i] = null;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("broadcastIntentWithFeature")
    /* loaded from: classes3.dex */
    public static class BroadcastIntentWithFeature extends BroadcastIntent {
    }

    @ProxyMethod("getContentProvider")
    /* loaded from: classes3.dex */
    public static class GetContentProvider extends MethodHook {
        private int getAuthIndex() {
            return BuildCompat.isQ() ? 2 : 1;
        }

        private int getUserIndex() {
            return getAuthIndex() + 1;
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            IBinder iBinder;
            int authIndex = getAuthIndex();
            Object obj2 = objArr[authIndex];
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (ProxyManifest.isProxy(str)) {
                    return method.invoke(obj, objArr);
                }
                if (BuildCompat.isQ()) {
                    objArr[1] = BlackBoxCore.getHostPkg();
                }
                if (obj2.equals("settings") || obj2.equals("media") || obj2.equals("telephony")) {
                    Object invoke = method.invoke(obj, objArr);
                    ContentProviderDelegate.update(invoke, str);
                    return invoke;
                }
                Log.d(IActivityManagerProxy.TAG, "hook getContentProvider: " + obj2);
                ProviderInfo resolveContentProvider = BlackBoxCore.getBPackageManager().resolveContentProvider(str, 128, BActivityThread.getUserId());
                Log.d(IActivityManagerProxy.TAG, "hook app: " + obj2);
                if (BActivityThread.getAppPid() != -1) {
                    AppConfig initProcess = BlackBoxCore.getBActivityManager().initProcess(resolveContentProvider.packageName, resolveContentProvider.processName, BActivityThread.getUserId());
                    iBinder = initProcess.bpid != BActivityThread.getAppPid() ? BlackBoxCore.getBActivityManager().acquireContentProviderClient(resolveContentProvider) : null;
                    objArr[authIndex] = ProxyManifest.getProxyAuthorities(initProcess.bpid);
                    objArr[getUserIndex()] = Integer.valueOf(BlackBoxCore.getHostUserId());
                } else {
                    iBinder = null;
                }
                if (iBinder == null) {
                    return null;
                }
                Object invoke2 = method.invoke(obj, objArr);
                Reflector.with(invoke2).field("info").set(resolveContentProvider);
                Reflector.with(invoke2).field("provider").set(new ContentProviderStub().wrapper(((ContentProviderNativeStatic) BlackReflection.create(ContentProviderNativeStatic.class, null, false)).asInterface(iBinder), BActivityThread.getAppPackageName()));
                return invoke2;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getIntentSender")
    /* loaded from: classes3.dex */
    public static class GetIntentSender extends MethodHook {
        private int getIntentsIndex(Object[] objArr) {
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof Intent[]) {
                    return i;
                }
            }
            return BuildCompat.isR() ? 6 : 5;
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[0]).intValue();
            Intent[] intentArr = (Intent[]) objArr[getIntentsIndex(objArr)];
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            for (int i = 0; i < intentArr.length; i++) {
                Intent intent = intentArr[i];
                if (intValue == 2) {
                    Intent intent2 = new Intent();
                    intent2.setComponent(new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.getProxyPendingActivity(BActivityThread.getAppPid())));
                    ProxyPendingRecord.saveStub(intent2, intent, BActivityThread.getUserId());
                    intentArr[i] = intent2;
                }
            }
            IInterface iInterface = (IInterface) method.invoke(obj, objArr);
            if (iInterface != null) {
                String[] packagesForUid = BPackageManager.get().getPackagesForUid(BActivityThread.getCallingBUid());
                if (packagesForUid.length < 1) {
                    packagesForUid = new String[]{BlackBoxCore.getHostPkg()};
                }
                BlackBoxCore.getBActivityManager().getIntentSender(iInterface.asBinder(), packagesForUid[0], BActivityThread.getCallingBUid());
            }
            return iInterface;
        }
    }

    @ProxyMethod("getIntentSenderWithFeature")
    /* loaded from: classes3.dex */
    public static class GetIntentSenderWithFeature extends GetIntentSender {
    }

    @ProxyMethod("getIntentSenderWithSourceToken")
    /* loaded from: classes3.dex */
    public static class GetIntentSenderWithSourceToken extends GetIntentSender {
    }

    @ProxyMethod("getRunningAppProcesses")
    /* loaded from: classes3.dex */
    public static class GetRunningAppProcesses extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            RunningAppProcessInfo runningAppProcesses = BActivityManager.get().getRunningAppProcesses(BActivityThread.getAppPackageName(), BActivityThread.getUserId());
            return runningAppProcesses == null ? new ArrayList() : runningAppProcesses.mAppProcessInfoList;
        }
    }

    @ProxyMethod("getServices")
    /* loaded from: classes3.dex */
    public static class GetServices extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            RunningServiceInfo runningServices = BActivityManager.get().getRunningServices(BActivityThread.getAppPackageName(), BActivityThread.getUserId());
            return runningServices == null ? new ArrayList() : runningServices.mRunningServiceInfoList;
        }
    }

    @ProxyMethod("grantUriPermission")
    /* loaded from: classes3.dex */
    public static class GrantUriPermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastUid(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("peekService")
    /* loaded from: classes3.dex */
    public static class PeekService extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastAppPkg(objArr);
            return BlackBoxCore.getBActivityManager().peekService((Intent) objArr[0], (String) objArr[1], BActivityThread.getUserId());
        }
    }

    @ProxyMethod("publishService")
    /* loaded from: classes3.dex */
    public static class PublishService extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerReceiver")
    /* loaded from: classes3.dex */
    public static class RegisterReceiver extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            Object obj2 = objArr[2];
            if (obj2 != null) {
                IIntentReceiver iIntentReceiver = (IIntentReceiver) obj2;
                IIntentReceiver createProxy = InnerReceiverDelegate.createProxy(iIntentReceiver);
                WeakReference<?> mDispatcher = ((LoadedApkReceiverDispatcherInnerReceiverContext) BlackReflection.create(LoadedApkReceiverDispatcherInnerReceiverContext.class, iIntentReceiver, false)).mDispatcher();
                if (mDispatcher != null) {
                    ((LoadedApkReceiverDispatcherContext) BlackReflection.create(LoadedApkReceiverDispatcherContext.class, mDispatcher.get(), false))._set_mIIntentReceiver(createProxy);
                }
                objArr[2] = createProxy;
            }
            if (objArr[4] != null) {
                objArr[4] = null;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerReceiverWithFeature")
    /* loaded from: classes3.dex */
    public static class RegisterReceiverWithFeature extends MethodHook {
        public int getPermissionIndex() {
            return BuildCompat.isS() ? 6 : 5;
        }

        public int getReceiverIndex() {
            return BuildCompat.isS() ? 4 : 3;
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            int receiverIndex = getReceiverIndex();
            Object obj2 = objArr[receiverIndex];
            if (obj2 != null) {
                IIntentReceiver iIntentReceiver = (IIntentReceiver) obj2;
                IIntentReceiver createProxy = InnerReceiverDelegate.createProxy(iIntentReceiver);
                WeakReference<?> mDispatcher = ((LoadedApkReceiverDispatcherInnerReceiverContext) BlackReflection.create(LoadedApkReceiverDispatcherInnerReceiverContext.class, iIntentReceiver, false)).mDispatcher();
                if (mDispatcher != null) {
                    ((LoadedApkReceiverDispatcherContext) BlackReflection.create(LoadedApkReceiverDispatcherContext.class, mDispatcher.get(), false))._set_mIIntentReceiver(createProxy);
                }
                objArr[receiverIndex] = createProxy;
            }
            if (objArr[getPermissionIndex()] != null) {
                objArr[getPermissionIndex()] = null;
            }
            if (BuildCompat.isU()) {
                int length = objArr.length - 1;
                int intValue = ((Integer) objArr[length]).intValue();
                if ((intValue & 4) == 0 && (intValue & 2) == 0) {
                    intValue |= 4;
                }
                objArr[length] = Integer.valueOf(intValue);
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("sendIntentSender")
    /* loaded from: classes3.dex */
    public static class SendIntentSender extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("setTaskDescription")
    /* loaded from: classes3.dex */
    public static class SetTaskDescription extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[1] = TaskDescriptionCompat.fix((ActivityManager.TaskDescription) objArr[1]);
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("startService")
    /* loaded from: classes3.dex */
    public static class StartService extends MethodHook {
        public int getRequireForeground() {
            return BuildCompat.isOreo() ? 3 : -1;
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Intent intent = (Intent) objArr[1];
            String str = (String) objArr[2];
            if (BlackBoxCore.getBPackageManager().resolveService(intent, 0, str, BActivityThread.getUserId()) == null) {
                return method.invoke(obj, objArr);
            }
            int requireForeground = getRequireForeground();
            return BlackBoxCore.getBActivityManager().startService(intent, str, requireForeground != -1 ? ((Boolean) objArr[requireForeground]).booleanValue() : false, BActivityThread.getUserId());
        }
    }

    @ProxyMethod("stopService")
    /* loaded from: classes3.dex */
    public static class StopService extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(BlackBoxCore.getBActivityManager().stopService((Intent) objArr[1], (String) objArr[2], BActivityThread.getUserId()));
        }
    }

    @ProxyMethod("stopServiceToken")
    /* loaded from: classes3.dex */
    public static class StopServiceToken extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BlackBoxCore.getBActivityManager().stopServiceToken((ComponentName) objArr[0], (IBinder) objArr[1], BActivityThread.getUserId());
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("unbindService")
    /* loaded from: classes3.dex */
    public static class UnbindService extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            IServiceConnection iServiceConnection = (IServiceConnection) objArr[0];
            if (iServiceConnection == null) {
                return method.invoke(obj, objArr);
            }
            BlackBoxCore.getBActivityManager().unbindService(iServiceConnection.asBinder(), BActivityThread.getUserId());
            ServiceConnectionDelegate delegate = ServiceConnectionDelegate.getDelegate(iServiceConnection.asBinder());
            if (delegate != null) {
                objArr[0] = delegate;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("bindServiceInstance")
    /* loaded from: classes3.dex */
    public static class bindServiceInstance extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return IActivityManagerProxy.BindServiceCommon(obj, method, objArr, 7);
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public boolean isEnable() {
            return BlackBoxCore.get().isBlackProcess() || BlackBoxCore.get().isServerProcess();
        }
    }

    @ProxyMethod("checkPermission")
    /* loaded from: classes3.dex */
    public static class checkPermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceLastUid(objArr);
            String str = (String) objArr[0];
            if (str.equals("android.permission.ACCOUNT_MANAGER") || str.equals("android.permission.SEND_SMS")) {
                return 0;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("checkUriPermission")
    /* loaded from: classes3.dex */
    public static class checkUriPermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("finishReceiver")
    /* loaded from: classes3.dex */
    public static class finishReceiver extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getCurrentUser")
    /* loaded from: classes3.dex */
    public static class getCurrentUser extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ((UserInfoStatic) BlackReflection.create(UserInfoStatic.class, null, false))._new(BActivityThread.getUserId(), "BlackBox", ((UserInfoStatic) BlackReflection.create(UserInfoStatic.class, null, false)).FLAG_PRIMARY().intValue());
        }
    }

    @ProxyMethod("getHistoricalProcessExitReasons")
    /* loaded from: classes3.dex */
    public static class getHistoricalProcessExitReasons extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(new ArrayList());
        }
    }

    @ProxyMethod("getPackageForIntentSender")
    /* loaded from: classes3.dex */
    public static class getPackageForIntentSender extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BlackBoxCore.getBActivityManager().getPackageForIntentSender(((IInterface) objArr[0]).asBinder());
        }
    }

    @ProxyMethod("getUidForIntentSender")
    /* loaded from: classes3.dex */
    public static class getUidForIntentSender extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(BlackBoxCore.getBActivityManager().getUidForIntentSender(((IInterface) objArr[0]).asBinder()));
        }
    }

    @ProxyMethod("registerUidObserver")
    /* loaded from: classes3.dex */
    public static class registerUidObserver extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("setRequestedOrientation")
    /* loaded from: classes3.dex */
    public static class setRequestedOrientation extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable th) {
                th.printStackTrace();
                return 0;
            }
        }
    }

    @ProxyMethod("setServiceForeground")
    /* loaded from: classes3.dex */
    public static class setServiceForeground extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("unregisterReceiver")
    /* loaded from: classes3.dex */
    public static class unregisterReceiver extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("unregisterUidObserver")
    /* loaded from: classes3.dex */
    public static class unregisterUidObserver extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("updateConfiguration")
    /* loaded from: classes3.dex */
    public static class updateConfiguration extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public static Object BindServiceCommon(Object obj, Method method, Object[] objArr, int i) {
        StringBuilder append;
        IInterface iInterface = (IInterface) objArr[0];
        IBinder iBinder = (IBinder) objArr[1];
        Intent intent = (Intent) objArr[2];
        String str = (String) objArr[3];
        IServiceConnection iServiceConnection = (IServiceConnection) objArr[4];
        ComponentName component = intent.getComponent();
        long intOrLongValue = getIntOrLongValue(objArr[5]);
        int intExtra = intent.getIntExtra("_B_|_UserId", -1);
        if (intExtra == -1) {
            intExtra = BActivityThread.getUserId();
        }
        ResolveInfo resolveService = BlackBoxCore.getBPackageManager().resolveService(intent, 0, str, intExtra);
        if (component == null || !component.getPackageName().equals(BlackBoxCore.getHostPkg())) {
            int i2 = isIsolated() ? 7 : 6;
            if (objArr.length > i2 && (objArr[i2] instanceof String)) {
                objArr[i2] = BlackBoxCore.getHostPkg();
            }
            if (resolveService != null) {
                if ((intOrLongValue & (-2147483648L)) != 0) {
                    objArr[5] = Long.valueOf(intOrLongValue & 2147483647L);
                }
                BActivityManager bActivityManager = BActivityManager.get();
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (bActivityManager.initProcess(serviceInfo.packageName, serviceInfo.name, intExtra) != null) {
                    objArr[2] = BlackBoxCore.getBActivityManager().bindService(intent, iServiceConnection == null ? null : iServiceConnection.asBinder(), str, intExtra);
                    objArr[4] = ServiceConnectionDelegate.createProxy(iServiceConnection, intent);
                    WeakReference<?> mDispatcher = ((LoadedApkServiceDispatcherInnerConnectionContext) BlackReflection.create(LoadedApkServiceDispatcherInnerConnectionContext.class, iServiceConnection, false)).mDispatcher();
                    if (mDispatcher != null && mDispatcher.get() != null) {
                        ((LoadedApkServiceDispatcherContext) BlackReflection.create(LoadedApkServiceDispatcherContext.class, mDispatcher.get(), false))._set_mConnection(ServiceConnectionDelegate.createProxy(iServiceConnection, intent));
                    }
                    return method.invoke(obj, objArr);
                }
                append = new StringBuilder("failed to initProcess for bindService: ").append(component);
            } else if (component != null && AppSystemEnv.isOpenPackage(component.getPackageName())) {
                MethodParameterUtils.replaceLastUserId(objArr);
                return method.invoke(obj, objArr);
            } else {
                append = new StringBuilder("Block bindService: ").append(intent);
            }
            Log.e("ActivityManager", append.toString());
            return 0;
        }
        return method.invoke(obj, objArr);
    }

    private static long getIntOrLongValue(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    private static boolean isIsolated() {
        return false;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        Object obj = null;
        if (BuildCompat.isOreo()) {
            obj = ((ActivityManagerOreoStatic) BlackReflection.create(ActivityManagerOreoStatic.class, null, false)).IActivityManagerSingleton();
        } else if (BuildCompat.isL()) {
            obj = AbstractC0566b.m166a().gDefault();
        }
        return ((SingletonContext) BlackReflection.create(SingletonContext.class, obj, false)).get();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        Object obj3 = null;
        if (BuildCompat.isOreo()) {
            obj3 = ((ActivityManagerOreoStatic) BlackReflection.create(ActivityManagerOreoStatic.class, null, false)).IActivityManagerSingleton();
        } else if (BuildCompat.isL()) {
            obj3 = AbstractC0566b.m166a().gDefault();
        }
        ((SingletonContext) BlackReflection.create(SingletonContext.class, obj3, false))._set_mInstance(obj2);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return getProxyInvocation() != getWho();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new PkgMethodProxy("getAppStartMode"));
        addMethodHook(new PkgMethodProxy("setAppLockedVerifying"));
        addMethodHook(new PkgMethodProxy("reportJunkFromApp"));
    }
}
