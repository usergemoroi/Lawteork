package top.niunaijun.blackbox.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import java.util.Objects;
import net.lingala.zip4j.util.InternalZipConstants;
import top.niunaijun.blackbox.app.BActivityThread;
/* loaded from: classes3.dex */
public class ComponentUtils {
    public static String getFirstAuthority(ProviderInfo providerInfo) {
        if (providerInfo == null) {
            return null;
        }
        String[] split = providerInfo.authority.split(";");
        return split.length == 0 ? providerInfo.authority : split[0];
    }

    public static String getProcessName(ComponentInfo componentInfo) {
        String str = componentInfo.processName;
        if (str == null) {
            String str2 = componentInfo.packageName;
            componentInfo.processName = str2;
            return str2;
        }
        return str;
    }

    public static String getTaskAffinity(ActivityInfo activityInfo) {
        if (activityInfo.launchMode == 3) {
            return "-SingleInstance-" + activityInfo.packageName + InternalZipConstants.ZIP_FILE_SEPARATOR + activityInfo.name;
        }
        String str = activityInfo.taskAffinity;
        return (str == null && activityInfo.applicationInfo.taskAffinity == null) ? activityInfo.packageName : str != null ? str : activityInfo.applicationInfo.taskAffinity;
    }

    public static boolean intentFilterEquals(Intent intent, Intent intent2) {
        if (intent == null || intent2 == null) {
            return true;
        }
        if (Objects.equals(intent.getAction(), intent2.getAction()) && Objects.equals(intent.getData(), intent2.getData()) && Objects.equals(intent.getType(), intent2.getType())) {
            String str = intent.getPackage();
            if (str == null && intent.getComponent() != null) {
                str = intent.getComponent().getPackageName();
            }
            String str2 = intent2.getPackage();
            if (str2 == null && intent2.getComponent() != null) {
                str2 = intent2.getComponent().getPackageName();
            }
            return Objects.equals(str, str2) && Objects.equals(intent.getComponent(), intent2.getComponent()) && Objects.equals(intent.getCategories(), intent2.getCategories());
        }
        return false;
    }

    public static boolean isRequestInstall(Intent intent) {
        return "application/vnd.android.package-archive".equals(intent.getType());
    }

    public static boolean isSameComponent(ComponentInfo componentInfo, ComponentInfo componentInfo2) {
        if (componentInfo == null || componentInfo2 == null) {
            return false;
        }
        return new StringBuilder().append(componentInfo.packageName).append("").toString().equals(new StringBuilder().append(componentInfo2.packageName).append("").toString()) && new StringBuilder().append(componentInfo.name).append("").toString().equals(new StringBuilder().append(componentInfo2.name).append("").toString());
    }

    public static boolean isSelf(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null || BActivityThread.getAppPackageName() == null) {
            return false;
        }
        return component.getPackageName().equals(BActivityThread.getAppPackageName());
    }

    public static ComponentName toComponentName(ComponentInfo componentInfo) {
        return new ComponentName(componentInfo.packageName, componentInfo.name);
    }

    public static boolean isSelf(Intent[] intentArr) {
        for (Intent intent : intentArr) {
            if (!isSelf(intent)) {
                return false;
            }
        }
        return true;
    }
}
