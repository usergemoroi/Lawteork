.class public Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$RegisterReceiverWithFeature;
.super Ltop/niunaijun/blackbox/fake/hook/MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RegisterReceiverWithFeature"
.end annotation

.annotation runtime Ltop/niunaijun/blackbox/fake/hook/ProxyMethod;
    value = "registerReceiverWithFeature"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public getPermissionIndex()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isS()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    return v0

    :cond_0
    const/4 v0, 0x5

    return v0
.end method

.method public getReceiverIndex()I
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isS()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    return v0

    :cond_0
    const/4 v0, 0x3

    return v0
.end method

.method public hook(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {p3}, Ltop/niunaijun/blackbox/utils/MethodParameterUtils;->replaceFirstAppPkg([Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$RegisterReceiverWithFeature;->getReceiverIndex()I

    move-result v0

    aget-object v1, p3, v0

    if-eqz v1, :cond_1

    check-cast v1, Landroid/content/IIntentReceiver;

    invoke-static {v1}, Ltop/niunaijun/blackbox/fake/delegate/InnerReceiverDelegate;->createProxy(Landroid/content/IIntentReceiver;)Landroid/content/IIntentReceiver;

    move-result-object v2

    .line 1
    const-class v3, Lblack/android/app/LoadedApkReceiverDispatcherInnerReceiverContext;

    const/4 v4, 0x0

    invoke-static {v3, v1, v4}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lblack/android/app/LoadedApkReceiverDispatcherInnerReceiverContext;

    .line 2
    invoke-interface {v1}, Lblack/android/app/LoadedApkReceiverDispatcherInnerReceiverContext;->mDispatcher()Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    .line 3
    const-class v3, Lblack/android/app/LoadedApkReceiverDispatcherContext;

    invoke-static {v3, v1, v4}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lblack/android/app/LoadedApkReceiverDispatcherContext;

    .line 4
    invoke-interface {v1, v2}, Lblack/android/app/LoadedApkReceiverDispatcherContext;->_set_mIIntentReceiver(Ljava/lang/Object;)V

    :cond_0
    aput-object v2, p3, v0

    :cond_1
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$RegisterReceiverWithFeature;->getPermissionIndex()I

    move-result v0

    aget-object v0, p3, v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$RegisterReceiverWithFeature;->getPermissionIndex()I

    move-result v0

    const/4 v1, 0x0

    aput-object v1, p3, v0

    :cond_2
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isU()Z

    move-result v0

    if-eqz v0, :cond_4

    array-length v0, p3

    add-int/lit8 v0, v0, -0x1

    aget-object v1, p3, v0

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    and-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_3

    and-int/lit8 v2, v1, 0x2

    if-nez v2, :cond_3

    or-int/lit8 v1, v1, 0x4

    :cond_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p3, v0

    :cond_4
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
