package top.niunaijun.blackbox.fake.service.context;

import black.android.content.IContentServiceStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ContentServiceStub extends BinderInvocationStub {

    @ProxyMethod("notifyChange")
    /* loaded from: classes3.dex */
    public static class NotifyChange extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("registerContentObserver")
    /* loaded from: classes3.dex */
    public static class RegisterContentObserver extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public ContentServiceStub() {
        super(AbstractC0922a.m88a().getService("content"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IContentServiceStubStatic) BlackReflection.create(IContentServiceStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("content"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("content");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
