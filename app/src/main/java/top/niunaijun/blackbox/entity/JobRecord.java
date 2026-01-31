package top.niunaijun.blackbox.entity;

import android.app.job.JobInfo;
import android.app.job.JobService;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class JobRecord implements Parcelable {
    public static final Parcelable.Creator<JobRecord> CREATOR = new Parcelable.Creator<JobRecord>() { // from class: top.niunaijun.blackbox.entity.JobRecord.1
        @Override // android.os.Parcelable.Creator
        public JobRecord createFromParcel(Parcel parcel) {
            return new JobRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public JobRecord[] newArray(int i) {
            return new JobRecord[i];
        }
    };
    public JobInfo mJobInfo;
    public JobService mJobService;
    public ServiceInfo mServiceInfo;

    public JobRecord() {
    }

    public JobRecord(Parcel parcel) {
        this.mJobInfo = (JobInfo) parcel.readParcelable(JobInfo.class.getClassLoader());
        this.mServiceInfo = (ServiceInfo) parcel.readParcelable(ServiceInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mJobInfo, i);
        parcel.writeParcelable(this.mServiceInfo, i);
    }
}
