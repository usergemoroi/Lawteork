package top.niunaijun.blackbox.fake.service;

import black.android.content.p008pm.UserInfoStatic;
import black.android.p009os.IUserManagerStubStatic;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IUserManagerProxy extends BinderInvocationStub {

    @ProxyMethod("getApplicationRestrictions")
    /* loaded from: classes3.dex */
    public static class GetApplicationRestrictions extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            objArr[0] = BlackBoxCore.getHostPkg();
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getProfileParent")
    /* loaded from: classes3.dex */
    public static class GetProfileParent extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ((UserInfoStatic) BlackReflection.create(UserInfoStatic.class, null, false))._new(BActivityThread.getUserId(), "BlackBox", ((UserInfoStatic) BlackReflection.create(UserInfoStatic.class, null, false)).FLAG_PRIMARY().intValue());
        }
    }

    @ProxyMethod("getUsers")
    /* loaded from: classes3.dex */
    public static class getUsers extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return new ArrayList();
        }
    }

    public IUserManagerProxy() {
        super(AbstractC0922a.m88a().getService("user"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IUserManagerStubStatic) BlackReflection.create(IUserManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("user"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("user");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
