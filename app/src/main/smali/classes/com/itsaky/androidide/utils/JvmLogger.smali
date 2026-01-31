.class public Lcom/itsaky/androidide/utils/JvmLogger;
.super Lcom/itsaky/androidide/utils/ILogger;
.source "JvmLogger.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/itsaky/androidide/utils/JvmLogger$LogInterceptor;
    }
.end annotation


# static fields
.field public static interceptor:Lcom/itsaky/androidide/utils/JvmLogger$LogInterceptor;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "tag"    # Ljava/lang/String;

    .line 32
    invoke-direct {p0, p1}, Lcom/itsaky/androidide/utils/ILogger;-><init>(Ljava/lang/String;)V

    .line 33
    return-void
.end method


# virtual methods
.method protected doLog(Lcom/itsaky/androidide/utils/ILogger$Level;Ljava/lang/String;)V
    .locals 3
    .param p1, "level"    # Lcom/itsaky/androidide/utils/ILogger$Level;
    .param p2, "message"    # Ljava/lang/String;

    .line 37
    sget-object v0, Lcom/itsaky/androidide/utils/JvmLogger;->interceptor:Lcom/itsaky/androidide/utils/JvmLogger$LogInterceptor;

    if-eqz v0, :cond_0

    .line 38
    iget-object v1, p0, Lcom/itsaky/androidide/utils/JvmLogger;->TAG:Ljava/lang/String;

    invoke-interface {v0, p1, v1, p2}, Lcom/itsaky/androidide/utils/JvmLogger$LogInterceptor;->onLog(Lcom/itsaky/androidide/utils/ILogger$Level;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    iget-object v1, p0, Lcom/itsaky/androidide/utils/JvmLogger;->TAG:Ljava/lang/String;

    .line 42
    const/16 v2, 0x19

    invoke-static {v1, v2}, Lcom/itsaky/androidide/utils/LogTagUtils;->trimTagIfNeeded(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iget-char v2, p1, Lcom/itsaky/androidide/utils/ILogger$Level;->levelChar:C

    .line 43
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    filled-new-array {v1, v2, p2}, [Ljava/lang/Object;

    move-result-object v1

    .line 40
    const-string v2, "%-25s %-2s %s%n"

    invoke-virtual {v0, v2, v1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 47
    :goto_0
    return-void
.end method
