.class public Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;
.super Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService$Stub;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/ISystemService;


# static fields
.field public static final TAG:Ljava/lang/String; = "BLocationManagerService"

.field private static final sService:Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;


# instance fields
.field private final mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

.field private final mLocationConfigs:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ltop/niunaijun/blackbox/entity/location/BLocationConfig;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mLocationListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Ltop/niunaijun/blackbox/core/system/location/LocationRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final mThreadPool:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->sService:Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService$Stub;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    new-instance v0, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationListeners:Ljava/util/Map;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mThreadPool:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic access$000(Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationListeners:Ljava/util/Map;

    return-object p0
.end method

.method private addTask(Landroid/os/IBinder;)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mThreadPool:Ljava/util/concurrent/Executor;

    new-instance v1, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda1;-><init>(Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;Landroid/os/IBinder;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->sService:Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;

    return-object v0
.end method

.method private getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    invoke-virtual {v2, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    if-nez p1, :cond_1

    new-instance p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    invoke-direct {p1}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;-><init>()V

    const/4 v2, 0x0

    iput v2, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->pattern:I

    invoke-virtual {v1, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method static lambda$addTask$0(Landroid/os/IInterface;Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    .locals 2

    .line 1
    const-class v0, Lblack/android/location/ILocationListenerContext;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/location/ILocationListenerContext;

    .line 2
    invoke-virtual {p1}, Ltop/niunaijun/blackbox/entity/location/BLocation;->convert2SystemLocation()Landroid/location/Location;

    move-result-object p1

    invoke-interface {p0, p1}, Lblack/android/location/ILocationListenerContext;->onLocationChanged(Landroid/location/Location;)Ljava/lang/Void;

    return-void
.end method


# virtual methods
.method public getAllCell(ILjava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iget p2, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->pattern:I

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->allCell:Ljava/util/List;

    return-object p1

    :cond_1
    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->allCell:Ljava/util/List;

    return-object p1
.end method

.method public getCell(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BCell;
    .locals 1

    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iget p2, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->pattern:I

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->cell:Ltop/niunaijun/blackbox/entity/location/BCell;

    return-object p1

    :cond_1
    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->cell:Ltop/niunaijun/blackbox/entity/location/BCell;

    return-object p1
.end method

.method public getGlobalLocation()Ltop/niunaijun/blackbox/entity/location/BLocation;
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iget-object v1, v1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->location:Ltop/niunaijun/blackbox/entity/location/BLocation;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getGlobalNeighboringCell()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iget-object v1, v1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->neighboringCellInfo:Ljava/util/List;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getLocation(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocation;
    .locals 1

    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iget p2, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->pattern:I

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->location:Ltop/niunaijun/blackbox/entity/location/BLocation;

    return-object p1

    :cond_1
    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->location:Ltop/niunaijun/blackbox/entity/location/BLocation;

    return-object p1
.end method

.method public getNeighboringCell(ILjava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->allCell:Ljava/util/List;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getPattern(ILjava/lang/String;)I
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iget p1, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->pattern:I

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method lambda$addTask$1$top-niunaijun-blackbox-core-system-location-BLocationManagerService(Landroid/os/IBinder;)V
    .locals 10

    .line 0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1
    const-class v4, Lblack/android/location/ILocationListenerStubStatic;

    const/4 v5, 0x0

    invoke-static {v4, v2, v5}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lblack/android/location/ILocationListenerStubStatic;

    .line 2
    invoke-interface {v4, p1}, Lblack/android/location/ILocationListenerStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v4

    iget-object v5, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationListeners:Ljava/util/Map;

    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ltop/niunaijun/blackbox/core/system/location/LocationRecord;

    if-nez v5, :cond_0

    :goto_1
    goto :goto_0

    :cond_0
    iget v6, v5, Ltop/niunaijun/blackbox/core/system/location/LocationRecord;->userId:I

    iget-object v5, v5, Ltop/niunaijun/blackbox/core/system/location/LocationRecord;->packageName:Ljava/lang/String;

    invoke-virtual {p0, v6, v5}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getLocation(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocation;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v0

    const-wide/16 v8, 0xbb8

    cmp-long v6, v6, v8

    if-gez v6, :cond_2

    const-wide/16 v4, 0x3e8

    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    goto :goto_1

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v3

    invoke-virtual {v3}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHandler()Landroid/os/Handler;

    move-result-object v3

    new-instance v6, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda0;

    invoke-direct {v6, v4, v5}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda0;-><init>(Landroid/os/IInterface;Ltop/niunaijun/blackbox/entity/location/BLocation;)V

    invoke-virtual {v3, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-object v3, v5

    goto :goto_0

    :cond_3
    return-void
.end method

.method public loadConfig()V
    .locals 13

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getFakeLocationConf()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v4, :cond_0

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v1, [Ljava/io/Closeable;

    aput-object v3, v0, v2

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    return-void

    :cond_0
    :try_start_1
    new-instance v4, Ljava/io/FileInputStream;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getFakeLocationConf()Ljava/io/File;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-static {v4}, Ltop/niunaijun/blackbox/utils/FileUtils;->toByteArray(Ljava/io/InputStream;)[B

    move-result-object v3

    array-length v5, v3

    invoke-virtual {v0, v3, v2, v5}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    monitor-enter v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v5, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    invoke-virtual {v5, v0}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->refresh(Landroid/os/Parcel;)V

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    iget-object v5, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->clear()V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    move v6, v2

    :goto_0
    if-ge v6, v5, :cond_1

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    const-class v8, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v8

    iget-object v9, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    invoke-virtual {v9, v7, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const-string v9, "BLocationManagerService"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "load userId: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v10, ", config: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v9, v7}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v1, [Ljava/io/Closeable;

    aput-object v4, v0, v2

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception v5

    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v5
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_1
    move-exception v5

    :try_start_8
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v3

    goto :goto_3

    :catch_0
    move-exception v3

    goto :goto_1

    :catchall_3
    move-exception v4

    move-object v12, v4

    move-object v4, v3

    move-object v3, v12

    goto :goto_3

    :catch_1
    move-exception v4

    move-object v12, v4

    move-object v4, v3

    move-object v3, v12

    :goto_1
    :try_start_a
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    const-string v3, "BLocationManagerService"

    const-string v5, "bad config"

    invoke-static {v3, v5}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getFakeLocationConf()Ljava/io/File;

    move-result-object v3

    invoke-static {v3}, Ltop/niunaijun/blackbox/utils/FileUtils;->deleteDir(Ljava/io/File;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v1, [Ljava/io/Closeable;

    aput-object v4, v0, v2

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    :goto_2
    return-void

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v1, [Ljava/io/Closeable;

    aput-object v4, v0, v2

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    throw v3
.end method

.method public removeUpdates(Landroid/os/IBinder;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationListeners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public requestLocationUpdates(Landroid/os/IBinder;Ljava/lang/String;I)V
    .locals 2

    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationListeners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$1;

    invoke-direct {v0, p0, p1}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$1;-><init>(Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;Landroid/os/IBinder;)V

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    new-instance v0, Ltop/niunaijun/blackbox/core/system/location/LocationRecord;

    invoke-direct {v0, p2, p3}, Ltop/niunaijun/blackbox/core/system/location/LocationRecord;-><init>(Ljava/lang/String;I)V

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationListeners:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->addTask(Landroid/os/IBinder;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public save()V
    .locals 10

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    new-instance v3, Landroid/util/AtomicFile;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getFakeLocationConf()Ljava/io/File;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    :try_start_2
    iget-object v7, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    invoke-virtual {v7, v2, v5}, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v7, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/os/Parcel;->writeInt(I)V

    move v7, v5

    :goto_0
    iget-object v8, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v8

    if-ge v7, v8, :cond_0

    iget-object v8, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v8

    iget-object v9, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    invoke-virtual {v9, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/HashMap;

    invoke-virtual {v2, v8}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, v9}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-virtual {v3}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v6

    invoke-static {v2, v6}, Ltop/niunaijun/blackbox/utils/FileUtils;->writeParcelToOutput(Landroid/os/Parcel;Ljava/io/FileOutputStream;)V

    invoke-virtual {v3, v6}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    new-array v2, v4, [Ljava/io/Closeable;

    aput-object v6, v2, v5

    invoke-static {v2}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v7

    :try_start_4
    invoke-virtual {v7}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-virtual {v3, v6}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    new-array v2, v4, [Ljava/io/Closeable;

    aput-object v6, v2, v5

    invoke-static {v2}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    :goto_1
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    return-void

    :catchall_1
    move-exception v3

    :try_start_7
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    new-array v2, v4, [Ljava/io/Closeable;

    aput-object v6, v2, v5

    invoke-static {v2}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    throw v3

    :catchall_2
    move-exception v2

    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw v2

    :catchall_3
    move-exception v1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw v1
.end method

.method public setAllCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iput-object p3, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->allCell:Ljava/util/List;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setCell(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BCell;)V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iput-object p3, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->cell:Ltop/niunaijun/blackbox/entity/location/BCell;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setGlobalAllCell(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iput-object p1, v1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->allCell:Ljava/util/List;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setGlobalCell(Ltop/niunaijun/blackbox/entity/location/BCell;)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iput-object p1, v1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->cell:Ltop/niunaijun/blackbox/entity/location/BCell;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setGlobalLocation(Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iput-object p1, v1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->location:Ltop/niunaijun/blackbox/entity/location/BLocation;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setGlobalNeighboringCell(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mGlobalConfig:Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    iput-object p1, v1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->neighboringCellInfo:Ljava/util/List;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setLocation(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iput-object p3, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->location:Ltop/niunaijun/blackbox/entity/location/BLocation;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setNeighboringCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iput-object p3, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->allCell:Ljava/util/List;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setPattern(ILjava/lang/String;I)V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationConfigs:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->getOrCreateConfig(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocationConfig;

    move-result-object p1

    iput p3, p1, Ltop/niunaijun/blackbox/entity/location/BLocationConfig;->pattern:I

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->save()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public systemReady()V
    .locals 2

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->loadConfig()V

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->mLocationListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IBinder;

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->addTask(Landroid/os/IBinder;)V

    goto :goto_0

    :cond_0
    return-void
.end method
