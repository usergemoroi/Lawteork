package top.niunaijun.blackbox.core.env;

import android.content.pm.ApplicationInfo;
import black.android.ddm.DdmHandleAppNameStatic;
import black.android.p009os.ProcessStatic;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class VirtualRuntime {
    private static String sInitialPackageName;
    private static String sProcessName;

    public static String getInitialPackageName() {
        return sInitialPackageName;
    }

    public static String getProcessName() {
        return sProcessName;
    }

    public static void setupRuntime(String str, ApplicationInfo applicationInfo) {
        if (sProcessName != null) {
            return;
        }
        sInitialPackageName = applicationInfo.packageName;
        sProcessName = str;
        ((ProcessStatic) BlackReflection.create(ProcessStatic.class, null, false)).setArgV0(str);
        ((DdmHandleAppNameStatic) BlackReflection.create(DdmHandleAppNameStatic.class, null, false)).setAppName(str, 0);
    }
}
