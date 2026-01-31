.class public Ltop/niunaijun/blackbox/core/system/am/UserSpace;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

.field public final mIntentSenderRecords:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Ltop/niunaijun/blackbox/core/system/am/PendingIntentRecord;",
            ">;"
        }
    .end annotation
.end field

.field public final mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/am/ActiveServices;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mActiveServices:Ltop/niunaijun/blackbox/core/system/am/ActiveServices;

    new-instance v0, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/am/ActivityStack;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mStack:Ltop/niunaijun/blackbox/core/system/am/ActivityStack;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/am/UserSpace;->mIntentSenderRecords:Ljava/util/Map;

    return-void
.end method
