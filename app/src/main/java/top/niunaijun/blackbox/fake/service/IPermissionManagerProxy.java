package top.niunaijun.blackbox.fake.service;

import android.content.pm.PackageManager;
import black.android.app.ActivityThreadStatic;
import black.android.permission.IPermissionManagerStubStatic;
import java.lang.reflect.Method;
import p007b.AbstractC0567c;
import p007b.AbstractC0568d;
import p015e.AbstractC0922a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.BinderInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
import top.niunaijun.blackbox.fake.hook.ProxyMethod;
import top.niunaijun.blackbox.utils.MethodParameterUtils;
import top.niunaijun.blackbox.utils.Reflector;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class IPermissionManagerProxy extends BinderInvocationStub {
    private static final String BLUETOOTH_CONNECT = "android.permission.BLUETOOTH_CONNECT";
    private static final String BLUETOOTH_SCAN = "android.permission.BLUETOOTH_SCAN";

    /* renamed from: P */
    private static final String f248P = "permissionmgr";
    private static final String READ_MEDIA_AUDIO = "android.permission.READ_MEDIA_AUDIO";
    public static final String TAG = "IPermissionManagerProxy";
    private static final String WRITE_MEDIA_AUDIO = "android.permission.WRITE_MEDIA_AUDIO";

    @ProxyMethod("addOnPermissionsChangeListener")
    /* loaded from: classes3.dex */
    public static class addOnPermissionsChangeListener extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("addPermission")
    /* loaded from: classes3.dex */
    public static class addPermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("checkPermission")
    /* loaded from: classes3.dex */
    public static class checkPermission extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if ("android.permission.RECORD_AUDIO".equals(str) || IPermissionManagerProxy.WRITE_MEDIA_AUDIO.equals(str) || IPermissionManagerProxy.READ_MEDIA_AUDIO.equals(str) || IPermissionManagerProxy.BLUETOOTH_CONNECT.equals(str) || IPermissionManagerProxy.BLUETOOTH_SCAN.equals(str)) {
                        return 0;
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("removeOnPermissionsChangeListener")
    /* loaded from: classes3.dex */
    public static class removeOnPermissionsChangeListener extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    @ProxyMethod("shouldShowRequestPermissionRationale")
    /* loaded from: classes3.dex */
    public static class shouldShowRequestPermissionRationale extends MethodHook {
        @Override // top.niunaijun.blackbox.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public IPermissionManagerProxy() {
        super(AbstractC0922a.m88a().getService(f248P));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((IPermissionManagerStubStatic) BlackReflection.create(IPermissionManagerStubStatic.class, null, false)).asInterface(AbstractC0922a.m88a().getService(f248P));
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(f248P);
        ((ActivityThreadStatic) BlackReflection.create(ActivityThreadStatic.class, null, true))._set_sPermissionManager(obj2);
        PackageManager mPackageManager = AbstractC0568d.m163a(AbstractC0567c.m164a(BlackBoxCore.mainThread()).getSystemContext()).mPackageManager();
        if (mPackageManager != null) {
            try {
                Reflector.m28on("android.app.ApplicationPackageManager").field("mPermissionManager").set(mPackageManager, obj2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
