package top.niunaijun.blackbox.core.system.p027pm.installer;

import top.niunaijun.blackbox.core.system.p027pm.BPackageSettings;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
/* renamed from: top.niunaijun.blackbox.core.system.pm.installer.Executor */
/* loaded from: classes3.dex */
public interface Executor {
    public static final String TAG = "InstallExecutor";

    int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i);
}
