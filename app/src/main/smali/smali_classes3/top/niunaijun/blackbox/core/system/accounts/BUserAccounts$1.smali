.class Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;",
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
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts$1;->createFromParcel(Landroid/os/Parcel;)Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;
    .locals 1

    .line 2
    new-instance v0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;

    invoke-direct {v0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts$1;->newArray(I)[Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;
    .locals 0

    .line 2
    new-array p1, p1, [Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;

    return-object p1
.end method
