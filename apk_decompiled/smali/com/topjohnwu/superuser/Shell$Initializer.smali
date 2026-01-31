.class public Lcom/topjohnwu/superuser/Shell$Initializer;
.super Ljava/lang/Object;
.source "Shell.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/topjohnwu/superuser/Shell;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Initializer"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 614
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInit(Landroid/content/Context;Lcom/topjohnwu/superuser/Shell;)Z
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "shell"    # Lcom/topjohnwu/superuser/Shell;

    .line 621
    const/4 v0, 0x1

    return v0
.end method
