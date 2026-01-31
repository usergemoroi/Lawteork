.class Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;
.super Landroid/accounts/IAccountManagerResponse$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;->getAccountByTypeAndFeatures(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;[Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;

.field final synthetic val$opPackageName:Ljava/lang/String;

.field final synthetic val$response:Landroid/accounts/IAccountManagerResponse;

.field final synthetic val$userId:I


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;->this$0:Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;->val$response:Landroid/accounts/IAccountManagerResponse;

    iput-object p3, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;->val$opPackageName:Ljava/lang/String;

    iput p4, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;->val$userId:I

    invoke-direct {p0}, Landroid/accounts/IAccountManagerResponse$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "accounts"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    array-length v0, p1

    new-array v0, v0, [Landroid/accounts/Account;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget-object v2, p1, v1

    check-cast v2, Landroid/accounts/Account;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;->this$0:Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;->val$response:Landroid/accounts/IAccountManagerResponse;

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;->val$opPackageName:Ljava/lang/String;

    iget v3, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$1;->val$userId:I

    invoke-static {p1, v1, v0, v2, v3}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;->access$100(Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;Landroid/accounts/IAccountManagerResponse;[Landroid/accounts/Account;Ljava/lang/String;I)V

    return-void
.end method
