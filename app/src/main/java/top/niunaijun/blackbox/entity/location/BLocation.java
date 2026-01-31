package top.niunaijun.blackbox.entity.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class BLocation implements Parcelable {
    public static final Parcelable.Creator<BLocation> CREATOR = new Parcelable.Creator<BLocation>() { // from class: top.niunaijun.blackbox.entity.location.BLocation.1
        @Override // android.os.Parcelable.Creator
        public BLocation createFromParcel(Parcel parcel) {
            return new BLocation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BLocation[] newArray(int i) {
            return new BLocation[i];
        }
    };
    private float mAccuracy;
    private double mAltitude;
    private float mBearing;
    private double mLatitude;
    private double mLongitude;
    private float mSpeed;

    public BLocation() {
        this.mLatitude = 0.0d;
        this.mLongitude = 0.0d;
        this.mAltitude = 0.0d;
        this.mSpeed = 0.0f;
        this.mBearing = 0.0f;
        this.mAccuracy = 0.0f;
    }

    public Location convert2SystemLocation() {
        Location location = new Location("gps");
        location.setLatitude(this.mLatitude);
        location.setLongitude(this.mLongitude);
        location.setSpeed(this.mSpeed);
        location.setBearing(this.mBearing);
        location.setAccuracy(40.0f);
        location.setTime(System.currentTimeMillis());
        Bundle bundle = new Bundle();
        bundle.putInt("satellites", 10);
        bundle.putInt("satellitesvalue", 10);
        location.setExtras(bundle);
        return location;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public boolean isEmpty() {
        return this.mLatitude == 0.0d && this.mLongitude == 0.0d;
    }

    public String toString() {
        return "BLocation{latitude: " + this.mLatitude + ", longitude: " + this.mLongitude + ", altitude: " + this.mAltitude + ", speed: " + this.mSpeed + ", bearing: " + this.mBearing + ", accuracy: " + this.mAccuracy + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeDouble(this.mAltitude);
        parcel.writeFloat(this.mSpeed);
        parcel.writeFloat(this.mBearing);
        parcel.writeFloat(this.mAccuracy);
    }

    public BLocation(double d, double d2) {
        this.mAltitude = 0.0d;
        this.mSpeed = 0.0f;
        this.mBearing = 0.0f;
        this.mAccuracy = 0.0f;
        this.mLatitude = d;
        this.mLongitude = d2;
    }

    public BLocation(Parcel parcel) {
        this.mLatitude = 0.0d;
        this.mLongitude = 0.0d;
        this.mAltitude = 0.0d;
        this.mSpeed = 0.0f;
        this.mBearing = 0.0f;
        this.mAccuracy = 0.0f;
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.mAltitude = parcel.readDouble();
        this.mAccuracy = parcel.readFloat();
        this.mSpeed = parcel.readFloat();
        this.mBearing = parcel.readFloat();
    }
}
