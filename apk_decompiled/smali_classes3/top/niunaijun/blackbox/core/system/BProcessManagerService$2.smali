.class Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->attachClientL(Ltop/niunaijun/blackbox/core/system/ProcessRecord;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

.field final synthetic val$app:Ltop/niunaijun/blackbox/core/system/ProcessRecord;

.field final synthetic val$appThread:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/BProcessManagerService;Ltop/niunaijun/blackbox/core/system/ProcessRecord;Landroid/os/IBinder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;->this$0:Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;->val$app:Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iput-object p3, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;->val$appThread:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "App Died: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;->val$app:Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    iget-object v1, v1, Ltop/niunaijun/blackbox/core/system/ProcessRecord;->processName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BProcessManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;->val$appThread:Landroid/os/IBinder;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;->this$0:Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$2;->val$app:Ltop/niunaijun/blackbox/core/system/ProcessRecord;

    invoke-virtual {v0, v1}, Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->onProcessDie(Ltop/niunaijun/blackbox/core/system/ProcessRecord;)V

    return-void
.end method
