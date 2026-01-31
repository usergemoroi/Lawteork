.class public Ltop/niunaijun/blackbox/BlackBoxCore;
.super Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String;

.field public static cExceptionHandler:Z

.field public static cPackageManager:I

.field public static clientpkg:Z

.field public static mHosts:Z

.field public static orgCallingUid:I

.field private static final sBlackBoxCore:Ltop/niunaijun/blackbox/BlackBoxCore;

.field private static sContext:Landroid/content/Context;


# instance fields
.field private appConfig:Ltop/niunaijun/blackbox/entity/AppConfig;

.field private final mAppLifecycleCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;",
            ">;"
        }
    .end annotation
.end field

.field private mClientConfiguration:Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;

.field private mExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final mHandler:Landroid/os/Handler;

.field private final mHostUid:I

.field private final mHostUserId:I

.field private mProcessType:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

.field private final mServices:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$folIObVedRto8KjpHA1-kMCu5mM(Ltop/niunaijun/blackbox/BlackBoxCore;)V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->lolApp()V

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3f84ed969af0fL    # 5.483587504733154E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    sput-object v1, Ltop/niunaijun/blackbox/BlackBoxCore;->TAG:Ljava/lang/String;

    new-instance v1, Ltop/niunaijun/blackbox/BlackBoxCore;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/BlackBoxCore;-><init>()V

    sput-object v1, Ltop/niunaijun/blackbox/BlackBoxCore;->sBlackBoxCore:Ltop/niunaijun/blackbox/BlackBoxCore;

    const/4 v1, 0x0

    sput-boolean v1, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts:Z

    sput-boolean v1, Ltop/niunaijun/blackbox/BlackBoxCore;->cExceptionHandler:Z

    sput v1, Ltop/niunaijun/blackbox/BlackBoxCore;->cPackageManager:I

    const/16 v2, 0x2710

    sput v2, Ltop/niunaijun/blackbox/BlackBoxCore;->orgCallingUid:I

    .line 3
    const-wide v2, 0x60e3f841d969af0fL    # 5.483533035513438E158

    invoke-static {v2, v3, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    sput-boolean v1, Ltop/niunaijun/blackbox/BlackBoxCore;->clientpkg:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mServices:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mAppLifecycleCallbacks:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mHandler:Landroid/os/Handler;

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    iput v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mHostUid:I

    invoke-static {}, Le/c;->a()Lblack/android/os/UserHandleStatic;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/os/UserHandleStatic;->myUserId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mHostUserId:I

    return-void
.end method

.method public static native HiddenUrl()Ljava/lang/String;
.end method

.method public static LocalReff(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v1, 0x1388

    :try_start_1
    invoke-virtual {p0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {p0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fa1fd969af0fL    # 5.485535826822973E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v2, 0xc8

    if-eq v1, v2, :cond_0

    :goto_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    return v0

    :cond_0
    :try_start_2
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fa1bd969af0fL    # 5.485519067063061E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    sput-boolean p1, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts:Z

    sput-boolean p1, Ltop/niunaijun/blackbox/BlackBoxCore;->cExceptionHandler:Z

    const/16 v1, 0x2711

    sput v1, Ltop/niunaijun/blackbox/BlackBoxCore;->orgCallingUid:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    return p1

    :cond_3
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    return v0

    :catchall_0
    move-exception p1

    move-object v1, p0

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v1, p0

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    :goto_2
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    return v0

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_5
    throw p1
.end method

.method public static native addIORule(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private static cdb()V
    .locals 4

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Debug;->waitingForDebugger()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x7

    sput v0, Ltop/niunaijun/blackbox/BlackBoxCore;->cPackageManager:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fa20d969af0fL    # 5.485540016762952E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 3
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fa21d969af0fL    # 5.48554420670293E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private deleteOn()V
    .locals 5

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/BlackBoxCore;->sContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3f93ad969af0fL    # 5.484576330567987E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->deleteRecursive(Ljava/io/File;)V

    :cond_0
    return-void
.end method

.method private deleteRecursive(Ljava/io/File;)V
    .locals 4

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-direct {p0, v3}, Ltop/niunaijun/blackbox/BlackBoxCore;->deleteRecursive(Ljava/io/File;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public static dumpDex(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Ltop/niunaijun/blackbox/utils/compat/DexFileCompat;->getCookies(Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static native enableIO()V
.end method

.method public static get()Ltop/niunaijun/blackbox/BlackBoxCore;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/BlackBoxCore;->sBlackBoxCore:Ltop/niunaijun/blackbox/BlackBoxCore;

    return-object v0
.end method

.method public static getAppPackageName()Ljava/lang/String;
    .locals 5

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPackageName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3f9c5d969af0fL    # 5.485158732224944E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3f9b8d969af0fL    # 5.485104263005228E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v1, v2, v0}, Ltop/niunaijun/blackbox/utils/Slog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public static getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v0

    return-object v0
.end method

.method public static getBJobManager()Ltop/niunaijun/blackbox/fake/frameworks/BJobManager;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BJobManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BJobManager;

    move-result-object v0

    return-object v0
.end method

.method public static getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    return-object v0
.end method

.method public static getBStorageManager()Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BStorageManager;

    move-result-object v0

    return-object v0
.end method

.method public static getCallingBUid()I
    .locals 5

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getCallingBUid()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3f97dd969af0fL    # 5.48485705654652E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3f970d969af0fL    # 5.484802587326805E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v1, v2, v0}, Ltop/niunaijun/blackbox/utils/Slog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, -0x1

    return v0
.end method

.method public static getCallingUid(I)I
    .locals 2

    const/16 v0, 0x2710

    if-lez p0, :cond_0

    if-ge p0, v0, :cond_0

    return p0

    :cond_0
    const/16 v1, 0x4e1f

    if-le p0, v1, :cond_1

    return p0

    :cond_1
    if-lt p0, v0, :cond_2

    if-gt p0, v1, :cond_2

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getCallingBUid()I

    move-result p0

    :cond_2
    return p0
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/BlackBoxCore;->sContext:Landroid/content/Context;

    return-object v0
.end method

.method public static getHostPkg()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getHostUid()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    iget v0, v0, Ltop/niunaijun/blackbox/BlackBoxCore;->mHostUid:I

    return v0
.end method

.method public static getHostUserId()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    iget v0, v0, Ltop/niunaijun/blackbox/BlackBoxCore;->mHostUserId:I

    return v0
.end method

.method public static getPackageManager()Landroid/content/pm/PackageManager;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/BlackBoxCore;->sContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    return-object v0
.end method

.method private static getProcessName(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fa16d969af0fL    # 5.48549811736317E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v2, v0, :cond_0

    iget-object p0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    .line 3
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fa0dd969af0fL    # 5.485460407903367E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static native hideXposed()V
.end method

.method public static native init(I)V
.end method

.method private initNotificationManager()V
    .locals 5

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3f8f3d969af0fL    # 5.484278844829541E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 3
    const-wide v3, 0x60e3f8e6d969af0fL    # 5.484224375609826E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 5
    const-wide v3, 0x60e3f8d7d969af0fL    # 5.484161526510154E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isOreo()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Landroid/app/NotificationChannel;

    const/4 v4, 0x4

    invoke-direct {v3, v2, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Landroid/app/NotificationChannel;->enableLights(Z)V

    const/high16 v2, -0x10000

    invoke-virtual {v3, v2}, Landroid/app/NotificationChannel;->setLightColor(I)V

    invoke-virtual {v3, v1}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    invoke-virtual {v3, v1}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public static is64Bit()Z
    .locals 4

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isM()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    move-result v0

    return v0

    :cond_0
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3f9fad969af0fL    # 5.485380799043783E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static killApp()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda6;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda6;-><init>()V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method static synthetic lambda$killApp$0()V
    .locals 1

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    const/16 v0, 0x2710

    sput v0, Ltop/niunaijun/blackbox/BlackBoxCore;->orgCallingUid:I

    return-void
.end method

.method static synthetic lambda$lolApp$3()V
    .locals 1

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method static lambda$startLogcat$5()V
    .locals 6

    new-instance v0, Ljava/io/File;

    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3f8c9d969af0fL    # 5.484102867350461E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->deleteDir(Ljava/io/File;)I

    .line 3
    const-wide v1, 0x60e3f8bdd969af0fL    # 5.4840525880707235E158

    invoke-static {v1, v2, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    const/4 v2, 0x0

    invoke-static {v1, v2}, Ltop/niunaijun/blackbox/utils/ShellUtils;->execCommand(Ljava/lang/String;Z)Ltop/niunaijun/blackbox/utils/ShellUtils$CommandResult;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    const-wide v4, 0x60e3f8b3d969af0fL    # 5.484010688670942E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Ltop/niunaijun/blackbox/utils/ShellUtils;->execCommand(Ljava/lang/String;Z)Ltop/niunaijun/blackbox/utils/ShellUtils$CommandResult;

    return-void
.end method

.method public static loadEmptyDex()[J
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ldalvik/system/DexFile;

    sget-object v2, Ltop/niunaijun/blackbox/core/env/BEnvironment;->EMPTY_JAR:Ljava/io/File;

    invoke-direct {v1, v2}, Ldalvik/system/DexFile;-><init>(Ljava/io/File;)V

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/compat/DexFileCompat;->getCookies(Ldalvik/system/DexFile;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [J

    move v3, v0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    aput-wide v4, v2, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    new-array v0, v0, [J

    return-object v0
.end method

.method private lolApp()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda2;-><init>()V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static mHosts()Z
    .locals 1

    sget-boolean v0, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts:Z

    return v0
.end method

.method public static mainThread()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lb/c;->a()Lblack/android/app/ActivityThreadStatic;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadStatic;->currentActivityThread()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static redirectPath(Ljava/io/File;)Ljava/io/File;
    .locals 1

    .line 1
    invoke-static {}, Ltop/niunaijun/blackbox/core/IOCore;->get()Ltop/niunaijun/blackbox/core/IOCore;

    move-result-object v0

    invoke-virtual {v0, p0}, Ltop/niunaijun/blackbox/core/IOCore;->redirectPath(Ljava/io/File;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static redirectPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2
    invoke-static {}, Ltop/niunaijun/blackbox/core/IOCore;->get()Ltop/niunaijun/blackbox/core/IOCore;

    move-result-object v0

    invoke-virtual {v0, p0}, Ltop/niunaijun/blackbox/core/IOCore;->redirectPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private startLogcat()V
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda5;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda5;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public addAppLifecycleCallback(Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;)V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mAppLifecycleCallbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public checkSelfPermission(Ljava/lang/String;)Z
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public clearPackage(Ljava/lang/String;I)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->clearPackage(Ljava/lang/String;I)V

    return-void
.end method

.method public createUser(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;->createUser(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;

    move-result-object p1

    return-object p1
.end method

.method public deleteUser(I)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;->deleteUser(I)V

    return-void
.end method

.method public doAttachBaseContext(Landroid/content/Context;Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;)V
    .locals 2

    if-eqz p2, :cond_4

    invoke-static {p1}, Lme/weishu/reflection/Reflection;->unseal(Landroid/content/Context;)I

    sput-object p1, Ltop/niunaijun/blackbox/BlackBoxCore;->sContext:Landroid/content/Context;

    iput-object p2, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mClientConfiguration:Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->initNotificationManager()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ltop/niunaijun/blackbox/BlackBoxCore;->getProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->Main:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    :goto_0
    iput-object p1, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mProcessType:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    goto :goto_1

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Ltop/niunaijun/blackbox/R$string;->black_box_service_name:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->Server:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    goto :goto_0

    :cond_1
    sget-object p1, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->BAppClient:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    goto :goto_0

    :goto_1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object p1

    invoke-virtual {p1}, Ltop/niunaijun/blackbox/BlackBoxCore;->isBlackProcess()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->load()V

    :cond_2
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->isServerProcess()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p2

    const-class v0, Ltop/niunaijun/blackbox/core/system/DaemonService;

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_3
    invoke-static {}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->get()Ltop/niunaijun/blackbox/fake/hook/HookManager;

    move-result-object p1

    invoke-virtual {p1}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->init()V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1
    sget-object p2, Li/a;->a:[Ljava/lang/String;

    const-wide v0, 0x60e3f9f0d969af0fL    # 5.485338899644002E158

    invoke-static {v0, v1, p2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public doCreate()V
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->cdb()V

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->isBlackProcess()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/fake/delegate/ContentProviderDelegate;->init()V

    :cond_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->isServerProcess()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/ServiceManager;->initBlackManager()V

    .line 1
    :cond_1
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3f9d3d969af0fL    # 5.485217391384637E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0, v0}, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda0;-><init>(Ltop/niunaijun/blackbox/BlackBoxCore;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public getAppConfig()Ltop/niunaijun/blackbox/entity/AppConfig;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->appConfig:Ltop/niunaijun/blackbox/entity/AppConfig;

    return-object v0
.end method

.method public getAppLifecycleCallbacks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mAppLifecycleCallbacks:Ljava/util/List;

    return-object v0
.end method

.method public getExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-object v0
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public getHostPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mClientConfiguration:Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;->getHostPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInstalledApplications(II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Landroid/content/pm/ApplicationInfo;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->getInstalledApplications(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getInstalledPackages(II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->getInstalledPackages(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getService(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 6

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mServices:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3f932d969af0fL    # 5.484542811048162E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ltop/niunaijun/blackbox/proxy/ProxyManifest;->getBindProvider()Ljava/lang/String;

    move-result-object v2

    .line 3
    const-wide v3, 0x60e3f920d969af0fL    # 5.484467392128556E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4
    const/4 v4, 0x0

    invoke-static {v2, v3, v4, v0}, Ltop/niunaijun/blackbox/utils/provider/ProviderCall;->callSafely(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 5
    const-wide v2, 0x60e3f91dd969af0fL    # 5.484454822308622E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v0, v2}, Ltop/niunaijun/blackbox/utils/compat/BundleCompat;->getBinder(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    .line 7
    const-wide v2, 0x60e3f910d969af0fL    # 5.484400353088906E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    const-wide v4, 0x60e3f903d969af0fL    # 5.484345883869191E158

    invoke-static {v4, v5, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 11
    const-wide v4, 0x60e3f8f6d969af0fL    # 5.484291414649476E158

    invoke-static {v4, v5, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mServices:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public getUsers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/core/system/user/BUserInfo;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/fake/frameworks/BUserManager;->getUsers()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public installGms(I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 0

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/GmsCore;->installGApps(I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1
.end method

.method public installPackageAsUser(Landroid/net/Uri;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    invoke-direct {p1}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;-><init>()V

    .line 1
    sget-object p2, Li/a;->a:[Ljava/lang/String;

    const-wide v0, 0x60e3f9c7d969af0fL    # 5.4851671121049E158

    invoke-static {v0, v1, p2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p1, p2}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;->installError(Ljava/lang/String;)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->installByStorage()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->makeUriFile()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->installPackageAsUser(Ljava/lang/String;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1
.end method

.method public installPackageAsUser(Ljava/io/File;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    invoke-direct {p1}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;-><init>()V

    .line 3
    sget-object p2, Li/a;->a:[Ljava/lang/String;

    const-wide v0, 0x60e3f9c9d969af0fL    # 5.485175491984856E158

    invoke-static {v0, v1, p2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;->installError(Ljava/lang/String;)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->installByStorage()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->installPackageAsUser(Ljava/lang/String;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1
.end method

.method public installPackageAsUser(Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    invoke-direct {p1}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;-><init>()V

    .line 5
    sget-object p2, Li/a;->a:[Ljava/lang/String;

    const-wide v0, 0x60e3f9cad969af0fL    # 5.485179681924834E158

    invoke-static {v0, v1, p2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;->installError(Ljava/lang/String;)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->installBySystem()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->installPackageAsUser(Ljava/lang/String;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p2, Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    invoke-direct {p2}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;->installError(Ljava/lang/String;)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1
.end method

.method public installXPModule(Landroid/net/Uri;)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 3

    .line 1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->installByStorage()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->makeXposed()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->makeUriFile()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    const/4 v2, -0x4

    invoke-virtual {v0, p1, v1, v2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->installPackageAsUser(Ljava/lang/String;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1
.end method

.method public installXPModule(Ljava/io/File;)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 3

    .line 2
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->installByStorage()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->makeXposed()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    const/4 v2, -0x4

    invoke-virtual {v0, p1, v1, v2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->installPackageAsUser(Ljava/lang/String;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1
.end method

.method public installXPModule(Ljava/lang/String;)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 3

    .line 3
    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->installBySystem()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    invoke-virtual {v1}, Ltop/niunaijun/blackbox/entity/pm/InstallOption;->makeXposed()Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    move-result-object v1

    const/4 v2, -0x4

    invoke-virtual {v0, p1, v1, v2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->installPackageAsUser(Ljava/lang/String;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;->installError(Ljava/lang/String;)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object p1

    return-object p1
.end method

.method public isBlackProcess()Z
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mProcessType:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    sget-object v1, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->BAppClient:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isHideRoot()Z
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mClientConfiguration:Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;->isHideRoot()Z

    move-result v0

    return v0
.end method

.method public isHideXposed()Z
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mClientConfiguration:Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;->isHideXposed()Z

    move-result v0

    return v0
.end method

.method public isInstallGms(I)Z
    .locals 0

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/GmsCore;->isInstalledGoogleService(I)Z

    move-result p1

    return p1
.end method

.method public isInstalled(Ljava/lang/String;I)Z
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->isInstalled(Ljava/lang/String;I)Z

    move-result p1

    return p1
.end method

.method public isInstalledXposedModule(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, -0x4

    invoke-virtual {p0, p1, v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->isInstalled(Ljava/lang/String;I)Z

    move-result p1

    return p1
.end method

.method public isMainProcess()Z
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mProcessType:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    sget-object v1, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->Main:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isServerProcess()Z
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mProcessType:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    sget-object v1, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->Server:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSupportGms()Z
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/core/GmsCore;->isSupportGms()Z

    move-result v0

    return v0
.end method

.method public isXposedModule(Ljava/io/File;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ltop/niunaijun/blackbox/utils/compat/XposedParserCompat;->isXPModule(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method lambda$doCreate$1$top-niunaijun-blackbox-BlackBoxCore(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->lolApp()V

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1
    sget-object p1, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3f853d969af0fL    # 5.483608454433044E158

    invoke-static {v1, v2, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    const/4 v3, 0x1

    if-ge v1, v2, :cond_2

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v0, :cond_3

    invoke-direct {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->lolApp()V

    goto :goto_2

    :cond_3
    sput-boolean v3, Ltop/niunaijun/blackbox/BlackBoxCore;->clientpkg:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-direct {p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->lolApp()V

    :goto_2
    return-void
.end method

.method lambda$doCreate$2$top-niunaijun-blackbox-BlackBoxCore(Ljava/lang/String;)V
    .locals 5

    .line 0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3f8a8d969af0fL    # 5.483964599331183E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    const/16 v2, 0x1388

    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 3
    const-wide v2, 0x60e3f866d969af0fL    # 5.483688063292628E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    const-wide v3, 0x60e3f85bd969af0fL    # 5.483641973952869E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v2, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda3;

    invoke-direct {v2, p0, v0, p1}, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda3;-><init>(Ltop/niunaijun/blackbox/BlackBoxCore;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda4;

    invoke-direct {v0, p0}, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda4;-><init>(Ltop/niunaijun/blackbox/BlackBoxCore;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_1
    return-void
.end method

.method synthetic lambda$launchApk$4$top-niunaijun-blackbox-BlackBoxCore(Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/BlackBoxCore;->xoxi(Landroid/content/Context;)V

    return-void
.end method

.method public launchApk(Ljava/lang/String;I)Z
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-boolean v0, Ltop/niunaijun/blackbox/BlackBoxCore;->clientpkg:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->getLaunchIntentForPackage(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p1, p2}, Ltop/niunaijun/blackbox/BlackBoxCore;->startActivity(Landroid/content/Intent;I)V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p1}, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda1;-><init>(Ltop/niunaijun/blackbox/BlackBoxCore;Landroid/content/Context;)V

    const-wide/16 v1, 0x4650

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 p1, 0x1

    return p1
.end method

.method public removeAppLifecycleCallback(Ltop/niunaijun/blackbox/app/configuration/AppLifecycleCallback;)V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mAppLifecycleCallbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public requestInstallPackage(Ljava/io/File;I)Z
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mClientConfiguration:Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;->requestInstallPackage(Ljava/io/File;I)Z

    move-result p1

    return p1
.end method

.method public setExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public startActivity(Landroid/content/Intent;I)V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore;->mClientConfiguration:Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;->isEnableLauncherActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ltop/niunaijun/blackbox/app/LauncherActivity;->launch(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->startActivity(Landroid/content/Intent;I)V

    :goto_0
    return-void
.end method

.method public stopPackage(Ljava/lang/String;I)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->stopPackage(Ljava/lang/String;I)V

    return-void
.end method

.method public uninstallGms(I)Z
    .locals 0

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/GmsCore;->uninstallGApps(I)V

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/GmsCore;->isInstalledGoogleService(I)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public uninstallPackage(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->uninstallPackage(Ljava/lang/String;)V

    return-void
.end method

.method public uninstallPackageAsUser(Ljava/lang/String;I)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mHosts()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBPackageManager()Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltop/niunaijun/blackbox/fake/frameworks/BPackageManager;->uninstallPackageAsUser(Ljava/lang/String;I)V

    return-void
.end method

.method public uninstallXPModule(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/BlackBoxCore;->uninstallPackage(Ljava/lang/String;)V

    return-void
.end method

.method public xoxi(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->get()Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->doAttachBaseContext(Landroid/content/Context;)V

    invoke-static {}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->startDownload()V

    return-void
.end method
