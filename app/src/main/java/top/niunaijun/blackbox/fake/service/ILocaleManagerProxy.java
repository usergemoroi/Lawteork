package top.niunaijun.blackbox.fake.service;

import black.android.app.ILocaleManagerStubStatic;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.service.base.PkgMethodProxy;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ILocaleManagerProxy extends BinderInvocationStub {
    public static final String TAG = "ILocaleManagerProxy";

    public ILocaleManagerProxy() {
        super(AbstractC0922a.m88a().getService("locale"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((ILocaleManagerStubStatic) BlackReflection.create(ILocaleManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("locale"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("locale");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // top.niunaijun.blackbox.fake.hook.BinderInvocationStub, top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new PkgMethodProxy("setApplicationLocales"));
        addMethodHook(new PkgMethodProxy("getApplicationLocales"));
    }
}
