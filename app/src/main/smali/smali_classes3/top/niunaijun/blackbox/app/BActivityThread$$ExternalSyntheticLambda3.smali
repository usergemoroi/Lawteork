.class public final synthetic Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroid/content/Intent;

.field public final synthetic f$1:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda3;->f$0:Landroid/content/Intent;

    iput-object p2, p0, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda3;->f$1:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda3;->f$0:Landroid/content/Intent;

    iget-object v1, p0, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda3;->f$1:Landroid/os/IBinder;

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/app/BActivityThread;->lambda$handleNewIntent$2(Landroid/content/Intent;Landroid/os/IBinder;)V

    return-void
.end method
