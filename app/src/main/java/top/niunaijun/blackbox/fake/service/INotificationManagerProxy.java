package top.niunaijun.blackbox.fake.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import black.android.content.p008pm.ParceledListSliceContext;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p007b.AbstractC0569e;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.frameworks.BNotificationManager;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackbox.utils.compat.ParceledListSliceCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class INotificationManagerProxy extends BinderInvocationStub {
    public static final String TAG = "INotificationManagerProxy";

    @ProxyMethod("cancelNotificationWithTag")
    /* loaded from: classes3.dex */
    public static class CancelNotificationWithTag extends MethodHook {
        public int getIdIndex() {
            return getTagIndex() + 1;
        }

        public int getTagIndex() {
            return BuildCompat.isR() ? 2 : 1;
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[getIdIndex()]).intValue();
            BNotificationManager.get().cancelNotificationWithTag(intValue, (String) objArr[getTagIndex()]);
            return 0;
        }
    }

    @ProxyMethod("createNotificationChannelGroups")
    /* loaded from: classes3.dex */
    public static class CreateNotificationChannelGroups extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Iterator<?> it = ((ParceledListSliceContext) BlackReflection.create(ParceledListSliceContext.class, objArr[1], false)).getList().iterator();
            while (it.hasNext()) {
                BNotificationManager.get().createNotificationChannelGroup((NotificationChannelGroup) it.next());
            }
            return 0;
        }
    }

    @ProxyMethod("createNotificationChannels")
    /* loaded from: classes3.dex */
    public static class CreateNotificationChannels extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            List<?> list = ((ParceledListSliceContext) BlackReflection.create(ParceledListSliceContext.class, objArr[1], false)).getList();
            if (list == null) {
                return 0;
            }
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                BNotificationManager.get().createNotificationChannel((NotificationChannel) it.next());
            }
            return 0;
        }
    }

    @ProxyMethod("deleteNotificationChannel")
    /* loaded from: classes3.dex */
    public static class DeleteNotificationChannel extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BNotificationManager.get().deleteNotificationChannel((String) objArr[1]);
            return 0;
        }
    }

    @ProxyMethod("deleteNotificationChannelGroup")
    /* loaded from: classes3.dex */
    public static class DeleteNotificationChannelGroup extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            BNotificationManager.get().deleteNotificationChannelGroup((String) objArr[1]);
            return 0;
        }
    }

    @ProxyMethod("enqueueNotificationWithTag")
    /* loaded from: classes3.dex */
    public static class EnqueueNotificationWithTag extends MethodHook {
        public int getIdIndex() {
            return getTagIndex() + 1;
        }

        public int getTagIndex() {
            return 2;
        }

        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            int intValue = ((Integer) objArr[getIdIndex()]).intValue();
            BNotificationManager.get().enqueueNotificationWithTag(intValue, (String) objArr[getTagIndex()], (Notification) MethodParameterUtils.getFirstParam(objArr, Notification.class));
            return 0;
        }
    }

    @ProxyMethod("getNotificationChannel")
    /* loaded from: classes3.dex */
    public static class GetNotificationChannel extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return BNotificationManager.get().getNotificationChannel((String) objArr[objArr.length - 1]);
        }
    }

    @ProxyMethod("getNotificationChannelGroups")
    /* loaded from: classes3.dex */
    public static class GetNotificationChannelGroups extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BNotificationManager.get().getNotificationChannelGroups(BActivityThread.getAppPackageName()));
        }
    }

    @ProxyMethod("getNotificationChannels")
    /* loaded from: classes3.dex */
    public static class GetNotificationChannels extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return ParceledListSliceCompat.create(BNotificationManager.get().getNotificationChannels(BActivityThread.getAppPackageName()));
        }
    }

    public INotificationManagerProxy() {
        super(AbstractC0569e.m162a().getService().asBinder());
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return AbstractC0569e.m162a().getService();
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        AbstractC0569e.m162a()._set_sService(getProxyInvocation());
        replaceSystemService("notification");
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        MethodParameterUtils.replaceAllAppPkg(objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
