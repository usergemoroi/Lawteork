.class public Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetIntentSenderWithSourceToken;
.super Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetIntentSender;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetIntentSenderWithSourceToken"
.end annotation

.annotation runtime Ltop/niunaijun/blackbox/fake/hook/ProxyMethod;
    value = "getIntentSenderWithSourceToken"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$GetIntentSender;-><init>()V

    return-void
.end method
