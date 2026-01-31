.class public Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public account:Landroid/accounts/Account;

.field public authToken:Ljava/lang/String;

.field public authTokenType:Ljava/lang/String;

.field public expiryEpochMillis:J

.field public packageName:Ljava/lang/String;

.field public userId:I


# direct methods
.method public constructor <init>(ILandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->userId:I

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->account:Landroid/accounts/Account;

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authToken:Ljava/lang/String;

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authToken:Ljava/lang/String;

    iput-object p3, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authTokenType:Ljava/lang/String;

    iput-object p4, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->packageName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->userId:I

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->account:Landroid/accounts/Account;

    iput-wide p6, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->expiryEpochMillis:J

    iput-object p5, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authToken:Ljava/lang/String;

    iput-object p4, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authTokenType:Ljava/lang/String;

    iput-object p3, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->packageName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->userId:I

    iget v3, p1, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->userId:I

    if-ne v1, v3, :cond_2

    iget-wide v3, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->expiryEpochMillis:J

    iget-wide v5, p1, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->expiryEpochMillis:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->account:Landroid/accounts/Account;

    iget-object v3, p1, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->account:Landroid/accounts/Account;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authToken:Ljava/lang/String;

    iget-object v3, p1, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authToken:Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authTokenType:Ljava/lang/String;

    iget-object v3, p1, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authTokenType:Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->packageName:Ljava/lang/String;

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->packageName:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 7

    iget v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->userId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->account:Landroid/accounts/Account;

    iget-wide v3, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->expiryEpochMillis:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authToken:Ljava/lang/String;

    iget-object v5, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->authTokenType:Ljava/lang/String;

    iget-object v6, p0, Ltop/niunaijun/blackbox/core/system/accounts/TokenCache;->packageName:Ljava/lang/String;

    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
