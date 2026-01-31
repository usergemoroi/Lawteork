.class public Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy$RegisterReceiver;
.super Ltop/niunaijun/blackbox/fake/hook/MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RegisterReceiver"
.end annotation

.annotation runtime Ltop/niunaijun/blackbox/fake/hook/ProxyMethod;
    value = "registerReceiver"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public hook(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {p3}, Ltop/niunaijun/blackbox/utils/MethodParameterUtils;->replaceFirstAppPkg([Ljava/lang/Object;)Ljava/lang/String;

    const/4 v0, 0x2

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
    const/4 v0, 0x4

    aget-object v1, p3, v0

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    aput-object v1, p3, v0

    :cond_2
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
