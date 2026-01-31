package top.niunaijun.blackbox.fake.service;

import android.os.IBinder;
import black.android.p009os.IVibratorManagerServiceStubStatic;
import black.com.android.internal.p010os.IVibratorServiceStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IVibratorServiceProxy extends BinderInvocationStub {
    private static String NAME;

    static {
        NAME = BuildCompat.isS() ? "vibrator_manager" : "vibrator";
    }

    public IVibratorServiceProxy() {
        super(AbstractC0922a.m88a().getService(NAME));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        IBinder service = AbstractC0922a.m88a().getService(NAME);
        if (BuildCompat.isS()) {
            return ((IVibratorManagerServiceStubStatic) BlackReflection.create(IVibratorManagerServiceStubStatic.class, null, false)).asInterface(service);
        }
        return ((IVibratorServiceStubStatic) BlackReflection.create(IVibratorServiceStubStatic.class, null, false)).asInterface(service);
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(NAME);
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstUid(objArr);
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
