.class public Ltop/niunaijun/blackbox/proxy/ProxyBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "ProxyBroadcastReceiver"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    invoke-static {p2}, Ltop/niunaijun/blackbox/proxy/record/ProxyBroadcastRecord;->create(Landroid/content/Intent;)Ltop/niunaijun/blackbox/proxy/record/ProxyBroadcastRecord;

    move-result-object p1

    iget-object p2, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyBroadcastRecord;->mIntent:Landroid/content/Intent;

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object p2

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getBActivityManager()Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;

    move-result-object v0

    iget-object v1, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyBroadcastRecord;->mIntent:Landroid/content/Intent;

    new-instance v2, Ltop/niunaijun/blackbox/entity/am/PendingResultData;

    invoke-direct {v2, p2}, Ltop/niunaijun/blackbox/entity/am/PendingResultData;-><init>(Landroid/content/BroadcastReceiver$PendingResult;)V

    iget p1, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyBroadcastRecord;->mUserId:I

    invoke-virtual {v0, v1, v2, p1}, Ltop/niunaijun/blackbox/fake/frameworks/BActivityManager;->scheduleBroadcastReceiver(Landroid/content/Intent;Ltop/niunaijun/blackbox/entity/am/PendingResultData;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    :goto_0
    return-void
.end method
