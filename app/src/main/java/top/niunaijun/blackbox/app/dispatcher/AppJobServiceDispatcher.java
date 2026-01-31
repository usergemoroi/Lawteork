package top.niunaijun.blackbox.app.dispatcher;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.res.Configuration;
import java.util.HashMap;
import java.util.Map;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.entity.JobRecord;
/* loaded from: classes3.dex */
public class AppJobServiceDispatcher {
    private static final AppJobServiceDispatcher sServiceDispatcher = new AppJobServiceDispatcher();
    private final Map<Integer, JobRecord> mJobRecords = new HashMap();

    public static AppJobServiceDispatcher get() {
        return sServiceDispatcher;
    }

    public JobService getJobService(int i) {
        JobService jobService;
        synchronized (this.mJobRecords) {
            JobRecord jobRecord = this.mJobRecords.get(Integer.valueOf(i));
            if (jobRecord == null || (jobService = jobRecord.mJobService) == null) {
                JobRecord queryJobRecord = BlackBoxCore.getBJobManager().queryJobRecord(BActivityThread.getAppProcessName(), i);
                if (queryJobRecord != null && queryJobRecord.mServiceInfo != null) {
                    JobService createJobService = BActivityThread.currentActivityThread().createJobService(queryJobRecord.mServiceInfo);
                    queryJobRecord.mJobService = createJobService;
                    if (createJobService == null) {
                        return null;
                    }
                    this.mJobRecords.put(Integer.valueOf(i), queryJobRecord);
                    return queryJobRecord.mJobService;
                }
                return null;
            }
            return jobService;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        for (JobRecord jobRecord : this.mJobRecords.values()) {
            JobService jobService = jobRecord.mJobService;
            if (jobService != null) {
                try {
                    jobService.onConfigurationChanged(configuration);
                } catch (Exception e) {
                }
            }
        }
    }

    public void onDestroy() {
        for (JobRecord jobRecord : this.mJobRecords.values()) {
            JobService jobService = jobRecord.mJobService;
            if (jobService != null) {
                jobService.onDestroy();
            }
        }
    }

    public void onLowMemory() {
        for (JobRecord jobRecord : this.mJobRecords.values()) {
            JobService jobService = jobRecord.mJobService;
            if (jobService != null) {
                try {
                    jobService.onLowMemory();
                } catch (Exception e) {
                }
            }
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        JobService jobService = getJobService(jobParameters.getJobId());
        if (jobService == null) {
            return false;
        }
        try {
            return jobService.onStartJob(jobParameters);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        JobService jobService = getJobService(jobParameters.getJobId());
        boolean z = false;
        if (jobService == null) {
            return false;
        }
        try {
            z = jobService.onStopJob(jobParameters);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            jobService.onDestroy();
        } catch (Exception e2) {
        }
        synchronized (this.mJobRecords) {
            this.mJobRecords.remove(Integer.valueOf(jobParameters.getJobId()));
        }
        return z;
    }

    public void onTrimMemory(int i) {
        for (JobRecord jobRecord : this.mJobRecords.values()) {
            JobService jobService = jobRecord.mJobService;
            if (jobService != null) {
                try {
                    jobService.onTrimMemory(i);
                } catch (Exception e) {
                }
            }
        }
    }
}
