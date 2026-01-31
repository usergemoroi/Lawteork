package top.niunaijun.blackbox.app.configuration;

import java.io.File;
/* loaded from: classes3.dex */
public abstract class ClientConfiguration {
    public abstract String getHostPackageName();

    public boolean isEnableDaemonService() {
        return true;
    }

    public boolean isEnableLauncherActivity() {
        return true;
    }

    public boolean isHideRoot() {
        return false;
    }

    public boolean isHideXposed() {
        return false;
    }

    public boolean requestInstallPackage(File file, int i) {
        return false;
    }
}
