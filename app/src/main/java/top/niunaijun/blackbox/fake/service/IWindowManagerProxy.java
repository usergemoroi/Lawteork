package top.niunaijun.blackbox.fake.service;

import android.os.IInterface;
import black.android.view.IWindowManagerStubStatic;
import black.android.view.WindowManagerGlobalStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IWindowManagerProxy extends BinderInvocationStub {
    public static final String TAG = "WindowManagerStub";

    @ProxyMethod("openSession")
    /* loaded from: classes3.dex */
    public static class OpenSession extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            IWindowSessionProxy iWindowSessionProxy = new IWindowSessionProxy((IInterface) method.invoke(obj, objArr));
            iWindowSessionProxy.injectHook();
            return iWindowSessionProxy.getProxyInvocation();
        }
    }

    public IWindowManagerProxy() {
        super(AbstractC0922a.m88a().getService("window"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IWindowManagerStubStatic) BlackReflection.create(IWindowManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("window"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("window");
        ((WindowManagerGlobalStatic) BlackReflection.create(WindowManagerGlobalStatic.class, null, false))._set_sWindowManagerService(null);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
