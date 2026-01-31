.class public interface abstract Ltop/niunaijun/blackbox/core/system/user/IBUserManagerService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/core/system/user/IBUserManagerService$_Parcel;,
        Ltop/niunaijun/blackbox/core/system/user/IBUserManagerService$Stub;,
        Ltop/niunaijun/blackbox/core/system/user/IBUserManagerService$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "top.niunaijun.blackbox.core.system.user.IBUserManagerService"


# virtual methods
.method public abstract createUser(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;
.end method

.method public abstract deleteUser(I)V
.end method

.method public abstract exists(I)Z
.end method

.method public abstract getUserInfo(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;
.end method

.method public abstract getUsers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/core/system/user/BUserInfo;",
            ">;"
        }
    .end annotation
.end method
