.class Lkentos/loader/floating/Overlay$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkentos/loader/floating/Overlay;->Start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final this$0:Lkentos/loader/floating/Overlay;


# direct methods
.method constructor <init>(Lkentos/loader/floating/Overlay;)V
    .locals 0

    iput-object p1, p0, Lkentos/loader/floating/Overlay$2;->this$0:Lkentos/loader/floating/Overlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-wide/16 v0, 0x0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lkentos/loader/floating/Overlay$2;->this$0:Lkentos/loader/floating/Overlay;

    sget-object v1, Lkentos/loader/activity/MainActivity;->socket:Ljava/lang/String;

    invoke-static {v0, v1}, Lkentos/loader/floating/Overlay;->access$100(Lkentos/loader/floating/Overlay;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method
