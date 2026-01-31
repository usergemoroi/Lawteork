.class Ltop/niunaijun/blackbox/core/system/am/ActiveServices$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->bindService(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;I)Landroid/content/Intent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

.field final synthetic val$binder:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/am/ActiveServices;Landroid/os/IBinder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$2;->this$0:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$2;->val$binder:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$2;->val$binder:Landroid/os/IBinder;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$2;->this$0:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-static {v0}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;->access$300(Ltop/niunaijun/blackbox/core/system/am/ActiveServices;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices$2;->val$binder:Landroid/os/IBinder;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
