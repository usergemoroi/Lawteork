package top.niunaijun.blackbox.fake.service;

import android.os.IInterface;
import black.android.location.ILocationManagerStubStatic;
import black.android.location.provider.ProviderPropertiesContext;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.frameworks.BLocationManager;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ILocationManagerProxy extends BinderInvocationStub {
    public static final String TAG = "ILocationManagerProxy";

    @ProxyMethod("getAllProviders")
    /* loaded from: classes3.dex */
    public static class GetAllProviders extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Arrays.asList("gps", "network");
        }
    }

    @ProxyMethod("getBestProvider")
    /* loaded from: classes3.dex */
    public static class GetBestProvider extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BLocationManager.isFakeLocationEnable() ? "gps" : method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getLastKnownLocation")
    /* loaded from: classes3.dex */
    public static class GetLastKnownLocation extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BLocationManager.isFakeLocationEnable() ? BLocationManager.get().getLocation(BActivityThread.getUserId(), BActivityThread.getAppPackageName()).convert2SystemLocation() : method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getLastLocation")
    /* loaded from: classes3.dex */
    public static class GetLastLocation extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BLocationManager.isFakeLocationEnable() ? BLocationManager.get().getLocation(BActivityThread.getUserId(), BActivityThread.getAppPackageName()).convert2SystemLocation() : method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getProviderProperties")
    /* loaded from: classes3.dex */
    public static class GetProviderProperties extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Object invoke = method.invoke(obj, objArr);
            if (BLocationManager.isFakeLocationEnable()) {
                Boolean bool = Boolean.FALSE;
                ((ProviderPropertiesContext) BlackReflection.create(ProviderPropertiesContext.class, invoke, false))._set_mHasNetworkRequirement(bool);
                if (BLocationManager.get().getCell(BActivityThread.getUserId(), BActivityThread.getAppPackageName()) == null) {
                    ((ProviderPropertiesContext) BlackReflection.create(ProviderPropertiesContext.class, invoke, false))._set_mHasCellRequirement(bool);
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("registerGnssStatusCallback")
    /* loaded from: classes3.dex */
    public static class RegisterGnssStatusCallback extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("removeGpsStatusListener")
    /* loaded from: classes3.dex */
    public static class RemoveGpsStatusListener extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("removeUpdates")
    /* loaded from: classes3.dex */
    public static class RemoveUpdates extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Object obj2 = objArr[0];
            if (obj2 instanceof IInterface) {
                BLocationManager.get().removeUpdates(((IInterface) obj2).asBinder());
                return 0;
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("requestLocationUpdates")
    /* loaded from: classes3.dex */
    public static class RequestLocationUpdates extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (BLocationManager.isFakeLocationEnable()) {
                Object obj2 = objArr[1];
                if (obj2 instanceof IInterface) {
                    BLocationManager.get().requestLocationUpdates(((IInterface) obj2).asBinder());
                    return 0;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("isProviderEnabledForUser")
    /* loaded from: classes3.dex */
    public static class isProviderEnabledForUser extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.valueOf(Objects.equals((String) objArr[0], "gps"));
        }
    }

    @ProxyMethod("setExtraLocationControllerPackageEnabled")
    /* loaded from: classes3.dex */
    public static class setExtraLocationControllerPackageEnabled extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public ILocationManagerProxy() {
        super(AbstractC0922a.m88a().getService("location"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((ILocationManagerStubStatic) BlackReflection.create(ILocationManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("location"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("location");
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
