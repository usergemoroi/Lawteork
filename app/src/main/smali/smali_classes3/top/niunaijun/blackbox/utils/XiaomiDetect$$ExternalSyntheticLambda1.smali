.class public final synthetic Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ltop/niunaijun/blackbox/utils/XiaomiDetect;

.field public final synthetic f$1:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Ltop/niunaijun/blackbox/utils/XiaomiDetect;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda1;->f$0:Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    iput-object p2, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda1;->f$1:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda1;->f$0:Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    iget-object v1, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$$ExternalSyntheticLambda1;->f$1:Ljava/io/File;

    invoke-virtual {v0, v1}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->lambda$startExecutionCycle$2$top-niunaijun-blackbox-utils-XiaomiDetect(Ljava/io/File;)V

    return-void
.end method
