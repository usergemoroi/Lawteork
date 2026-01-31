package top.niunaijun.blackbox.fake.service;

import android.os.storage.StorageVolume;
import black.android.p009os.mount.IMountServiceStubStatic;
import black.android.p009os.storage.IStorageManagerStubStatic;
import java.lang.reflect.Method;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IStorageManagerProxy extends BinderInvocationStub {

    @ProxyMethod("getVolumeList")
    /* loaded from: classes3.dex */
    public static class GetVolumeList extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                StorageVolume[] volumeList = BlackBoxCore.getBStorageManager().getVolumeList(BActivityThread.getBUid(), null, 0, BActivityThread.getUserId());
                return volumeList == null ? method.invoke(obj, objArr) : volumeList;
            }
            try {
                StorageVolume[] volumeList2 = BlackBoxCore.getBStorageManager().getVolumeList(((Integer) objArr[0]).intValue(), (String) objArr[1], ((Integer) objArr[2]).intValue(), BActivityThread.getUserId());
                return volumeList2 == null ? method.invoke(obj, objArr) : volumeList2;
            } catch (Throwable th) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("mkdirs")
    /* loaded from: classes3.dex */
    public static class mkdirs extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public IStorageManagerProxy() {
        super(AbstractC0922a.m88a().getService("mount"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        if (BuildCompat.isOreo()) {
            return ((IStorageManagerStubStatic) BlackReflection.create(IStorageManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("mount"));
        }
        return ((IMountServiceStubStatic) BlackReflection.create(IMountServiceStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService("mount"));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("mount");
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
