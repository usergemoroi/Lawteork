package top.niunaijun.blackbox.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.RequestPermissionsActivity;
import top.niunaijun.blackbox.core.system.p025am.IRequestPermissionsResult;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
/* loaded from: classes3.dex */
public class PermissionUtils {
    public static Set<String> DANGEROUS_PERMISSION = new HashSet<String>() { // from class: top.niunaijun.blackbox.utils.PermissionUtils.1
        {
            add("android.permission.WRITE_EXTERNAL_STORAGE");
            add("android.permission.READ_EXTERNAL_STORAGE");
            add("android.permission.BODY_SENSORS");
        }
    };

    /* loaded from: classes3.dex */
    public interface CallBack {
        boolean onResult(int i, String[] strArr, int[] iArr);
    }

    public static boolean checkPermissions(String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (!BlackBoxCore.get().checkSelfPermission(str)) {
                return true;
            }
        }
        return false;
    }

    public static String[] findDangerousPermissions(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (DANGEROUS_PERMISSION.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean isCheckPermissionRequired(ApplicationInfo applicationInfo) {
        return !BuildCompat.isM() && BlackBoxCore.getContext().getApplicationInfo().targetSdkVersion >= 23 && applicationInfo.targetSdkVersion < 23;
    }

    public static boolean isRequestGranted(int[] iArr) {
        for (int i : iArr) {
            if (i == -1) {
                return false;
            }
        }
        return true;
    }

    public static void startRequestPermissions(Context context, String[] strArr, final CallBack callBack) {
        RequestPermissionsActivity.request(context, strArr, new IRequestPermissionsResult.Stub() { // from class: top.niunaijun.blackbox.utils.PermissionUtils.2
            @Override // top.niunaijun.blackbox.core.system.p025am.IRequestPermissionsResult
            public boolean onResult(int i, String[] strArr2, int[] iArr) {
                CallBack callBack2 = CallBack.this;
                if (callBack2 != null) {
                    return callBack2.onResult(i, strArr2, iArr);
                }
                return false;
            }
        });
    }
}
