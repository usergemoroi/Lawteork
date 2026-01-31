.class public Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy$disableBle;,
        Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy$enableBle;,
        Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy$updateBleAppCount;,
        Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy$enableNoAutoConnect;,
        Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy$disable;,
        Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy$enable;
    }
.end annotation


# static fields
.field private static final SERVER_NAME:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "bluetooth_manager"

    sput-object v0, Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy;->SERVER_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    sget-object v1, Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy;->SERVER_NAME:Ljava/lang/String;

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 3

    .line 1
    const-class v0, Lblack/android/bluetooth/IBluetoothStubStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/bluetooth/IBluetoothStubStatic;

    .line 2
    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v1

    sget-object v2, Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy;->SERVER_NAME:Ljava/lang/String;

    invoke-interface {v1, v2}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/bluetooth/IBluetoothStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    sget-object p1, Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy;->SERVER_NAME:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
