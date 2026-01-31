.class public Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static final REQUEST_PERMISSION_CODE:I = 0x3e4


# instance fields
.field private mCallBack:Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static request(Landroid/content/Context;[Ljava/lang/String;Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v1, "permissions"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    const-string p2, "callback"

    invoke-static {v0, p2, p1}, Ltop/niunaijun/blackbox/utils/BundleUtils;->putBinder(Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    sget v0, Ltop/niunaijun/blackbox/BlackBoxCore;->orgCallingUid:I

    const/16 v1, 0x2710

    if-le v0, v1, :cond_3

    const-string v0, "permissions"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "callback"

    invoke-static {p1, v1}, Ltop/niunaijun/blackbox/utils/BundleUtils;->getBinder(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult$Stub;->asInterface(Landroid/os/IBinder;)Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult;

    move-result-object p1

    iput-object p1, p0, Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;->mCallBack:Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult;

    const/16 p1, 0x3e4

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    iget-object v0, p0, Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;->mCallBack:Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult;->onResult(I[Ljava/lang/String;[I)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ltop/niunaijun/blackbox/app/RequestPermissionsActivity$1;

    invoke-direct {p1, p0}, Ltop/niunaijun/blackbox/app/RequestPermissionsActivity$1;-><init>(Ltop/niunaijun/blackbox/app/RequestPermissionsActivity;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
