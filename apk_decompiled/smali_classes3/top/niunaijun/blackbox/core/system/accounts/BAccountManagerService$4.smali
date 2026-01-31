.class Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;
.super Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;->addAccount(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLandroid/os/Bundle;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;

.field final synthetic val$accountType:Ljava/lang/String;

.field final synthetic val$authTokenType:Ljava/lang/String;

.field final synthetic val$options:Landroid/os/Bundle;

.field final synthetic val$requiredFeatures:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;ZZLjava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->this$0:Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;

    iput-object p10, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$authTokenType:Ljava/lang/String;

    iput-object p11, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$requiredFeatures:[Ljava/lang/String;

    iput-object p12, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$options:Landroid/os/Bundle;

    iput-object p13, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$accountType:Ljava/lang/String;

    invoke-direct/range {p0 .. p9}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;-><init>(Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;ZZ)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->mAccountType:Ljava/lang/String;

    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$authTokenType:Ljava/lang/String;

    iget-object v4, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$requiredFeatures:[Ljava/lang/String;

    iget-object v5, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$options:Landroid/os/Bundle;

    move-object v1, p0

    invoke-interface/range {v0 .. v5}, Landroid/accounts/IAccountAuthenticator;->addAccount(Landroid/accounts/IAccountAuthenticatorResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public toDebugString(J)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->toDebugString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ", addAccount, accountType "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$accountType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ", requiredFeatures "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$4;->val$requiredFeatures:[Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
