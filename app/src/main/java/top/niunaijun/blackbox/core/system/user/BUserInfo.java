package top.niunaijun.blackbox.core.system.user;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class BUserInfo implements Parcelable {
    public static final Parcelable.Creator<BUserInfo> CREATOR = new Parcelable.Creator<BUserInfo>() { // from class: top.niunaijun.blackbox.core.system.user.BUserInfo.1
        @Override // android.os.Parcelable.Creator
        public BUserInfo createFromParcel(Parcel parcel) {
            return new BUserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BUserInfo[] newArray(int i) {
            return new BUserInfo[i];
        }
    };
    public long createTime;

    /* renamed from: id */
    public int f247id;
    public String name;
    public BUserStatus status;

    public BUserInfo() {
    }

    public BUserInfo(Parcel parcel) {
        this.f247id = parcel.readInt();
        int readInt = parcel.readInt();
        this.status = readInt == -1 ? null : BUserStatus.values()[readInt];
        this.name = parcel.readString();
        this.createTime = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "BUserInfo{id=" + this.f247id + ", status=" + this.status + ", name='" + this.name + "', createTime=" + this.createTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f247id);
        BUserStatus bUserStatus = this.status;
        parcel.writeInt(bUserStatus == null ? -1 : bUserStatus.ordinal());
        parcel.writeString(this.name);
        parcel.writeLong(this.createTime);
    }
}
