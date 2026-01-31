.class public Ltop/niunaijun/blackbox/entity/JobRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltop/niunaijun/blackbox/entity/JobRecord;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public mJobInfo:Landroid/app/job/JobInfo;

.field public mJobService:Landroid/app/job/JobService;

.field public mServiceInfo:Landroid/content/pm/ServiceInfo;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/entity/JobRecord$1;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/entity/JobRecord$1;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/entity/JobRecord;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroid/app/job/JobInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobInfo;

    iput-object v0, p0, Ltop/niunaijun/blackbox/entity/JobRecord;->mJobInfo:Landroid/app/job/JobInfo;

    const-class v0, Landroid/content/pm/ServiceInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ServiceInfo;

    iput-object p1, p0, Ltop/niunaijun/blackbox/entity/JobRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/entity/JobRecord;->mJobInfo:Landroid/app/job/JobInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Ltop/niunaijun/blackbox/entity/JobRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
