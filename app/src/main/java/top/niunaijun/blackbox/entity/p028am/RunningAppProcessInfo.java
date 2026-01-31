package top.niunaijun.blackbox.entity.p028am;

import android.app.ActivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* renamed from: top.niunaijun.blackbox.entity.am.RunningAppProcessInfo */
/* loaded from: classes3.dex */
public class RunningAppProcessInfo implements Parcelable {
    public static final Parcelable.Creator<RunningAppProcessInfo> CREATOR = new Parcelable.Creator<RunningAppProcessInfo>() { // from class: top.niunaijun.blackbox.entity.am.RunningAppProcessInfo.1
        @Override // android.os.Parcelable.Creator
        public RunningAppProcessInfo createFromParcel(Parcel parcel) {
            return new RunningAppProcessInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RunningAppProcessInfo[] newArray(int i) {
            return new RunningAppProcessInfo[i];
        }
    };
    public List<ActivityManager.RunningAppProcessInfo> mAppProcessInfoList;

    public RunningAppProcessInfo() {
        this.mAppProcessInfoList = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mAppProcessInfoList = parcel.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mAppProcessInfoList);
    }

    public RunningAppProcessInfo(Parcel parcel) {
        this.mAppProcessInfoList = parcel.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
    }
}
