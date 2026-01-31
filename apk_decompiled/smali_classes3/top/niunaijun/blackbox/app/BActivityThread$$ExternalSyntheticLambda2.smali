.class public final synthetic Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ltop/niunaijun/blackbox/app/BActivityThread;

.field public final synthetic f$1:Ltop/niunaijun/blackbox/entity/am/ReceiverData;


# direct methods
.method public synthetic constructor <init>(Ltop/niunaijun/blackbox/app/BActivityThread;Ltop/niunaijun/blackbox/entity/am/ReceiverData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda2;->f$0:Ltop/niunaijun/blackbox/app/BActivityThread;

    iput-object p2, p0, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda2;->f$1:Ltop/niunaijun/blackbox/entity/am/ReceiverData;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda2;->f$0:Ltop/niunaijun/blackbox/app/BActivityThread;

    iget-object v1, p0, Ltop/niunaijun/blackbox/app/BActivityThread$$ExternalSyntheticLambda2;->f$1:Ltop/niunaijun/blackbox/entity/am/ReceiverData;

    invoke-virtual {v0, v1}, Ltop/niunaijun/blackbox/app/BActivityThread;->lambda$scheduleReceiver$3$top-niunaijun-blackbox-app-BActivityThread(Ltop/niunaijun/blackbox/entity/am/ReceiverData;)V

    return-void
.end method
