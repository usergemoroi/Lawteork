.class public Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;
.super Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltop/niunaijun/blackbox/fake/frameworks/BlackManager<",
        "Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;",
        ">;"
    }
.end annotation


# static fields
.field public static final CLOSE_MODE:I = 0x0

.field public static final GLOBAL_MODE:I = 0x1

.field public static final OWN_MODE:I = 0x2

.field private static final sLocationManager:Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;->sLocationManager:Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;-><init>()V

    return-void
.end method

.method public static disableFakeLocation(ILjava/lang/String;)V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;->setPattern(ILjava/lang/String;I)V

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;->sLocationManager:Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;

    return-object v0
.end method

.method public static isFakeLocationEnable()Z
    .locals 3

    invoke-static {}, Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;->get()Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;

    move-result-object v0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ltop/niunaijun/blackbox/fake/frameworks/BLocationManager;->getPattern(ILjava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public getAllCell(ILjava/lang/String;)Ljava/util/List;
    .locals 1
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

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->getAllCell(ILjava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public getCell(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BCell;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->getCell(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BCell;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getGlobalLocation()Ltop/niunaijun/blackbox/entity/location/BLocation;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->getGlobalLocation()Ltop/niunaijun/blackbox/entity/location/BLocation;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

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

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->getGlobalNeighboringCell()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLocation(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocation;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->getLocation(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocation;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getNeighboringCell(ILjava/lang/String;)Ljava/util/List;
    .locals 1
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

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->getNeighboringCell(ILjava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getPattern(ILjava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->getPattern(ILjava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return p1
.end method

.method public getServiceName()Ljava/lang/String;
    .locals 1

    const-string v0, "location_manager"

    return-object v0
.end method

.method public removeUpdates(Landroid/os/IBinder;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->removeUpdates(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public requestLocationUpdates(Landroid/os/IBinder;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getAppPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v2

    invoke-interface {v0, p1, v1, v2}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->requestLocationUpdates(Landroid/os/IBinder;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setAllCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setAllCell(ILjava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setCell(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BCell;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setCell(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BCell;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setGlobalAllCell(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setGlobalAllCell(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setGlobalCell(Ltop/niunaijun/blackbox/entity/location/BCell;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setGlobalCell(Ltop/niunaijun/blackbox/entity/location/BCell;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setGlobalLocation(Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setGlobalLocation(Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setGlobalNeighboringCell(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setGlobalNeighboringCell(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setLocation(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setLocation(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BLocation;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setNeighboringCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setNeighboringCell(ILjava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setPattern(ILjava/lang/String;I)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/frameworks/BlackManager;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;

    invoke-interface {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;->setPattern(ILjava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method
