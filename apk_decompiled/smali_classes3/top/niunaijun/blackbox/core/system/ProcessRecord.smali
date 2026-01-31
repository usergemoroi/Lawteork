.class public Ltop/niunaijun/blackbox/core/system/ProcessRecord;
.super Landroid/os/Binder;
.source "SourceFile"


# instance fields
.field public appThread:Landroid/os/IInterface;

.field public bActivityThread:Ltop/niunaijun/blackbox/core/IBActivityThread;

.field public bpid:I

.field public buid:I

.field public callingBUid:I

.field public final info:Landroid/content/pm/ApplicationInfo;

.field public initLock:Landroid/os/ConditionVariable;

.field public pid:I

.field public final processName:Ljava/lang/String;

.field public uid:I

.field public userId:I


# direct methods
.method public constructor <init>(Landroid/content/pm/ApplicationInfo;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->initLock:Landroid/os/ConditionVariable;

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->info:Landroid/content/pm/ApplicationInfo;

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCallingBUid()I
    .locals 1

    iget v0, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->callingBUid:I

    return v0
.end method

.method public getClientConfig()Ltop/niunaijun/blackbox/entity/AppConfig;
    .locals 2

    new-instance v0, Ltop/niunaijun/blackbox/entity/AppConfig;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/entity/AppConfig;-><init>()V

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->info:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iput-object v1, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->packageName:Ljava/lang/String;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    iput-object v1, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->processName:Ljava/lang/String;

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    iput v1, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->bpid:I

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->buid:I

    iput v1, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->buid:I

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->uid:I

    iput v1, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->uid:I

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->callingBUid:I

    iput v1, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->callingBUid:I

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    iput v1, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->userId:I

    iput-object p0, v0, Ltop/niunaijun/blackbox/entity/AppConfig;->token:Landroid/os/IBinder;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->info:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderAuthority()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    invoke-static {v0}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getProxyAuthorities(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 7

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    iget v1, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->pid:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->buid:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->bpid:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->uid:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->pid:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget v6, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->userId:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public kill()V
    .locals 1

    iget v0, p0, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->pid:I

    if-lez v0, :cond_0

    :try_start_0
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V
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
