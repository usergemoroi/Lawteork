.class Ltop/niunaijun/blackbox/entity/location/BLocationConfig$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/entity/location/BLocationConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Ltop/niunaijun/blackbox/entity/location/BLocationConfig;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig$1;->createFromParcel(Landroid/os/Parcel;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;
    .locals 1

    .line 2
    new-instance v0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    invoke-direct {v0, p1}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig$1;->newArray(I)[Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Ltop/niunaijun/blackbox/entity/location/BLocationConfig;
    .locals 0

    .line 2
    new-array p1, p1, [Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    return-object p1
.end method
