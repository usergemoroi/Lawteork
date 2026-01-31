package top.niunaijun.blackbox.fake.frameworks;

import android.app.job.JobInfo;
import android.os.RemoteException;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.system.ServiceManager;
import top.niunaijun.blackbox.core.system.p025am.IBJobManagerService;
import top.niunaijun.blackbox.entity.JobRecord;
/* loaded from: classes3.dex */
public class BJobManager extends BlackManager<IBJobManagerService> {
    private static final BJobManager sJobManager = new BJobManager();

    public static BJobManager get() {
        return sJobManager;
    }

    public int cancel(String str, int i) {
        try {
            return getService().cancel(str, i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void cancelAll(String str) {
        try {
            getService().cancelAll(str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // top.niunaijun.blackbox.fake.frameworks.BlackManager
    public String getServiceName() {
        return ServiceManager.JOB_MANAGER;
    }

    public JobRecord queryJobRecord(String str, int i) {
        try {
            return getService().queryJobRecord(str, i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JobInfo schedule(JobInfo jobInfo) {
        try {
            return getService().schedule(jobInfo, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }
}
