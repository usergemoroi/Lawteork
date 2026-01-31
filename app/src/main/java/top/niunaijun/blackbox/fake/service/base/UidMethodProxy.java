package top.niunaijun.blackbox.fake.service.base;

import java.lang.reflect.Method;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.hook.MethodHook;
/* loaded from: classes3.dex */
public class UidMethodProxy extends MethodHook {
    private final int index;
    private final String name;

    public UidMethodProxy(String str, int i) {
        this.index = i;
        this.name = str;
    }

    @Override // top.niunaijun.blackbox.fake.hook.MethodHook
    public String getMethodName() {
        return this.name;
    }

    @Override // top.niunaijun.blackbox.fake.hook.MethodHook
    public Object hook(Object obj, Method method, Object[] objArr) {
        if (((Integer) objArr[this.index]).intValue() == BActivityThread.getBUid()) {
            objArr[this.index] = Integer.valueOf(BlackBoxCore.getHostUid());
        }
        return method.invoke(obj, objArr);
    }
}
