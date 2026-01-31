package top.niunaijun.blackbox.fake.service;

import black.android.service.persistentdata.IPersistentDataBlockServiceStubStatic;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.service.base.ValueMethodProxy;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IPersistentDataBlockServiceProxy extends BinderInvocationStub {
    public static final String NAME = "persistent_data_block";

    public IPersistentDataBlockServiceProxy() {
        super(AbstractC0922a.m88a().getService(NAME));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IPersistentDataBlockServiceStubStatic) BlackReflection.create(IPersistentDataBlockServiceStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService(NAME));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(NAME);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // top.niunaijun.blackbox.fake.hook.BinderInvocationStub, top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new ValueMethodProxy("write", -1));
        addMethodHook(new ValueMethodProxy("read", new byte[0]));
        addMethodHook(new ValueMethodProxy("wipe", null));
        addMethodHook(new ValueMethodProxy("getDataBlockSize", 0));
        addMethodHook(new ValueMethodProxy("getMaximumDataBlockSize", 0));
        addMethodHook(new ValueMethodProxy("setOemUnlockEnabled", 0));
        addMethodHook(new ValueMethodProxy("getOemUnlockEnabled", Boolean.FALSE));
    }
}
