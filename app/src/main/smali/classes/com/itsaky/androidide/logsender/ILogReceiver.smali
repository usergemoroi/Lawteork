.class public interface abstract Lcom/itsaky/androidide/logsender/ILogReceiver;
.super Ljava/lang/Object;
.source "ILogReceiver.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/itsaky/androidide/logsender/ILogReceiver$Stub;,
        Lcom/itsaky/androidide/logsender/ILogReceiver$Default;
    }
.end annotation


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "com.itsaky.androidide.logsender.ILogReceiver"


# virtual methods
.method public abstract connect(Lcom/itsaky/androidide/logsender/ILogSender;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract disconnect(Ljava/lang/String;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract ping()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
