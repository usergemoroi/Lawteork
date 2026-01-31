package top.niunaijun.blackbox.entity.location;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class BCell implements Parcelable {
    public static final Parcelable.Creator<BCell> CREATOR = new Parcelable.Creator<BCell>() { // from class: top.niunaijun.blackbox.entity.location.BCell.1
        @Override // android.os.Parcelable.Creator
        public BCell createFromParcel(Parcel parcel) {
            return new BCell(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BCell[] newArray(int i) {
            return new BCell[i];
        }
    };
    public static final int NETWORK_TYPE_1xRTT = 7;
    public static final int NETWORK_TYPE_CDMA = 4;
    public static final int NETWORK_TYPE_EDGE = 2;
    public static final int NETWORK_TYPE_EVDO_0 = 5;
    public static final int NETWORK_TYPE_EVDO_A = 6;
    public static final int NETWORK_TYPE_GPRS = 1;
    public static final int NETWORK_TYPE_UMTS = 3;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int PHONE_TYPE_CDMA = 2;
    public static final int PHONE_TYPE_GSM = 1;
    public static final int PHONE_TYPE_NONE = 0;
    public int CID;
    public int LAC;
    public int MCC;
    public int MNC;
    public int TYPE;

    public BCell() {
    }

    public BCell(int i, int i2, int i3, int i4) {
        this.TYPE = 1;
        this.MCC = i;
        this.CID = i4;
        this.MNC = i2;
        this.LAC = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MCC);
        parcel.writeInt(this.MNC);
        parcel.writeInt(this.LAC);
        parcel.writeInt(this.CID);
        parcel.writeInt(this.TYPE);
    }

    public BCell(Parcel parcel) {
        this.MCC = parcel.readInt();
        this.MNC = parcel.readInt();
        this.LAC = parcel.readInt();
        this.CID = parcel.readInt();
        this.TYPE = parcel.readInt();
    }
}
