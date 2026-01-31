package top.niunaijun.blackbox.core.system;

import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.env.AppSystemEnv;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.accounts.BAccountManagerService;
import top.niunaijun.blackbox.core.system.location.BLocationManagerService;
import top.niunaijun.blackbox.core.system.notification.BNotificationManagerService;
import top.niunaijun.blackbox.core.system.p025am.BActivityManagerService;
import top.niunaijun.blackbox.core.system.p025am.BJobManagerService;
import top.niunaijun.blackbox.core.system.p026os.BStorageManagerService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageInstallerService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.core.system.p027pm.BXposedManagerService;
import top.niunaijun.blackbox.core.system.user.BUserManagerService;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.utils.FileUtils;
/* loaded from: classes3.dex */
public class BlackBoxSystem {
    private static final AtomicBoolean isStartup = new AtomicBoolean(false);
    private static BlackBoxSystem sBlackBoxSystem;
    private final List<ISystemService> mServices = new ArrayList();

    public static BlackBoxSystem getSystem() {
        if (sBlackBoxSystem == null) {
            synchronized (BlackBoxSystem.class) {
                if (sBlackBoxSystem == null) {
                    sBlackBoxSystem = new BlackBoxSystem();
                }
            }
        }
        return sBlackBoxSystem;
    }

    private void initJarEnv() {
        try {
            FileUtils.copyFile(BlackBoxCore.getContext().getAssets().open("junit.jar"), BEnvironment.JUNIT_JAR);
            FileUtils.copyFile(BlackBoxCore.getContext().getAssets().open("empty.jar"), BEnvironment.EMPTY_JAR);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startup() {
        if (isStartup.getAndSet(true)) {
            return;
        }
        BEnvironment.load();
        this.mServices.add(BPackageManagerService.get());
        this.mServices.add(BUserManagerService.get());
        this.mServices.add(BActivityManagerService.get());
        this.mServices.add(BJobManagerService.get());
        this.mServices.add(BStorageManagerService.get());
        this.mServices.add(BPackageInstallerService.get());
        this.mServices.add(BXposedManagerService.get());
        this.mServices.add(BProcessManagerService.get());
        this.mServices.add(BAccountManagerService.get());
        this.mServices.add(BLocationManagerService.get());
        this.mServices.add(BNotificationManagerService.get());
        for (ISystemService iSystemService : this.mServices) {
            iSystemService.systemReady();
        }
        for (String str : AppSystemEnv.getPreInstallPackages()) {
            try {
                if (!BPackageManagerService.get().isInstalled(str, -1)) {
                    BPackageManagerService.get().installPackageAsUser(BlackBoxCore.getPackageManager().getPackageInfo(str, 0).applicationInfo.sourceDir, InstallOption.installBySystem(), -1);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        initJarEnv();
    }
}
