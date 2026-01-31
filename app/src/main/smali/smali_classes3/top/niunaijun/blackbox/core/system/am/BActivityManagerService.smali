.class public Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;
.super Ltop/niunaijun/blackbox/core/system/am/IBActivityManagerService$Stub;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/ISystemService;


# static fields
.field public static final TAG:Ljava/lang/String; = "BActivityManagerService"

.field private static final sService:Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;


# instance fields
.field private final mBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

.field private final mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

.field private final mUserSpace:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ltop/niunaijun/blackbox/core/system/am/UserSpace;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->sService:Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/IBActivityManagerService$Stub;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mUserSpace:Ljava/util/Map;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    invoke-static {p0, v0}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->startSystem(Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;)Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->sService:Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;

    return-object v0
.end method

.method private getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mUserSpace:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mUserSpace:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/am/UserSpace;-><init>()V

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mUserSpace:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public acquireContentProviderClient(Landroid/content/pm/ProviderInfo;)Landroid/os/IBinder;
    .locals 7

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v1

    iget-object v2, p1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    iget-object v3, p1, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v4

    invoke-virtual {v4, v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->getUserIdByCallingPid(I)I

    move-result v4

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v6

    const/4 v5, -0x1

    invoke-virtual/range {v1 .. v6}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startProcessLocked(Ljava/lang/String;Ljava/lang/String;III)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    invoke-interface {v0, p1}, Ltop/niunaijun/blackbox/core/IBActivityThread;->acquireContentProviderClient(Landroid/content/pm/ProviderInfo;)Landroid/os/IBinder;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to create process "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Landroid/content/pm/ProviderInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bindService(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;I)Landroid/content/Intent;
    .locals 2

    invoke-direct {p0, p4}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2, p3, p4}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->bindService(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public finishBroadcast(Ltop/niunaijun/blackbox/entity/am/PendingResultData;)V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->finishBroadcast(Ltop/niunaijun/blackbox/entity/am/PendingResultData;)V

    return-void
.end method

.method public getCallingActivity(Landroid/os/IBinder;I)Landroid/content/ComponentName;
    .locals 2

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->getCallingActivity(Landroid/os/IBinder;I)Landroid/content/ComponentName;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getCallingPackage(Landroid/os/IBinder;I)Ljava/lang/String;
    .locals 2

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->getCallingPackage(Landroid/os/IBinder;I)Ljava/lang/String;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getIntentSender(Landroid/os/IBinder;Ljava/lang/String;II)V
    .locals 2

    invoke-direct {p0, p4}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object p4

    iget-object v0, p4, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mIntentSenderRecords:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;-><init>()V

    iput p3, v1, Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;->uid:I

    iput-object p2, v1, Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;->packageName:Ljava/lang/String;

    iget-object p2, p4, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mIntentSenderRecords:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getPackageForIntentSender(Landroid/os/IBinder;I)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object p2

    iget-object v0, p2, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mIntentSenderRecords:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object p2, p2, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mIntentSenderRecords:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;

    if-eqz p1, :cond_0

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;->packageName:Ljava/lang/String;

    monitor-exit v0

    return-object p1

    :cond_0
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

.method public getRunningAppProcesses(Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/am/RunningAppProcessInfo;
    .locals 4

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

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

    check-cast v2, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v3, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->getPackageProcessAsUser(Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ltop/niunaijun/blackbox/entity/am/RunningAppProcessInfo;

    invoke-direct {p2}, Ltop/niunaijun/blackbox/entity/am/RunningAppProcessInfo;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iget v2, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->pid:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager$RunningAppProcessInfo;

    if-eqz v2, :cond_1

    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    iput-object v0, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    iget-object v0, p2, Ltop/niunaijun/blackbox/entity/am/RunningAppProcessInfo;->mAppProcessInfoList:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p2
.end method

.method public getRunningServices(Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/am/RunningServiceInfo;
    .locals 1

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->getRunningServiceInfo(Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/am/RunningServiceInfo;

    move-result-object p1

    return-object p1
.end method

.method public getUidForIntentSender(Landroid/os/IBinder;I)I
    .locals 1

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object p2

    iget-object v0, p2, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mIntentSenderRecords:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object p2, p2, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mIntentSenderRecords:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;

    if-eqz p1, :cond_0

    iget p1, p1, Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;->uid:I

    monitor-exit v0

    return p1

    :cond_0
    monitor-exit v0

    const/4 p1, -0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public initProcess(Ljava/lang/String;Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/AppConfig;
    .locals 6

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v5

    const/4 v4, -0x1

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startProcessLocked(Ljava/lang/String;Ljava/lang/String;III)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->getClientConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object p1

    return-object p1
.end method

.method public onActivityCreated(ILandroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 3

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v1

    invoke-virtual {v1, v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessByPid(I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p3, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    iget v1, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v1

    iget-object v2, v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v2

    :try_start_0
    iget-object v1, v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    invoke-virtual {v1, v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->onActivityCreated(Ltop/niunaijun/blackbox/core/system/ProcessRecord;ILandroid/os/IBinder;Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onActivityDestroyed(Landroid/os/IBinder;)V
    .locals 3

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v1

    invoke-virtual {v1, v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessByPid(I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v1

    iget-object v2, v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v2

    :try_start_0
    iget-object v1, v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    iget v0, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-virtual {v1, v0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->onActivityDestroyed(ILandroid/os/IBinder;)V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onActivityResumed(Landroid/os/IBinder;)V
    .locals 3

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v1

    invoke-virtual {v1, v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessByPid(I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v1

    iget-object v2, v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v2

    :try_start_0
    iget-object v1, v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    iget v0, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-virtual {v1, v0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->onActivityResumed(ILandroid/os/IBinder;)V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onFinishActivity(Landroid/os/IBinder;)V
    .locals 3

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v0

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v1

    invoke-virtual {v1, v0}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessByPid(I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v1

    iget-object v2, v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v2

    :try_start_0
    iget-object v1, v1, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    iget v0, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-virtual {v1, v0, p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->onFinishActivity(ILandroid/os/IBinder;)V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onServiceDestroy(Landroid/content/Intent;I)V
    .locals 2

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->onServiceDestroy(Landroid/content/Intent;I)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onServiceUnbind(Landroid/content/Intent;I)Ltop/niunaijun/blackbox/entity/UnbindRecord;
    .locals 2

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->onServiceUnbind(Landroid/content/Intent;I)Ltop/niunaijun/blackbox/entity/UnbindRecord;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onStartCommand(Landroid/content/Intent;I)V
    .locals 2

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->onStartCommand(Landroid/content/Intent;I)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public peekService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/os/IBinder;
    .locals 2

    invoke-direct {p0, p3}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->peekService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/os/IBinder;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public restartProcess(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->restartAppProcess(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public scheduleBroadcastReceiver(Landroid/content/Intent;Ltop/niunaijun/blackbox/entity/am/PendingResultData;I)V
    .locals 5

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v0

    const/16 v1, 0x80

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, p3}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->queryBroadcastReceivers(Landroid/content/Intent;ILjava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Ltop/niunaijun/blackbox/entity/am/PendingResultData;->build()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const-string p1, "BActivityManagerService"

    const-string p2, "scheduleBroadcastReceiver empty"

    invoke-static {p1, p2}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    invoke-virtual {v1, p2}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->sendBroadcast(Ltop/niunaijun/blackbox/entity/am/PendingResultData;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v2

    iget-object v3, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    invoke-virtual {v2, v4, v3, p3}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessRecord(Ljava/lang/String;Ljava/lang/String;I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Ltop/niunaijun/blackbox/entity/am/ReceiverData;

    invoke-direct {v3}, Ltop/niunaijun/blackbox/entity/am/ReceiverData;-><init>()V

    iput-object p1, v3, Ltop/niunaijun/blackbox/entity/am/ReceiverData;->intent:Landroid/content/Intent;

    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iput-object v1, v3, Ltop/niunaijun/blackbox/entity/am/ReceiverData;->activityInfo:Landroid/content/pm/ActivityInfo;

    iput-object p2, v3, Ltop/niunaijun/blackbox/entity/am/ReceiverData;->data:Ltop/niunaijun/blackbox/entity/am/PendingResultData;

    iget-object v1, v2, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    invoke-interface {v1, v3}, Ltop/niunaijun/blackbox/core/IBActivityThread;->scheduleReceiver(Ltop/niunaijun/blackbox/entity/am/ReceiverData;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public sendBroadcast(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/Intent;
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, p1, v1, p2, p3}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->queryBroadcastReceivers(Landroid/content/Intent;ILjava/lang/String;I)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v1

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, p3}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->findProcessRecord(Ljava/lang/String;Ljava/lang/String;I)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    invoke-interface {v0}, Ltop/niunaijun/blackbox/core/IBActivityThread;->bindApplication()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_1
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    return-object p2
.end method

.method public startActivities(I[Landroid/content/Intent;[Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)I
    .locals 8

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v2 .. v7}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->startActivitiesLocked(I[Landroid/content/Intent;[Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)I

    move-result p1

    monitor-exit v1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public startActivity(Landroid/content/Intent;I)V
    .locals 11

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/4 v10, 0x0

    move v3, p2

    move-object v4, p1

    invoke-virtual/range {v2 .. v10}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->startActivityLocked(ILandroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;)I

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public startActivityAms(ILandroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;)I
    .locals 11

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    invoke-virtual/range {v2 .. v10}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->startActivityLocked(ILandroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;)I

    move-result v0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public startService(Landroid/content/Intent;Ljava/lang/String;ZI)Landroid/content/ComponentName;
    .locals 2

    invoke-direct {p0, p4}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2, p3, p4}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->startService(Landroid/content/Intent;Ljava/lang/String;ZI)V

    monitor-exit v1

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public stopService(Landroid/content/Intent;Ljava/lang/String;I)I
    .locals 2

    invoke-direct {p0, p3}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->stopService(Landroid/content/Intent;Ljava/lang/String;I)I

    move-result p1

    monitor-exit v1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public stopServiceToken(Landroid/content/ComponentName;Landroid/os/IBinder;I)V
    .locals 2

    invoke-direct {p0, p3}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->stopServiceToken(Landroid/content/ComponentName;Landroid/os/IBinder;I)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public systemReady()V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->mBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->startup()V

    return-void
.end method

.method public unbindService(Landroid/os/IBinder;I)V
    .locals 2

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;->getOrCreateSpaceLocked(I)Ltop/niunaijun/blackbox/core/system/am/UserSpace;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->unbindService(Landroid/os/IBinder;I)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
