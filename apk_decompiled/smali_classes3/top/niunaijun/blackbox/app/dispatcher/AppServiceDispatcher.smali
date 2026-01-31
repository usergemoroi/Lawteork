.class public Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "AppServiceDispatcher"

.field private static final sServiceDispatcher:Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field private mService:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/content/Intent$FilterComparison;",
            "Ltop/niunaijun/blackbox/entity/ServiceRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->sServiceDispatcher:Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method private findRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/entity/ServiceRecord;
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    new-instance v1, Landroid/content/Intent$FilterComparison;

    invoke-direct {v1, p1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/entity/ServiceRecord;

    return-object p1
.end method

.method public static get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->sServiceDispatcher:Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    return-object v0
.end method

.method private getOrCreateService(Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;)Landroid/app/Service;
    .locals 4

    iget-object v0, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    iget-object v1, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    iget-object p1, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mToken:Landroid/os/IBinder;

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->findRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/entity/ServiceRecord;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getService()Landroid/app/Service;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getService()Landroid/app/Service;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v2

    invoke-virtual {v2, v1, p1}, Ltop/niunaijun/blackbox/app/BActivityThread;->createService(Landroid/content/pm/ServiceInfo;Landroid/os/IBinder;)Landroid/app/Service;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance v1, Ltop/niunaijun/blackbox/entity/ServiceRecord;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;-><init>()V

    invoke-virtual {v1, p1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->setService(Landroid/app/Service;)V

    iget-object v2, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    new-instance v3, Landroid/content/Intent$FilterComparison;

    invoke-direct {v3, v0}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic lambda$stopService$0(Ltop/niunaijun/blackbox/entity/ServiceRecord;)V
    .locals 0

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getService()Landroid/app/Service;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    invoke-static {p1}, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->create(Landroid/content/Intent;)Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;

    move-result-object p1

    iget-object v0, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    iget-object v1, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->getOrCreateService(Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;)Landroid/app/Service;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->findRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/entity/ServiceRecord;

    move-result-object v1

    invoke-virtual {v1, v0}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->incrementAndGetBindCount(Landroid/content/Intent;)I

    invoke-virtual {v1, v0}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->hasBinder(Landroid/content/Intent;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->isRebind()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, v0}, Landroid/app/Service;->onRebind(Landroid/content/Intent;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->setRebind(Z)V

    :cond_2
    invoke-virtual {v1, v0}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getBinder(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    :cond_3
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/app/Service;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->addBinder(Landroid/content/Intent;Landroid/os/IBinder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_0
    return-object v2
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/entity/ServiceRecord;

    :try_start_0
    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getService()Landroid/app/Service;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/entity/ServiceRecord;

    :try_start_0
    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getService()Landroid/app/Service;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Service;->onDestroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public onLowMemory()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/entity/ServiceRecord;

    :try_start_0
    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getService()Landroid/app/Service;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Service;->onLowMemory()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    invoke-static {p1}, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->create(Landroid/content/Intent;)Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;

    move-result-object p3

    iget-object v0, p3, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    const/4 v1, 0x2

    if-eqz v0, :cond_2

    iget-object v0, p3, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p3}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->getOrCreateService(Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;)Landroid/app/Service;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v2, p3, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v2, p3, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-direct {p0, v2}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->findRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/entity/ServiceRecord;

    move-result-object v2

    iget v3, p3, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mStartId:I

    invoke-virtual {v2, v3}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->setStartId(I)V

    :try_start_0
    iget-object v2, p3, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    iget v3, p3, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mStartId:I

    invoke-virtual {v0, v2, p2, v3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v0

    iget p3, p3, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mUserId:I

    invoke-virtual {v0, p1, p3}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->onStartCommand(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p2

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    return v1
.end method

.method public onTrimMemory(I)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/entity/ServiceRecord;

    :try_start_0
    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getService()Landroid/app/Service;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/app/Service;->onTrimMemory(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 7

    invoke-static {p1}, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->create(Landroid/content/Intent;)Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;

    move-result-object v0

    iget-object v1, v0, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    iget-object v3, v0, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v3

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v4

    invoke-virtual {v3, p1, v4}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->onServiceUnbind(Landroid/content/Intent;I)Ltop/niunaijun/blackbox/entity/UnbindRecord;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->getOrCreateService(Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;)Landroid/app/Service;

    move-result-object v4

    if-nez v4, :cond_2

    return v2

    :cond_2
    iget-object v0, v0, Ltop/niunaijun/blackbox/proxy/record/ProxyServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->findRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/entity/ServiceRecord;

    move-result-object v0

    invoke-virtual {v3}, Ltop/niunaijun/blackbox/entity/UnbindRecord;->getStartId()I

    move-result v3

    const/4 v5, 0x1

    if-nez v3, :cond_3

    move v3, v5

    goto :goto_0

    :cond_3
    move v3, v2

    :goto_0
    if-nez v3, :cond_4

    invoke-virtual {v0, v1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->decreaseConnectionCount(Landroid/content/Intent;)Z

    move-result v6

    if-eqz v6, :cond_6

    :cond_4
    invoke-virtual {v4, v1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    if-eqz v3, :cond_5

    invoke-virtual {v4}, Landroid/app/Service;->onDestroy()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v3

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v4

    invoke-virtual {v3, p1, v4}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->onServiceDestroy(Landroid/content/Intent;I)V

    iget-object p1, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    new-instance v3, Landroid/content/Intent$FilterComparison;

    invoke-direct {v3, v1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {p1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {v0, v5}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->setRebind(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_1
    return v2
.end method

.method public peekService(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->findRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/entity/ServiceRecord;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getBinder(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public stopService(Landroid/content/Intent;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->findRecord(Landroid/content/Intent;)Ltop/niunaijun/blackbox/entity/ServiceRecord;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getService()Landroid/app/Service;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->getStartId()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mHandler:Landroid/os/Handler;

    new-instance v2, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher$$ExternalSyntheticLambda0;-><init>(Ltop/niunaijun/blackbox/entity/ServiceRecord;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->onServiceDestroy(Landroid/content/Intent;I)V

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->mService:Ljava/util/Map;

    new-instance v1, Landroid/content/Intent$FilterComparison;

    invoke-direct {v1, p1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_1
    return-void
.end method
