package top.niunaijun.blackbox.utils.compat;

import android.os.IBinder;
import android.os.IInterface;
import black.android.app.ApplicationThreadNativeStatic;
import black.android.app.IApplicationThreadOreoStubStatic;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class ApplicationThreadCompat {
    public static IInterface asInterface(IBinder iBinder) {
        if (BuildCompat.isOreo()) {
            return ((IApplicationThreadOreoStubStatic) BlackReflection.create(IApplicationThreadOreoStubStatic.class, null, false)).asInterface(iBinder);
        }
        return ((ApplicationThreadNativeStatic) BlackReflection.create(ApplicationThreadNativeStatic.class, null, false)).asInterface(iBinder);
    }
}
