.class public interface abstract Landroid/content/pm/IPackageInstallerSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/content/pm/IPackageInstallerSession$_Parcel;,
        Landroid/content/pm/IPackageInstallerSession$Stub;,
        Landroid/content/pm/IPackageInstallerSession$Default;
    }
.end annotation


# virtual methods
.method public abstract abandon()V
.end method

.method public abstract addClientProgress(F)V
.end method

.method public abstract close()V
.end method

.method public abstract commit(Landroid/content/IntentSender;)V
.end method

.method public abstract getNames()[Ljava/lang/String;
.end method

.method public abstract openRead(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
.end method

.method public abstract openWrite(Ljava/lang/String;JJ)Landroid/os/ParcelFileDescriptor;
.end method

.method public abstract removeSplit(Ljava/lang/String;)V
.end method

.method public abstract setClientProgress(F)V
.end method
