.class public interface abstract Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService$_Parcel;,
        Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService$Stub;,
        Ltop/niunaijun/blackbox/core/system/location/IBLocationManagerService$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "top.niunaijun.blackbox.core.system.location.IBLocationManagerService"


# virtual methods
.method public abstract getAllCell(ILjava/lang/String;)Ljava/util/List;
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
.end method

.method public abstract getCell(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BCell;
.end method

.method public abstract getGlobalLocation()Ltop/niunaijun/blackbox/entity/location/BLocation;
.end method

.method public abstract getGlobalNeighboringCell()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLocation(ILjava/lang/String;)Ltop/niunaijun/blackbox/entity/location/BLocation;
.end method

.method public abstract getNeighboringCell(ILjava/lang/String;)Ljava/util/List;
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
.end method

.method public abstract getPattern(ILjava/lang/String;)I
.end method

.method public abstract removeUpdates(Landroid/os/IBinder;)V
.end method

.method public abstract requestLocationUpdates(Landroid/os/IBinder;Ljava/lang/String;I)V
.end method

.method public abstract setAllCell(ILjava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setCell(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BCell;)V
.end method

.method public abstract setGlobalAllCell(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setGlobalCell(Ltop/niunaijun/blackbox/entity/location/BCell;)V
.end method

.method public abstract setGlobalLocation(Ltop/niunaijun/blackbox/entity/location/BLocation;)V
.end method

.method public abstract setGlobalNeighboringCell(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setLocation(ILjava/lang/String;Ltop/niunaijun/blackbox/entity/location/BLocation;)V
.end method

.method public abstract setNeighboringCell(ILjava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/location/BCell;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setPattern(ILjava/lang/String;I)V
.end method
