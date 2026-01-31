package top.niunaijun.blackbox.utils.compat;

import black.android.content.p008pm.ParceledListSliceContext;
import black.android.content.p008pm.ParceledListSliceStatic;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import top.niunaijun.blackreflection.BlackReflection;
import top.niunaijun.blackreflection.utils.ClassUtil;
/* loaded from: classes3.dex */
public class ParceledListSliceCompat {
    public static Object create(List<?> list) {
        Object _new = ((ParceledListSliceStatic) BlackReflection.create(ParceledListSliceStatic.class, null, false))._new(list);
        if (_new != null) {
            return _new;
        }
        Object _new2 = ((ParceledListSliceStatic) BlackReflection.create(ParceledListSliceStatic.class, null, false))._new();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((ParceledListSliceContext) BlackReflection.create(ParceledListSliceContext.class, _new2, false)).append(it.next());
        }
        ((ParceledListSliceContext) BlackReflection.create(ParceledListSliceContext.class, _new2, false)).setLastSlice(true);
        return _new2;
    }

    public static boolean isParceledListSlice(Object obj) {
        return obj != null && obj.getClass() == ClassUtil.classReady(ParceledListSliceContext.class);
    }

    public static boolean isReturnParceledListSlice(Method method) {
        return method != null && method.getReturnType() == ClassUtil.classReady(ParceledListSliceContext.class);
    }
}
