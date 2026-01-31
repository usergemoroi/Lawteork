.class Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/utils/XiaomiDetect;->startExecutionCycle(Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/utils/XiaomiDetect;

.field final synthetic val$file:Ljava/io/File;

.field final synthetic val$handler:Landroid/os/Handler;

.field final synthetic val$maxDuration:J

.field final synthetic val$startTime:J


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/utils/XiaomiDetect;Ljava/io/File;JJLandroid/os/Handler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->this$0:Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    iput-object p2, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->val$file:Ljava/io/File;

    iput-wide p3, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->val$startTime:J

    iput-wide p5, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->val$maxDuration:J

    iput-object p7, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->this$0:Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    iget-object v1, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->val$file:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->access$000(Ltop/niunaijun/blackbox/utils/XiaomiDetect;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->val$startTime:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->val$maxDuration:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Ltop/niunaijun/blackbox/utils/XiaomiDetect$1;->val$handler:Landroid/os/Handler;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->get()Ltop/niunaijun/blackbox/utils/XiaomiDetect;

    move-result-object v0

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/XiaomiDetect;->access$100(Ltop/niunaijun/blackbox/utils/XiaomiDetect;)V

    :goto_0
    return-void
.end method
