.class public interface abstract Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService$_Parcel;,
        Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService$Stub;,
        Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "top.niunaijun.blackbox.core.system.os.IBStorageManagerService"


# virtual methods
.method public abstract getUriForFile(Ljava/lang/String;)Landroid/net/Uri;
.end method

.method public abstract getVolumeList(ILjava/lang/String;II)[Landroid/os/storage/StorageVolume;
.end method
