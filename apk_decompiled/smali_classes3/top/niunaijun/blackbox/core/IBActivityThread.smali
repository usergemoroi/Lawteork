.class public interface abstract Ltop/niunaijun/blackbox/core/IBActivityThread;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/core/IBActivityThread$_Parcel;,
        Ltop/niunaijun/blackbox/core/IBActivityThread$Stub;,
        Ltop/niunaijun/blackbox/core/IBActivityThread$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "top.niunaijun.blackbox.core.IBActivityThread"


# virtual methods
.method public abstract acquireContentProviderClient(Landroid/content/pm/ProviderInfo;)Landroid/os/IBinder;
.end method

.method public abstract bindApplication()V
.end method

.method public abstract finishActivity(Landroid/os/IBinder;)V
.end method

.method public abstract getActivityThread()Landroid/os/IBinder;
.end method

.method public abstract handleNewIntent(Landroid/os/IBinder;Landroid/content/Intent;)V
.end method

.method public abstract peekService(Landroid/content/Intent;)Landroid/os/IBinder;
.end method

.method public abstract restartJobService(Ljava/lang/String;)V
.end method

.method public abstract scheduleReceiver(Ltop/niunaijun/blackbox/entity/am/ReceiverData;)V
.end method

.method public abstract stopService(Landroid/content/Intent;)V
.end method
