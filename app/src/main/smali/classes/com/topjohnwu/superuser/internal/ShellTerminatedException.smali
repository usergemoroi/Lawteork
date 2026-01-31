.class Lcom/topjohnwu/superuser/internal/ShellTerminatedException;
.super Ljava/io/IOException;
.source "ShellImpl.java"


# direct methods
.method constructor <init>()V
    .locals 1

    .line 45
    const-string v0, "Shell terminated unexpectedly"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 46
    return-void
.end method
