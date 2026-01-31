.class public Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;
.super Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$updateConfiguration;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$unregisterUidObserver;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$registerUidObserver;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$setRequestedOrientation;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$SetTaskDescription;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$checkUriPermission;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$checkPermission;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$getCurrentUser;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$getHistoricalProcessExitReasons;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$setServiceForeground;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GrantUriPermission;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$RegisterReceiver;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$RegisterReceiverWithFeature;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$SendIntentSender;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$PeekService;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$PublishService;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$finishReceiver;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$unregisterReceiver;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$BroadcastIntent;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$BroadcastIntentWithFeature;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetIntentSenderWithFeature;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetIntentSenderWithSourceToken;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$getUidForIntentSender;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$getPackageForIntentSender;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetIntentSender;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetServices;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetRunningAppProcesses;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$UnbindService;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$BindIsolatedService;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$bindServiceInstance;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$BindService;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$StopServiceToken;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$StopService;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$StartService;,
        Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetContentProvider;
    }
.end annotation

.annotation runtime Ltop/niunaijun/blackbox/fake/hook/ScanClass;
    value = {
        Ltop/niunaijun/blackbox/fake/service/ActivityManagerCommonProxy;
    }
.end annotation


# static fields
.field static StartService:Landroid/app/IServiceConnection; = null

.field public static final TAG:Ljava/lang/String; = "ActivityManagerStub"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;-><init>()V

    return-void
.end method

.method public static BindServiceCommon(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aget-object v5, v2, v3

    check-cast v5, Landroid/os/IInterface;

    const/4 v5, 0x1

    aget-object v5, v2, v5

    check-cast v5, Landroid/os/IBinder;

    const/4 v5, 0x2

    aget-object v6, v2, v5

    check-cast v6, Landroid/content/Intent;

    const/4 v7, 0x3

    aget-object v7, v2, v7

    check-cast v7, Ljava/lang/String;

    const/4 v8, 0x4

    aget-object v9, v2, v8

    check-cast v9, Landroid/app/IServiceConnection;

    invoke-virtual {v6}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v10

    const/4 v11, 0x5

    aget-object v12, v2, v11

    invoke-static {v12}, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;->getIntOrLongValue(Ljava/lang/Object;)J

    move-result-wide v12

    const-string v14, "_B_|_UserId"

    const/4 v15, -0x1

    invoke-virtual {v6, v14, v15}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v14

    if-ne v14, v15, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v14

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v15

    invoke-virtual {v15, v6, v3, v7, v14}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->resolveService(Landroid/content/Intent;ILjava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object v15

    if-eqz v10, :cond_1

    invoke-virtual {v10}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;->isIsolated()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x7

    goto :goto_0

    :cond_2
    const/4 v3, 0x6

    :goto_0
    array-length v8, v2

    if-le v8, v3, :cond_3

    aget-object v8, v2, v3

    instance-of v8, v8, Ljava/lang/String;

    if-eqz v8, :cond_3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v2, v3

    :cond_3
    const-string v3, "ActivityManager"

    if-nez v15, :cond_6

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ltop/niunaijun/blackbox/core/env/AppSystemEnv;->isOpenPackage(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-static/range {p2 .. p2}, Ltop/niunaijun/blackbox/utils/MethodParameterUtils;->replaceLastUserId([Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Block bindService: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v4

    :cond_6
    const-wide/32 v16, -0x80000000

    and-long v16, v12, v16

    const-wide/16 v18, 0x0

    cmp-long v8, v16, v18

    if-eqz v8, :cond_7

    const-wide/32 v16, 0x7fffffff

    and-long v12, v12, v16

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v2, v11

    :cond_7
    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v8

    iget-object v11, v15, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v12, v11, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v11, v11, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v8, v12, v11, v14}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->initProcess(Ljava/lang/String;Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v8

    if-nez v8, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "failed to initProcess for bindService: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto :goto_2

    :cond_8
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v3

    if-nez v9, :cond_9

    const/4 v4, 0x0

    goto :goto_3

    :cond_9
    invoke-interface {v9}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v4

    :goto_3
    invoke-virtual {v3, v6, v4, v7, v14}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->bindService(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v9, v6}, Ltop/niunaijun/blackbox/fake/delegate/ServiceConnectionDelegate;->createProxy(Landroid/app/IServiceConnection;Landroid/content/Intent;)Landroid/app/IServiceConnection;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v2, v4

    .line 1
    const-class v3, Lblack/android/app/LoadedApkServiceDispatcherInnerConnectionContext;

    const/4 v4, 0x0

    invoke-static {v3, v9, v4}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lblack/android/app/LoadedApkServiceDispatcherInnerConnectionContext;

    .line 2
    invoke-interface {v3}, Lblack/android/app/LoadedApkServiceDispatcherInnerConnectionContext;->mDispatcher()Ljava/lang/ref/WeakReference;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    .line 3
    const-class v4, Lblack/android/app/LoadedApkServiceDispatcherContext;

    const/4 v5, 0x0

    invoke-static {v4, v3, v5}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lblack/android/app/LoadedApkServiceDispatcherContext;

    .line 4
    invoke-static {v9, v6}, Ltop/niunaijun/blackbox/fake/delegate/ServiceConnectionDelegate;->createProxy(Landroid/app/IServiceConnection;Landroid/content/Intent;)Landroid/app/IServiceConnection;

    move-result-object v4

    invoke-interface {v3, v4}, Lblack/android/app/LoadedApkServiceDispatcherContext;->_set_mConnection(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static getIntOrLongValue(Ljava/lang/Object;)J
    .locals 2

    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private static isIsolated()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isOreo()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 1
    const-class v0, Lblack/android/app/ActivityManagerOreoStatic;

    invoke-static {v0, v2, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityManagerOreoStatic;

    .line 2
    invoke-interface {v0}, Lblack/android/app/ActivityManagerOreoStatic;->IActivityManagerSingleton()Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isL()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/b;->a()Lblack/android/app/ActivityManagerNativeStatic;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityManagerNativeStatic;->gDefault()Ljava/lang/Object;

    move-result-object v2

    .line 3
    :cond_1
    :goto_0
    const-class v0, Lblack/android/util/SingletonContext;

    invoke-static {v0, v2, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/util/SingletonContext;

    .line 4
    invoke-interface {v0}, Lblack/android/util/SingletonContext;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isOreo()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1
    const-class p1, Lblack/android/app/ActivityManagerOreoStatic;

    invoke-static {p1, v1, v0}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/app/ActivityManagerOreoStatic;

    .line 2
    invoke-interface {p1}, Lblack/android/app/ActivityManagerOreoStatic;->IActivityManagerSingleton()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isL()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lb/b;->a()Lblack/android/app/ActivityManagerNativeStatic;

    move-result-object p1

    invoke-interface {p1}, Lblack/android/app/ActivityManagerNativeStatic;->gDefault()Ljava/lang/Object;

    move-result-object v1

    .line 3
    :cond_1
    :goto_0
    const-class p1, Lblack/android/util/SingletonContext;

    invoke-static {p1, v1, v0}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/util/SingletonContext;

    .line 4
    invoke-interface {p1, p2}, Lblack/android/util/SingletonContext;->_set_mInstance(Ljava/lang/Object;)V

    return-void
.end method

.method public isBadEnv()Z
    .locals 2

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;->getWho()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onBindMethod()V
    .locals 2

    invoke-super {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->onBindMethod()V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;

    const-string v1, "getAppStartMode"

    invoke-direct {v0, v1}, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;

    const-string v1, "setAppLockedVerifying"

    invoke-direct {v0, v1}, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;

    const-string v1, "reportJunkFromApp"

    invoke-direct {v0, v1}, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    return-void
.end method
