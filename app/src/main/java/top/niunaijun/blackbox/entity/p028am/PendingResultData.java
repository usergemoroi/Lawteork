package top.niunaijun.blackbox.entity.p028am;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import black.android.content.BroadcastReceiverPendingResultContext;
import black.android.content.BroadcastReceiverPendingResultMContext;
import black.android.content.BroadcastReceiverPendingResultMStatic;
import black.android.content.BroadcastReceiverPendingResultStatic;
import java.util.UUID;
import p013c.AbstractC0574b;
import p013c.AbstractC0575c;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: top.niunaijun.blackbox.entity.am.PendingResultData */
/* loaded from: classes3.dex */
public class PendingResultData implements Parcelable {
    public static final Parcelable.Creator<PendingResultData> CREATOR = new Parcelable.Creator<PendingResultData>() { // from class: top.niunaijun.blackbox.entity.am.PendingResultData.1
        @Override // android.os.Parcelable.Creator
        public PendingResultData createFromParcel(Parcel parcel) {
            return new PendingResultData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PendingResultData[] newArray(int i) {
            return new PendingResultData[i];
        }
    };
    public boolean mAbortBroadcast;
    public String mBToken;
    public boolean mFinished;
    public int mFlags;
    public boolean mInitialStickyHint;
    public boolean mOrderedHint;
    public int mResultCode;
    public String mResultData;
    public Bundle mResultExtras;
    public int mSendingUser;
    public IBinder mToken;
    public int mType;

    public PendingResultData(BroadcastReceiver.PendingResult pendingResult) {
        Boolean mFinished;
        this.mBToken = UUID.randomUUID().toString();
        if (BuildCompat.isM()) {
            BroadcastReceiverPendingResultMContext m149a = AbstractC0575c.m149a(pendingResult);
            this.mType = m149a.mType().intValue();
            this.mOrderedHint = m149a.mOrderedHint().booleanValue();
            this.mInitialStickyHint = m149a.mInitialStickyHint().booleanValue();
            this.mToken = m149a.mToken();
            this.mSendingUser = m149a.mSendingUser().intValue();
            this.mFlags = m149a.mFlags().intValue();
            this.mResultData = m149a.mResultData();
            this.mResultExtras = m149a.mResultExtras();
            this.mAbortBroadcast = m149a.mAbortBroadcast().booleanValue();
            mFinished = m149a.mFinished();
        } else {
            BroadcastReceiverPendingResultContext m150a = AbstractC0574b.m150a(pendingResult);
            this.mType = m150a.mType().intValue();
            this.mOrderedHint = m150a.mOrderedHint().booleanValue();
            this.mInitialStickyHint = m150a.mInitialStickyHint().booleanValue();
            this.mToken = m150a.mToken();
            this.mSendingUser = m150a.mSendingUser().intValue();
            this.mResultData = m150a.mResultData();
            this.mResultExtras = m150a.mResultExtras();
            this.mAbortBroadcast = m150a.mAbortBroadcast().booleanValue();
            mFinished = m150a.mFinished();
        }
        this.mFinished = mFinished.booleanValue();
    }

    public BroadcastReceiver.PendingResult build() {
        if (BuildCompat.isM()) {
            return ((BroadcastReceiverPendingResultMStatic) BlackReflection.create(BroadcastReceiverPendingResultMStatic.class, null, false))._new(this.mResultCode, this.mResultData, this.mResultExtras, this.mType, this.mOrderedHint, this.mInitialStickyHint, this.mToken, this.mSendingUser, this.mFlags);
        }
        return ((BroadcastReceiverPendingResultStatic) BlackReflection.create(BroadcastReceiverPendingResultStatic.class, null, false))._new(this.mResultCode, this.mResultData, this.mResultExtras, this.mType, this.mOrderedHint, this.mInitialStickyHint, this.mToken, this.mSendingUser);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mType = parcel.readInt();
        this.mOrderedHint = parcel.readByte() != 0;
        this.mInitialStickyHint = parcel.readByte() != 0;
        this.mToken = parcel.readStrongBinder();
        this.mSendingUser = parcel.readInt();
        this.mFlags = parcel.readInt();
        this.mResultCode = parcel.readInt();
        this.mResultData = parcel.readString();
        this.mResultExtras = parcel.readBundle();
        this.mAbortBroadcast = parcel.readByte() != 0;
        this.mFinished = parcel.readByte() != 0;
        this.mBToken = parcel.readString();
    }

    public String toString() {
        return "PendingResultData{mType=" + this.mType + ", mOrderedHint=" + this.mOrderedHint + ", mInitialStickyHint=" + this.mInitialStickyHint + ", mToken=" + this.mToken + ", mSendingUser=" + this.mSendingUser + ", mFlags=" + this.mFlags + ", mResultCode=" + this.mResultCode + ", mResultData='" + this.mResultData + "', mResultExtras=" + this.mResultExtras + ", mAbortBroadcast=" + this.mAbortBroadcast + ", mFinished=" + this.mFinished + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mType);
        parcel.writeByte(this.mOrderedHint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mInitialStickyHint ? (byte) 1 : (byte) 0);
        parcel.writeStrongBinder(this.mToken);
        parcel.writeInt(this.mSendingUser);
        parcel.writeInt(this.mFlags);
        parcel.writeInt(this.mResultCode);
        parcel.writeString(this.mResultData);
        parcel.writeBundle(this.mResultExtras);
        parcel.writeByte(this.mAbortBroadcast ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mFinished ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mBToken);
    }

    public PendingResultData(Parcel parcel) {
        this.mType = parcel.readInt();
        this.mOrderedHint = parcel.readByte() != 0;
        this.mInitialStickyHint = parcel.readByte() != 0;
        this.mToken = parcel.readStrongBinder();
        this.mSendingUser = parcel.readInt();
        this.mFlags = parcel.readInt();
        this.mResultCode = parcel.readInt();
        this.mResultData = parcel.readString();
        this.mResultExtras = parcel.readBundle();
        this.mAbortBroadcast = parcel.readByte() != 0;
        this.mFinished = parcel.readByte() != 0;
        this.mBToken = parcel.readString();
    }
}
