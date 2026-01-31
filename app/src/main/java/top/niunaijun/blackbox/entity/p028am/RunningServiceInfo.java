package top.niunaijun.blackbox.entity.p028am;

import android.app.ActivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* renamed from: top.niunaijun.blackbox.entity.am.RunningServiceInfo */
/* loaded from: classes3.dex */
public class RunningServiceInfo implements Parcelable {
    public static final Parcelable.Creator<RunningServiceInfo> CREATOR = new Parcelable.Creator<RunningServiceInfo>() { // from class: top.niunaijun.blackbox.entity.am.RunningServiceInfo.1
        @Override // android.os.Parcelable.Creator
        public RunningServiceInfo createFromParcel(Parcel parcel) {
            return new RunningServiceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RunningServiceInfo[] newArray(int i) {
            return new RunningServiceInfo[i];
        }
    };
    public List<ActivityManager.RunningServiceInfo> mRunningServiceInfoList;

    public RunningServiceInfo() {
        this.mRunningServiceInfoList = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mRunningServiceInfoList = parcel.createTypedArrayList(ActivityManager.RunningServiceInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mRunningServiceInfoList);
    }

    public RunningServiceInfo(Parcel parcel) {
        this.mRunningServiceInfoList = parcel.createTypedArrayList(ActivityManager.RunningServiceInfo.CREATOR);
    }
}
