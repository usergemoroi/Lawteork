.class public Ltop/niunaijun/blackbox/entity/location/BLocationConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltop/niunaijun/blackbox/entity/location/BLocationConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public allCell:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation
.end field

.field public cell:Ltop/niunaijun/blackbox/entity/location/BCell;

.field public location:Ltop/niunaijun/blackbox/entity/location/BLocation;

.field public neighboringCellInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation
.end field

.field public pattern:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig$1;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig$1;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->refresh(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public refresh(Landroid/os/Parcel;)V
    .locals 2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->pattern:I

    const-class v0, Ltop/niunaijun/blackbox/entity/location/BCell;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/entity/location/BCell;

    iput-object v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->cell:Ltop/niunaijun/blackbox/entity/location/BCell;

    sget-object v0, Ltop/niunaijun/blackbox/entity/location/BCell;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->allCell:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->neighboringCellInfo:Ljava/util/List;

    const-class v0, Ltop/niunaijun/blackbox/entity/location/BLocation;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/entity/location/BLocation;

    iput-object p1, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->location:Ltop/niunaijun/blackbox/entity/location/BLocation;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->pattern:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->cell:Ltop/niunaijun/blackbox/entity/location/BCell;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->allCell:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->neighboringCellInfo:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object v0, p0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->location:Ltop/niunaijun/blackbox/entity/location/BLocation;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
