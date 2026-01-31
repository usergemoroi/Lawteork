.class public Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;
.super Lcom/itsaky/androidide/logsender/socket/AbstractSocketCommand;
.source "SenderInfoCommand.java"


# static fields
.field public static final NAME:Ljava/lang/String; = "sender"


# instance fields
.field public final packageName:Ljava/lang/String;

.field public final senderId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "senderId"    # Ljava/lang/String;
    .param p2, "packageName"    # Ljava/lang/String;

    .line 31
    invoke-direct {p0}, Lcom/itsaky/androidide/logsender/socket/AbstractSocketCommand;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;->senderId:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;->packageName:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 38
    const-string/jumbo v0, "sender"

    return-object v0
.end method

.method protected getParams()[Ljava/lang/String;
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;->senderId:Ljava/lang/String;

    iget-object v1, p0, Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;->packageName:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
