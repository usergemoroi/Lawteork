.class public abstract Lcom/itsaky/androidide/logsender/ILogReceiver$Stub;
.super Landroid/os/Binder;
.source "ILogReceiver.java"

# interfaces
.implements Lcom/itsaky/androidide/logsender/ILogReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/itsaky/androidide/logsender/ILogReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/itsaky/androidide/logsender/ILogReceiver$Stub$Proxy;
    }
.end annotation


# static fields
.field static final TRANSACTION_connect:I = 0x2

.field static final TRANSACTION_disconnect:I = 0x3

.field static final TRANSACTION_ping:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 34
    const-string v0, "com.itsaky.androidide.logsender.ILogReceiver"

    invoke-virtual {p0, p0, v0}, Lcom/itsaky/androidide/logsender/ILogReceiver$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 35
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/itsaky/androidide/logsender/ILogReceiver;
    .locals 2
    .param p0, "obj"    # Landroid/os/IBinder;

    .line 42
    if-nez p0, :cond_0

    .line 43
    const/4 v0, 0x0

    return-object v0

    .line 45
    :cond_0
    const-string v0, "com.itsaky.androidide.logsender.ILogReceiver"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 46
    .local v0, "iin":Landroid/os/IInterface;
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/itsaky/androidide/logsender/ILogReceiver;

    if-eqz v1, :cond_1

    .line 47
    move-object v1, v0

    check-cast v1, Lcom/itsaky/androidide/logsender/ILogReceiver;

    return-object v1

    .line 49
    :cond_1
    new-instance v1, Lcom/itsaky/androidide/logsender/ILogReceiver$Stub$Proxy;

    invoke-direct {v1, p0}, Lcom/itsaky/androidide/logsender/ILogReceiver$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v1
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 53
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4
    .param p1, "code"    # I
    .param p2, "data"    # Landroid/os/Parcel;
    .param p3, "reply"    # Landroid/os/Parcel;
    .param p4, "flags"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 57
    const-string v0, "com.itsaky.androidide.logsender.ILogReceiver"

    .line 58
    .local v0, "descriptor":Ljava/lang/String;
    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 59
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 61
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 69
    packed-switch p1, :pswitch_data_1

    .line 94
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    return v1

    .line 65
    :pswitch_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    return v1

    .line 86
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 88
    .local v2, "_arg0":Ljava/lang/String;
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 89
    .local v3, "_arg1":Ljava/lang/String;
    invoke-virtual {p0, v2, v3}, Lcom/itsaky/androidide/logsender/ILogReceiver$Stub;->disconnect(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    goto :goto_0

    .line 79
    .end local v2    # "_arg0":Ljava/lang/String;
    .end local v3    # "_arg1":Ljava/lang/String;
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lcom/itsaky/androidide/logsender/ILogSender$Stub;->asInterface(Landroid/os/IBinder;)Lcom/itsaky/androidide/logsender/ILogSender;

    move-result-object v2

    .line 80
    .local v2, "_arg0":Lcom/itsaky/androidide/logsender/ILogSender;
    invoke-virtual {p0, v2}, Lcom/itsaky/androidide/logsender/ILogReceiver$Stub;->connect(Lcom/itsaky/androidide/logsender/ILogSender;)V

    .line 81
    goto :goto_0

    .line 73
    .end local v2    # "_arg0":Lcom/itsaky/androidide/logsender/ILogSender;
    :pswitch_3
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/ILogReceiver$Stub;->ping()V

    .line 74
    nop

    .line 97
    :goto_0
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x5f4e5446
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
