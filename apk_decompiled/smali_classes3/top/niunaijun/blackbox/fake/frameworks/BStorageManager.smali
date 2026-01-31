.class public Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;
.super Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltop/niunaijun/blackbox/fake/frameworks/BlackManager<",
        "Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService;",
        ">;"
    }
.end annotation


# static fields
.field private static final sStorageManager:Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;->sStorageManager:Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;-><init>()V

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;->sStorageManager:Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;

    return-object v0
.end method


# virtual methods
.method public getServiceName()Ljava/lang/String;
    .locals 1

    const-string v0, "storage_manager"

    return-object v0
.end method

.method public getUriForFile(Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService;

    invoke-interface {v0, p1}, Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService;->getUriForFile(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getVolumeList(ILjava/lang/String;II)[Landroid/os/storage/StorageVolume;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService;

    invoke-interface {v0, p1, p2, p3, p4}, Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService;->getVolumeList(ILjava/lang/String;II)[Landroid/os/storage/StorageVolume;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    new-array p1, p1, [Landroid/os/storage/StorageVolume;

    return-object p1
.end method
