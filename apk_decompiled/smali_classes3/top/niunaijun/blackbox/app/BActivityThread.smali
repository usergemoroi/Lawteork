.class public Ltop/niunaijun/blackbox/app/BActivityThread;
.super Ltop/niunaijun/blackbox/core/IBActivityThread$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final TAG:Ljava/lang/String;

.field private static final mConfigLock:Ljava/lang/Object;

.field private static sBActivityThread:Ltop/niunaijun/blackbox/app/BActivityThread;


# instance fields
.field private mAppConfig:Ltop/niunaijun/blackbox/entity/AppConfig;

.field private mBoundApplication:Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

.field private final mH:Landroid/os/Handler;

.field private mInitialApplication:Landroid/app/Application;

.field private final mProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/pm/ProviderInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fe55d969af0fL    # 5.490052582119373E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    sput-object v0, Ltop/niunaijun/blackbox/app/BActivityThread;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mConfigLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/IBActivityThread$Stub;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mProviders:Ljava/util/List;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mH:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic access$000()Ljava/lang/Object;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mConfigLock:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic access$102(Ltop/niunaijun/blackbox/app/BActivityThread;Ltop/niunaijun/blackbox/entity/AppConfig;)Ltop/niunaijun/blackbox/entity/AppConfig;
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mAppConfig:Ltop/niunaijun/blackbox/entity/AppConfig;

    return-object p1
.end method

.method public static createPackageContext(Landroid/content/pm/ApplicationInfo;)Landroid/content/Context;
    .locals 2

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;
    .locals 2

    sget-object v0, Ltop/niunaijun/blackbox/app/BActivityThread;->sBActivityThread:Ltop/niunaijun/blackbox/app/BActivityThread;

    if-nez v0, :cond_1

    const-class v0, Ltop/niunaijun/blackbox/app/BActivityThread;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ltop/niunaijun/blackbox/app/BActivityThread;->sBActivityThread:Ltop/niunaijun/blackbox/app/BActivityThread;

    if-nez v1, :cond_0

    new-instance v1, Ltop/niunaijun/blackbox/app/BActivityThread;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/app/BActivityThread;-><init>()V

    sput-object v1, Ltop/niunaijun/blackbox/app/BActivityThread;->sBActivityThread:Ltop/niunaijun/blackbox/app/BActivityThread;

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
    sget-object v0, Ltop/niunaijun/blackbox/app/BActivityThread;->sBActivityThread:Ltop/niunaijun/blackbox/app/BActivityThread;

    return-object v0
.end method

.method public static getActivityByToken(Landroid/os/IBinder;)Landroid/app/Activity;
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadContext;->mActivities()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 1
    const-class v0, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/app/ActivityThreadActivityClientRecordContext;

    .line 2
    invoke-interface {p0}, Lblack/android/app/ActivityThreadActivityClientRecordContext;->activity()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;
    .locals 2

    sget-object v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mConfigLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v1

    iget-object v1, v1, Ltop/niunaijun/blackbox/app/BActivityThread;->mAppConfig:Ltop/niunaijun/blackbox/entity/AppConfig;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static getAppPackageName()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->packageName:Ljava/lang/String;

    return-object v0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    if-eqz v0, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getAppPid()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    iget v0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->bpid:I

    :goto_0
    return v0
.end method

.method public static getAppProcessName()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->processName:Ljava/lang/String;

    return-object v0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mBoundApplication:Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

    if-eqz v0, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mBoundApplication:Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->processName:Ljava/lang/String;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getApplication()Landroid/app/Application;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    return-object v0
.end method

.method public static getBAppId()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostUid()I

    move-result v0

    invoke-static {v0}, Ltop/niunaijun/blackbox/core/system/user/BUserHandle;->getAppId(I)I

    move-result v0

    return v0
.end method

.method public static getBUid()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v0, 0x2710

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    iget v0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->buid:I

    :goto_0
    return v0
.end method

.method public static getCallingBUid()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostUid()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    iget v0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->callingBUid:I

    :goto_0
    return v0
.end method

.method public static getProviders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/content/pm/ProviderInfo;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mProviders:Ljava/util/List;

    return-object v0
.end method

.method public static getUid()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    iget v0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->uid:I

    :goto_0
    return v0
.end method

.method public static getUserId()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    iget v0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->userId:I

    :goto_0
    return v0
.end method

.method public static installProvider(Ljava/lang/Object;Landroid/content/Context;Landroid/content/pm/ProviderInfo;Ljava/lang/Object;)V
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fe97d969af0fL    # 5.490329118157928E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/Reflector;->findMethodByFirstName(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object v2, p1

    move-object v3, p3

    move-object v4, p2

    move-object v6, v7

    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private installProviders(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/content/pm/ProviderInfo;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v0

    :try_start_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ProviderInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, v2, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, v2, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-boolean v3, v2, Landroid/content/pm/ProviderInfo;->multiprocess:Z

    if-eqz v3, :cond_0

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, p1, v2, v4}, Ltop/niunaijun/blackbox/app/BActivityThread;->installProvider(Ljava/lang/Object;Landroid/content/Context;Landroid/content/pm/ProviderInfo;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :cond_2
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    invoke-static {}, Ltop/niunaijun/blackbox/fake/delegate/ContentProviderDelegate;->init()V

    return-void

    :catchall_1
    move-exception p1

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    invoke-static {}, Ltop/niunaijun/blackbox/fake/delegate/ContentProviderDelegate;->init()V

    throw p1
.end method

.method private static isBlockedTool(Ljava/lang/String;)Z
    .locals 3

    if-eqz p0, :cond_1

    .line 1
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3feeed969af0fL    # 5.490693642936023E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    const-wide v1, 0x60e3fee6d969af0fL    # 5.490660123416198E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    const-wide v1, 0x60e3fed3d969af0fL    # 5.490580514556614E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 7
    const-wide v1, 0x60e3feccd969af0fL    # 5.490551184976768E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 9
    const-wide v1, 0x60e3fec2d969af0fL    # 5.4905092855769865E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 11
    const-wide v1, 0x60e3febdd969af0fL    # 5.490488335877096E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 13
    const-wide v1, 0x60e3feb6d969af0fL    # 5.490459006297249E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 15
    const-wide v1, 0x60e3feabd969af0fL    # 5.49041291695749E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 17
    const-wide v1, 0x60e3fea2d969af0fL    # 5.490375207497687E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isThreadInit()Z
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/app/BActivityThread;->sBActivityThread:Ltop/niunaijun/blackbox/app/BActivityThread;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static ispkgname(Ljava/lang/String;)Z
    .locals 3

    if-eqz p0, :cond_1

    .line 1
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3ff0fd969af0fL    # 5.490831910955301E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    const-wide v1, 0x60e3fef5d969af0fL    # 5.49072297251587E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic lambda$finishActivity$1(Landroid/os/IBinder;)V
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadContext;->mActivities()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p0}, Ltop/niunaijun/blackbox/app/BActivityThread;->getActivityByToken(Landroid/os/IBinder;)Landroid/app/Activity;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Landroid/app/Activity;->getParent()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->getParent()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lb/a;->a(Ljava/lang/Object;)Lblack/android/app/ActivityContext;

    move-result-object v1

    invoke-interface {v1}, Lblack/android/app/ActivityContext;->mResultCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0}, Lb/a;->a(Ljava/lang/Object;)Lblack/android/app/ActivityContext;

    move-result-object v2

    invoke-interface {v2}, Lblack/android/app/ActivityContext;->mResultData()Landroid/content/Intent;

    move-result-object v2

    invoke-static {p0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/ActivityManagerCompat;->finishActivity(Landroid/os/IBinder;ILandroid/content/Intent;)Z

    invoke-static {v0}, Lb/a;->a(Ljava/lang/Object;)Lblack/android/app/ActivityContext;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lblack/android/app/ActivityContext;->_set_mFinished(Ljava/lang/Object;)V

    return-void
.end method

.method static lambda$handleNewIntent$2(Landroid/content/Intent;Landroid/os/IBinder;)V
    .locals 4

    .line 1
    const-class v0, Lblack/com/android/internal/content/ReferrerIntentStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/com/android/internal/content/ReferrerIntentStatic;

    .line 2
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, p0, v3}, Lblack/com/android/internal/content/ReferrerIntentStatic;->_new(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v3

    invoke-interface {v3, v1, v1}, Lblack/android/app/ActivityThreadContext;->_check_performNewIntents(Landroid/os/IBinder;Ljava/util/List;)Ljava/lang/reflect/Method;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, p1, p0}, Lblack/android/app/ActivityThreadContext;->performNewIntents(Landroid/os/IBinder;Ljava/util/List;)Ljava/lang/Void;

    goto :goto_0

    .line 3
    :cond_0
    const-class v3, Lblack/android/app/ActivityThreadNMR1Context;

    invoke-static {v3, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lblack/android/app/ActivityThreadNMR1Context;

    .line 4
    invoke-interface {v3, v1, v1, v2}, Lblack/android/app/ActivityThreadNMR1Context;->_check_performNewIntents(Landroid/os/IBinder;Ljava/util/List;Z)Ljava/lang/reflect/Method;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 5
    const-class v1, Lblack/android/app/ActivityThreadNMR1Context;

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityThreadNMR1Context;

    .line 6
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x1

    invoke-interface {v0, p1, p0, v1}, Lblack/android/app/ActivityThreadNMR1Context;->performNewIntents(Landroid/os/IBinder;Ljava/util/List;Z)Ljava/lang/Void;

    goto :goto_0

    .line 7
    :cond_1
    const-class v3, Lblack/android/app/ActivityThreadQContext;

    invoke-static {v3, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lblack/android/app/ActivityThreadQContext;

    .line 8
    invoke-interface {v3, v1, v1}, Lblack/android/app/ActivityThreadQContext;->_check_handleNewIntent(Landroid/os/IBinder;Ljava/util/List;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 9
    const-class v1, Lblack/android/app/ActivityThreadQContext;

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityThreadQContext;

    .line 10
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, p1, p0}, Lblack/android/app/ActivityThreadQContext;->handleNewIntent(Landroid/os/IBinder;Ljava/util/List;)Ljava/lang/Void;

    :cond_2
    :goto_0
    return-void
.end method

.method private onAfterApplicationOnCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->getAppLifecycleCallbacks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v2

    invoke-virtual {v1, p1, p2, p3, v2}, Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;->afterApplicationOnCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private onBeforeApplicationOnCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->getAppLifecycleCallbacks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v2

    invoke-virtual {v1, p1, p2, p3, v2}, Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;->beforeApplicationOnCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private onBeforeCreateApplication(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->getAppLifecycleCallbacks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v2

    invoke-virtual {v1, p1, p2, p3, v2}, Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;->beforeCreateApplication(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;I)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public acquireContentProviderClient(Landroid/content/pm/ProviderInfo;)Landroid/os/IBinder;
    .locals 5

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/app/BActivityThread;->isInit()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v0

    iget-object v0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->packageName:Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;

    move-result-object v1

    iget-object v1, v1, Ltop/niunaijun/blackbox/entity/AppConfig;->processName:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ltop/niunaijun/blackbox/app/BActivityThread;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 1
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fe87d969af0fL    # 5.490262079118278E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/ContentResolver;->acquireContentProviderClient(Ljava/lang/String;)Landroid/content/ContentProviderClient;

    move-result-object v3

    .line 3
    const-class v4, Lblack/android/content/ContentProviderClientContext;

    invoke-static {v4, v3, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lblack/android/content/ContentProviderClientContext;

    .line 4
    invoke-interface {v3}, Lblack/android/content/ContentProviderClientContext;->mContentProvider()Landroid/os/IInterface;

    move-result-object v3

    if-nez v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public bindApplication()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/app/BActivityThread;->isInit()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppProcessName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ltop/niunaijun/blackbox/app/BActivityThread;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bindApplication(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 2
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0}, Landroid/os/ConditionVariable;-><init>()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v1

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHandler()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0, p1, p2, v0}, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda1;-><init>(Ltop/niunaijun/blackbox/app/BActivityThread;Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Ltop/niunaijun/blackbox/app/BActivityThread;->handleBindApplication(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public createJobService(Landroid/content/pm/ServiceInfo;)Landroid/app/job/JobService;
    .locals 13

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/BActivityThread;->isInit()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    iget-object v1, p1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v2, p1, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ltop/niunaijun/blackbox/app/BActivityThread;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mBoundApplication:Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->info:Ljava/lang/Object;

    .line 1
    const-class v1, Lblack/android/app/LoadedApkContext;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/LoadedApkContext;

    .line 2
    invoke-interface {v0}, Lblack/android/app/LoadedApkContext;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iget-object v3, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobService;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    const/4 v5, 0x3

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lb/d;->a(Ljava/lang/Object;)Lblack/android/app/ContextImplContext;

    move-result-object v4

    invoke-interface {v4, v0}, Lblack/android/app/ContextImplContext;->setOuterContext(Landroid/content/Context;)Ljava/lang/Void;

    .line 3
    const-class v4, Lblack/android/app/ServiceContext;

    invoke-static {v4, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lblack/android/app/ServiceContext;

    .line 4
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v8

    iget-object v9, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v2

    invoke-virtual {v2}, Ltop/niunaijun/blackbox/app/BActivityThread;->getActivityThread()Landroid/os/IBinder;

    move-result-object v10

    iget-object v11, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    invoke-static {}, Lb/b;->a()Lblack/android/app/ActivityManagerNativeStatic;

    move-result-object v2

    invoke-interface {v2}, Lblack/android/app/ActivityManagerNativeStatic;->getDefault()Landroid/os/IInterface;

    move-result-object v12

    move-object v7, v3

    invoke-interface/range {v6 .. v12}, Lblack/android/app/ServiceContext;->attach(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Landroid/os/IBinder;Landroid/app/Application;Ljava/lang/Object;)Ljava/lang/Void;

    invoke-static {v3}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fix(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/job/JobService;->onCreate()V

    invoke-virtual {v0, v1}, Landroid/app/job/JobService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3ff55d969af0fL    # 5.491125206753768E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 7
    const-wide v4, 0x60e3ff38d969af0fL    # 5.491003698494403E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3ff85d969af0fL    # 5.491326323872717E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 10
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    const-wide v5, 0x60e3ff75d969af0fL    # 5.491259284833068E158

    invoke-static {v5, v6, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 13
    const-wide v4, 0x60e3ff58d969af0fL    # 5.491137776573703E158

    invoke-static {v4, v5, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Ltop/niunaijun/blackbox/utils/Slog;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method

.method public createService(Landroid/content/pm/ServiceInfo;Landroid/os/IBinder;)Landroid/app/Service;
    .locals 12

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/BActivityThread;->isInit()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->currentActivityThread()Ltop/niunaijun/blackbox/app/BActivityThread;

    move-result-object v0

    iget-object v1, p1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v2, p1, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ltop/niunaijun/blackbox/app/BActivityThread;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mBoundApplication:Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->info:Ljava/lang/Object;

    .line 1
    const-class v1, Lblack/android/app/LoadedApkContext;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/LoadedApkContext;

    .line 2
    invoke-interface {v0}, Lblack/android/app/LoadedApkContext;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    :try_start_0
    iget-object v1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Service;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    const/4 v4, 0x3

    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lb/d;->a(Ljava/lang/Object;)Lblack/android/app/ContextImplContext;

    move-result-object v3

    invoke-interface {v3, v0}, Lblack/android/app/ContextImplContext;->setOuterContext(Landroid/content/Context;)Ljava/lang/Void;

    .line 3
    const-class v3, Lblack/android/app/ServiceContext;

    invoke-static {v3, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lblack/android/app/ServiceContext;

    .line 4
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v7

    iget-object v8, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    iget-object v10, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    invoke-static {}, Lb/b;->a()Lblack/android/app/ActivityManagerNativeStatic;

    move-result-object v2

    invoke-interface {v2}, Lblack/android/app/ActivityManagerNativeStatic;->getDefault()Landroid/os/IInterface;

    move-result-object v11

    move-object v6, v1

    move-object v9, p2

    invoke-interface/range {v5 .. v11}, Lblack/android/app/ServiceContext;->attach(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Landroid/os/IBinder;Landroid/app/Application;Ljava/lang/Object;)Ljava/lang/Void;

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fix(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/Service;->onCreate()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception p2

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3ffa2d969af0fL    # 5.491447832132082E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 7
    const-wide v3, 0x60e3ff88d969af0fL    # 5.491338893692652E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3ffd4d969af0fL    # 5.491657329130988E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    const-wide v3, 0x60e3ffc4d969af0fL    # 5.491590290091338E158

    invoke-static {v3, v4, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 13
    const-wide v2, 0x60e3ffa5d969af0fL    # 5.491460401952017E158

    invoke-static {v2, v3, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ltop/niunaijun/blackbox/utils/Slog;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public finishActivity(Landroid/os/IBinder;)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mH:Landroid/os/Handler;

    new-instance v1, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda0;-><init>(Landroid/os/IBinder;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public getActivityThread()Landroid/os/IBinder;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadContext;->getApplicationThread()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public getPackageInfo()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mBoundApplication:Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

    iget-object v0, v0, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->info:Ljava/lang/Object;

    return-object v0
.end method

.method public declared-synchronized handleBindApplication(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/app/BActivityThread;->isInit()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Ltop/niunaijun/blackbox/core/CrashHandler;->create()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_0
    :try_start_2
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v1

    const/16 v2, 0x8

    invoke-virtual {v0, p1, v2, v1}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v2, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    new-array v2, v3, [Landroid/content/pm/ProviderInfo;

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    :cond_1
    iget-object v2, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mProviders:Ljava/util/List;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadContext;->mBoundApplication()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ltop/niunaijun/blackbox/app/BActivityThread;->createPackageContext(Landroid/content/pm/ApplicationInfo;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lb/d;->a(Ljava/lang/Object;)Lblack/android/app/ContextImplContext;

    move-result-object v4

    invoke-interface {v4}, Lblack/android/app/ContextImplContext;->mPackageInfo()Ljava/lang/Object;

    move-result-object v4

    .line 1
    const-class v5, Lblack/android/app/LoadedApkContext;

    invoke-static {v5, v4, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lblack/android/app/LoadedApkContext;

    .line 2
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v5, v6}, Lblack/android/app/LoadedApkContext;->_set_mSecurityViolation(Ljava/lang/Object;)V

    .line 3
    const-class v5, Lblack/android/app/LoadedApkContext;

    invoke-static {v5, v4, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lblack/android/app/LoadedApkContext;

    .line 4
    invoke-interface {v5, v1}, Lblack/android/app/LoadedApkContext;->_set_mApplicationInfo(Ljava/lang/Object;)V

    iget v5, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x18

    if-ge v5, v7, :cond_2

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/StrictModeCompat;->disableDeathOnFileUriExposure()Z

    :cond_2
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPackageName()Ljava/lang/String;

    invoke-static {p2, v1}, Ltop/niunaijun/blackbox/core/env/VirtualRuntime;->setupRuntime(Ljava/lang/String;Landroid/content/pm/ApplicationInfo;)V

    .line 5
    const-class v5, Lblack/dalvik/system/VMRuntimeStatic;

    const/4 v7, 0x0

    invoke-static {v5, v7, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lblack/dalvik/system/VMRuntimeStatic;

    .line 6
    invoke-interface {v5}, Lblack/dalvik/system/VMRuntimeStatic;->getRuntime()Ljava/lang/Object;

    move-result-object v5

    .line 7
    const-class v8, Lblack/dalvik/system/VMRuntimeContext;

    invoke-static {v8, v5, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lblack/dalvik/system/VMRuntimeContext;

    .line 8
    iget v8, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-interface {v5, v8}, Lblack/dalvik/system/VMRuntimeContext;->setTargetSdkVersion(I)Ljava/lang/Void;

    const/16 v5, 0x1f

    if-lt v6, v5, :cond_3

    .line 9
    const-class v5, Lblack/android/graphics/CompatibilityStatic;

    invoke-static {v5, v7, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lblack/android/graphics/CompatibilityStatic;

    .line 10
    iget v8, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-interface {v5, v8}, Lblack/android/graphics/CompatibilityStatic;->setTargetSdkVersion(I)Ljava/lang/Void;

    :cond_3
    invoke-static {v6}, Ltop/niunaijun/blackbox/BlackBoxCore;->init(I)V

    if-eqz v2, :cond_6

    invoke-static {}, Ltop/niunaijun/blackbox/core/IOCore;->get()Ltop/niunaijun/blackbox/core/IOCore;

    move-result-object v5

    invoke-virtual {v5, v2}, Ltop/niunaijun/blackbox/core/IOCore;->enableRedirect(Landroid/content/Context;)V

    new-instance v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

    invoke-direct {v5}, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;-><init>()V

    iput-object v1, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    iput-object p2, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->processName:Ljava/lang/String;

    iput-object v4, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->info:Ljava/lang/Object;

    iget-object v1, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mProviders:Ljava/util/List;

    iput-object v1, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->providers:Ljava/util/List;

    .line 11
    const-class v1, Lblack/android/app/ActivityThreadAppBindDataContext;

    invoke-static {v1, v0, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityThreadAppBindDataContext;

    .line 12
    new-instance v1, Landroid/content/ComponentName;

    iget-object v6, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-class v8, Landroid/app/Instrumentation;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v6, v8}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lblack/android/app/ActivityThreadAppBindDataContext;->_set_instrumentationName(Ljava/lang/Object;)V

    iget-object v1, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    invoke-interface {v0, v1}, Lblack/android/app/ActivityThreadAppBindDataContext;->_set_appInfo(Ljava/lang/Object;)V

    iget-object v1, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->info:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lblack/android/app/ActivityThreadAppBindDataContext;->_set_info(Ljava/lang/Object;)V

    iget-object v1, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->processName:Ljava/lang/String;

    invoke-interface {v0, v1}, Lblack/android/app/ActivityThreadAppBindDataContext;->_set_processName(Ljava/lang/Object;)V

    iget-object v1, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->providers:Ljava/util/List;

    invoke-interface {v0, v1}, Lblack/android/app/ActivityThreadAppBindDataContext;->_set_providers(Ljava/lang/Object;)V

    iput-object v5, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mBoundApplication:Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

    .line 13
    const-class v0, Lblack/android/security/net/config/NetworkSecurityConfigProviderContext;

    invoke-static {v0}, Ltop/niunaijun/blackreflection/utils/ClassUtil;->classReady(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 14
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v8, 0x60e3ff35d969af0fL    # 5.490991128674469E158

    invoke-static {v8, v9, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {v0}, Ljava/security/Security;->removeProvider(Ljava/lang/String;)V

    .line 16
    const-class v0, Lblack/android/security/net/config/NetworkSecurityConfigProviderStatic;

    invoke-static {v0, v7, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/security/net/config/NetworkSecurityConfigProviderStatic;

    .line 17
    invoke-interface {v0, v2}, Lblack/android/security/net/config/NetworkSecurityConfigProviderStatic;->install(Landroid/content/Context;)Ljava/lang/Void;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_4
    :try_start_3
    invoke-direct {p0, p1, p2, v2}, Ltop/niunaijun/blackbox/app/BActivityThread;->onBeforeCreateApplication(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 18
    const-class v0, Lblack/android/app/LoadedApkContext;

    invoke-static {v0, v4, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/LoadedApkContext;

    .line 19
    invoke-interface {v0, v3, v7}, Lblack/android/app/LoadedApkContext;->makeApplication(ZLandroid/app/Instrumentation;)Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fix(Landroid/content/Context;)V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v1

    invoke-interface {v1}, Lblack/android/app/ActivityThreadContext;->getSystemContext()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fix(Landroid/content/Context;)V

    iput-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v1

    iget-object v3, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    invoke-interface {v1, v3}, Lblack/android/app/ActivityThreadContext;->_set_mInitialApplication(Ljava/lang/Object;)V

    iget-object v1, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    iget-object v3, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->processName:Ljava/lang/String;

    iget-object v4, v5, Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;->providers:Ljava/util/List;

    invoke-direct {p0, v1, v3, v4}, Ltop/niunaijun/blackbox/app/BActivityThread;->installProviders(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    invoke-direct {p0, p1, p2, v0}, Ltop/niunaijun/blackbox/app/BActivityThread;->onBeforeApplicationOnCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V

    invoke-static {}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->get()Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    move-result-object v1

    invoke-virtual {v1, v0}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->callApplicationOnCreate(Landroid/app/Application;)V

    invoke-direct {p0, p1, p2, v0}, Ltop/niunaijun/blackbox/app/BActivityThread;->onAfterApplicationOnCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V

    invoke-static {}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->get()Ltop/niunaijun/blackbox/fake/hook/HookManager;

    move-result-object p1

    const-class p2, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;

    invoke-virtual {p1, p2}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->checkEnv(Ljava/lang/Class;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ltop/niunaijun/blackbox/app/BActivityThread;->isBlockedTool(Ljava/lang/String;)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-nez p1, :cond_5

    :try_start_5
    new-instance p1, Landroid/webkit/WebView;

    invoke-direct {p1, v2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_5
    :goto_1
    monitor-exit p0

    return-void

    :catch_0
    move-exception p1

    :try_start_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p2, Ljava/lang/RuntimeException;

    .line 20
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3ff29d969af0fL    # 5.490940849394732E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 10
    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 0
    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public handleNewIntent(Landroid/os/IBinder;Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mH:Landroid/os/Handler;

    new-instance v1, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda3;

    invoke-direct {v1, p2, p1}, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda3;-><init>(Landroid/content/Intent;Landroid/os/IBinder;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public initProcess(Ltop/niunaijun/blackbox/entity/AppConfig;)V
    .locals 6

    sget-object v0, Ltop/niunaijun/blackbox/app/BActivityThread;->mConfigLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mAppConfig:Ltop/niunaijun/blackbox/entity/AppConfig;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ltop/niunaijun/blackbox/entity/AppConfig;->packageName:Ljava/lang/String;

    iget-object v2, p1, Ltop/niunaijun/blackbox/entity/AppConfig;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3ffffd969af0fL    # 5.491837496550046E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/AppConfig;->processName:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 3
    const-wide v4, 0x60e3ffe9d969af0fL    # 5.491745317870528E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v2, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mAppConfig:Ltop/niunaijun/blackbox/entity/AppConfig;

    iget-object v2, v2, Ltop/niunaijun/blackbox/entity/AppConfig;->processName:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iput-object p1, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mAppConfig:Ltop/niunaijun/blackbox/entity/AppConfig;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/core/IBActivityThread$Stub;->asBinder()Landroid/os/IBinder;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Ltop/niunaijun/blackbox/app/BActivityThread$1;

    invoke-direct {v1, p0, p1}, Ltop/niunaijun/blackbox/app/BActivityThread$1;-><init>(Ltop/niunaijun/blackbox/app/BActivityThread;Landroid/os/IBinder;)V

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public isInit()Z
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mBoundApplication:Ltop/niunaijun/blackbox/app/BActivityThread$AppBindData;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method synthetic lambda$bindApplication$0$top-niunaijun-blackbox-app-BActivityThread(Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Ltop/niunaijun/blackbox/app/BActivityThread;->handleBindApplication(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method lambda$scheduleReceiver$3$top-niunaijun-blackbox-app-BActivityThread(Ltop/niunaijun/blackbox/entity/am/ReceiverData;)V
    .locals 6

    .line 0
    iget-object v0, p1, Ltop/niunaijun/blackbox/entity/am/ReceiverData;->intent:Landroid/content/Intent;

    iget-object v1, p1, Ltop/niunaijun/blackbox/entity/am/ReceiverData;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, p1, Ltop/niunaijun/blackbox/entity/am/ReceiverData;->data:Ltop/niunaijun/blackbox/entity/am/PendingResultData;

    invoke-virtual {v2}, Ltop/niunaijun/blackbox/entity/am/PendingResultData;->build()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mInitialApplication:Landroid/app/Application;

    invoke-virtual {v4}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/BroadcastReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1
    :try_start_1
    const-class v3, Lblack/android/content/BroadcastReceiverContext;

    const/4 v5, 0x0

    invoke-static {v3, v1, v5}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lblack/android/content/BroadcastReceiverContext;

    .line 2
    invoke-interface {v3, v2}, Lblack/android/content/BroadcastReceiverContext;->setPendingResult(Ljava/lang/Object;)Ljava/lang/Void;

    invoke-virtual {v1, v4, v0}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 3
    const-class v2, Lblack/android/content/BroadcastReceiverContext;

    invoke-static {v2, v1, v5}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lblack/android/content/BroadcastReceiverContext;

    .line 4
    invoke-interface {v2}, Lblack/android/content/BroadcastReceiverContext;->getPendingResult()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v2

    iget-object p1, p1, Ltop/niunaijun/blackbox/entity/am/ReceiverData;->data:Ltop/niunaijun/blackbox/entity/am/PendingResultData;

    invoke-virtual {v2, p1}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->finishBroadcast(Ltop/niunaijun/blackbox/entity/am/PendingResultData;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v3, v1

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    sget-object p1, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fe85d969af0fL    # 5.490253699238322E158

    invoke-static {v1, v2, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    const-wide v4, 0x60e3fe75d969af0fL    # 5.490186660198672E158

    invoke-static {v4, v5, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 9
    const-wide v4, 0x60e3fe5ad969af0fL    # 5.490073531819263E158

    invoke-static {v4, v5, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ltop/niunaijun/blackbox/utils/Slog;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method

.method public peekService(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->peekService(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public restartJobService(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public scheduleReceiver(Ltop/niunaijun/blackbox/entity/am/ReceiverData;)V
    .locals 2

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/app/BActivityThread;->isInit()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/app/BActivityThread;->bindApplication()V

    :cond_0
    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread;->mH:Landroid/os/Handler;

    new-instance v1, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0, p1}, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda2;-><init>(Ltop/niunaijun/blackbox/app/BActivityThread;Ltop/niunaijun/blackbox/entity/am/ReceiverData;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public stopService(Landroid/content/Intent;)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->stopService(Landroid/content/Intent;)V

    return-void
.end method
