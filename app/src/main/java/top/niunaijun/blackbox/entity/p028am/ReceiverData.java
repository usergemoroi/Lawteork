package top.niunaijun.blackbox.entity.p028am;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: top.niunaijun.blackbox.entity.am.ReceiverData */
/* loaded from: classes3.dex */
public class ReceiverData implements Parcelable {
    public static final Parcelable.Creator<ReceiverData> CREATOR = new Parcelable.Creator<ReceiverData>() { // from class: top.niunaijun.blackbox.entity.am.ReceiverData.1
        @Override // android.os.Parcelable.Creator
        public ReceiverData createFromParcel(Parcel parcel) {
            return new ReceiverData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ReceiverData[] newArray(int i) {
            return new ReceiverData[i];
        }
    };
    public ActivityInfo activityInfo;
    public PendingResultData data;
    public Intent intent;

    public ReceiverData() {
    }

    public ReceiverData(Parcel parcel) {
        this.intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.activityInfo = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
        this.data = (PendingResultData) parcel.readParcelable(PendingResultData.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.activityInfo = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
        this.data = (PendingResultData) parcel.readParcelable(PendingResultData.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.intent, i);
        parcel.writeParcelable(this.activityInfo, i);
        parcel.writeParcelable(this.data, i);
    }
}
