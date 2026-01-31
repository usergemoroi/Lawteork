package top.niunaijun.blackbox.fake.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import black.android.app.ActivityClientActivityClientControllerSingletonContext;
import black.android.app.ActivityClientContext;
import black.android.app.ActivityClientStatic;
import black.android.app.ActivityThreadActivityClientRecordContext;
import black.android.app.ActivityThreadCreateServiceDataContext;
import black.android.app.ActivityThreadHStatic;
import black.android.app.IActivityManagerContext;
import black.android.app.servertransaction.ClientTransactionContext;
import black.android.app.servertransaction.LaunchActivityItemContext;
import black.android.p009os.HandlerContext;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.lsposed.lsparanoid.DeobfuscatorHelper;
import p007b.AbstractC0566b;
import p007b.AbstractC0567c;
import p019i.AbstractC0929a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.hook.IInjectHook;
import top.niunaijun.blackbox.proxy.ProxyManifest;
import top.niunaijun.blackbox.proxy.record.ProxyActivityRecord;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
import top.niunaijun.blackreflection.utils.ClassUtil;
/* loaded from: classes3.dex */
public class HCallbackProxy implements IInjectHook, Handler.Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = DeobfuscatorHelper.getString(6981696040259399439L, AbstractC0929a.f169a);
    private AtomicBoolean mBeing = new AtomicBoolean(false);
    private Handler.Callback mOtherCallback;

    private void checkActivityClient() {
        try {
            Object activityClientController = ((ActivityClientStatic) BlackReflection.create(ActivityClientStatic.class, null, false)).getActivityClientController();
            if (activityClientController instanceof Proxy) {
                return;
            }
            IActivityClientProxy iActivityClientProxy = new IActivityClientProxy(activityClientController);
            iActivityClientProxy.onlyProxy(true);
            iActivityClientProxy.injectHook();
            ((ActivityClientActivityClientControllerSingletonContext) BlackReflection.create(ActivityClientActivityClientControllerSingletonContext.class, ((ActivityClientContext) BlackReflection.create(ActivityClientContext.class, ((ActivityClientStatic) BlackReflection.create(ActivityClientStatic.class, null, false)).getInstance(), false)).INTERFACE_SINGLETON(), false))._set_mKnownInstance(iActivityClientProxy.getProxyInvocation());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private Handler getH() {
        return AbstractC0567c.m164a(BlackBoxCore.mainThread()).m160mH();
    }

    private Handler.Callback getHCallback() {
        return ((HandlerContext) BlackReflection.create(HandlerContext.class, getH(), false)).mCallback();
    }

    private Object getLaunchActivityItem(Object obj) {
        List<Object> mActivityCallbacks = ((ClientTransactionContext) BlackReflection.create(ClientTransactionContext.class, obj, false)).mActivityCallbacks();
        if (mActivityCallbacks != null) {
            for (Object obj2 : mActivityCallbacks) {
                if (ClassUtil.classReady(LaunchActivityItemContext.class).getName().equals(obj2.getClass().getCanonicalName())) {
                    return obj2;
                }
            }
            return null;
        }
        return null;
    }

    private boolean handleCreateService(Object obj) {
        if (BActivityThread.getAppConfig() != null) {
            String appPackageName = BActivityThread.getAppPackageName();
            if (appPackageName == null) {
                throw new AssertionError();
            }
            ServiceInfo info = ((ActivityThreadCreateServiceDataContext) BlackReflection.create(ActivityThreadCreateServiceDataContext.class, obj, false)).info();
            if (!info.name.equals(ProxyManifest.getProxyService(BActivityThread.getAppPid())) && !info.name.equals(ProxyManifest.getProxyJobService(BActivityThread.getAppPid()))) {
                String[] strArr = AbstractC0929a.f169a;
                Slog.m20d(DeobfuscatorHelper.getString(6981696194878222095L, strArr), DeobfuscatorHelper.getString(6981696134748679951L, strArr) + obj);
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(appPackageName, info.name));
                BlackBoxCore.getBActivityManager().startService(intent, null, false, BActivityThread.getUserId());
                return true;
            }
        }
        return false;
    }

    private Boolean handleLaunchActivity(Message message) {
        Intent intent;
        IBinder iBinder;
        Object obj = message.obj;
        Object launchActivityItem = BuildCompat.isPie() ? getLaunchActivityItem(obj) : obj;
        if (launchActivityItem == null) {
            return Boolean.FALSE;
        }
        if (BuildCompat.isPie()) {
            intent = ((LaunchActivityItemContext) BlackReflection.create(LaunchActivityItemContext.class, launchActivityItem, false)).mIntent();
            iBinder = ((ClientTransactionContext) BlackReflection.create(ClientTransactionContext.class, obj, false)).mActivityToken();
        } else {
            ActivityThreadActivityClientRecordContext activityThreadActivityClientRecordContext = (ActivityThreadActivityClientRecordContext) BlackReflection.create(ActivityThreadActivityClientRecordContext.class, launchActivityItem, false);
            intent = activityThreadActivityClientRecordContext.intent();
            iBinder = activityThreadActivityClientRecordContext.token();
        }
        if (intent == null) {
            return Boolean.FALSE;
        }
        ProxyActivityRecord create = ProxyActivityRecord.create(intent);
        ActivityInfo activityInfo = create.mActivityInfo;
        if (activityInfo != null) {
            if (BActivityThread.getAppConfig() == null) {
                BlackBoxCore.getBActivityManager().restartProcess(activityInfo.packageName, activityInfo.processName, create.mUserId);
                ProxyActivityRecord.saveStub(intent, BlackBoxCore.getBPackageManager().getLaunchIntentForPackage(activityInfo.packageName, create.mUserId), create.mActivityInfo, create.mActivityRecord, create.mUserId);
                if (BuildCompat.isPie()) {
                    LaunchActivityItemContext launchActivityItemContext = (LaunchActivityItemContext) BlackReflection.create(LaunchActivityItemContext.class, launchActivityItem, false);
                    launchActivityItemContext._set_mIntent(intent);
                    launchActivityItemContext._set_mInfo(activityInfo);
                } else {
                    ActivityThreadActivityClientRecordContext activityThreadActivityClientRecordContext2 = (ActivityThreadActivityClientRecordContext) BlackReflection.create(ActivityThreadActivityClientRecordContext.class, launchActivityItem, false);
                    activityThreadActivityClientRecordContext2._set_intent(intent);
                    activityThreadActivityClientRecordContext2._set_activityInfo(activityInfo);
                }
            } else if (BActivityThread.currentActivityThread().isInit()) {
                BlackBoxCore.getBActivityManager().onActivityCreated(((IActivityManagerContext) BlackReflection.create(IActivityManagerContext.class, AbstractC0566b.m166a().getDefault(), false)).getTaskForActivity(iBinder, false).intValue(), iBinder, create.mActivityRecord);
                if (BuildCompat.isT()) {
                    LaunchActivityItemContext launchActivityItemContext2 = (LaunchActivityItemContext) BlackReflection.create(LaunchActivityItemContext.class, launchActivityItem, false);
                    launchActivityItemContext2._set_mIntent(create.mTarget);
                    launchActivityItemContext2._set_mInfo(activityInfo);
                    checkActivityClient();
                } else if (BuildCompat.isS()) {
                    ActivityThreadActivityClientRecordContext activityThreadActivityClientRecordContext3 = (ActivityThreadActivityClientRecordContext) BlackReflection.create(ActivityThreadActivityClientRecordContext.class, AbstractC0567c.m164a(BlackBoxCore.mainThread()).getLaunchingActivity(iBinder), false);
                    activityThreadActivityClientRecordContext3._set_intent(create.mTarget);
                    activityThreadActivityClientRecordContext3._set_activityInfo(activityInfo);
                    activityThreadActivityClientRecordContext3._set_packageInfo(BActivityThread.currentActivityThread().getPackageInfo());
                    checkActivityClient();
                } else if (BuildCompat.isPie()) {
                    LaunchActivityItemContext launchActivityItemContext3 = (LaunchActivityItemContext) BlackReflection.create(LaunchActivityItemContext.class, launchActivityItem, false);
                    launchActivityItemContext3._set_mIntent(create.mTarget);
                    launchActivityItemContext3._set_mInfo(activityInfo);
                } else {
                    ActivityThreadActivityClientRecordContext activityThreadActivityClientRecordContext4 = (ActivityThreadActivityClientRecordContext) BlackReflection.create(ActivityThreadActivityClientRecordContext.class, launchActivityItem, false);
                    activityThreadActivityClientRecordContext4._set_intent(create.mTarget);
                    activityThreadActivityClientRecordContext4._set_activityInfo(activityInfo);
                }
            } else {
                BActivityThread.currentActivityThread().bindApplication(activityInfo.packageName, activityInfo.processName);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Boolean handleLaunchActivity;
        boolean handleMessage;
        Boolean handleLaunchActivity2;
        if (this.mBeing.getAndSet(true)) {
            return false;
        }
        try {
            if (BuildCompat.isPie()) {
                if (message.what == ((ActivityThreadHStatic) BlackReflection.create(ActivityThreadHStatic.class, null, false)).EXECUTE_TRANSACTION().intValue() && (handleLaunchActivity2 = handleLaunchActivity(message)) != null && handleLaunchActivity2.booleanValue()) {
                    getH().sendMessageAtFrontOfQueue(Message.obtain(message));
                    return true;
                }
            } else if (message.what == ((ActivityThreadHStatic) BlackReflection.create(ActivityThreadHStatic.class, null, false)).LAUNCH_ACTIVITY().intValue() && (handleLaunchActivity = handleLaunchActivity(message)) != null && handleLaunchActivity.booleanValue()) {
                getH().sendMessageAtFrontOfQueue(Message.obtain(message));
                return true;
            }
            if (message.what == ((ActivityThreadHStatic) BlackReflection.create(ActivityThreadHStatic.class, null, false)).CREATE_SERVICE().intValue()) {
                handleMessage = handleCreateService(message.obj);
            } else {
                Handler.Callback callback = this.mOtherCallback;
                if (callback == null) {
                    return false;
                }
                handleMessage = callback.handleMessage(message);
            }
            return handleMessage;
        } finally {
            this.mBeing.set(false);
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public void injectHook() {
        Handler.Callback hCallback = getHCallback();
        this.mOtherCallback = hCallback;
        if (hCallback != null && (hCallback == this || hCallback.getClass().getName().equals(getClass().getName()))) {
            this.mOtherCallback = null;
        }
        ((HandlerContext) BlackReflection.create(HandlerContext.class, getH(), false))._set_mCallback(this);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        Handler.Callback hCallback = getHCallback();
        return (hCallback == null || hCallback == this) ? false : true;
    }
}
