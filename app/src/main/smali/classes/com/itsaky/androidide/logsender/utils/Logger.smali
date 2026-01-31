.class public Lcom/itsaky/androidide/logsender/utils/Logger;
.super Ljava/lang/Object;
.source "Logger.java"


# static fields
.field public static final LOG:Lcom/itsaky/androidide/utils/ILogger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const-string v0, "LogSender"

    invoke-static {v0}, Lcom/itsaky/androidide/utils/ILogger;->newInstance(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object v0

    sput-object v0, Lcom/itsaky/androidide/logsender/utils/Logger;->LOG:Lcom/itsaky/androidide/utils/ILogger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs debug([Ljava/lang/Object;)V
    .locals 1
    .param p0, "messages"    # [Ljava/lang/Object;

    .line 43
    sget-object v0, Lcom/itsaky/androidide/logsender/utils/Logger;->LOG:Lcom/itsaky/androidide/utils/ILogger;

    invoke-virtual {v0, p0}, Lcom/itsaky/androidide/utils/ILogger;->debug([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    .line 44
    return-void
.end method

.method public static varargs error([Ljava/lang/Object;)V
    .locals 1
    .param p0, "messages"    # [Ljava/lang/Object;

    .line 31
    sget-object v0, Lcom/itsaky/androidide/logsender/utils/Logger;->LOG:Lcom/itsaky/androidide/utils/ILogger;

    invoke-virtual {v0, p0}, Lcom/itsaky/androidide/utils/ILogger;->error([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    .line 32
    return-void
.end method

.method public static varargs info([Ljava/lang/Object;)V
    .locals 1
    .param p0, "messages"    # [Ljava/lang/Object;

    .line 39
    sget-object v0, Lcom/itsaky/androidide/logsender/utils/Logger;->LOG:Lcom/itsaky/androidide/utils/ILogger;

    invoke-virtual {v0, p0}, Lcom/itsaky/androidide/utils/ILogger;->info([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    .line 40
    return-void
.end method

.method public static varargs warn([Ljava/lang/Object;)V
    .locals 1
    .param p0, "messages"    # [Ljava/lang/Object;

    .line 35
    sget-object v0, Lcom/itsaky/androidide/logsender/utils/Logger;->LOG:Lcom/itsaky/androidide/utils/ILogger;

    invoke-virtual {v0, p0}, Lcom/itsaky/androidide/utils/ILogger;->warn([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    .line 36
    return-void
.end method
