.class public interface abstract Ltop/niunaijun/blackbox/core/system/pm/IBPackageInstallerService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/core/system/pm/IBPackageInstallerService$_Parcel;,
        Ltop/niunaijun/blackbox/core/system/pm/IBPackageInstallerService$Stub;,
        Ltop/niunaijun/blackbox/core/system/pm/IBPackageInstallerService$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService"


# virtual methods
.method public abstract clearPackage(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;I)I
.end method

.method public abstract installPackageAsUser(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;I)I
.end method

.method public abstract uninstallPackageAsUser(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;ZI)I
.end method

.method public abstract updatePackage(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;)I
.end method
