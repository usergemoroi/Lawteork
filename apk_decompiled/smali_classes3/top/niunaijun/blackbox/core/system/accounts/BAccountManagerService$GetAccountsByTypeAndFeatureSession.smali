.class Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;
.super Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "GetAccountsByTypeAndFeatureSession"
.end annotation


# instance fields
.field private volatile mAccountsOfType:[Landroid/accounts/Account;

.field private volatile mAccountsWithFeatures:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/accounts/Account;",
            ">;"
        }
    .end annotation
.end field

.field private volatile mCurrentAccount:I

.field private final mFeatures:[Ljava/lang/String;

.field private final mIncludeManagedNotVisible:Z

.field private final mPackageName:Ljava/lang/String;

.field private final mUserId:I

.field final synthetic this$0:Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;[Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 10

    move-object v9, p0

    move-object v1, p1

    iput-object v1, v9, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->this$0:Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v8}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;-><init>(Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;Z)V

    const/4 v0, 0x0

    iput-object v0, v9, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsOfType:[Landroid/accounts/Account;

    iput-object v0, v9, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsWithFeatures:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, v9, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mCurrentAccount:I

    move/from16 v0, p6

    iput v0, v9, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mUserId:I

    move-object v0, p5

    iput-object v0, v9, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mFeatures:[Ljava/lang/String;

    move-object/from16 v0, p7

    iput-object v0, v9, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mPackageName:Ljava/lang/String;

    move/from16 v0, p8

    iput-boolean v0, v9, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mIncludeManagedNotVisible:Z

    return-void
.end method


# virtual methods
.method public checkAccount()V
    .locals 3

    iget v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mCurrentAccount:I

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsOfType:[Landroid/accounts/Account;

    array-length v1, v1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->sendResult()V

    return-void

    :cond_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->mAuthenticator:Landroid/accounts/IAccountAuthenticator;

    if-nez v0, :cond_2

    const/4 v0, 0x2

    const-string v1, "AccountManagerService"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "checkAccount: aborting session since we are no longer connected to the authenticator, "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->toDebugString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void

    :cond_2
    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsOfType:[Landroid/accounts/Account;

    iget v2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mCurrentAccount:I

    aget-object v1, v1, v2

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mFeatures:[Ljava/lang/String;

    invoke-interface {v0, p0, v1, v2}, Landroid/accounts/IAccountAuthenticator;->hasFeatures(Landroid/accounts/IAccountAuthenticatorResponse;Landroid/accounts/Account;[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x1

    const-string v1, "remote exception"

    invoke-virtual {p0, v0, v1}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->onError(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 2

    iget v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->mNumResults:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->mNumResults:I

    if-nez p1, :cond_0

    const/4 p1, 0x5

    const-string v0, "null bundle"

    invoke-virtual {p0, p1, v0}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->onError(ILjava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "booleanResult"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsWithFeatures:Ljava/util/ArrayList;

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsOfType:[Landroid/accounts/Account;

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mCurrentAccount:I

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mCurrentAccount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mCurrentAccount:I

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->checkAccount()V

    return-void
.end method

.method public run()V
    .locals 5

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->this$0:Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->mAccounts:Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->mAccountType:Ljava/lang/String;

    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mPackageName:Ljava/lang/String;

    iget-boolean v4, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mIncludeManagedNotVisible:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;->getAccountsFromCache(Ltop/niunaijun/blackbox/core/system/accounts/BUserAccounts;Ljava/lang/String;Ljava/lang/String;Z)[Landroid/accounts/Account;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsOfType:[Landroid/accounts/Account;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsOfType:[Landroid/accounts/Account;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsWithFeatures:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mCurrentAccount:I

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->checkAccount()V

    return-void
.end method

.method public sendResult()V
    .locals 7

    const-string v0, "AccountManagerService"

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$Session;->getResponseAndClose()Landroid/accounts/IAccountManagerResponse;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v2, 0x2

    :try_start_0
    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsWithFeatures:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v4, v3, [Landroid/accounts/Account;

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    iget-object v6, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mAccountsWithFeatures:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/accounts/Account;

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " calling onResult() on response "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v5, "accounts"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    invoke-interface {v1, v3}, Landroid/accounts/IAccountManagerResponse;->onResult(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "failure while notifying response"

    invoke-static {v0, v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_1
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

    const-string p2, ", getAccountsByTypeAndFeatures, "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService$GetAccountsByTypeAndFeatureSession;->mFeatures:[Ljava/lang/String;

    if-eqz p2, :cond_0

    const-string v0, ","

    invoke-static {v0, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
