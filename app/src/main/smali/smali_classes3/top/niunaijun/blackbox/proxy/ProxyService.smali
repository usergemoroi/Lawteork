.class public Ltop/niunaijun/blackbox/proxy/ProxyService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/proxy/ProxyService$P49;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P48;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P47;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P46;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P45;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P44;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P43;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P42;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P41;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P40;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P39;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P38;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P37;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P36;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P35;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P34;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P33;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P32;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P31;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P30;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P29;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P28;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P27;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P26;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P25;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P24;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P23;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P22;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P21;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P20;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P19;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P18;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P17;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P16;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P15;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P14;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P13;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P12;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P11;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P10;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P9;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P8;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P7;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P6;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P5;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P4;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P3;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P2;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P1;,
        Ltop/niunaijun/blackbox/proxy/ProxyService$P0;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "StubService"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private showNotification()V
    .locals 4

    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".blackbox_proxy"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isOreo()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->onDestroy()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onLowMemory()V

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->onLowMemory()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->onStartCommand(Landroid/content/Intent;II)I

    const/4 p1, 0x2

    return p1
.end method

.method public onTrimMemory(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Service;->onTrimMemory(I)V

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->onTrimMemory(I)V

    return-void
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppServiceDispatcher;->onUnbind(Landroid/content/Intent;)Z

    const/4 p1, 0x0

    return p1
.end method
