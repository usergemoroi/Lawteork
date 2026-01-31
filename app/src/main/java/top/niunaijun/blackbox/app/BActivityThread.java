package top.niunaijun.blackbox.app;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Service;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.webkit.WebView;
import black.android.app.ActivityThreadActivityClientRecordContext;
import black.android.app.ActivityThreadAppBindDataContext;
import black.android.app.ActivityThreadNMR1Context;
import black.android.app.ActivityThreadQContext;
import black.android.app.LoadedApkContext;
import black.android.app.ServiceContext;
import black.android.content.BroadcastReceiverContext;
import black.android.content.ContentProviderClientContext;
import black.android.graphics.CompatibilityStatic;
import black.android.security.net.config.NetworkSecurityConfigProviderContext;
import black.android.security.net.config.NetworkSecurityConfigProviderStatic;
import black.com.android.internal.content.ReferrerIntentStatic;
import black.dalvik.system.VMRuntimeContext;
import black.dalvik.system.VMRuntimeStatic;
import java.lang.reflect.Method;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.lsposed.lsparanoid.DeobfuscatorHelper;
import p007b.AbstractC0565a;
import p007b.AbstractC0566b;
import p007b.AbstractC0567c;
import p007b.AbstractC0568d;
import p019i.AbstractC0929a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.configuration.AppLifecycleCallback;
import top.niunaijun.blackbox.app.dispatcher.AppServiceDispatcher;
import top.niunaijun.blackbox.core.CrashHandler;
import top.niunaijun.blackbox.core.IBActivityThread;
import top.niunaijun.blackbox.core.IOCore;
import top.niunaijun.blackbox.core.env.VirtualRuntime;
import top.niunaijun.blackbox.core.system.user.BUserHandle;
import top.niunaijun.blackbox.entity.AppConfig;
import top.niunaijun.blackbox.entity.p028am.ReceiverData;
import top.niunaijun.blackbox.fake.delegate.AppInstrumentation;
import top.niunaijun.blackbox.fake.delegate.ContentProviderDelegate;
import top.niunaijun.blackbox.fake.hook.HookManager;
import top.niunaijun.blackbox.fake.service.HCallbackProxy;
import top.niunaijun.blackbox.utils.Reflector;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.ActivityManagerCompat;
import top.niunaijun.blackbox.utils.compat.ContextCompat;
import top.niunaijun.blackbox.utils.compat.StrictModeCompat;
import top.niunaijun.blackreflection.BlackReflection;
import top.niunaijun.blackreflection.utils.ClassUtil;
/* loaded from: classes3.dex */
public class BActivityThread extends IBActivityThread.Stub {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = DeobfuscatorHelper.getString(6981703492027657999L, AbstractC0929a.f169a);
    private static final Object mConfigLock = new Object();
    private static BActivityThread sBActivityThread;
    private AppConfig mAppConfig;
    private AppBindData mBoundApplication;
    private Application mInitialApplication;
    private final List<ProviderInfo> mProviders = new ArrayList();

    /* renamed from: mH */
    private final Handler f244mH = BlackBoxCore.get().getHandler();

    /* loaded from: classes3.dex */
    public static class AppBindData {
        ApplicationInfo appInfo;
        Object info;
        String processName;
        List<ProviderInfo> providers;
    }

    public static Context createPackageContext(ApplicationInfo applicationInfo) {
        try {
            return BlackBoxCore.getContext().createPackageContext(applicationInfo.packageName, 3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BActivityThread currentActivityThread() {
        if (sBActivityThread == null) {
            synchronized (BActivityThread.class) {
                if (sBActivityThread == null) {
                    sBActivityThread = new BActivityThread();
                }
            }
        }
        return sBActivityThread;
    }

    public static Activity getActivityByToken(IBinder iBinder) {
        return ((ActivityThreadActivityClientRecordContext) BlackReflection.create(ActivityThreadActivityClientRecordContext.class, AbstractC0567c.m164a(BlackBoxCore.mainThread()).mActivities().get(iBinder), false)).activity();
    }

    public static AppConfig getAppConfig() {
        AppConfig appConfig;
        synchronized (mConfigLock) {
            appConfig = currentActivityThread().mAppConfig;
        }
        return appConfig;
    }

    public static String getAppPackageName() {
        if (getAppConfig() != null) {
            return getAppConfig().packageName;
        }
        if (currentActivityThread().mInitialApplication != null) {
            return currentActivityThread().mInitialApplication.getPackageName();
        }
        return null;
    }

    public static int getAppPid() {
        if (getAppConfig() == null) {
            return -1;
        }
        return getAppConfig().bpid;
    }

    public static String getAppProcessName() {
        if (getAppConfig() != null) {
            return getAppConfig().processName;
        }
        if (currentActivityThread().mBoundApplication != null) {
            return currentActivityThread().mBoundApplication.processName;
        }
        return null;
    }

    public static Application getApplication() {
        return currentActivityThread().mInitialApplication;
    }

    public static int getBAppId() {
        return BUserHandle.getAppId(BlackBoxCore.getHostUid());
    }

    public static int getBUid() {
        return getAppConfig() == null ? BUserHandle.AID_APP_START : getAppConfig().buid;
    }

    public static int getCallingBUid() {
        return getAppConfig() == null ? BlackBoxCore.getHostUid() : getAppConfig().callingBUid;
    }

    public static List<ProviderInfo> getProviders() {
        return currentActivityThread().mProviders;
    }

    public static int getUid() {
        if (getAppConfig() == null) {
            return -1;
        }
        return getAppConfig().uid;
    }

    public static int getUserId() {
        if (getAppConfig() == null) {
            return 0;
        }
        return getAppConfig().userId;
    }

    public static void installProvider(Object obj, Context context, ProviderInfo providerInfo, Object obj2) {
        Method findMethodByFirstName = Reflector.findMethodByFirstName(obj.getClass(), DeobfuscatorHelper.getString(6981703775495499535L, AbstractC0929a.f169a));
        if (findMethodByFirstName != null) {
            findMethodByFirstName.setAccessible(true);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            findMethodByFirstName.invoke(obj, context, obj2, providerInfo, bool, bool2, bool2);
        }
    }

    private void installProviders(Context context, String str, List<ProviderInfo> list) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            for (ProviderInfo providerInfo : list) {
                try {
                    if (str.equals(providerInfo.processName) || providerInfo.processName.equals(context.getPackageName()) || providerInfo.multiprocess) {
                        installProvider(BlackBoxCore.mainThread(), context, providerInfo, null);
                    }
                } catch (Throwable th) {
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            ContentProviderDelegate.init();
        }
    }

    private static boolean isBlockedTool(String str) {
        if (str != null) {
            String[] strArr = AbstractC0929a.f169a;
            if (str.contains(DeobfuscatorHelper.getString(6981704149157654287L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981704114797915919L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981704033193537295L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981704003128766223L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981703960179093263L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981703938704256783L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981703908639485711L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981703861394845455L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981703822740139791L, strArr))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isThreadInit() {
        return sBActivityThread != null;
    }

    private static boolean ispkgname(String str) {
        if (str != null) {
            String[] strArr = AbstractC0929a.f169a;
            if (str.contains(DeobfuscatorHelper.getString(6981704290891575055L, strArr)) || str.contains(DeobfuscatorHelper.getString(6981704179222425359L, strArr))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$finishActivity$1(IBinder iBinder) {
        Map<IBinder, Object> mActivities = AbstractC0567c.m164a(BlackBoxCore.mainThread()).mActivities();
        if (mActivities.isEmpty() || mActivities.get(iBinder) == null) {
            return;
        }
        Activity activityByToken = getActivityByToken(iBinder);
        while (activityByToken.getParent() != null) {
            activityByToken = activityByToken.getParent();
        }
        ActivityManagerCompat.finishActivity(iBinder, AbstractC0565a.m167a(activityByToken).mResultCode().intValue(), AbstractC0565a.m167a(activityByToken).mResultData());
        AbstractC0565a.m167a(activityByToken)._set_mFinished(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void lambda$handleNewIntent$2(Intent intent, IBinder iBinder) {
        Intent _new = ((ReferrerIntentStatic) BlackReflection.create(ReferrerIntentStatic.class, null, false))._new(intent, BlackBoxCore.getHostPkg());
        Object mainThread = BlackBoxCore.mainThread();
        if (AbstractC0567c.m164a(BlackBoxCore.mainThread())._check_performNewIntents(null, null) != null) {
            AbstractC0567c.m164a(mainThread).performNewIntents(iBinder, Collections.singletonList(_new));
        } else if (((ActivityThreadNMR1Context) BlackReflection.create(ActivityThreadNMR1Context.class, mainThread, false))._check_performNewIntents(null, null, false) != null) {
            ((ActivityThreadNMR1Context) BlackReflection.create(ActivityThreadNMR1Context.class, mainThread, false)).performNewIntents(iBinder, Collections.singletonList(_new), true);
        } else if (((ActivityThreadQContext) BlackReflection.create(ActivityThreadQContext.class, mainThread, false))._check_handleNewIntent(null, null) != null) {
            ((ActivityThreadQContext) BlackReflection.create(ActivityThreadQContext.class, mainThread, false)).handleNewIntent(iBinder, Collections.singletonList(_new));
        }
    }

    private void onAfterApplicationOnCreate(String str, String str2, Application application) {
        for (AppLifecycleCallback appLifecycleCallback : BlackBoxCore.get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.afterApplicationOnCreate(str, str2, application, getUserId());
        }
    }

    private void onBeforeApplicationOnCreate(String str, String str2, Application application) {
        for (AppLifecycleCallback appLifecycleCallback : BlackBoxCore.get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.beforeApplicationOnCreate(str, str2, application, getUserId());
        }
    }

    private void onBeforeCreateApplication(String str, String str2, Context context) {
        for (AppLifecycleCallback appLifecycleCallback : BlackBoxCore.get().getAppLifecycleCallbacks()) {
            appLifecycleCallback.beforeCreateApplication(str, str2, context, getUserId());
        }
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
        if (!isInit()) {
            bindApplication(getAppConfig().packageName, getAppConfig().processName);
        }
        for (String str : providerInfo.authority.split(DeobfuscatorHelper.getString(6981703706776022799L, AbstractC0929a.f169a))) {
            IInterface mContentProvider = ((ContentProviderClientContext) BlackReflection.create(ContentProviderClientContext.class, BlackBoxCore.getContext().getContentResolver().acquireContentProviderClient(str), false)).mContentProvider();
            if (mContentProvider != null) {
                return mContentProvider.asBinder();
            }
        }
        return null;
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public void bindApplication() {
        if (isInit()) {
            return;
        }
        bindApplication(getAppPackageName(), getAppProcessName());
    }

    public JobService createJobService(ServiceInfo serviceInfo) {
        if (!currentActivityThread().isInit()) {
            currentActivityThread().bindApplication(serviceInfo.packageName, serviceInfo.processName);
        }
        try {
            JobService jobService = (JobService) ((LoadedApkContext) BlackReflection.create(LoadedApkContext.class, this.mBoundApplication.info, false)).getClassLoader().loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = BlackBoxCore.getContext().createPackageContext(serviceInfo.packageName, 3);
                AbstractC0568d.m163a(createPackageContext).setOuterContext(jobService);
                ((ServiceContext) BlackReflection.create(ServiceContext.class, jobService, false)).attach(createPackageContext, BlackBoxCore.mainThread(), serviceInfo.name, currentActivityThread().getActivityThread(), this.mInitialApplication, AbstractC0566b.m166a().getDefault());
                ContextCompat.fix(createPackageContext);
                jobService.onCreate();
                jobService.onBind(null);
                return jobService;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                String[] strArr = AbstractC0929a.f169a;
                throw new RuntimeException(sb.append(DeobfuscatorHelper.getString(6981704591539285775L, strArr)).append(serviceInfo.name).append(DeobfuscatorHelper.getString(6981704466985234191L, strArr)).append(e.toString()).toString(), e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            String[] strArr2 = AbstractC0929a.f169a;
            Slog.m18e(DeobfuscatorHelper.getString(6981704797697715983L, strArr2), DeobfuscatorHelper.getString(6981704728978239247L, strArr2) + serviceInfo.name + DeobfuscatorHelper.getString(6981704604424187663L, strArr2) + e2.toString());
            return null;
        }
    }

    public Service createService(ServiceInfo serviceInfo, IBinder iBinder) {
        if (!currentActivityThread().isInit()) {
            currentActivityThread().bindApplication(serviceInfo.packageName, serviceInfo.processName);
        }
        try {
            Service service = (Service) ((LoadedApkContext) BlackReflection.create(LoadedApkContext.class, this.mBoundApplication.info, false)).getClassLoader().loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = BlackBoxCore.getContext().createPackageContext(serviceInfo.packageName, 3);
                AbstractC0568d.m163a(createPackageContext).setOuterContext(service);
                ((ServiceContext) BlackReflection.create(ServiceContext.class, service, false)).attach(createPackageContext, BlackBoxCore.mainThread(), serviceInfo.name, iBinder, this.mInitialApplication, AbstractC0566b.m166a().getDefault());
                ContextCompat.fix(createPackageContext);
                service.onCreate();
                return service;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                String[] strArr = AbstractC0929a.f169a;
                throw new RuntimeException(sb.append(DeobfuscatorHelper.getString(6981704922251767567L, strArr)).append(serviceInfo.name).append(DeobfuscatorHelper.getString(6981704810582617871L, strArr)).append(e.toString()).toString(), e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            String[] strArr2 = AbstractC0929a.f169a;
            Slog.m18e(DeobfuscatorHelper.getString(6981705137000132367L, strArr2), DeobfuscatorHelper.getString(6981705068280655631L, strArr2) + serviceInfo.name + DeobfuscatorHelper.getString(6981704935136669455L, strArr2) + e2.toString());
            return null;
        }
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public void finishActivity(final IBinder iBinder) {
        this.f244mH.post(new Runnable() { // from class: top.niunaijun.blackbox.app.BActivityThread$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BActivityThread.lambda$finishActivity$1(iBinder);
            }
        });
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public IBinder getActivityThread() {
        return AbstractC0567c.m164a(BlackBoxCore.mainThread()).getApplicationThread();
    }

    public Object getPackageInfo() {
        return this.mBoundApplication.info;
    }

    public synchronized void handleBindApplication(String str, String str2) {
        if (isInit()) {
            return;
        }
        try {
            CrashHandler.create();
        } catch (Throwable th) {
        }
        Binder.clearCallingIdentity();
        PackageInfo packageInfo = BlackBoxCore.getBPackageManager().getPackageInfo(str, 8, getUserId());
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (packageInfo.providers == null) {
            packageInfo.providers = new ProviderInfo[0];
        }
        this.mProviders.addAll(Arrays.asList(packageInfo.providers));
        Object mBoundApplication = AbstractC0567c.m164a(BlackBoxCore.mainThread()).mBoundApplication();
        Context createPackageContext = createPackageContext(applicationInfo);
        Object mPackageInfo = AbstractC0568d.m163a(createPackageContext).mPackageInfo();
        ((LoadedApkContext) BlackReflection.create(LoadedApkContext.class, mPackageInfo, false))._set_mSecurityViolation(Boolean.FALSE);
        ((LoadedApkContext) BlackReflection.create(LoadedApkContext.class, mPackageInfo, false))._set_mApplicationInfo(applicationInfo);
        int i = applicationInfo.targetSdkVersion;
        int i2 = Build.VERSION.SDK_INT;
        if (i < 24) {
            StrictModeCompat.disableDeathOnFileUriExposure();
        }
        getAppPackageName();
        VirtualRuntime.setupRuntime(str2, applicationInfo);
        ((VMRuntimeContext) BlackReflection.create(VMRuntimeContext.class, ((VMRuntimeStatic) BlackReflection.create(VMRuntimeStatic.class, null, false)).getRuntime(), false)).setTargetSdkVersion(applicationInfo.targetSdkVersion);
        if (i2 >= 31) {
            ((CompatibilityStatic) BlackReflection.create(CompatibilityStatic.class, null, false)).setTargetSdkVersion(applicationInfo.targetSdkVersion);
        }
        BlackBoxCore.init(i2);
        if (createPackageContext == null) {
            throw new AssertionError();
        }
        IOCore.get().enableRedirect(createPackageContext);
        AppBindData appBindData = new AppBindData();
        appBindData.appInfo = applicationInfo;
        appBindData.processName = str2;
        appBindData.info = mPackageInfo;
        appBindData.providers = this.mProviders;
        ActivityThreadAppBindDataContext activityThreadAppBindDataContext = (ActivityThreadAppBindDataContext) BlackReflection.create(ActivityThreadAppBindDataContext.class, mBoundApplication, false);
        activityThreadAppBindDataContext._set_instrumentationName(new ComponentName(appBindData.appInfo.packageName, Instrumentation.class.getName()));
        activityThreadAppBindDataContext._set_appInfo(appBindData.appInfo);
        activityThreadAppBindDataContext._set_info(appBindData.info);
        activityThreadAppBindDataContext._set_processName(appBindData.processName);
        activityThreadAppBindDataContext._set_providers(appBindData.providers);
        this.mBoundApplication = appBindData;
        if (ClassUtil.classReady(NetworkSecurityConfigProviderContext.class) != null) {
            Security.removeProvider(DeobfuscatorHelper.getString(6981704454100332303L, AbstractC0929a.f169a));
            ((NetworkSecurityConfigProviderStatic) BlackReflection.create(NetworkSecurityConfigProviderStatic.class, null, false)).install(createPackageContext);
        }
        try {
            onBeforeCreateApplication(str, str2, createPackageContext);
            Application makeApplication = ((LoadedApkContext) BlackReflection.create(LoadedApkContext.class, mPackageInfo, false)).makeApplication(false, null);
            ContextCompat.fix(makeApplication);
            ContextCompat.fix((Context) AbstractC0567c.m164a(BlackBoxCore.mainThread()).getSystemContext());
            this.mInitialApplication = makeApplication;
            AbstractC0567c.m164a(BlackBoxCore.mainThread())._set_mInitialApplication(this.mInitialApplication);
            installProviders(this.mInitialApplication, appBindData.processName, appBindData.providers);
            onBeforeApplicationOnCreate(str, str2, makeApplication);
            AppInstrumentation.get().callApplicationOnCreate(makeApplication);
            onAfterApplicationOnCreate(str, str2, makeApplication);
            HookManager.get().checkEnv(HCallbackProxy.class);
            if (!isBlockedTool(getAppPackageName())) {
                new WebView(createPackageContext).destroy();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(DeobfuscatorHelper.getString(6981704402560724751L, AbstractC0929a.f169a), e);
        }
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public void handleNewIntent(final IBinder iBinder, final Intent intent) {
        this.f244mH.post(new Runnable() { // from class: top.niunaijun.blackbox.app.BActivityThread$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BActivityThread.lambda$handleNewIntent$2(intent, iBinder);
            }
        });
    }

    public void initProcess(AppConfig appConfig) {
        synchronized (mConfigLock) {
            AppConfig appConfig2 = this.mAppConfig;
            if (appConfig2 != null && !appConfig2.packageName.equals(appConfig.packageName)) {
                StringBuilder sb = new StringBuilder();
                String[] strArr = AbstractC0929a.f169a;
                throw new RuntimeException(sb.append(DeobfuscatorHelper.getString(6981705321683726095L, strArr)).append(appConfig.processName).append(DeobfuscatorHelper.getString(6981705227194445583L, strArr)).append(this.mAppConfig.processName).toString());
            }
            this.mAppConfig = appConfig;
            final IBinder asBinder = asBinder();
            try {
                asBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: top.niunaijun.blackbox.app.BActivityThread.1
                    @Override // android.os.IBinder.DeathRecipient
                    public void binderDied() {
                        synchronized (BActivityThread.mConfigLock) {
                            try {
                                asBinder.linkToDeath(this, 0);
                            } catch (RemoteException e) {
                            }
                            BActivityThread.this.mAppConfig = null;
                        }
                    }
                }, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isInit() {
        return this.mBoundApplication != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$bindApplication$0$top-niunaijun-blackbox-app-BActivityThread */
    public /* synthetic */ void m33x40eb976e(String str, String str2, ConditionVariable conditionVariable) {
        handleBindApplication(str, str2);
        conditionVariable.open();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$scheduleReceiver$3$top-niunaijun-blackbox-app-BActivityThread */
    public void m32x898f55be(ReceiverData receiverData) {
        Context baseContext;
        BroadcastReceiver broadcastReceiver;
        Intent intent = receiverData.intent;
        ActivityInfo activityInfo = receiverData.activityInfo;
        BroadcastReceiver.PendingResult build = receiverData.data.build();
        BroadcastReceiver broadcastReceiver2 = null;
        try {
            baseContext = this.mInitialApplication.getBaseContext();
            ClassLoader classLoader = baseContext.getClassLoader();
            intent.setExtrasClassLoader(classLoader);
            broadcastReceiver = (BroadcastReceiver) classLoader.loadClass(activityInfo.name).newInstance();
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BroadcastReceiverContext) BlackReflection.create(BroadcastReceiverContext.class, broadcastReceiver, false)).setPendingResult(build);
            broadcastReceiver.onReceive(baseContext, intent);
            BroadcastReceiver.PendingResult pendingResult = ((BroadcastReceiverContext) BlackReflection.create(BroadcastReceiverContext.class, broadcastReceiver, false)).getPendingResult();
            if (pendingResult != null) {
                pendingResult.finish();
            }
            BlackBoxCore.getBActivityManager().finishBroadcast(receiverData.data);
        } catch (Throwable th2) {
            th = th2;
            broadcastReceiver2 = broadcastReceiver;
            th.printStackTrace();
            String[] strArr = AbstractC0929a.f169a;
            Slog.m18e(DeobfuscatorHelper.getString(6981703698186088207L, strArr), DeobfuscatorHelper.getString(6981703629466611471L, strArr) + intent + DeobfuscatorHelper.getString(6981703513502494479L, strArr) + broadcastReceiver2);
        }
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public IBinder peekService(Intent intent) {
        return AppServiceDispatcher.get().peekService(intent);
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public void restartJobService(String str) {
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public void scheduleReceiver(final ReceiverData receiverData) {
        if (!isInit()) {
            bindApplication();
        }
        this.f244mH.post(new Runnable() { // from class: top.niunaijun.blackbox.app.BActivityThread$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BActivityThread.this.m32x898f55be(receiverData);
            }
        });
    }

    @Override // top.niunaijun.blackbox.core.IBActivityThread
    public void stopService(Intent intent) {
        AppServiceDispatcher.get().stopService(intent);
    }

    public void bindApplication(final String str, final String str2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            handleBindApplication(str, str2);
            return;
        }
        final ConditionVariable conditionVariable = new ConditionVariable();
        BlackBoxCore.get().getHandler().post(new Runnable() { // from class: top.niunaijun.blackbox.app.BActivityThread$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BActivityThread.this.m33x40eb976e(str, str2, conditionVariable);
            }
        });
        conditionVariable.block();
    }
}
