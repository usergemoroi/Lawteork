package top.niunaijun.blackbox.core.system.p027pm.installer;

import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.p027pm.BPackageSettings;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.utils.FileUtils;
/* renamed from: top.niunaijun.blackbox.core.system.pm.installer.CreateUserExecutor */
/* loaded from: classes3.dex */
public class CreateUserExecutor implements Executor {
    @Override // top.niunaijun.blackbox.core.system.p027pm.installer.Executor
    public int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i) {
        String str = bPackageSettings.pkg.packageName;
        FileUtils.deleteDir(BEnvironment.getDataLibDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDataDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDataCacheDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDataFilesDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDataDatabasesDir(str, i));
        FileUtils.mkdirs(BEnvironment.getDeDataDir(str, i));
        return 0;
    }
}
