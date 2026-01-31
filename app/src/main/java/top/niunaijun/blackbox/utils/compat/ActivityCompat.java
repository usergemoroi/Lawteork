package top.niunaijun.blackbox.utils.compat;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p007b.AbstractC0565a;
import p017g.AbstractC0927a;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.utils.DrawableUtils;
/* loaded from: classes3.dex */
public class ActivityCompat {
    public static void fix(Activity activity) {
        Bitmap bitmap;
        AbstractC0565a.m167a(activity).mActivityInfo();
        Context baseContext = activity.getBaseContext();
        try {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(AbstractC0927a.m84a().Window());
            if (obtainStyledAttributes != null) {
                if (obtainStyledAttributes.getBoolean(AbstractC0927a.m84a().Window_windowShowWallpaper().intValue(), false)) {
                    activity.getWindow().setBackgroundDrawable(WallpaperManager.getInstance(activity).getDrawable());
                }
                if (obtainStyledAttributes.getBoolean(AbstractC0927a.m84a().Window_windowFullscreen().intValue(), false)) {
                    activity.getWindow().addFlags(1024);
                }
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Intent intent = activity.getIntent();
        ApplicationInfo applicationInfo = baseContext.getApplicationInfo();
        PackageManager packageManager = activity.getPackageManager();
        if (intent == null || !activity.isTaskRoot()) {
            return;
        }
        try {
            String taskDescriptionLabel = TaskDescriptionCompat.getTaskDescriptionLabel(BActivityThread.getUserId(), applicationInfo.loadLabel(packageManager));
            Drawable activityIcon = getActivityIcon(activity);
            if (activityIcon != null) {
                int launcherLargeIconSize = ((ActivityManager) baseContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = DrawableUtils.drawableToBitmap(activityIcon, launcherLargeIconSize, launcherLargeIconSize);
            } else {
                bitmap = null;
            }
            activity.setTaskDescription(new ActivityManager.TaskDescription(taskDescriptionLabel, bitmap));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private static Drawable getActivityIcon(Activity activity) {
        PackageManager packageManager = activity.getPackageManager();
        try {
            Drawable activityIcon = packageManager.getActivityIcon(activity.getComponentName());
            if (activityIcon != null) {
                return activityIcon;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return activity.getApplicationInfo().loadIcon(packageManager);
    }
}
