package black.android.content.p008pm;

import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.UserManager;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("android.content.pm.LauncherApps")
/* renamed from: black.android.content.pm.LauncherApps */
/* loaded from: classes.dex */
public interface LauncherApps {
    @BField
    PackageManager mPm();

    @BField
    IInterface mService();

    @BField
    UserManager mUserManager();
}
