.class public final Lcom/itsaky/androidide/logsender/socket/SignalCommand;
.super Lcom/itsaky/androidide/logsender/socket/AbstractSocketCommand;
.source "SignalCommand.java"


# static fields
.field public static final STOP:Lcom/itsaky/androidide/logsender/socket/ISocketCommand;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;

    const-string/jumbo v1, "stop"

    invoke-direct {v0, v1}, Lcom/itsaky/androidide/logsender/socket/SignalCommand;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;->STOP:Lcom/itsaky/androidide/logsender/socket/ISocketCommand;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .line 32
    invoke-direct {p0}, Lcom/itsaky/androidide/logsender/socket/AbstractSocketCommand;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;->name:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .line 43
    if-ne p0, p1, :cond_0

    .line 44
    const/4 v0, 0x1

    return v0

    .line 46
    :cond_0
    instance-of v0, p1, Lcom/itsaky/androidide/logsender/socket/SignalCommand;

    if-nez v0, :cond_1

    .line 47
    const/4 v0, 0x0

    return v0

    .line 49
    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;

    .line 50
    .local v0, "that":Lcom/itsaky/androidide/logsender/socket/SignalCommand;
    iget-object v1, p0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;->name:Ljava/lang/String;

    iget-object v2, v0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;->name:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    return v1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/socket/SignalCommand;->name:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
