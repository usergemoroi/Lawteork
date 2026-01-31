.class public Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetNeighboringCellInfo;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetNetworkTypeForSubscriber;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetNetworkOperator;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetAllCellInfo;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetCellLocation;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetDeviceIdWithFeature;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetSubscriberId;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$getLine1NumberForDisplay;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$IsUserDataEnabled;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetMeidForSlot;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$getImeiForSlot;,
        Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy$GetDeviceId;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "ITelephonyManagerProxy"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "phone"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 4

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "phone"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    .line 1
    const-class v1, Lblack/com/android/internal/telephony/ITelephonyStubStatic;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lblack/com/android/internal/telephony/ITelephonyStubStatic;

    .line 2
    invoke-interface {v1, v0}, Lblack/com/android/internal/telephony/ITelephonyStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "phone"

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
