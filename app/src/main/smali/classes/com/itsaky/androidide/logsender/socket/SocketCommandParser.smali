.class public final Lcom/itsaky/androidide/logsender/socket/SocketCommandParser;
.super Ljava/lang/Object;
.source "SocketCommandParser.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static create(Ljava/lang/String;)Lcom/itsaky/androidide/logsender/socket/ISocketCommand;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 43
    sget-object v0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;->STOP:Lcom/itsaky/androidide/logsender/socket/ISocketCommand;

    invoke-interface {v0}, Lcom/itsaky/androidide/logsender/socket/ISocketCommand;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    sget-object v0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;->STOP:Lcom/itsaky/androidide/logsender/socket/ISocketCommand;

    return-object v0

    .line 47
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static createParameterized([Ljava/lang/String;)Lcom/itsaky/androidide/logsender/socket/ISocketCommand;
    .locals 4
    .param p0, "segments"    # [Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    aget-object v0, p0, v0

    .line 52
    .local v0, "command":Ljava/lang/String;
    const-string/jumbo v1, "sender"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 56
    const/4 v1, 0x1

    :try_start_0
    aget-object v3, p0, v1

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    nop

    .line 61
    new-instance v2, Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;

    aget-object v1, p0, v1

    const/4 v3, 0x2

    aget-object v3, p0, v3

    invoke-direct {v2, v1, v3}, Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 57
    :catch_0
    move-exception v1

    .line 58
    .local v1, "e":Ljava/lang/Exception;
    return-object v2

    .line 63
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_0
    return-object v2
.end method

.method public static parse(Ljava/lang/String;)Lcom/itsaky/androidide/logsender/socket/ISocketCommand;
    .locals 3
    .param p0, "line"    # Ljava/lang/String;

    .line 29
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 30
    sget-object v0, Lcom/itsaky/androidide/logsender/socket/ISocketCommand;->PARAM_DELIMITER:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    invoke-static {p0}, Lcom/itsaky/androidide/logsender/socket/SocketCommandParser;->create(Ljava/lang/String;)Lcom/itsaky/androidide/logsender/socket/ISocketCommand;

    move-result-object v0

    return-object v0

    .line 34
    :cond_0
    sget-object v0, Lcom/itsaky/androidide/logsender/socket/ISocketCommand;->PARAM_DELIMITER:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 35
    .local v0, "segments":[Ljava/lang/String;
    array-length v1, v0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_1

    .line 36
    invoke-static {v0}, Lcom/itsaky/androidide/logsender/socket/SocketCommandParser;->createParameterized([Ljava/lang/String;)Lcom/itsaky/androidide/logsender/socket/ISocketCommand;

    move-result-object v1

    return-object v1

    .line 39
    :cond_1
    const/4 v1, 0x0

    return-object v1
.end method
