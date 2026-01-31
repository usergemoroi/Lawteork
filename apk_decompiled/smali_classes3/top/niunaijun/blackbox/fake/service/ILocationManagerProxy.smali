.class public Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$setExtraLocationControllerPackageEnabled;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$isProviderEnabledForUser;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$GetAllProviders;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$GetBestProvider;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$RemoveGpsStatusListener;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$GetProviderProperties;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$RemoveUpdates;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$RequestLocationUpdates;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$GetLastKnownLocation;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$GetLastLocation;,
        Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy$RegisterGnssStatusCallback;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "ILocationManagerProxy"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "location"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 3

    .line 1
    const-class v0, Lblack/android/location/ILocationManagerStubStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/location/ILocationManagerStubStatic;

    .line 2
    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v1

    const-string v2, "location"

    invoke-interface {v1, v2}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/location/ILocationManagerStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "location"

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p3}, Ltop/niunaijun/blackbox/utils/MethodParameterUtils;->replaceFirstAppPkg([Ljava/lang/Object;)Ljava/lang/String;

    invoke-super {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
