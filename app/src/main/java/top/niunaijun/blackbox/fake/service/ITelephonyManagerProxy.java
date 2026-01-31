package top.niunaijun.blackbox.fake.service;

import android.util.Log;
import black.com.android.internal.telephony.ITelephonyStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.frameworks.BLocationManager;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.Md5Utils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ITelephonyManagerProxy extends BinderInvocationStub {
    public static final String TAG = "ITelephonyManagerProxy";

    @ProxyMethod("getAllCellInfo")
    /* loaded from: classes3.dex */
    public static class GetAllCellInfo extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (BLocationManager.isFakeLocationEnable()) {
                return BLocationManager.get().getAllCell(BActivityThread.getUserId(), BActivityThread.getAppPackageName());
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable th) {
                return null;
            }
        }
    }

    @ProxyMethod("getCellLocation")
    /* loaded from: classes3.dex */
    public static class GetCellLocation extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Log.d(ITelephonyManagerProxy.TAG, "getCellLocation");
            if (!BLocationManager.isFakeLocationEnable() || BLocationManager.get().getCell(BActivityThread.getUserId(), BActivityThread.getAppPackageName()) == null) {
                return method.invoke(obj, objArr);
            }
            return null;
        }
    }

    @ProxyMethod("getDeviceId")
    /* loaded from: classes3.dex */
    public static class GetDeviceId extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("getDeviceIdWithFeature")
    /* loaded from: classes3.dex */
    public static class GetDeviceIdWithFeature extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("getMeidForSlot")
    /* loaded from: classes3.dex */
    public static class GetMeidForSlot extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("getNeighboringCellInfo")
    /* loaded from: classes3.dex */
    public static class GetNeighboringCellInfo extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Log.d(ITelephonyManagerProxy.TAG, "getNeighboringCellInfo");
            if (BLocationManager.isFakeLocationEnable()) {
                BLocationManager.get().getNeighboringCell(BActivityThread.getUserId(), BActivityThread.getAppPackageName());
                return null;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getNetworkOperator")
    /* loaded from: classes3.dex */
    public static class GetNetworkOperator extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Log.d(ITelephonyManagerProxy.TAG, "getNetworkOperator");
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getNetworkTypeForSubscriber")
    /* loaded from: classes3.dex */
    public static class GetNetworkTypeForSubscriber extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable th) {
                return 0;
            }
        }
    }

    @ProxyMethod("getSubscriberId")
    /* loaded from: classes3.dex */
    public static class GetSubscriberId extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("isUserDataEnabled")
    /* loaded from: classes3.dex */
    public static class IsUserDataEnabled extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("getImeiForSlot")
    /* loaded from: classes3.dex */
    public static class getImeiForSlot extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Md5Utils.md5(BlackBoxCore.getHostPkg());
        }
    }

    @ProxyMethod("getLine1NumberForDisplay")
    /* loaded from: classes3.dex */
    public static class getLine1NumberForDisplay extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    public ITelephonyManagerProxy() {
        super(AbstractC0922a.m88a().getService("phone"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((ITelephonyStubStatic) BlackReflection.create(ITelephonyStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("phone"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("phone");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
