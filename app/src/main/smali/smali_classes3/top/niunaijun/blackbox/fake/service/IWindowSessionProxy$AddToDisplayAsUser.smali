.class public Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy$AddToDisplayAsUser;
.super Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy$AddToDisplay;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AddToDisplayAsUser"
.end annotation

.annotation runtime Ltop/niunaijun/blackbox/fake/hook/ProxyMethod;
    value = "addToDisplayAsUser"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/IWindowSessionProxy$AddToDisplay;-><init>()V

    return-void
.end method
