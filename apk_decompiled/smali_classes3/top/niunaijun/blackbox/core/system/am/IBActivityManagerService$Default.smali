.class public Ltop/niunaijun/blackbox/core/system/am/IBActivityManagerService$Default;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/am/IBActivityManagerService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/core/system/am/IBActivityManagerService;
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

.method public bindService(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;I)Landroid/content/Intent;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public finishBroadcast(Ltop/niunaijun/blackbox/entity/am/PendingResultData;)V
    .locals 0

    return-void
.end method

.method public getCallingActivity(Landroid/os/IBinder;I)Landroid/content/ComponentName;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getCallingPackage(Landroid/os/IBinder;I)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getIntentSender(Landroid/os/IBinder;Ljava/lang/String;II)V
    .locals 0

    return-void
.end method

.method public getPackageForIntentSender(Landroid/os/IBinder;I)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getRunningAppProcesses(Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/am/RunningAppProcessInfo;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getRunningServices(Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/am/RunningServiceInfo;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getUidForIntentSender(Landroid/os/IBinder;I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public initProcess(Ljava/lang/String;Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/AppConfig;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onActivityCreated(ILandroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/os/IBinder;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/os/IBinder;)V
    .locals 0

    return-void
.end method

.method public onFinishActivity(Landroid/os/IBinder;)V
    .locals 0

    return-void
.end method

.method public onServiceDestroy(Landroid/content/Intent;I)V
    .locals 0

    return-void
.end method

.method public onServiceUnbind(Landroid/content/Intent;I)Ltop/niunaijun/blackbox/entity/UnbindRecord;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onStartCommand(Landroid/content/Intent;I)V
    .locals 0

    return-void
.end method

.method public peekService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public restartProcess(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public scheduleBroadcastReceiver(Landroid/content/Intent;Ltop/niunaijun/blackbox/entity/am/PendingResultData;I)V
    .locals 0

    return-void
.end method

.method public sendBroadcast(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/Intent;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public startActivities(I[Landroid/content/Intent;[Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public startActivity(Landroid/content/Intent;I)V
    .locals 0

    return-void
.end method

.method public startActivityAms(ILandroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;IILandroid/os/Bundle;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public startService(Landroid/content/Intent;Ljava/lang/String;ZI)Landroid/content/ComponentName;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public stopService(Landroid/content/Intent;Ljava/lang/String;I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public stopServiceToken(Landroid/content/ComponentName;Landroid/os/IBinder;I)V
    .locals 0

    return-void
.end method

.method public unbindService(Landroid/os/IBinder;I)V
    .locals 0

    return-void
.end method
