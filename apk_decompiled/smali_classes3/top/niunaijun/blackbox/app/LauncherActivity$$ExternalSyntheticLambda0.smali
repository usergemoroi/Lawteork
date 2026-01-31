.class public final synthetic Ltop/niunaijun/blackbox/app/LauncherActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroid/content/Intent;

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/app/LauncherActivity$$ExternalSyntheticLambda0;->f$0:Landroid/content/Intent;

    iput p2, p0, Ltop/niunaijun/blackbox/app/LauncherActivity$$ExternalSyntheticLambda0;->f$1:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/LauncherActivity$$ExternalSyntheticLambda0;->f$0:Landroid/content/Intent;

    iget v1, p0, Ltop/niunaijun/blackbox/app/LauncherActivity$$ExternalSyntheticLambda0;->f$1:I

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/app/LauncherActivity;->lambda$onCreate$0(Landroid/content/Intent;I)V

    return-void
.end method
