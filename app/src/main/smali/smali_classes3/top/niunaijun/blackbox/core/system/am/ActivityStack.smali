.class public Ltop/niunaijun/blackbox/core/system/am/ActivityStack;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field public static final LAUNCH_TIME_OUT:I = 0x0

.field public static final TAG:Ljava/lang/String; = "ActivityStack"


# instance fields
.field private final mAms:Landroid/app/ActivityManager;

.field private final mHandler:Landroid/os/Handler;

.field private final mLaunchingActivities:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final mTasks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ltop/niunaijun/blackbox/core/system/am/TaskRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mLaunchingActivities:Ljava/util/Set;

    new-instance v0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack$1;-><init>(Ltop/niunaijun/blackbox/core/system/am/ActivityStack;Landroid/os/Looper;)V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mHandler:Landroid/os/Handler;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mAms:Landroid/app/ActivityManager;

    return-void
.end method

.method public static synthetic access$000(Ltop/niunaijun/blackbox/core/system/am/ActivityStack;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mLaunchingActivities:Ljava/util/Set;

    return-object p0
.end method

.method private deliverNewIntentLocked(Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;Landroid/content/Intent;)V
    .locals 1

    :try_start_0
    iget-object v0, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->processRecord:Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->token:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Ltop/niunaijun/blackbox/core/IBActivityThread;->handleNewIntent(Landroid/os/IBinder;Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private findActivityRecordByComponentName(ILandroid/content/ComponentName;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;
    .locals 5

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget v3, v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->userId:I

    if-ne p1, v3, :cond_0

    iget-object v2, v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    iget-object v4, v3, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->component:Landroid/content/ComponentName;

    invoke-virtual {v4, p2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v1, v3

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;
    .locals 5

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget v3, v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->userId:I

    if-ne p1, v3, :cond_0

    iget-object v2, v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    iget-object v4, v3, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->token:Landroid/os/IBinder;

    if-ne v4, p2, :cond_1

    move-object v0, v3

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private findTaskRecordByTaskAffinityLocked(ILjava/lang/String;)Ltop/niunaijun/blackbox/core/system/am/TaskRecord;
    .locals 4

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget v3, v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->userId:I

    if-ne p1, v3, :cond_0

    iget-object v3, v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->taskAffinity:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

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

.method private findTaskRecordByTokenLocked(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/TaskRecord;
    .locals 5

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget v3, v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->userId:I

    if-ne p1, v3, :cond_0

    iget-object v3, v2, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    iget-object v4, v4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->token:Landroid/os/IBinder;

    if-ne v4, p2, :cond_1

    monitor-exit v0

    return-object v2

    :cond_2
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

.method private finishAllActivity(I)V
    .locals 4

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget-object v1, v1, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    iget v3, v2, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->userId:I

    if-ne v3, p1, :cond_1

    iget-boolean v3, v2, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->finished:Z

    if-eqz v3, :cond_1

    :try_start_0
    iget-object v3, v2, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->processRecord:Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iget-object v3, v3, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

    iget-object v2, v2, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->token:Landroid/os/IBinder;

    invoke-interface {v3, v2}, Ltop/niunaijun/blackbox/core/IBActivityThread;->finishActivity(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method private getStartStubActivityIntentInner(Landroid/content/Intent;IILtop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;Landroid/content/pm/ActivityInfo;)Landroid/content/Intent;
    .locals 5

    new-instance p3, Landroid/content/Intent;

    invoke-direct {p3}, Landroid/content/Intent;-><init>()V

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p5, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v1, v2}, Ltop/niunaijun/blackbox/core/system/pm/PackageManagerCompat;->getResources(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p5, Landroid/content/pm/ActivityInfo;->theme:I

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p5, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->theme:I

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-static {}, Lg/a;->a()Lblack/com/android/internal/RstyleableStatic;

    move-result-object v3

    invoke-interface {v3}, Lblack/com/android/internal/RstyleableStatic;->Window()[I

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-static {}, Lg/a;->a()Lblack/com/android/internal/RstyleableStatic;

    move-result-object v1

    invoke-interface {v1}, Lblack/com/android/internal/RstyleableStatic;->Window_windowIsTranslucent()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v2, Landroid/content/ComponentName;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->TransparentProxyActivity(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v2, Landroid/content/ComponentName;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getProxyActivity(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p3, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v2, "ActivityStack"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p5

    const-string v3, ", windowIsTranslucent: "

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p5

    invoke-virtual {p5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {v2, p5}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_2
    new-instance p5, Ljava/lang/AssertionError;

    invoke-direct {p5}, Ljava/lang/AssertionError;-><init>()V

    throw p5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p5

    :try_start_1
    invoke-virtual {p5}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p5, Landroid/content/ComponentName;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getProxyActivity(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p5, v1, p2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, p5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_3

    :goto_2
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    iget-object p2, p4, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mActivityInfo:Landroid/content/pm/ActivityInfo;

    iget-object p5, p4, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mActivityRecord:Landroid/os/IBinder;

    iget p4, p4, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->mUserId:I

    invoke-static {p3, p1, p2, p5, p4}, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;->saveStub(Landroid/content/Intent;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;I)V

    return-object p3

    :catchall_1
    move-exception p1

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_4
    throw p1
.end method

.method private getTopActivityRecord()Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->synchronizeTasks()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Ljava/util/LinkedList;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->getTopActivityRecord()Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private realStartActivityLocked(Landroid/os/IInterface;Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;)I
    .locals 13

    and-int/lit8 v0, p7, -0x3

    and-int/lit8 v0, v0, -0x9

    and-int/lit8 v9, v0, -0x5

    const/4 v12, 0x0

    :try_start_0
    invoke-static {}, Lb/b;->a()Lblack/android/app/ActivityManagerNativeStatic;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityManagerNativeStatic;->getDefault()Landroid/os/IInterface;

    move-result-object v0

    .line 1
    const-class v1, Lblack/android/app/IActivityManagerContext;

    invoke-static {v1, v0, v12}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lblack/android/app/IActivityManagerContext;

    .line 2
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v11, p8

    invoke-interface/range {v1 .. v11}, Lblack/android/app/IActivityManagerContext;->startActivity(Ljava/lang/Object;Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILjava/lang/Object;Landroid/os/Bundle;)Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return v12
.end method

.method private startActivityInNewTaskLocked(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;I)I
    .locals 0

    invoke-virtual {p0, p2, p3, p4, p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->newActivityRecord(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;I)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->startActivityProcess(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)Landroid/content/Intent;

    move-result-object p1

    const/high16 p2, 0x8000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p2, 0x80000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p1, p5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x0

    return p1
.end method

.method private startActivityInSourceTask(Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;ILtop/niunaijun/blackbox/core/system/am/ActivityRecord;Landroid/content/pm/ActivityInfo;I)I
    .locals 10

    move-object v9, p0

    move-object v0, p1

    move-object v4, p3

    move/from16 v1, p8

    move-object/from16 v2, p10

    invoke-virtual {p0, p1, v2, p3, v1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->newActivityRecord(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;I)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object v3

    invoke-direct {p0, v1, p1, v2, v3}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->startActivityProcess(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)Landroid/content/Intent;

    move-result-object v2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move/from16 v0, p11

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    if-nez v4, :cond_0

    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    move-object/from16 v0, p9

    iget-object v0, v0, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->processRecord:Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iget-object v1, v0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->appThread:Landroid/os/IInterface;

    move-object v0, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->realStartActivityLocked(Landroid/os/IInterface;Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;)I

    move-result v0

    return v0
.end method

.method private startActivityProcess(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)Landroid/content/Intent;
    .locals 11

    new-instance v4, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;

    invoke-direct {v4, p1, p3, p2, p4}, Ltop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;-><init>(ILandroid/content/pm/ActivityInfo;Landroid/content/Intent;Landroid/os/IBinder;)V

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->get()Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    move-result-object v5

    iget-object v6, p3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v7, p3, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v10

    const/4 v9, -0x1

    move v8, p1

    invoke-virtual/range {v5 .. v10}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startProcessLocked(Ljava/lang/String;Ljava/lang/String;III)Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    move-result-object p4

    if-eqz p4, :cond_0

    iget v2, p4, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    move-object v0, p0

    move-object v1, p2

    move v3, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->getStartStubActivityIntentInner(Landroid/content/Intent;IILtop/niunaijun/blackbox/proxy/record/ProxyActivityRecord;Landroid/content/pm/ActivityInfo;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Unable to create process, name:"

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private synchronizeTasks()V
    .locals 6

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mAms:Landroid/app/ActivityManager;

    const/16 v1, 0x64

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/ActivityManager;->getRecentTasks(II)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$RecentTaskInfo;

    iget-object v4, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    iget v5, v3, Landroid/app/ActivityManager$RecentTaskInfo;->id:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    iget v3, v3, Landroid/app/ActivityManager$RecentTaskInfo;->id:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public containsFlag(Landroid/content/Intent;I)Z
    .locals 0

    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getCallingActivity(Landroid/os/IBinder;I)Landroid/content/ComponentName;
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->synchronizeTasks()V

    invoke-direct {p0, p2, p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->resultTo:Landroid/os/IBinder;

    invoke-direct {p0, p2, p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->component:Landroid/content/ComponentName;

    monitor-exit v0

    return-object p1

    :cond_0
    new-instance p1, Landroid/content/ComponentName;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object p2

    const-class v1, Ltop/niunaijun/blackbox/proxy/ProxyActivity$P0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, p2, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getCallingPackage(Landroid/os/IBinder;I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->synchronizeTasks()V

    invoke-direct {p0, p2, p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->resultTo:Landroid/os/IBinder;

    invoke-direct {p0, p2, p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    monitor-exit v0

    return-object p1

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public newActivityRecord(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;I)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;
    .locals 2

    invoke-static {p1, p2, p3, p4}, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->create(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;I)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mLaunchingActivities:Ljava/util/Set;

    monitor-enter p2

    :try_start_0
    iget-object p3, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mLaunchingActivities:Ljava/util/Set;

    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p3, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mHandler:Landroid/os/Handler;

    const/4 p4, 0x0

    invoke-static {p3, p4, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p3

    iget-object p4, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mHandler:Landroid/os/Handler;

    const-wide/16 v0, 0x7d0

    invoke-virtual {p4, p3, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onActivityCreated(Ltop/niunaijun/blackbox/core/system/ProcessRecord;ILandroid/os/IBinder;Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)V
    .locals 5

    const-string v0, "onActivityCreated : "

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mLaunchingActivities:Ljava/util/Set;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mLaunchingActivities:Ljava/util/Set;

    invoke-interface {v2, p4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mHandler:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v2

    :try_start_1
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->synchronizeTasks()V

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    if-nez v1, :cond_0

    new-instance v1, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget v3, p4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->userId:I

    iget-object v4, p4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    invoke-static {v4}, Ltop/niunaijun/blackbox/utils/ComponentUtils;->getTaskAffinity(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, p2, v3, v4}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;-><init>(IILjava/lang/String;)V

    iget-object v3, p4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->intent:Landroid/content/Intent;

    iput-object v3, v1, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->rootIntent:Landroid/content/Intent;

    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v3, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p3, p4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->token:Landroid/os/IBinder;

    iput-object p1, p4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->processRecord:Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iput-object v1, p4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->task:Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    invoke-virtual {v1, p4}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->addTopActivity(Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)V

    const-string p1, "ActivityStack"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->component:Landroid/content/ComponentName;

    invoke-virtual {p3}, Landroid/content/ComponentName;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public onActivityDestroyed(ILandroid/os/IBinder;)V
    .locals 3

    const-string v0, "onActivityDestroyed : "

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->synchronizeTasks()V

    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p1

    if-nez p1, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    const/4 p2, 0x1

    iput-boolean p2, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->finished:Z

    const-string p2, "ActivityStack"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->component:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->task:Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    invoke-virtual {p2, p1}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->removeActivity(Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onActivityResumed(ILandroid/os/IBinder;)V
    .locals 3

    const-string v0, "onActivityResumed : "

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->synchronizeTasks()V

    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p1

    if-nez p1, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    const-string p2, "ActivityStack"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->component:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->task:Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    invoke-virtual {p2, p1}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->removeActivity(Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)V

    iget-object p2, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->task:Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    invoke-virtual {p2, p1}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->addTopActivity(Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onFinishActivity(ILandroid/os/IBinder;)V
    .locals 3

    const-string v0, "onFinishActivity : "

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->synchronizeTasks()V

    invoke-direct {p0, p1, p2}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object p1

    if-nez p1, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    const/4 p2, 0x1

    iput-boolean p2, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->finished:Z

    const-string p2, "ActivityStack"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->component:Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/content/ComponentName;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public startActivitiesLocked(I[Landroid/content/Intent;[Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)I
    .locals 14

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    if-eqz v0, :cond_3

    if-eqz v1, :cond_2

    array-length v2, v0

    array-length v3, v1

    if-ne v2, v3, :cond_1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_0

    aget-object v7, v0, v3

    aget-object v8, v1, v3

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x0

    move-object v5, p0

    move v6, p1

    move-object/from16 v9, p4

    move-object/from16 v13, p5

    invoke-virtual/range {v5 .. v13}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->startActivityLocked(ILandroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;)I

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "intents are length different than resolvedTypes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "resolvedTypes is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "intents is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public startActivityLocked(ILandroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;)I
    .locals 20

    move-object/from16 v13, p0

    move/from16 v0, p1

    move-object/from16 v2, p2

    iget-object v1, v13, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mTasks:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    invoke-direct/range {p0 .. p0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->synchronizeTasks()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v1

    const/4 v3, 0x1

    move-object/from16 v4, p3

    invoke-virtual {v1, v2, v3, v4, v0}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->resolveActivity(Landroid/content/Intent;ILjava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    const/4 v5, 0x0

    if-eqz v1, :cond_1d

    iget-object v6, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-nez v6, :cond_0

    goto/16 :goto_14

    :cond_0
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "startActivityLocked : "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "ActivityStack"

    invoke-static {v7, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v11, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    move-object/from16 v1, p4

    invoke-direct {v13, v0, v1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByToken(ILandroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object v6

    if-nez v6, :cond_1

    const/4 v1, 0x0

    :cond_1
    if-eqz v6, :cond_2

    iget-object v6, v6, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->task:Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    invoke-static {v11}, Ltop/niunaijun/blackbox/utils/ComponentUtils;->getTaskAffinity(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    move-result-object v8

    const/high16 v9, 0x20000000

    invoke-virtual {v13, v2, v9}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->containsFlag(Landroid/content/Intent;I)Z

    move-result v9

    if-nez v9, :cond_4

    iget v9, v11, Landroid/content/pm/ActivityInfo;->launchMode:I

    if-ne v9, v3, :cond_3

    goto :goto_1

    :cond_3
    move v9, v5

    goto :goto_2

    :cond_4
    :goto_1
    move v9, v3

    :goto_2
    const/high16 v10, 0x10000000

    invoke-virtual {v13, v2, v10}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->containsFlag(Landroid/content/Intent;I)Z

    move-result v10

    const/high16 v14, 0x4000000

    invoke-virtual {v13, v2, v14}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->containsFlag(Landroid/content/Intent;I)Z

    move-result v14

    const v15, 0x8000

    invoke-virtual {v13, v2, v15}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->containsFlag(Landroid/content/Intent;I)Z

    move-result v15

    iget v7, v11, Landroid/content/pm/ActivityInfo;->launchMode:I

    packed-switch v7, :pswitch_data_0

    const/4 v7, 0x0

    goto :goto_3

    :pswitch_0
    invoke-direct {v13, v0, v8}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findTaskRecordByTaskAffinityLocked(ILjava/lang/String;)Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    move-result-object v7

    goto :goto_3

    :pswitch_1
    invoke-direct {v13, v0, v8}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findTaskRecordByTaskAffinityLocked(ILjava/lang/String;)Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    move-result-object v7

    if-nez v7, :cond_5

    if-nez v10, :cond_5

    move-object v7, v6

    :cond_5
    :goto_3
    if-eqz v7, :cond_1c

    invoke-virtual {v7}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->needNewTask()Z

    move-result v8

    if-eqz v8, :cond_6

    goto/16 :goto_13

    :cond_6
    iget-object v8, v13, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mAms:Landroid/app/ActivityManager;

    iget v12, v7, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->id:I

    invoke-virtual {v8, v12, v5}, Landroid/app/ActivityManager;->moveTaskToFront(II)V

    if-nez v14, :cond_8

    if-nez v9, :cond_8

    if-eqz v15, :cond_7

    goto :goto_4

    :cond_7
    move v8, v5

    goto :goto_5

    :cond_8
    :goto_4
    move v8, v3

    :goto_5
    if-nez v8, :cond_9

    iget-object v8, v7, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->rootIntent:Landroid/content/Intent;

    invoke-static {v8, v2}, Ltop/niunaijun/blackbox/utils/ComponentUtils;->intentFilterEquals(Landroid/content/Intent;Landroid/content/Intent;)Z

    move-result v8

    if-eqz v8, :cond_9

    iget-object v8, v7, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->rootIntent:Landroid/content/Intent;

    invoke-virtual {v8}, Landroid/content/Intent;->getFlags()I

    move-result v8

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getFlags()I

    move-result v12

    if-ne v8, v12, :cond_9

    move v8, v3

    goto :goto_6

    :cond_9
    move v8, v5

    :goto_6
    if-eqz v8, :cond_a

    return v5

    :cond_a
    invoke-virtual {v7}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->getTopActivityRecord()Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object v12

    invoke-static {v11}, Ltop/niunaijun/blackbox/utils/ComponentUtils;->toComponentName(Landroid/content/pm/ComponentInfo;)Landroid/content/ComponentName;

    move-result-object v8

    invoke-direct {v13, v0, v8}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByComponentName(ILandroid/content/ComponentName;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object v8

    if-eqz v14, :cond_e

    if-eqz v8, :cond_e

    iget-object v5, v8, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->task:Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget-object v5, v5, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    monitor-enter v5

    :try_start_1
    iget-object v3, v8, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->task:Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget-object v3, v3, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/16 v16, 0x1

    add-int/lit8 v3, v3, -0x1

    :goto_7
    if-ltz v3, :cond_d

    iget-object v4, v8, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->task:Ltop/niunaijun/blackbox/core/system/am/TaskRecord;

    iget-object v4, v4, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    if-eq v4, v8, :cond_b

    move-object/from16 v17, v6

    const/4 v6, 0x1

    iput-boolean v6, v4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->finished:Z

    const-string v6, "ActivityStack"

    move-object/from16 v18, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v19, v10

    const-string v10, "makerFinish: "

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, v4, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->component:Landroid/content/ComponentName;

    invoke-virtual {v4}, Landroid/content/ComponentName;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    add-int/lit8 v3, v3, -0x1

    move-object/from16 v4, p3

    move-object/from16 v6, v17

    move-object/from16 v1, v18

    move/from16 v10, v19

    goto :goto_7

    :cond_b
    move-object/from16 v18, v1

    move-object/from16 v17, v6

    move/from16 v19, v10

    if-eqz v9, :cond_c

    goto :goto_9

    :cond_c
    const/4 v1, 0x1

    iput-boolean v1, v8, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->finished:Z

    goto :goto_8

    :cond_d
    move-object/from16 v18, v1

    move-object/from16 v17, v6

    move/from16 v19, v10

    :goto_8
    const/4 v8, 0x0

    :goto_9
    monitor-exit v5

    goto :goto_a

    :catchall_0
    move-exception v0

    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_e
    move-object/from16 v18, v1

    move-object/from16 v17, v6

    move/from16 v19, v10

    const/4 v8, 0x0

    :goto_a
    if-eqz v9, :cond_12

    if-nez v14, :cond_12

    iget-object v1, v12, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->intent:Landroid/content/Intent;

    invoke-static {v1, v2}, Ltop/niunaijun/blackbox/utils/ComponentUtils;->intentFilterEquals(Landroid/content/Intent;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_f

    move-object v8, v12

    goto :goto_c

    :cond_f
    iget-object v1, v13, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mLaunchingActivities:Ljava/util/Set;

    monitor-enter v1

    :try_start_2
    iget-object v3, v13, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->mLaunchingActivities:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_10
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    iget-boolean v6, v5, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->finished:Z

    if-nez v6, :cond_10

    iget-object v5, v5, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->component:Landroid/content/ComponentName;

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v4, 0x1

    goto :goto_b

    :cond_11
    monitor-exit v1

    goto :goto_d

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_12
    :goto_c
    const/4 v4, 0x0

    :goto_d
    iget v1, v11, Landroid/content/pm/ActivityInfo;->launchMode:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_15

    if-nez v14, :cond_15

    iget-object v1, v12, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->intent:Landroid/content/Intent;

    invoke-static {v1, v2}, Ltop/niunaijun/blackbox/utils/ComponentUtils;->intentFilterEquals(Landroid/content/Intent;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_13

    move-object v8, v12

    goto :goto_f

    :cond_13
    invoke-static {v11}, Ltop/niunaijun/blackbox/utils/ComponentUtils;->toComponentName(Landroid/content/pm/ComponentInfo;)Landroid/content/ComponentName;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->findActivityRecordByComponentName(ILandroid/content/ComponentName;)Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object v1

    if-eqz v1, :cond_15

    iget-object v3, v7, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    monitor-enter v3

    :try_start_3
    iget-object v5, v7, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    :goto_e
    if-ltz v5, :cond_14

    iget-object v8, v7, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    if-eq v8, v1, :cond_14

    iput-boolean v6, v8, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->finished:Z

    add-int/lit8 v5, v5, -0x1

    const/4 v6, 0x1

    goto :goto_e

    :cond_14
    monitor-exit v3

    move-object v8, v1

    goto :goto_f

    :catchall_2
    move-exception v0

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :cond_15
    :goto_f
    iget v1, v11, Landroid/content/pm/ActivityInfo;->launchMode:I

    const/4 v3, 0x3

    if-ne v1, v3, :cond_16

    move-object v8, v12

    :cond_16
    if-eqz v15, :cond_17

    if-eqz v19, :cond_17

    iget-object v1, v7, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    const/4 v5, 0x1

    iput-boolean v5, v3, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->finished:Z

    goto :goto_10

    :cond_17
    invoke-direct/range {p0 .. p1}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->finishAllActivity(I)V

    if-eqz v8, :cond_18

    invoke-direct {v13, v8, v2}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->deliverNewIntentLocked(Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;Landroid/content/Intent;)V

    const/4 v1, 0x0

    return v1

    :cond_18
    const/4 v1, 0x0

    if-eqz v4, :cond_19

    return v1

    :cond_19
    if-nez v18, :cond_1a

    invoke-virtual {v7}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->getTopActivityRecord()Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object v1

    if-eqz v1, :cond_1b

    goto :goto_11

    :cond_1a
    if-eqz v17, :cond_1b

    invoke-virtual/range {v17 .. v17}, Ltop/niunaijun/blackbox/core/system/am/TaskRecord;->getTopActivityRecord()Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    move-result-object v1

    if-eqz v1, :cond_1b

    :goto_11
    iget-object v1, v1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;->token:Landroid/os/IBinder;

    move-object v4, v1

    goto :goto_12

    :cond_1b
    move-object/from16 v4, v18

    :goto_12
    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p1

    move-object v10, v12

    const/4 v0, 0x0

    move v12, v0

    invoke-direct/range {v1 .. v12}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->startActivityInSourceTask(Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;ILtop/niunaijun/blackbox/core/system/am/ActivityRecord;Landroid/content/pm/ActivityInfo;I)I

    move-result v0

    return v0

    :cond_1c
    :goto_13
    move-object/from16 v18, v1

    const/4 v1, 0x0

    move-object/from16 p3, p0

    move/from16 p4, p1

    move-object/from16 p5, p2

    move-object/from16 p6, v11

    move-object/from16 p7, v18

    move/from16 p8, v1

    invoke-direct/range {p3 .. p8}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->startActivityInNewTaskLocked(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;I)I

    move-result v0

    return v0

    :cond_1d
    :goto_14
    move v0, v5

    return v0

    :catchall_3
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
