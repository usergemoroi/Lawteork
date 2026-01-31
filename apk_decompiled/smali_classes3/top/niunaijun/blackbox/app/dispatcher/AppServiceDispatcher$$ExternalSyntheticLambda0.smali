.class public final synthetic Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ltop/niunaijun/blackbox/entity/ServiceRecord;


# direct methods
.method public synthetic constructor <init>(Ltop/niunaijun/blackbox/entity/ServiceRecord;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher$$ExternalSyntheticLambda0;->f$0:Ltop/niunaijun/blackbox/entity/ServiceRecord;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher$$ExternalSyntheticLambda0;->f$0:Ltop/niunaijun/blackbox/entity/ServiceRecord;

    invoke-static {v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->lambda$stopService$0(Ltop/niunaijun/blackbox/entity/ServiceRecord;)V

    return-void
.end method
