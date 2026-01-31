.class Ltop/niunaijun/blackbox/app/BActivityThread$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/app/BActivityThread;->initProcess(Ltop/niunaijun/blackbox/entity/AppConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/app/BActivityThread;

.field final synthetic val$iBinder:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/app/BActivityThread;Landroid/os/IBinder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ltop/niunaijun/blackbox/app/BActivityThread$1;->this$0:Ltop/niunaijun/blackbox/app/BActivityThread;

    iput-object p2, p0, Ltop/niunaijun/blackbox/app/BActivityThread$1;->val$iBinder:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->access$000()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/app/BActivityThread$1;->val$iBinder:Landroid/os/IBinder;

    const/4 v2, 0x0

    invoke-interface {v1, p0, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :goto_0
    :try_start_1
    iget-object v1, p0, Ltop/niunaijun/blackbox/app/BActivityThread$1;->this$0:Ltop/niunaijun/blackbox/app/BActivityThread;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ltop/niunaijun/blackbox/app/BActivityThread;->access$102(Ltop/niunaijun/blackbox/app/BActivityThread;Ltop/niunaijun/blackbox/entity/AppConfig;)Ltop/niunaijun/blackbox/entity/AppConfig;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
