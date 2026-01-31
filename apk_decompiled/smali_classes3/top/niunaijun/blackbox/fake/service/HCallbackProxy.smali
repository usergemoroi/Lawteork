.class public Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/fake/hook/IInjectHook;
.implements Landroid/os/Handler$Callback;


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final TAG:Ljava/lang/String;


# instance fields
.field private mBeing:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mOtherCallback:Landroid/os/Handler$Callback;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3f78ed969af0fL    # 5.482783036257357E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    sput-object v0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mBeing:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private checkActivityClient()V
    .locals 4

    .line 1
    :try_start_0
    const-class v0, Lblack/android/app/ActivityClientStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityClientStatic;

    .line 2
    invoke-interface {v0}, Lblack/android/app/ActivityClientStatic;->getActivityClientController()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/reflect/Proxy;

    if-nez v3, :cond_0

    new-instance v3, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;

    invoke-direct {v3, v0}, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;-><init>(Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;->onlyProxy(Z)V

    invoke-virtual {v3}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->injectHook()V

    .line 3
    const-class v0, Lblack/android/app/ActivityClientStatic;

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityClientStatic;

    .line 4
    invoke-interface {v0}, Lblack/android/app/ActivityClientStatic;->getInstance()Ljava/lang/Object;

    move-result-object v0

    .line 5
    const-class v1, Lblack/android/app/ActivityClientContext;

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityClientContext;

    .line 6
    invoke-interface {v0}, Lblack/android/app/ActivityClientContext;->INTERFACE_SINGLETON()Ljava/lang/Object;

    move-result-object v0

    .line 7
    const-class v1, Lblack/android/app/ActivityClientActivityClientControllerSingletonContext;

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityClientActivityClientControllerSingletonContext;

    .line 8
    invoke-virtual {v3}, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/app/ActivityClientActivityClientControllerSingletonContext;->_set_mKnownInstance(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method private getH()Landroid/os/Handler;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadContext;->mH()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private getHCallback()Landroid/os/Handler$Callback;
    .locals 3

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->getH()Landroid/os/Handler;

    move-result-object v0

    .line 1
    const-class v1, Lblack/android/os/HandlerContext;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/os/HandlerContext;

    .line 2
    invoke-interface {v0}, Lblack/android/os/HandlerContext;->mCallback()Landroid/os/Handler$Callback;

    move-result-object v0

    return-object v0
.end method

.method private getLaunchActivityItem(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-class v0, Lblack/android/app/servertransaction/ClientTransactionContext;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/servertransaction/ClientTransactionContext;

    .line 2
    invoke-interface {p1}, Lblack/android/app/servertransaction/ClientTransactionContext;->mActivityCallbacks()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 3
    const-class v1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    invoke-static {v1}, Ltop/niunaijun/blackreflection/utils/ClassUtil;->classReady(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private handleCreateService(Ljava/lang/Object;)Z
    .locals 8

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1
    const-class v2, Lblack/android/app/ActivityThreadCreateServiceDataContext;

    invoke-static {v2, p1, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lblack/android/app/ActivityThreadCreateServiceDataContext;

    .line 2
    invoke-interface {v2}, Lblack/android/app/ActivityThreadCreateServiceDataContext;->info()Landroid/content/pm/ServiceInfo;

    move-result-object v2

    iget-object v3, v2, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPid()I

    move-result v4

    invoke-static {v4}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getProxyService(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, v2, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPid()I

    move-result v4

    invoke-static {v4}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getProxyJobService(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 3
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3f7b2d969af0fL    # 5.482933874096569E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    const-wide v6, 0x60e3f7a4d969af0fL    # 5.482875214936875E158

    invoke-static {v6, v7, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    new-instance v3, Landroid/content/ComponentName;

    iget-object v2, v2, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v3, v0, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->startService(Landroid/content/Intent;Ljava/lang/String;ZI)Landroid/content/ComponentName;

    const/4 p1, 0x1

    return p1

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 6
    :cond_1
    return v1
.end method

.method private handleLaunchActivity(Landroid/os/Message;)Ljava/lang/Boolean;
    .locals 8

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isPie()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->getLaunchActivityItem(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    if-nez v0, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isPie()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 1
    const-class v1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    .line 2
    invoke-interface {v1}, Lblack/android/app/servertransaction/LaunchActivityItemContext;->mIntent()Landroid/content/Intent;

    move-result-object v1

    .line 3
    const-class v3, Lblack/android/app/servertransaction/ClientTransactionContext;

    invoke-static {v3, p1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/servertransaction/ClientTransactionContext;

    .line 4
    invoke-interface {p1}, Lblack/android/app/servertransaction/ClientTransactionContext;->mActivityToken()Landroid/os/IBinder;

    move-result-object p1

    goto :goto_1

    .line 5
    :cond_2
    const-class p1, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    invoke-static {p1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    .line 6
    invoke-interface {p1}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->intent()Landroid/content/Intent;

    move-result-object v1

    invoke-interface {p1}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->token()Landroid/os/IBinder;

    move-result-object p1

    :goto_1
    if-nez v1, :cond_3

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    invoke-static {v1}, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->create(Landroid/content/Intent;)Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;

    move-result-object v3

    iget-object v4, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mActivityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v4, :cond_a

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v5

    if-nez v5, :cond_5

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object p1

    iget-object v5, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v6, v4, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    iget v7, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mUserId:I

    invoke-virtual {p1, v5, v6, v7}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->restartProcess(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object p1

    iget-object v5, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget v6, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mUserId:I

    invoke-virtual {p1, v5, v6}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->getLaunchIntentForPackage(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p1

    iget-object v5, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mActivityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mActivityRecord:Landroid/os/IBinder;

    iget v3, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mUserId:I

    invoke-static {v1, p1, v5, v6, v3}, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->saveStub(Landroid/content/Intent;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;I)V

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isPie()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 7
    const-class p1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    invoke-static {p1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    .line 8
    invoke-interface {p1, v1}, Lblack/android/app/servertransaction/LaunchActivityItemContext;->_set_mIntent(Ljava/lang/Object;)V

    invoke-interface {p1, v4}, Lblack/android/app/servertransaction/LaunchActivityItemContext;->_set_mInfo(Ljava/lang/Object;)V

    goto :goto_2

    .line 9
    :cond_4
    const-class p1, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    invoke-static {p1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    .line 10
    invoke-interface {p1, v1}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->_set_intent(Ljava/lang/Object;)V

    invoke-interface {p1, v4}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->_set_activityInfo(Ljava/lang/Object;)V

    :goto_2
    nop

    :goto_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_5
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v1

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/app/BActivityThread;->isInit()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object p1

    iget-object v0, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v1, v4, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ltop/niunaijun/blackbox/app/BActivityThread;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    invoke-static {}, Lb/b;->a()Lblack/android/app/ActivityManagerNativeStatic;

    move-result-object v1

    invoke-interface {v1}, Lblack/android/app/ActivityManagerNativeStatic;->getDefault()Landroid/os/IInterface;

    move-result-object v1

    .line 11
    const-class v5, Lblack/android/app/IActivityManagerContext;

    invoke-static {v5, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lblack/android/app/IActivityManagerContext;

    .line 12
    invoke-interface {v1, p1, v2}, Lblack/android/app/IActivityManagerContext;->getTaskForActivity(Landroid/os/IBinder;Z)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v5

    iget-object v6, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mActivityRecord:Landroid/os/IBinder;

    invoke-virtual {v5, v1, p1, v6}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->onActivityCreated(ILandroid/os/IBinder;Landroid/os/IBinder;)V

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isT()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 13
    const-class p1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    invoke-static {p1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    .line 14
    iget-object v0, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mTarget:Landroid/content/Intent;

    invoke-interface {p1, v0}, Lblack/android/app/servertransaction/LaunchActivityItemContext;->_set_mIntent(Ljava/lang/Object;)V

    invoke-interface {p1, v4}, Lblack/android/app/servertransaction/LaunchActivityItemContext;->_set_mInfo(Ljava/lang/Object;)V

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->checkActivityClient()V

    goto :goto_4

    :cond_7
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isS()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-interface {v0, p1}, Lblack/android/app/ActivityThreadContext;->getLaunchingActivity(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object p1

    .line 15
    const-class v0, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    invoke-static {v0, p1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    .line 16
    iget-object v0, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mTarget:Landroid/content/Intent;

    invoke-interface {p1, v0}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->_set_intent(Ljava/lang/Object;)V

    invoke-interface {p1, v4}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->_set_activityInfo(Ljava/lang/Object;)V

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/BActivityThread;->getPackageInfo()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->_set_packageInfo(Ljava/lang/Object;)V

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->checkActivityClient()V

    goto :goto_4

    :cond_8
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isPie()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 17
    const-class p1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    invoke-static {p1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/servertransaction/LaunchActivityItemContext;

    .line 18
    iget-object v0, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mTarget:Landroid/content/Intent;

    invoke-interface {p1, v0}, Lblack/android/app/servertransaction/LaunchActivityItemContext;->_set_mIntent(Ljava/lang/Object;)V

    invoke-interface {p1, v4}, Lblack/android/app/servertransaction/LaunchActivityItemContext;->_set_mInfo(Ljava/lang/Object;)V

    goto :goto_4

    .line 19
    :cond_9
    const-class p1, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    invoke-static {p1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    .line 20
    iget-object v0, v3, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mTarget:Landroid/content/Intent;

    invoke-interface {p1, v0}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->_set_intent(Ljava/lang/Object;)V

    invoke-interface {p1, v4}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->_set_activityInfo(Ljava/lang/Object;)V

    :cond_a
    :goto_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mBeing:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_4

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isPie()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    iget v0, p1, Landroid/os/Message;->what:I

    .line 1
    const-class v4, Lblack/android/app/ActivityThreadHStatic;

    invoke-static {v4, v3, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lblack/android/app/ActivityThreadHStatic;

    .line 2
    invoke-interface {v4}, Lblack/android/app/ActivityThreadHStatic;->EXECUTE_TRANSACTION()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v0, v4, :cond_1

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->handleLaunchActivity(Landroid/os/Message;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->getH()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mBeing:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return v1

    :cond_0
    :try_start_1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 3
    const-class v4, Lblack/android/app/ActivityThreadHStatic;

    invoke-static {v4, v3, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lblack/android/app/ActivityThreadHStatic;

    .line 4
    invoke-interface {v4}, Lblack/android/app/ActivityThreadHStatic;->LAUNCH_ACTIVITY()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v0, v4, :cond_1

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->handleLaunchActivity(Landroid/os/Message;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->getH()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mBeing:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return v1

    :cond_1
    :try_start_2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 5
    const-class v1, Lblack/android/app/ActivityThreadHStatic;

    invoke-static {v1, v3, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lblack/android/app/ActivityThreadHStatic;

    .line 6
    invoke-interface {v1}, Lblack/android/app/ActivityThreadHStatic;->CREATE_SERVICE()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->handleCreateService(Ljava/lang/Object;)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mBeing:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return p1

    :cond_2
    :try_start_3
    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mOtherCallback:Landroid/os/Handler$Callback;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Landroid/os/Handler$Callback;->handleMessage(Landroid/os/Message;)Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :cond_3
    iget-object p1, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mBeing:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return v2

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mBeing:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw p1

    :cond_4
    return v2
.end method

.method public injectHook()V
    .locals 3

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->getHCallback()Landroid/os/Handler$Callback;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mOtherCallback:Landroid/os/Handler$Callback;

    if-eqz v0, :cond_1

    if-eq v0, p0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->mOtherCallback:Landroid/os/Handler$Callback;

    :cond_1
    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->getH()Landroid/os/Handler;

    move-result-object v0

    .line 1
    const-class v1, Lblack/android/os/HandlerContext;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/os/HandlerContext;

    .line 2
    invoke-interface {v0, p0}, Lblack/android/os/HandlerContext;->_set_mCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;->getHCallback()Landroid/os/Handler$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
