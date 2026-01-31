package top.niunaijun.blackbox.entity;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class AppConfig implements Parcelable {
    public static final Parcelable.Creator<AppConfig> CREATOR = new Parcelable.Creator<AppConfig>() { // from class: top.niunaijun.blackbox.entity.AppConfig.1
        @Override // android.os.Parcelable.Creator
        public AppConfig createFromParcel(Parcel parcel) {
            return new AppConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AppConfig[] newArray(int i) {
            return new AppConfig[i];
        }
    };
    public static final String KEY = "BlackBox_client_config";
    public int bpid;
    public int buid;
    public int callingBUid;
    public String packageName;
    public String processName;
    public IBinder token;
    public int uid;
    public int userId;

    public AppConfig() {
    }

    public AppConfig(Parcel parcel) {
        this.packageName = parcel.readString();
        this.processName = parcel.readString();
        this.bpid = parcel.readInt();
        this.buid = parcel.readInt();
        this.uid = parcel.readInt();
        this.userId = parcel.readInt();
        this.callingBUid = parcel.readInt();
        this.token = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.processName);
        parcel.writeInt(this.bpid);
        parcel.writeInt(this.buid);
        parcel.writeInt(this.uid);
        parcel.writeInt(this.userId);
        parcel.writeInt(this.callingBUid);
        parcel.writeStrongBinder(this.token);
    }
}
