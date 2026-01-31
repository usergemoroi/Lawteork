.class public Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$unregisterAccountListener;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$registerAccountListener;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAccountsAndVisibilityForPackage;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAccountVisibility;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$setAccountVisibility;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$addAccountExplicitlyWithVisibility;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getPackagesAndVisibilityForAccount;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAuthTokenLabel;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$accountAuthenticated;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$confirmCredentialsAsUser;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$editProperties;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$updateCredentials;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$addAccountAsUser;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$addAccount;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAuthToken;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$updateAppPermission;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$setUserData;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$clearPassword;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$setPassword;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$setAuthToken;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$peekAuthToken;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$invalidateAuthToken;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$copyAccountToUser;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$removeAccountExplicitly;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$removeAccountAsUser;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$addAccountExplicitly;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAccountsAsUser;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAccountsByFeatures;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAccountByTypeAndFeatures;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAccountsByTypeForPackage;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAccountsForPackage;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getAuthenticatorTypes;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getUserData;,
        Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy$getPassword;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "IAccountManagerProxy"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "account"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 3

    .line 1
    const-class v0, Lblack/android/accounts/IAccountManagerStubStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/accounts/IAccountManagerStubStatic;

    .line 2
    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v1

    const-string v2, "account"

    invoke-interface {v1, v2}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/accounts/IAccountManagerStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "account"

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "call "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IAccountManagerProxy"

    invoke-static {v1, v0}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onBindMethod()V
    .locals 0

    invoke-super {p0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->onBindMethod()V

    return-void
.end method
