.class public final synthetic Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroid/os/IInterface;

.field public final synthetic f$1:Ltop/niunaijun/blackbox/entity/location/BLocation;


# direct methods
.method public synthetic constructor <init>(Landroid/os/IInterface;Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda0;->f$0:Landroid/os/IInterface;

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda0;->f$1:Ltop/niunaijun/blackbox/entity/location/BLocation;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda0;->f$0:Landroid/os/IInterface;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService$$ExternalSyntheticLambda0;->f$1:Ltop/niunaijun/blackbox/entity/location/BLocation;

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/core/system/location/BLocationManagerService;->lambda$addTask$0(Landroid/os/IInterface;Ltop/niunaijun/blackbox/entity/location/BLocation;)V

    return-void
.end method
