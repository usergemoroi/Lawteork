.class Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService$1;->this$0:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService$1;->this$0:Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->access$000(Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;)Ltop/niunaijun/blackbox/core/system/pm/Settings;

    move-result-object p1

    invoke-virtual {p1}, Ltop/niunaijun/blackbox/core/system/pm/Settings;->scanPackage()V

    :cond_1
    return-void
.end method
