package top.niunaijun.blackbox.core.system.p027pm.installer;

import java.io.File;
import java.io.IOException;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.p027pm.BPackageSettings;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.NativeUtils;
/* renamed from: top.niunaijun.blackbox.core.system.pm.installer.CopyExecutor */
/* loaded from: classes3.dex */
public class CopyExecutor implements Executor {
    @Override // top.niunaijun.blackbox.core.system.p027pm.installer.Executor
    public int exec(BPackageSettings bPackageSettings, InstallOption installOption, int i) {
        try {
            if (!installOption.isFlag(1)) {
                NativeUtils.copyNativeLib(new File(bPackageSettings.pkg.baseCodePath), BEnvironment.getAppLibDir(bPackageSettings.pkg.packageName));
            }
            if (!installOption.isFlag(2)) {
                installOption.isFlag(1);
                return 0;
            }
            File file = new File(bPackageSettings.pkg.baseCodePath);
            File baseApkDir = BEnvironment.getBaseApkDir(bPackageSettings.pkg.packageName);
            try {
                if (!installOption.isFlag(8) || !FileUtils.renameTo(file, baseApkDir)) {
                    FileUtils.copyFile(file, baseApkDir);
                }
                baseApkDir.setReadOnly();
                bPackageSettings.pkg.baseCodePath = baseApkDir.getAbsolutePath();
                return 0;
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }
}
