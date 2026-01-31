.class Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/fake/service/BuildProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GuestIdentity"
.end annotation


# instance fields
.field public androidId:Ljava/lang/String;

.field public brand:Ljava/lang/String;

.field public fingerprint:Ljava/lang/String;

.field public model:Ljava/lang/String;

.field public radioVersion:Ljava/lang/String;

.field public serial:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltop/niunaijun/blackbox/fake/service/BuildProxy$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;-><init>()V

    return-void
.end method
