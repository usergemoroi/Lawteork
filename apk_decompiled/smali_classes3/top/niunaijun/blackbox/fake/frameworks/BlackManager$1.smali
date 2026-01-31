.class Ltop/niunaijun/blackbox/fake/frameworks/BlackManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager$1;->this$0:Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager$1;->this$0:Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;

    invoke-static {v0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->access$000(Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;)Landroid/os/IInterface;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager$1;->this$0:Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->access$002(Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;Landroid/os/IInterface;)Landroid/os/IInterface;

    return-void
.end method
