.class public Ltop/niunaijun/blackbox/entity/location/BLocation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltop/niunaijun/blackbox/entity/location/BLocation;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mAccuracy:F

.field private mAltitude:D

.field private mBearing:F

.field private mLatitude:D

.field private mLongitude:D

.field private mSpeed:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/entity/location/BLocation$1;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/entity/location/BLocation$1;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/entity/location/BLocation;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAltitude:D

    const/4 v0, 0x0

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mSpeed:F

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mBearing:F

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAccuracy:F

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAltitude:D

    const/4 v0, 0x0

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mSpeed:F

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mBearing:F

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAccuracy:F

    iput-wide p1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    iput-wide p3, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAltitude:D

    const/4 v0, 0x0

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mSpeed:F

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mBearing:F

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAccuracy:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAltitude:D

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAccuracy:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mSpeed:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    iput p1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mBearing:F

    return-void
.end method


# virtual methods
.method public convert2SystemLocation()Landroid/location/Location;
    .locals 4

    new-instance v0, Landroid/location/Location;

    const-string v1, "gps"

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    iget-wide v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    iget v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mSpeed:F

    invoke-virtual {v0, v1}, Landroid/location/Location;->setSpeed(F)V

    iget v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mBearing:F

    invoke-virtual {v0, v1}, Landroid/location/Location;->setBearing(F)V

    const/high16 v1, 0x42200000    # 40.0f

    invoke-virtual {v0, v1}, Landroid/location/Location;->setAccuracy(F)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setTime(J)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "satellites"

    const/16 v3, 0xa

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "satellitesvalue"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/location/Location;->setExtras(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getLatitude()D
    .locals 2

    iget-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    iget-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    return-wide v0
.end method

.method public isEmpty()Z
    .locals 4

    iget-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BLocation{latitude: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", longitude: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", altitude: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAltitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", speed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bearing: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mBearing:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accuracy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAccuracy:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLatitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mLongitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAltitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget p2, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mSpeed:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mBearing:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Ltop/niunaijun/blackbox/entity/location/BLocation;->mAccuracy:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
