.class public interface abstract Landroid/accounts/IAccountAuthenticatorResponse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/accounts/IAccountAuthenticatorResponse$_Parcel;,
        Landroid/accounts/IAccountAuthenticatorResponse$Stub;,
        Landroid/accounts/IAccountAuthenticatorResponse$Default;
    }
.end annotation


# virtual methods
.method public abstract onError(ILjava/lang/String;)V
.end method

.method public abstract onRequestContinued()V
.end method

.method public abstract onResult(Landroid/os/Bundle;)V
.end method
