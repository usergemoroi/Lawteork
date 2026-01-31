package top.niunaijun.blackbox.core.system.p027pm;

import java.util.ArrayList;
import java.util.Iterator;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService;
import top.niunaijun.blackbox.core.system.p027pm.installer.CopyExecutor;
import top.niunaijun.blackbox.core.system.p027pm.installer.CreatePackageExecutor;
import top.niunaijun.blackbox.core.system.p027pm.installer.CreateUserExecutor;
import top.niunaijun.blackbox.core.system.p027pm.installer.Executor;
import top.niunaijun.blackbox.core.system.p027pm.installer.RemoveAppExecutor;
import top.niunaijun.blackbox.core.system.p027pm.installer.RemoveUserExecutor;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.utils.Slog;
/* renamed from: top.niunaijun.blackbox.core.system.pm.BPackageInstallerService */
/* loaded from: classes3.dex */
public class BPackageInstallerService extends IBPackageInstallerService.Stub implements ISystemService {
    public static final String TAG = "BPackageInstallerService";
    private static final BPackageInstallerService sService = new BPackageInstallerService();

    public static BPackageInstallerService get() {
        return sService;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
    public int clearPackage(BPackageSettings bPackageSettings, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RemoveUserExecutor());
        arrayList.add(new CreateUserExecutor());
        InstallOption installOption = bPackageSettings.installOption;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Executor executor = (Executor) it.next();
            int exec = executor.exec(bPackageSettings, installOption, i);
            Slog.m20d(TAG, "uninstallPackageAsUser: " + executor.getClass().getSimpleName() + " exec: " + exec);
            if (exec != 0) {
                return exec;
            }
        }
        return 0;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
    public int installPackageAsUser(BPackageSettings bPackageSettings, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CreateUserExecutor());
        arrayList.add(new CreatePackageExecutor());
        arrayList.add(new CopyExecutor());
        InstallOption installOption = bPackageSettings.installOption;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Executor executor = (Executor) it.next();
            int exec = executor.exec(bPackageSettings, installOption, i);
            Slog.m20d(TAG, "installPackageAsUser: " + executor.getClass().getSimpleName() + " exec: " + exec);
            if (exec != 0) {
                return exec;
            }
        }
        return 0;
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
    public int uninstallPackageAsUser(BPackageSettings bPackageSettings, boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new RemoveAppExecutor());
        }
        arrayList.add(new RemoveUserExecutor());
        InstallOption installOption = bPackageSettings.installOption;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Executor executor = (Executor) it.next();
            int exec = executor.exec(bPackageSettings, installOption, i);
            Slog.m20d(TAG, "uninstallPackageAsUser: " + executor.getClass().getSimpleName() + " exec: " + exec);
            if (exec != 0) {
                return exec;
            }
        }
        return 0;
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
    public int updatePackage(BPackageSettings bPackageSettings) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CreatePackageExecutor());
        arrayList.add(new CopyExecutor());
        InstallOption installOption = bPackageSettings.installOption;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int exec = ((Executor) it.next()).exec(bPackageSettings, installOption, -1);
            if (exec != 0) {
                return exec;
            }
        }
        return 0;
    }
}
