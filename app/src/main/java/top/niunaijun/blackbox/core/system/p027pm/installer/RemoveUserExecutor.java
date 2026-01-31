package top.niunaijun.blackbox.core.system.p027pm.installer;

import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.p027pm.BPackageSettings;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.utils.FileUtils;
/* renamed from: top.niunaijun.blackbox.core.system.pm.installer.RemoveUserExecutor */
/* loaded from: classes3.dex */
public class RemoveUserExecutor implements Executor {
    @Override // top.niunaijun.blackbox.core.system.p027pm.installer.Executor
    public int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i) {
        String str = bPackageSettings.pkg.packageName;
        FileUtils.deleteDir(BEnvironment.getDataDir(str, i));
        FileUtils.deleteDir(BEnvironment.getDeDataDir(str, i));
        FileUtils.deleteDir(BEnvironment.getExternalDataDir(str, i));
        return 0;
    }
}
