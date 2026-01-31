.class public Ltop/niunaijun/blackbox/core/system/am/ActiveServices;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;,
        Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "ActiveServices"


# instance fields
.field private final mConnectedServices:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final mRunningServiceRecords:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/content/Intent$FilterComparison;",
            "Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final mRunningTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningServiceRecords:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningTokens:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mConnectedServices:Ljava/util/Map;

    return-void
.end method

.method public static synthetic access$300(Ltop/niunaijun/blackbox/core/system/am/ActiveServices;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mConnectedServices:Ljava/util/Map;

    return-object p0
.end method

.method private createStubServiceIntent(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;Ltop/niunaijun/blackbox/core/system/ProcessRecord;Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Landroid/content/Intent;
    .locals 7

    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    new-instance v0, Landroid/content/ComponentName;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v1

    iget v2, p3, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    invoke-static {v2}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getProxyService(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget v4, p3, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-static {p4}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$200(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    invoke-static/range {v0 .. v5}, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->saveStub(Landroid/content/Intent;Landroid/content/Intent;Landroid/content/pm/ServiceInfo;Landroid/os/IBinder;II)V

    return-object v6
.end method

.method private findRunningServiceByToken(Landroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningTokens:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    return-object p1
.end method

.method private findRunningServiceRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningServiceRecords:Ljava/util/Map;

    new-instance v1, Landroid/content/Intent$FilterComparison;

    invoke-direct {v1, p1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    return-object p1
.end method

.method private getOrCreateRunningServiceRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;
    .locals 3

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->findRunningServiceRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;-><init>()V

    invoke-static {v0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$702(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;Landroid/content/Intent;)Landroid/content/Intent;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningServiceRecords:Ljava/util/Map;

    new-instance v2, Landroid/content/Intent$FilterComparison;

    invoke-direct {v2, p1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningTokens:Ljava/util/Map;

    invoke-interface {p1, v0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private resolveService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2, p3}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->resolveService(Landroid/content/Intent;ILjava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bindService(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;I)Landroid/content/Intent;
    .locals 6

    invoke-direct {p0, p1, p3, p4}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->resolveService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p3

    if-nez p3, :cond_0

    return-object p1

    :cond_0
    iget-object p3, p3, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v0

    iget-object v1, p3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v2, p3, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v5

    const/4 v4, -0x1

    move v3, p4

    invoke-virtual/range {v0 .. v5}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startProcessLocked(Ljava/lang/String;Ljava/lang/String;III)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object p4

    if-eqz p4, :cond_4

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningServiceRecords:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->getOrCreateRunningServiceRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    move-result-object v1

    invoke-static {v1, p3}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$002(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;Landroid/content/pm/ServiceInfo;)Landroid/content/pm/ServiceInfo;

    if-eqz p2, :cond_3

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mConnectedServices:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;

    if-eqz v2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    new-instance v2, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;

    invoke-direct {v2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    :try_start_1
    new-instance v4, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$2;

    invoke-direct {v4, p0, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$2;-><init>(Ltop/niunaijun/blackbox/core/system/am/ActiveServices;Landroid/os/IBinder;)V

    invoke-interface {p2, v4, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v4

    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-static {v2, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;->access$402(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;Landroid/os/IBinder;)Landroid/os/IBinder;

    invoke-static {v2, p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;->access$502(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;Landroid/content/Intent;)Landroid/content/Intent;

    iget-object v4, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mConnectedServices:Ljava/util/Map;

    invoke-interface {v4, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move p2, v3

    :goto_1
    if-nez p2, :cond_2

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->incrementBindCountAndGet()I

    :cond_2
    invoke-static {v1, v2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$602(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;

    :cond_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-direct {p0, p1, p3, p4, v1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->createStubServiceIntent(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;Ltop/niunaijun/blackbox/core/system/ProcessRecord;Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Unable to create "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getRunningServiceInfo(Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/am/RunningServiceInfo;
    .locals 7

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager$RunningServiceInfo;

    iget v3, v2, Landroid/app/ActivityManager$RunningServiceInfo;->pid:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ltop/niunaijun/blackbox/entity/am/RunningServiceInfo;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/entity/am/RunningServiceInfo;-><init>()V

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningServiceRecords:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    invoke-static {v3}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$000(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Landroid/content/pm/ServiceInfo;

    move-result-object v3

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v4

    iget-object v5, v3, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    invoke-virtual {v4, p1, v5, p2}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessRecord(Ljava/lang/String;Ljava/lang/String;I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    iget v5, v4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->pid:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/ActivityManager$RunningServiceInfo;

    if-eqz v5, :cond_1

    iget-object v4, v4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    iput-object v4, v5, Landroid/app/ActivityManager$RunningServiceInfo;->process:Ljava/lang/String;

    new-instance v4, Landroid/content/ComponentName;

    iget-object v6, v3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v4, v6, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v4, v5, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;

    iget-object v3, v0, Ltop/niunaijun/blackbox/entity/am/RunningServiceInfo;->mRunningServiceInfoList:Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public onServiceDestroy(Landroid/content/Intent;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->create(Landroid/content/Intent;)Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;

    move-result-object p2

    iget-object p2, p2, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    if-eqz p2, :cond_1

    move-object p1, p2

    :cond_1
    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningServiceRecords:Ljava/util/Map;

    new-instance v0, Landroid/content/Intent$FilterComparison;

    invoke-direct {v0, p1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    if-eqz p1, :cond_2

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningTokens:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public onServiceUnbind(Landroid/content/Intent;I)Ltop/niunaijun/blackbox/entity/UnbindRecord;
    .locals 1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    invoke-static {p1}, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->create(Landroid/content/Intent;)Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;

    move-result-object p1

    iget-object v0, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    iget-object p1, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->findRunningServiceRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p2

    :cond_1
    new-instance p2, Ltop/niunaijun/blackbox/entity/UnbindRecord;

    invoke-direct {p2}, Ltop/niunaijun/blackbox/entity/UnbindRecord;-><init>()V

    invoke-virtual {p2, v0}, Ltop/niunaijun/blackbox/entity/UnbindRecord;->setComponentName(Landroid/content/ComponentName;)V

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$100(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p2, v0}, Ltop/niunaijun/blackbox/entity/UnbindRecord;->setBindCount(I)V

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$200(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    invoke-virtual {p2, p1}, Ltop/niunaijun/blackbox/entity/UnbindRecord;->setStartId(I)V

    return-object p2
.end method

.method public onStartCommand(Landroid/content/Intent;I)V
    .locals 0

    return-void
.end method

.method public peekService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/os/IBinder;
    .locals 3

    invoke-direct {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->resolveService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v1

    iget-object p2, p2, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v2, p2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object p2, p2, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    invoke-virtual {v1, v2, p2, p3}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessRecord(Ljava/lang/String;Ljava/lang/String;I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object p2

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    :try_start_0
    iget-object p2, p2, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    invoke-interface {p2, p1}, Ltop/niunaijun/blackbox/core/IBActivityThread;->peekService(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v0
.end method

.method public startService(Landroid/content/Intent;Ljava/lang/String;ZI)V
    .locals 6

    invoke-direct {p0, p1, p2, p4}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->resolveService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p2, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v0

    iget-object v1, p2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v2, p2, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v5

    const/4 v4, -0x1

    move v3, p4

    invoke-virtual/range {v0 .. v5}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startProcessLocked(Ljava/lang/String;Ljava/lang/String;III)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->getOrCreateRunningServiceRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    move-result-object p4

    invoke-static {p4, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$002(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;Landroid/content/pm/ServiceInfo;)Landroid/content/pm/ServiceInfo;

    invoke-virtual {p4}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->getAndIncrementStartId()I

    invoke-direct {p0, p1, p2, p3, p4}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->createStubServiceIntent(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;Ltop/niunaijun/blackbox/core/system/ProcessRecord;Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Landroid/content/Intent;

    move-result-object p1

    new-instance p2, Ljava/lang/Thread;

    new-instance p3, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$1;

    invoke-direct {p3, p0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$1;-><init>(Ltop/niunaijun/blackbox/core/system/am/ActiveServices;Landroid/content/Intent;)V

    invoke-direct {p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Unable to create "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p2, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public stopService(Landroid/content/Intent;Ljava/lang/String;I)I
    .locals 9

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mRunningServiceRecords:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->findRunningServiceRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return v2

    :cond_0
    invoke-static {v1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$100(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    if-lez v3, :cond_1

    const-string p1, "ActiveServices"

    const-string p2, "There are also connections"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v0

    return v2

    :cond_1
    invoke-static {v1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$200(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    invoke-direct {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->resolveService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p2

    if-nez p2, :cond_2

    monitor-exit v0

    return v2

    :cond_2
    iget-object p2, p2, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v3

    iget-object v4, p2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v5, p2, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    const/4 v7, -0x1

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v8

    move v6, p3

    invoke-virtual/range {v3 .. v8}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startProcessLocked(Ljava/lang/String;Ljava/lang/String;III)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object p2

    if-nez p2, :cond_3

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    :cond_3
    :try_start_1
    iget-object p2, p2, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    invoke-interface {p2, p1}, Ltop/niunaijun/blackbox/core/IBActivityThread;->stopService(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :goto_0
    :try_start_2
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public stopServiceToken(Landroid/content/ComponentName;Landroid/os/IBinder;I)V
    .locals 0

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->findRunningServiceByToken(Landroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$700(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Landroid/content/Intent;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->stopService(Landroid/content/Intent;Ljava/lang/String;I)I

    :cond_0
    return-void
.end method

.method public unbindService(Landroid/os/IBinder;I)V
    .locals 1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mConnectedServices:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-static {p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;->access$500(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;)Landroid/content/Intent;

    move-result-object p2

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->getOrCreateRunningServiceRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, v0}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$602(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;)Ltop/niunaijun/blackbox/core/system/am/ActiveServices$ConnectedServiceRecord;

    invoke-static {p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;->access$100(Ltop/niunaijun/blackbox/core/system/am/ActiveServices$RunningServiceRecord;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->mConnectedServices:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
