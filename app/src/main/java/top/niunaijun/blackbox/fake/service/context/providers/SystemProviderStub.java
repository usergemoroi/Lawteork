package top.niunaijun.blackbox.fake.service.context.providers;

import android.os.IInterface;
import black.android.content.AttributionSourceContext;
import java.lang.reflect.Method;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.utils.compat.ContextCompat;
import top.niunaijun.blackreflection.utils.ClassUtil;
/* loaded from: classes3.dex */
public class SystemProviderStub extends ClassInvocationStub implements BContentProvider {
    private IInterface mBase;

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return this.mBase;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if ("asBinder".equals(method.getName())) {
            return method.invoke(this.mBase, objArr);
        }
        if (objArr != null && objArr.length > 0) {
            Object obj2 = objArr[0];
            if (obj2 instanceof String) {
                objArr[0] = BlackBoxCore.getHostPkg();
            } else if (obj2.getClass().getName().equals(ClassUtil.classReady(AttributionSourceContext.class).getName())) {
                ContextCompat.fixAttributionSourceState(obj2, BlackBoxCore.getHostUid());
            }
        }
        return method.invoke(this.mBase, objArr);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void onBindMethod() {
    }

    @Override // top.niunaijun.blackbox.fake.service.context.providers.BContentProvider
    public IInterface wrapper(IInterface iInterface, String str) {
        this.mBase = iInterface;
        injectHook();
        return (IInterface) getProxyInvocation();
    }
}
