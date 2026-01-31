.class public interface abstract Lcom/itsaky/androidide/logsender/socket/ISocketCommand;
.super Ljava/lang/Object;
.source "ISocketCommand.java"


# static fields
.field public static final PARAM_DELIMITER:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    sget-object v0, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    sput-object v0, Lcom/itsaky/androidide/logsender/socket/ISocketCommand;->PARAM_DELIMITER:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract getName()Ljava/lang/String;
.end method
