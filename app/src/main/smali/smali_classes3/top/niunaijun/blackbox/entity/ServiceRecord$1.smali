.class Ltop/niunaijun/blackbox/entity/ServiceRecord$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/entity/ServiceRecord;->addBinder(Landroid/content/Intent;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/entity/ServiceRecord;

.field final synthetic val$filterComparison:Landroid/content/Intent$FilterComparison;

.field final synthetic val$iBinder:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/entity/ServiceRecord;Landroid/os/IBinder;Landroid/content/Intent$FilterComparison;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ltop/niunaijun/blackbox/entity/ServiceRecord$1;->this$0:Ltop/niunaijun/blackbox/entity/ServiceRecord;

    iput-object p2, p0, Ltop/niunaijun/blackbox/entity/ServiceRecord$1;->val$iBinder:Landroid/os/IBinder;

    iput-object p3, p0, Ltop/niunaijun/blackbox/entity/ServiceRecord$1;->val$filterComparison:Landroid/content/Intent$FilterComparison;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/entity/ServiceRecord$1;->val$iBinder:Landroid/os/IBinder;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/entity/ServiceRecord$1;->this$0:Ltop/niunaijun/blackbox/entity/ServiceRecord;

    invoke-static {v0}, Ltop/niunaijun/blackbox/entity/ServiceRecord;->access$000(Ltop/niunaijun/blackbox/entity/ServiceRecord;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ltop/niunaijun/blackbox/entity/ServiceRecord$1;->val$filterComparison:Landroid/content/Intent$FilterComparison;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
