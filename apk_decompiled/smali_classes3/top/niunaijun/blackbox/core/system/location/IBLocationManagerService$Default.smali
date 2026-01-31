.class public Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService$Default;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;
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
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAllCell(ILjava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public getCell(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BCell;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getGlobalLocation()Ltop/niunaijun/blackbox/entity/location/BLocation;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getGlobalNeighboringCell()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLocation(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocation;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getNeighboringCell(ILjava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public getPattern(ILjava/lang/String;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public removeUpdates(Landroid/os/IBinder;)V
    .locals 0

    return-void
.end method

.method public requestLocationUpdates(Landroid/os/IBinder;Ljava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public setAllCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public setCell(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BCell;)V
    .locals 0

    return-void
.end method

.method public setGlobalAllCell(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public setGlobalCell(Ltop/niunaijun/blackbox/entity/location/BCell;)V
    .locals 0

    return-void
.end method

.method public setGlobalLocation(Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    .locals 0

    return-void
.end method

.method public setGlobalNeighboringCell(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public setLocation(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    .locals 0

    return-void
.end method

.method public setNeighboringCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public setPattern(ILjava/lang/String;I)V
    .locals 0

    return-void
.end method
