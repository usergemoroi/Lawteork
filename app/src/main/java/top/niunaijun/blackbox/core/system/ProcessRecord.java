package top.niunaijun.blackbox.core.system;

import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.ConditionVariable;
import android.os.IInterface;
import android.os.Process;
import java.util.Arrays;
import top.niunaijun.blackbox.core.IBActivityThread;
import top.niunaijun.blackbox.entity.AppConfig;
import top.niunaijun.blackbox.proxy.ProxyManifest;
/* loaded from: classes3.dex */
public class ProcessRecord extends Binder {
    public IInterface appThread;
    public IBActivityThread bActivityThread;
    public int bpid;
    public int buid;
    public int callingBUid;
    public final ApplicationInfo info;
    public ConditionVariable initLock = new ConditionVariable();
    public int pid;
    public final String processName;
    public int uid;
    public int userId;

    public ProcessRecord(ApplicationInfo applicationInfo, String str) {
        this.info = applicationInfo;
        this.processName = str;
    }

    public int getCallingBUid() {
        return this.callingBUid;
    }

    public AppConfig getClientConfig() {
        AppConfig appConfig = new AppConfig();
        appConfig.packageName = this.info.packageName;
        appConfig.processName = this.processName;
        appConfig.bpid = this.bpid;
        appConfig.buid = this.buid;
        appConfig.uid = this.uid;
        appConfig.callingBUid = this.callingBUid;
        appConfig.userId = this.userId;
        appConfig.token = this;
        return appConfig;
    }

    public String getPackageName() {
        return this.info.packageName;
    }

    public String getProviderAuthority() {
        return ProxyManifest.getProxyAuthorities(this.bpid);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.processName, Integer.valueOf(this.pid), Integer.valueOf(this.buid), Integer.valueOf(this.bpid), Integer.valueOf(this.uid), Integer.valueOf(this.pid), Integer.valueOf(this.userId)});
    }

    public void kill() {
        int i = this.pid;
        if (i > 0) {
            try {
                Process.killProcess(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
