.class public Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/pm/PackageMonitor;


# static fields
.field public static final MSG_TIME_OUT:I = 0x1

.field public static final TAG:Ljava/lang/String; = "BroadcastManager"

.field public static final TIMEOUT:I = 0x2328

.field private static sBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;


# instance fields
.field private final mAms:Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;

.field private final mHandler:Landroid/os/Handler;

.field private final mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

.field private final mReceivers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/content/BroadcastReceiver;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mReceiversData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ltop/niunaijun/blackbox/entity/am/PendingResultData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceiversData:Ljava/util/Map;

    new-instance v0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager$1;-><init>(Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;Landroid/os/Looper;)V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mHandler:Landroid/os/Handler;

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mAms:Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    return-void
.end method

.method private addReceiver(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private registerPackage(Ltop/niunaijun/blackbox/core/system/pm/BPackage;)V
    .locals 7

    const-string v0, "register: "

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    const-string v2, "BroadcastManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackage;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", size: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackage;->receivers:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackage;->receivers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/pm/BPackage$Activity;

    iget-object v2, v2, Ltop/niunaijun/blackbox/core/system/pm/BPackage$Component;->intents:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/niunaijun/blackbox/core/system/pm/BPackage$ActivityIntentInfo;

    new-instance v4, Ltop/niunaijun/blackbox/proxy/ProxyBroadcastReceiver;

    invoke-direct {v4}, Ltop/niunaijun/blackbox/proxy/ProxyBroadcastReceiver;-><init>()V

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1a

    if-lt v5, v6, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v3, v3, Ltop/niunaijun/blackbox/core/system/pm/BPackage$IntentInfo;->intentFilter:Landroid/content/IntentFilter;

    const/4 v6, 0x2

    invoke-virtual {v5, v4, v3, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_1

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v3, v3, Ltop/niunaijun/blackbox/core/system/pm/BPackage$IntentInfo;->intentFilter:Landroid/content/IntentFilter;

    invoke-virtual {v5, v4, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_1
    iget-object v3, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackage;->packageName:Ljava/lang/String;

    invoke-direct {p0, v3, v4}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->addReceiver(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    goto :goto_0

    :cond_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static startSystem(Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;)Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;
    .locals 2

    sget-object v0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->sBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    if-nez v0, :cond_1

    const-class v0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->sBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    if-nez v1, :cond_0

    new-instance v1, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    invoke-direct {v1, p0, p1}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;-><init>(Ltop/niunaijun/blackbox/core/system/am/BActivityManagerService;Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;)V

    sput-object v1, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->sBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->sBroadcastManager:Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;

    return-object p0
.end method


# virtual methods
.method public finishBroadcast(Ltop/niunaijun/blackbox/entity/am/PendingResultData;)V
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceiversData:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceiversData:Ljava/util/Map;

    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/am/PendingResultData;->mBToken:Ljava/lang/String;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onPackageInstalled(Ljava/lang/String;I)V
    .locals 1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getBPackageSetting(Ljava/lang/String;)Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;->pkg:Ltop/niunaijun/blackbox/core/system/pm/BPackage;

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->registerPackage(Ltop/niunaijun/blackbox/core/system/pm/BPackage;)V

    :cond_0
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onPackageUninstalled(Ljava/lang/String;ZI)V
    .locals 3

    const-string p3, "unregisterReceiver Package: "

    if-eqz p2, :cond_1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v1, "BroadcastManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    const-string v2, ", size: "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/BroadcastReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object p3, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceivers:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p2

    goto :goto_1

    :catchall_1
    move-exception p1

    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_1
    :goto_1
    return-void
.end method

.method public sendBroadcast(Ltop/niunaijun/blackbox/entity/am/PendingResultData;)V
    .locals 4

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceiversData:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mReceiversData:Ljava/util/Map;

    iget-object v2, p1, Ltop/niunaijun/blackbox/entity/am/PendingResultData;->mBToken:Ljava/lang/String;

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-static {v1, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mHandler:Landroid/os/Handler;

    const-wide/16 v2, 0x2328

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public startup()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    invoke-virtual {v0, p0}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->addPackageMonitor(Ltop/niunaijun/blackbox/core/system/pm/PackageMonitor;)V

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->mPms:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->getBPackageSettings()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;

    iget-object v1, v1, Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;->pkg:Ltop/niunaijun/blackbox/core/system/pm/BPackage;

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/core/system/am/BroadcastManager;->registerPackage(Ltop/niunaijun/blackbox/core/system/pm/BPackage;)V

    goto :goto_0

    :cond_0
    return-void
.end method
