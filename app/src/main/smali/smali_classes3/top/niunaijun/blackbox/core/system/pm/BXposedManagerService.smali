.class public Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;
.super Ltop/niunaijun/blackbox/core/system/pm/IBXposedManagerService$Stub;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/ISystemService;
.implements Ltop/niunaijun/blackbox/core/system/pm/PackageMonitor;


# static fields
.field private static final sService:Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;


# instance fields
.field private final mCacheModule:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ltop/niunaijun/blackbox/entity/pm/InstalledModule;",
            ">;"
        }
    .end annotation
.end field

.field private final mLock:Ljava/lang/Object;

.field private mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

.field private mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->sService:Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/pm/IBXposedManagerService$Stub;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mLock:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->sService:Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;

    return-object v0
.end method

.method private loadModuleStateLr()V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getXPModuleConf()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->saveModuleStateLw()V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->readToParcel(Ljava/io/File;)Landroid/os/Parcel;

    move-result-object v1

    new-instance v0, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    invoke-direct {v0, v1}, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_1

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    :cond_1
    return-void

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    :cond_2
    throw v0
.end method

.method private saveModuleStateLw()V
    .locals 6

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    new-instance v1, Landroidx/core/util/AtomicFile;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getXPModuleConf()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/core/util/AtomicFile;-><init>(Ljava/io/File;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    iget-object v5, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    invoke-virtual {v5, v0, v3}, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-virtual {v1}, Landroidx/core/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v4

    invoke-static {v0, v4}, Ltop/niunaijun/blackbox/utils/FileUtils;->writeParcelToOutput(Landroid/os/Parcel;Ljava/io/FileOutputStream;)V

    invoke-virtual {v1, v4}, Landroidx/core/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v2, [Ljava/io/Closeable;

    aput-object v4, v0, v3

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    goto :goto_1

    :catch_0
    move-exception v5

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :goto_0
    :try_start_1
    invoke-virtual {v1, v4}, Landroidx/core/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v2, [Ljava/io/Closeable;

    aput-object v4, v0, v3

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    :goto_1
    return-void

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    new-array v0, v2, [Ljava/io/Closeable;

    aput-object v4, v0, v3

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    throw v1
.end method


# virtual methods
.method public getInstalledModules()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/pm/InstalledModule;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    const/16 v1, 0x80

    const/4 v2, -0x4

    invoke-virtual {v0, v1, v2}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getInstalledApplications(II)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ApplicationInfo;

    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    iget-object v4, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Ltop/niunaijun/blackbox/utils/compat/XposedParserCompat;->parseModule(Landroid/content/pm/ApplicationInfo;)Ltop/niunaijun/blackbox/entity/pm/InstalledModule;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/niunaijun/blackbox/entity/pm/InstalledModule;

    iget-object v4, v3, Ltop/niunaijun/blackbox/entity/pm/InstalledModule;->packageName:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->isModuleEnable(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, v3, Ltop/niunaijun/blackbox/entity/pm/InstalledModule;->enable:Z

    goto :goto_1

    :cond_3
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public isModuleEnable(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    iget-object v1, v1, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;->moduleState:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isXPEnable()Z
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    iget-boolean v1, v1, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;->enable:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onPackageInstalled(Ljava/lang/String;I)V
    .locals 2

    const/4 v0, -0x4

    if-eq p2, v0, :cond_0

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    iget-object p2, p2, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;->moduleState:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->saveModuleStateLw()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public onPackageUninstalled(Ljava/lang/String;ZI)V
    .locals 0

    const/4 p2, -0x4

    if-eq p3, p2, :cond_0

    const/4 p2, -0x1

    if-eq p3, p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    monitor-enter p2

    :try_start_0
    iget-object p3, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mCacheModule:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object p3, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mLock:Ljava/lang/Object;

    monitor-enter p3

    :try_start_1
    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    iget-object p2, p2, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;->moduleState:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->saveModuleStateLw()V

    monitor-exit p3

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public setModuleEnable(Ljava/lang/String;Z)V
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    const/4 v2, -0x4

    invoke-virtual {v1, p1, v2}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->isInstalled(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    iget-object v1, v1, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;->moduleState:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->saveModuleStateLw()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setXPEnable(Z)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mXposedConfig:Ltop/niunaijun/blackbox/entity/pm/XposedConfig;

    iput-boolean p1, v1, Ltop/niunaijun/blackbox/entity/pm/XposedConfig;->enable:Z

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->saveModuleStateLw()V

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
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->loadModuleStateLr()V

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    invoke-virtual {v0, p0}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->addPackageMonitor(Ltop/niunaijun/blackbox/core/system/pm/PackageMonitor;)V

    return-void
.end method
