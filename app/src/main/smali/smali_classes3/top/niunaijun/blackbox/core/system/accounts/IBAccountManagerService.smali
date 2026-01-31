.class public interface abstract Ltop/niunaijun/blackbox/core/system/accounts/IBAccountManagerService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/core/system/accounts/IBAccountManagerService$_Parcel;,
        Ltop/niunaijun/blackbox/core/system/accounts/IBAccountManagerService$Stub;,
        Ltop/niunaijun/blackbox/core/system/accounts/IBAccountManagerService$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService"


# virtual methods
.method public abstract accountAuthenticated(Landroid/accounts/Account;I)Z
.end method

.method public abstract addAccount(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLandroid/os/Bundle;I)V
.end method

.method public abstract addAccountAsUser(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLandroid/os/Bundle;I)V
.end method

.method public abstract addAccountExplicitly(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;I)Z
.end method

.method public abstract addAccountExplicitlyWithVisibility(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;I)Z
.end method

.method public abstract clearPassword(Landroid/accounts/Account;I)V
.end method

.method public abstract confirmCredentialsAsUser(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Landroid/os/Bundle;ZI)V
.end method

.method public abstract copyAccountToUser(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;II)V
.end method

.method public abstract editProperties(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZI)V
.end method

.method public abstract getAccountByTypeAndFeatures(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;[Ljava/lang/String;I)V
.end method

.method public abstract getAccountVisibility(Landroid/accounts/Account;Ljava/lang/String;I)I
.end method

.method public abstract getAccountsAndVisibilityForPackage(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/Map;
.end method

.method public abstract getAccountsAsUser(Ljava/lang/String;I)[Landroid/accounts/Account;
.end method

.method public abstract getAccountsByFeatures(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;[Ljava/lang/String;I)V
.end method

.method public abstract getAccountsByTypeForPackage(Ljava/lang/String;Ljava/lang/String;I)[Landroid/accounts/Account;
.end method

.method public abstract getAccountsForPackage(Ljava/lang/String;II)[Landroid/accounts/Account;
.end method

.method public abstract getAuthToken(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Ljava/lang/String;ZZLandroid/os/Bundle;I)V
.end method

.method public abstract getAuthTokenLabel(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract getAuthenticatorTypes(I)[Landroid/accounts/AuthenticatorDescription;
.end method

.method public abstract getPackagesAndVisibilityForAccount(Landroid/accounts/Account;I)Ljava/util/Map;
.end method

.method public abstract getPassword(Landroid/accounts/Account;I)Ljava/lang/String;
.end method

.method public abstract getUserData(Landroid/accounts/Account;Ljava/lang/String;I)Ljava/lang/String;
.end method

.method public abstract invalidateAuthToken(Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract peekAuthToken(Landroid/accounts/Account;Ljava/lang/String;I)Ljava/lang/String;
.end method

.method public abstract registerAccountListener([Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract removeAccountAsUser(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;ZI)V
.end method

.method public abstract removeAccountExplicitly(Landroid/accounts/Account;I)Z
.end method

.method public abstract setAccountVisibility(Landroid/accounts/Account;Ljava/lang/String;II)Z
.end method

.method public abstract setAuthToken(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract setPassword(Landroid/accounts/Account;Ljava/lang/String;I)V
.end method

.method public abstract setUserData(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract unregisterAccountListener([Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract updateAppPermission(Landroid/accounts/Account;Ljava/lang/String;IZ)V
.end method

.method public abstract updateCredentials(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Ljava/lang/String;ZLandroid/os/Bundle;I)V
.end method
