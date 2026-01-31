package top.niunaijun.blackbox.fake.service;

import black.android.view.IAutoFillManagerStubStatic;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ISystemUpdateProxy extends BinderInvocationStub {
    public ISystemUpdateProxy() {
        super(AbstractC0922a.m88a().getService("system_update"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IAutoFillManagerStubStatic) BlackReflection.create(IAutoFillManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("system_update"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("system_update");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
