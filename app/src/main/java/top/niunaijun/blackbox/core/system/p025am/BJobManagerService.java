package top.niunaijun.blackbox.core.system.p025am;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.text.TextUtils;
import black.android.app.job.JobInfoContext;
import java.util.HashMap;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.BProcessManagerService;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.ProcessRecord;
import top.niunaijun.blackbox.core.system.p025am.IBJobManagerService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.entity.JobRecord;
import top.niunaijun.blackbox.proxy.ProxyManifest;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: top.niunaijun.blackbox.core.system.am.BJobManagerService */
/* loaded from: classes3.dex */
public class BJobManagerService extends IBJobManagerService.Stub implements ISystemService {
    private static final BJobManagerService sService = new BJobManagerService();
    private final Map<String, JobRecord> mJobRecords = new HashMap();

    private String formatKey(String str, int i) {
        return str + "_" + i;
    }

    public static BJobManagerService get() {
        return sService;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
    public int cancel(String str, int i, int i2) {
        return i;
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
    public void cancelAll(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : this.mJobRecords.keySet()) {
            if (str2.startsWith(str + "_")) {
                this.mJobRecords.get(str2);
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
    public JobRecord queryJobRecord(String str, int i, int i2) {
        return this.mJobRecords.get(formatKey(str, i));
    }

    @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
    public JobInfo schedule(JobInfo jobInfo, int i) {
        ComponentName service = jobInfo.getService();
        Intent intent = new Intent();
        intent.setComponent(service);
        ResolveInfo resolveService = BPackageManagerService.get().resolveService(intent, 128, null, i);
        if (resolveService == null) {
            return jobInfo;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        ProcessRecord findProcessRecord = BProcessManagerService.get().findProcessRecord(serviceInfo.packageName, serviceInfo.processName, i);
        if (findProcessRecord == null && (findProcessRecord = BProcessManagerService.get().startProcessLocked(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid())) == null) {
            throw new RuntimeException("Unable to create Process " + serviceInfo.processName);
        }
        return scheduleJob(findProcessRecord, jobInfo, serviceInfo);
    }

    public JobInfo scheduleJob(ProcessRecord processRecord, JobInfo jobInfo, ServiceInfo serviceInfo) {
        JobRecord jobRecord = new JobRecord();
        jobRecord.mJobInfo = jobInfo;
        jobRecord.mServiceInfo = serviceInfo;
        this.mJobRecords.put(formatKey(processRecord.processName, jobInfo.getId()), jobRecord);
        ((JobInfoContext) BlackReflection.create(JobInfoContext.class, jobInfo, false))._set_service(new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.getProxyJobService(processRecord.bpid)));
        return jobInfo;
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
    }
}
