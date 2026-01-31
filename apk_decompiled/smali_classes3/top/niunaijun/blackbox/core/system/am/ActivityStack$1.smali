.class Ltop/niunaijun/blackbox/core/system/am/ActivityStack$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/core/system/am/ActivityStack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/am/ActivityStack;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack$1;->this$0:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ltop/niunaijun/blackbox/core/system/am/ActivityRecord;

    if-eqz p1, :cond_1

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack$1;->this$0:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    invoke-static {v0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;->access$000(Ltop/niunaijun/blackbox/core/system/am/ActivityStack;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method
