.class public Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public accounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/core/system/accounts/BAccount;",
            ">;"
        }
    .end annotation
.end field

.field public final lock:Ljava/lang/Object;

.field public userId:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts$1;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts$1;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->lock:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->lock:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->userId:I

    sget-object v0, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addAccount(Landroid/accounts/Account;)Ltop/niunaijun/blackbox/core/system/accounts/BAccount;
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;-><init>()V

    iput-object p1, v0, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->account:Landroid/accounts/Account;

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public delAccount(Landroid/accounts/Account;)Z
    .locals 1

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->getAccount(Landroid/accounts/Account;)Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    move-result-object p1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public findAccountLastAuthenticatedTime(Landroid/accounts/Account;)J
    .locals 2

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->getAccount(Landroid/accounts/Account;)Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-wide v0, p1, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->updateLastAuthenticatedTime:J

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public getAccount(Landroid/accounts/Account;)Ltop/niunaijun/blackbox/core/system/accounts/BAccount;
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    invoke-virtual {v1, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->isMatch(Landroid/accounts/Account;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getAccountUserData(Landroid/accounts/Account;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->getAccount(Landroid/accounts/Account;)Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1

    :cond_0
    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->accountUserData:Ljava/util/HashMap;

    return-object p1
.end method

.method public getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    iget-object v3, v2, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->account:Landroid/accounts/Account;

    iget-object v3, v3, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->account:Landroid/accounts/Account;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Landroid/accounts/Account;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/accounts/Account;

    return-object p1
.end method

.method public getAuthToken(Landroid/accounts/Account;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->getAccount(Landroid/accounts/Account;)Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1

    :cond_0
    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->authTokens:Ljava/util/HashMap;

    return-object p1
.end method

.method public getVisibility(Landroid/accounts/Account;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->getAccount(Landroid/accounts/Account;)Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1

    :cond_0
    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->visibility:Ljava/util/HashMap;

    return-object p1
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->userId:I

    sget-object v0, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    return-void
.end method

.method public toAccounts()[Landroid/accounts/Account;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    iget-object v2, v2, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->account:Landroid/accounts/Account;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    new-array v1, v1, [Landroid/accounts/Account;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/accounts/Account;

    return-object v0
.end method

.method public updateLastAuthenticatedTime(Landroid/accounts/Account;)V
    .locals 2

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->getAccount(Landroid/accounts/Account;)Ltop/niunaijun/blackbox/core/system/accounts/BAccount;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Ltop/niunaijun/blackbox/core/system/accounts/BAccount;->updateLastAuthenticatedTime:J

    :cond_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->userId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;->accounts:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    return-void
.end method
