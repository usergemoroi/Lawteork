.class public Ltop/niunaijun/blackbox/core/system/BProcessManagerService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/ISystemService;


# static fields
.field public static final TAG:Ljava/lang/String; = "BProcessManager"

.field public static sBProcessManagerService:Ltop/niunaijun/blackbox/core/system/BProcessManagerService;


# instance fields
.field private final mPidsSelfLocked:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/core/system/ProcessRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final mProcessLock:Ljava/lang/Object;

.field private final mProcessMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ltop/niunaijun/blackbox/core/system/ProcessRecord;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->sBProcessManagerService:Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessLock:Ljava/lang/Object;

    return-void
.end method

.method private attachClientL(Ltop/niunaijun/blackbox/core/system/ProcessRecord;Landroid/os/IBinder;)V
    .locals 3

    invoke-static {p2}, Ltop/niunaijun/blackbox/core/IBActivityThread$Stub;->asInterface(Landroid/os/IBinder;)Ltop/niunaijun/blackbox/core/IBActivityThread;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->kill()V

    return-void

    :cond_0
    :try_start_0
    new-instance v1, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;

    invoke-direct {v1, p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;-><init>(Ltop/niunaijun/blackbox/core/system/BProcessManagerService;Ltop/niunaijun/blackbox/core/system/ProcessRecord;Landroid/os/IBinder;)V

    const/4 v2, 0x0

    invoke-interface {p2, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    iput-object v0, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    :try_start_1
    invoke-interface {v0}, Ltop/niunaijun/blackbox/core/IBActivityThread;->getActivityThread()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Ltop/niunaijun/blackbox/utils/compat/ApplicationThreadCompat;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object p2

    iput-object p2, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->appThread:Landroid/os/IInterface;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->initLock:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method private static createProc(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)V
    .locals 3

    new-instance v0, Ljava/io/File;

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    invoke-static {v1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getProcDir(I)Ljava/io/File;

    move-result-object v1

    const-string v2, "cmdline"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    iget-object p0, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0, v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->writeToFile([BLjava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    :goto_0
    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->sBProcessManagerService:Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    return-object v0
.end method

.method public static getPid(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    :try_start_0
    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget-object v1, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget p0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method private static getProcessName(Landroid/content/Context;I)Ljava/lang/String;
    .locals 2

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v1, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v1, p1, :cond_0

    iget-object p0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "processName = null"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private getUsingBPidL()I
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget-object v2, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-direct {p0, v2}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->parseBPid(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    const/16 v2, 0x32

    if-ge v0, v2, :cond_2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method private initAppProcessL(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)Z
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initProcess: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BProcessManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->getClientConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "BlackBox_client_config"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p1}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->getProviderAuthority()Ljava/lang/String;

    move-result-object v0

    const-string v2, "_Black_|_init_process_"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Ltop/niunaijun/blackbox/utils/provider/ProviderCall;->callSafely(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "_Black_|_client_"

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/compat/BundleCompat;->getBinder(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->attachClientL(Ltop/niunaijun/blackbox/core/system/ProcessRecord;Landroid/os/IBinder;)V

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->createProc(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private parseBPid(Ljava/lang/String;)I
    .locals 3

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":p"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    :cond_1
    return v0
.end method

.method private static removeProc(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)V
    .locals 0

    iget p0, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    invoke-static {p0}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getProcDir(I)Ljava/io/File;

    move-result-object p0

    invoke-static {p0}, Ltop/niunaijun/blackbox/utils/FileUtils;->deleteDir(Ljava/io/File;)I

    return-void
.end method

.method private requestPermissionIfNeed(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)V
    .locals 1

    iget-object v0, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->info:Landroid/content/pm/ApplicationInfo;

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/PermissionUtils;->isCheckPermissionRequired(Landroid/content/pm/ApplicationInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v0

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->info:Landroid/content/pm/ApplicationInfo;

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getDangerousPermissions(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ltop/niunaijun/blackbox/utils/PermissionUtils;->checkPermissions([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0}, Landroid/os/ConditionVariable;-><init>()V

    invoke-direct {p0, p1, v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startRequestPermission([Ljava/lang/String;Landroid/os/ConditionVariable;)V

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    :cond_0
    return-void
.end method

.method private startRequestPermission([Ljava/lang/String;Landroid/os/ConditionVariable;)V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$1;

    invoke-direct {v1, p0, p2}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$1;-><init>(Ltop/niunaijun/blackbox/core/system/BProcessManagerService;Landroid/os/ConditionVariable;)V

    invoke-static {v0, p1, v1}, Ltop/niunaijun/blackbox/utils/PermissionUtils;->startRequestPermissions(Landroid/content/Context;[Ljava/lang/String;Ltop/niunaijun/blackbox/utils/PermissionUtils$CallBack;)V

    return-void
.end method


# virtual methods
.method public findProcessByPid(I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;
    .locals 4

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iget v3, v2, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->pid:I

    if-ne v3, p1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_1
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public findProcessRecord(Ljava/lang/String;Ljava/lang/String;I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v1

    invoke-virtual {v1, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getAppId(Ljava/lang/String;)I

    move-result p1

    invoke-static {p3, p1}, Ltop/niunaijun/blackbox/core/system/user/BUserHandle;->getUid(II)I

    move-result p1

    iget-object p3, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-nez p1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getBUidByPidOrPackageName(ILjava/lang/String;)I
    .locals 0

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessByPid(I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object p1

    invoke-virtual {p1, p2}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getAppId(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    iget p1, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->buid:I

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/system/user/BUserHandle;->getAppId(I)I

    move-result p1

    return p1
.end method

.method public getPackageProcessAsUser(Ljava/lang/String;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/core/system/ProcessRecord;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v1

    invoke-virtual {v1, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getAppId(Ljava/lang/String;)I

    move-result p1

    invoke-static {p2, p1}, Ltop/niunaijun/blackbox/core/system/user/BUserHandle;->getUid(II)I

    move-result p1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    monitor-exit v0

    return-object p1

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object p2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getUserIdByCallingPid(I)I
    .locals 0

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessByPid(I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget p1, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    return p1
.end method

.method public killAllByPackageName(Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v3

    invoke-virtual {v3, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getAppId(Ljava/lang/String;)I

    move-result p1

    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iget v5, v4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->buid:I

    invoke-static {v5}, Ltop/niunaijun/blackbox/core/system/user/BUserHandle;->getAppId(I)I

    move-result v5

    if-ne p1, v5, :cond_0

    iget-object v5, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    iget v6, v4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->buid:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->kill()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public killPackageAsUser(Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v1

    invoke-virtual {v1, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getAppId(Ljava/lang/String;)I

    move-result p1

    invoke-static {p2, p1}, Ltop/niunaijun/blackbox/core/system/user/BUserHandle;->getUid(II)I

    move-result p1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    if-nez p2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->kill()V

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onProcessDie(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)V
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->kill()V

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    iget v2, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->buid:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_0

    iget-object v2, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    iget v2, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->buid:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->removeProc(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)V

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/notification/BNotificationManagerService;->get()Ltop/niunaijun/blackbox/core/system/notification/BNotificationManagerService;

    move-result-object v1

    invoke-virtual {p1}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget p1, p1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-virtual {v1, v2, p1}, Ltop/niunaijun/blackbox/core/system/notification/BNotificationManagerService;->deletePackageNotification(Ljava/lang/String;I)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public restartAppProcess(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v6

    invoke-virtual {p0, v6}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessByPid(I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v6}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->getProcessName(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->parseBPid(Ljava/lang/String;)I

    move-result v5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-virtual/range {v1 .. v6}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startProcessLocked(Ljava/lang/String;Ljava/lang/String;III)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public startProcessLocked(Ljava/lang/String;Ljava/lang/String;III)Ltop/niunaijun/blackbox/core/system/ProcessRecord;
    .locals 9

    const-string v0, "init bUid = "

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2, p3}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v3

    invoke-virtual {v3, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getAppId(Ljava/lang/String;)I

    move-result v3

    invoke-static {p3, v3}, Ltop/niunaijun/blackbox/core/system/user/BUserHandle;->getUid(II)I

    move-result v3

    iget-object v4, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessLock:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    if-nez v5, :cond_1

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_1
    const/4 v6, -0x1

    if-ne p4, v6, :cond_4

    invoke-interface {v5, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    if-eqz p4, :cond_3

    iget-object v7, p4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->initLock:Landroid/os/ConditionVariable;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Landroid/os/ConditionVariable;->block()V

    :cond_2
    iget-object v7, p4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    if-eqz v7, :cond_3

    monitor-exit v4

    return-object p4

    :cond_3
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->getUsingBPidL()I

    move-result p4

    const-string v7, "BProcessManager"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, ", bPid = "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    if-eq p4, v6, :cond_6

    new-instance v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    invoke-direct {v0, v1, p2}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;-><init>(Landroid/content/pm/ApplicationInfo;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    iput v1, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->uid:I

    iput p4, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object p4

    invoke-virtual {p4, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getAppId(Ljava/lang/String;)I

    move-result p4

    iput p4, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->buid:I

    invoke-virtual {p0, p5, p1}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->getBUidByPidOrPackageName(ILjava/lang/String;)I

    move-result p1

    iput p1, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->callingBUid:I

    iput p3, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-interface {v5, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p3, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mProcessMap:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->initAppProcessL(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-interface {v5, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->mPidsSelfLocked:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p1

    iget p2, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    invoke-static {p2}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getProcessName(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->getPid(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->pid:I

    move-object v2, v0

    :goto_0
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v2

    :catchall_0
    move-exception p2

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p2

    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "No processes available"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public systemReady()V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getProcDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->deleteDir(Ljava/io/File;)I

    return-void
.end method
