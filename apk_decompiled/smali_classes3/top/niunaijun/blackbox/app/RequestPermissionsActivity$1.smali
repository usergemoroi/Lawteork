.class Ltop/niunaijun/blackbox/app/RequestPermissionsActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/app/RequestPermissionsActivity$1;->this$0:Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/RequestPermissionsActivity$1;->this$0:Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;

    const-string v1, "Request permission failed."

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
