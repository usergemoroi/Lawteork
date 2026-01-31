package top.niunaijun.blackbox.fake.service.libcore;

import java.lang.reflect.Method;
import net.lingala.zip4j.util.InternalZipConstants;
import p018h.AbstractC0928a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.IOCore;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.Reflector;
/* loaded from: classes3.dex */
public class OsStub extends ClassInvocationStub {
    public static final String TAG = "OsStub";
    private Object mBase = AbstractC0928a.m83a().m152os();

    @ProxyMethod("getuid")
    /* loaded from: classes3.dex */
    public static class getuid extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(OsStub.getFakeUid(((Integer) method.invoke(obj, objArr)).intValue()));
        }
    }

    @ProxyMethod("stat")
    /* loaded from: classes3.dex */
    public static class stat extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                Reflector.with(invoke).field("st_uid").set(Integer.valueOf(OsStub.getFakeUid(-1)));
                return invoke;
            } catch (Throwable th) {
                throw th.getCause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFakeUid(int i) {
        return (i <= 0 || i > 10000) ? (BActivityThread.isThreadInit() && BActivityThread.currentActivityThread().isInit()) ? BActivityThread.getBAppId() : BlackBoxCore.getHostUid() : i;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return this.mBase;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        AbstractC0928a.m83a()._set_os(obj2);
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 != null && (obj2 instanceof String) && ((String) obj2).startsWith(InternalZipConstants.ZIP_FILE_SEPARATOR)) {
                    objArr[i] = IOCore.get().redirectPath((String) objArr[i]);
                }
            }
        }
        return super.invoke(obj, method, objArr);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return AbstractC0928a.m83a().m152os() != getProxyInvocation();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void onBindMethod() {
    }
}
