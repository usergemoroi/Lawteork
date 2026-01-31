.class public Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final isStartup:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static sBlackBoxSystem:Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;


# instance fields
.field private final mServices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/core/system/ISystemService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->isStartup:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    return-void
.end method

.method public static getSystem()Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;
    .locals 2

    sget-object v0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->sBlackBoxSystem:Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;

    if-nez v0, :cond_1

    const-class v0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->sBlackBoxSystem:Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;

    if-nez v1, :cond_0

    new-instance v1, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;-><init>()V

    sput-object v1, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->sBlackBoxSystem:Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->sBlackBoxSystem:Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;

    return-object v0
.end method

.method private initJarEnv()V
    .locals 2

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "junit.jar"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->JUNIT_JAR:Ljava/io/File;

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/FileUtils;->copyFile(Ljava/io/InputStream;Ljava/io/File;)V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "empty.jar"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->EMPTY_JAR:Ljava/io/File;

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/FileUtils;->copyFile(Ljava/io/InputStream;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public startup()V
    .locals 5

    sget-object v0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->isStartup:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->load()V

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->get()Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->get()Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/am/BJobManagerService;->get()Ltop/niunaijun/blackbox/core/system/am/BJobManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;->get()Ltop/niunaijun/blackbox/core/system/os/BStorageManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BXposedManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;->get()Ltop/niunaijun/blackbox/core/system/accounts/BAccountManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->get()Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/notification/BNotificationManagerService;->get()Ltop/niunaijun/blackbox/core/system/notification/BNotificationManagerService;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->mServices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/core/system/ISystemService;

    invoke-interface {v1}, Ltop/niunaijun/blackbox/core/system/ISystemService;->systemReady()V

    goto :goto_0

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/core/env/AppSystemEnv;->getPreInstallPackages()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v1, v3}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->isInstalled(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v2

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->installBySystem()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v4

    invoke-virtual {v2, v1, v4, v3}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->installPackageAsUser(Ljava/lang/String;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/BlackBoxSystem;->initJarEnv()V

    return-void
.end method
