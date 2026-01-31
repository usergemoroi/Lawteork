package top.niunaijun.blackbox.fake.service;

import androidx.core.app.NotificationCompat;
import black.android.app.IAlarmManagerStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IAlarmManagerProxy extends BinderInvocationStub {

    @ProxyMethod("set")
    /* loaded from: classes3.dex */
    public static class Set extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public IAlarmManagerProxy() {
        super(AbstractC0922a.m88a().getService(NotificationCompat.CATEGORY_ALARM));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IAlarmManagerStubStatic) BlackReflection.create(IAlarmManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService(NotificationCompat.CATEGORY_ALARM));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
