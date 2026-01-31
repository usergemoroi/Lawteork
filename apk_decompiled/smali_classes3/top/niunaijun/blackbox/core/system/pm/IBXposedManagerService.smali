.class public interface abstract Ltop/niunaijun/blackbox/core/system/pm/IBXposedManagerService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/core/system/pm/IBXposedManagerService$_Parcel;,
        Ltop/niunaijun/blackbox/core/system/pm/IBXposedManagerService$Stub;,
        Ltop/niunaijun/blackbox/core/system/pm/IBXposedManagerService$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "top.niunaijun.blackbox.core.system.pm.IBXposedManagerService"


# virtual methods
.method public abstract getInstalledModules()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/entity/pm/InstalledModule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isModuleEnable(Ljava/lang/String;)Z
.end method

.method public abstract isXPEnable()Z
.end method

.method public abstract setModuleEnable(Ljava/lang/String;Z)V
.end method

.method public abstract setXPEnable(Z)V
.end method
