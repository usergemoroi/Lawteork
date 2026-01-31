.class public Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;
.super Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService$Stub;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/ISystemService;


# static fields
.field private static final sService:Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;->sService:Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/os/IBStorageManagerService$Stub;-><init>()V

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;->sService:Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;

    return-object v0
.end method


# virtual methods
.method public getUriForFile(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getProxyFileProvider()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackbox/fake/provider/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public getVolumeList(ILjava/lang/String;II)[Landroid/os/storage/StorageVolume;
    .locals 5

    .line 1
    const-class p1, Lblack/android/os/storage/StorageManagerStatic;

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/os/storage/StorageManagerStatic;

    .line 2
    invoke-interface {p1, p3, p3}, Lblack/android/os/storage/StorageManagerStatic;->getVolumeList(II)[Landroid/os/storage/StorageVolume;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    .line 3
    :cond_0
    :try_start_0
    const-class p1, Lblack/android/os/storage/StorageManagerStatic;

    invoke-static {p1, p2, p3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/os/storage/StorageManagerStatic;

    .line 4
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    invoke-static {v0}, Ltop/niunaijun/blackbox/core/system/user/BUserHandle;->getUserId(I)I

    move-result v0

    invoke-interface {p1, v0, p3}, Lblack/android/os/storage/StorageManagerStatic;->getVolumeList(II)[Landroid/os/storage/StorageVolume;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p2

    :cond_1
    array-length v0, p1

    move v1, p3

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v2, p1, v1

    .line 5
    const-class v3, Lblack/android/os/storage/StorageVolumeContext;

    invoke-static {v3, v2, p3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lblack/android/os/storage/StorageVolumeContext;

    .line 6
    invoke-static {p4}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getExternalUserDir(I)Ljava/io/File;

    move-result-object v4

    invoke-interface {v3, v4}, Lblack/android/os/storage/StorageVolumeContext;->_set_mPath(Ljava/lang/Object;)V

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isPie()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 7
    const-class v3, Lblack/android/os/storage/StorageVolumeContext;

    invoke-static {v3, v2, p3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lblack/android/os/storage/StorageVolumeContext;

    .line 8
    invoke-static {p4}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getExternalUserDir(I)Ljava/io/File;

    move-result-object v3

    invoke-interface {v2, v3}, Lblack/android/os/storage/StorageVolumeContext;->_set_mInternalPath(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-object p2
.end method

.method public systemReady()V
    .locals 0

    return-void
.end method
