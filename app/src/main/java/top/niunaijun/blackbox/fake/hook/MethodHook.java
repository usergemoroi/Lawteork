package top.niunaijun.blackbox.fake.hook;

import java.lang.reflect.Method;
import top.niunaijun.blackbox.BlackBoxCore;
/* loaded from: classes3.dex */
public abstract class MethodHook {
    public Object afterHook(Object obj) {
        return obj;
    }

    public Object beforeHook(Object obj, Method method, Object[] objArr) {
        return null;
    }

    public String getMethodName() {
        return null;
    }

    public abstract Object hook(Object obj, Method method, Object[] objArr);

    public boolean isEnable() {
        return BlackBoxCore.get().isBlackProcess();
    }
}
