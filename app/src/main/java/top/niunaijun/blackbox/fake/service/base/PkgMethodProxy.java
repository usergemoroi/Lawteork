package top.niunaijun.blackbox.fake.service.base;

import java.lang.reflect.Method;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
/* loaded from: classes3.dex */
public class PkgMethodProxy extends MethodHook {
    String mName;

    public PkgMethodProxy(String str) {
        this.mName = str;
    }

    @Override // top.niunaijun.blackbox.fake.hook.MethodHook
    public String getMethodName() {
        return this.mName;
    }

    @Override // top.niunaijun.blackbox.fake.hook.MethodHook
    public Object hook(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return method.invoke(obj, objArr);
    }
}
