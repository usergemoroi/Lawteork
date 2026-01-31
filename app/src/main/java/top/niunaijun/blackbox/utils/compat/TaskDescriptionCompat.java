package top.niunaijun.blackbox.utils.compat;

import android.app.ActivityManager;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Locale;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.utils.DrawableUtils;
/* loaded from: classes3.dex */
public class TaskDescriptionCompat {
    public static ActivityManager.TaskDescription fix(ActivityManager.TaskDescription taskDescription) {
        String label = taskDescription.getLabel();
        Bitmap icon = taskDescription.getIcon();
        if (label == null || icon == null) {
            String taskDescriptionLabel = getTaskDescriptionLabel(BActivityThread.getUserId(), getApplicationLabel());
            Drawable applicationIcon = getApplicationIcon();
            if (applicationIcon == null) {
                return taskDescription;
            }
            int launcherLargeIconSize = ((ActivityManager) BlackBoxCore.getContext().getSystemService("activity")).getLauncherLargeIconSize();
            return new ActivityManager.TaskDescription(taskDescriptionLabel, DrawableUtils.drawableToBitmap(applicationIcon, launcherLargeIconSize, launcherLargeIconSize), taskDescription.getPrimaryColor());
        }
        return taskDescription;
    }

    private static Drawable getApplicationIcon() {
        try {
            PackageManager packageManager = BlackBoxCore.getContext().getPackageManager();
            return packageManager.getApplicationIcon(packageManager.getApplicationInfo(BActivityThread.getAppPackageName(), 0));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static CharSequence getApplicationLabel() {
        try {
            PackageManager packageManager = BlackBoxCore.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(BActivityThread.getAppPackageName(), 0));
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static String getTaskDescriptionLabel(int i, CharSequence charSequence) {
        return String.format(Locale.CHINA, "%s", charSequence);
    }
}
