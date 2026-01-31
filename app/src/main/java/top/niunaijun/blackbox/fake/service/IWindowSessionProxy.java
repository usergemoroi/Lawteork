package top.niunaijun.blackbox.fake.service;

import android.os.IInterface;
import android.view.WindowManager;
import java.lang.reflect.Method;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
/* loaded from: classes3.dex */
public class IWindowSessionProxy extends BinderInvocationStub {
    public static final String TAG = "WindowSessionStub";
    private IInterface mSession;

    @ProxyMethod("addToDisplay")
    /* loaded from: classes3.dex */
    public static class AddToDisplay extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            for (Object obj2 : objArr) {
                if (obj2 != null && (obj2 instanceof WindowManager.LayoutParams)) {
                    ((WindowManager.LayoutParams) obj2).packageName = BlackBoxCore.getHostPkg();
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("addToDisplayAsUser")
    /* loaded from: classes3.dex */
    public static class AddToDisplayAsUser extends AddToDisplay {
    }

    public IWindowSessionProxy(IInterface iInterface) {
        super(iInterface.asBinder());
        this.mSession = iInterface;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getProxyInvocation() {
        return super.getProxyInvocation();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return this.mSession;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
