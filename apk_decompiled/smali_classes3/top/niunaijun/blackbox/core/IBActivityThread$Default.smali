.class public Ltop/niunaijun/blackbox/core/IBActivityThread$Default;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/IBActivityThread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/core/IBActivityThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireContentProviderClient(Landroid/content/pm/ProviderInfo;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bindApplication()V
    .locals 0

    return-void
.end method

.method public finishActivity(Landroid/os/IBinder;)V
    .locals 0

    return-void
.end method

.method public getActivityThread()Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public handleNewIntent(Landroid/os/IBinder;Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public peekService(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public restartJobService(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public scheduleReceiver(Ltop/niunaijun/blackbox/entity/am/ReceiverData;)V
    .locals 0

    return-void
.end method

.method public stopService(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method
