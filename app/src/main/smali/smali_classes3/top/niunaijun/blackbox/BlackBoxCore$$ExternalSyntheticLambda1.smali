.class public final synthetic Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ltop/niunaijun/blackbox/BlackBoxCore;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ltop/niunaijun/blackbox/BlackBoxCore;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda1;->f$0:Ltop/niunaijun/blackbox/BlackBoxCore;

    iput-object p2, p0, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda1;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda1;->f$0:Ltop/niunaijun/blackbox/BlackBoxCore;

    iget-object v1, p0, Ltop/niunaijun/blackbox/BlackBoxCore$$ExternalSyntheticLambda1;->f$1:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ltop/niunaijun/blackbox/BlackBoxCore;->lambda$launchApk$4$top-niunaijun-blackbox-BlackBoxCore(Landroid/content/Context;)V

    return-void
.end method
