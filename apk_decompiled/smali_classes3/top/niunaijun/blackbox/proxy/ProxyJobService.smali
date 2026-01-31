.class public Ltop/niunaijun/blackbox/proxy/ProxyJobService;
.super Landroid/app/job/JobService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P49;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P48;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P47;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P46;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P45;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P44;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P43;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P42;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P41;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P40;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P39;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P38;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P37;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P36;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P35;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P34;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P33;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P32;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P31;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P30;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P29;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P28;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P27;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P26;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P25;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P24;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P23;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P22;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P21;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P20;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P19;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P18;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P17;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P16;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P15;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P14;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P13;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P12;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P11;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P10;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P9;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P8;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P7;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P6;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P5;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P4;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P3;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P2;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P1;,
        Ltop/niunaijun/blackbox/proxy/ProxyJobService$P0;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "StubJobService"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/job/JobService;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/job/JobService;->onDestroy()V

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->onDestroy()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/job/JobService;->onLowMemory()V

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->onLowMemory()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method public onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->onStartJob(Landroid/app/job/JobParameters;)Z

    move-result p1

    return p1
.end method

.method public onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->onStopJob(Landroid/app/job/JobParameters;)Z

    move-result p1

    return p1
.end method

.method public onTrimMemory(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/job/JobService;->onTrimMemory(I)V

    invoke-static {}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->get()Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Ltop/niunaijun/blackbox/app/dispatcher/AppJobServiceDispatcher;->onTrimMemory(I)V

    return-void
.end method
