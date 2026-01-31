.class public Ltop/niunaijun/blackbox/fake/hook/HookManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "HookManager"

.field private static final sHookManager:Ltop/niunaijun/blackbox/fake/hook/HookManager;


# instance fields
.field private final mInjectors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ltop/niunaijun/blackbox/fake/hook/IInjectHook;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/fake/hook/HookManager;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/fake/hook/HookManager;->sHookManager:Ltop/niunaijun/blackbox/fake/hook/HookManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/fake/hook/HookManager;->mInjectors:Ljava/util/Map;

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/fake/hook/HookManager;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/fake/hook/HookManager;->sHookManager:Ltop/niunaijun/blackbox/fake/hook/HookManager;

    return-object v0
.end method


# virtual methods
.method public addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/hook/HookManager;->mInjectors:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public checkAll()V
    .locals 5

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/hook/HookManager;->mInjectors:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    iget-object v2, p0, Ltop/niunaijun/blackbox/fake/hook/HookManager;->mInjectors:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/fake/hook/IInjectHook;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ltop/niunaijun/blackbox/fake/hook/IInjectHook;->isBadEnv()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "checkEnv: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " is bad env"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "HookManager"

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v2}, Ltop/niunaijun/blackbox/fake/hook/IInjectHook;->injectHook()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public checkEnv(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/hook/HookManager;->mInjectors:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackbox/fake/hook/IInjectHook;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ltop/niunaijun/blackbox/fake/hook/IInjectHook;->isBadEnv()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "checkEnv: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " is bad env"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HookManager"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v0}, Ltop/niunaijun/blackbox/fake/hook/IInjectHook;->injectHook()V

    :cond_0
    return-void
.end method

.method public init()V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->isBlackProcess()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->isServerProcess()Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_0
    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IDisplayManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IDisplayManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/libcore/OsStub;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/libcore/OsStub;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IActivityManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IPackageManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/ITelephonyManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IAppOpsManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IAppOpsManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/INotificationManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/INotificationManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IAlarmManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IAlarmManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IAppWidgetManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IAppWidgetManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/context/ContentServiceStub;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/context/ContentServiceStub;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IWindowManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IWindowManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IUserManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IUserManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/context/RestrictionsManagerStub;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/context/RestrictionsManagerStub;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/ILocationManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IStorageManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IStorageManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/ILauncherAppsProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/ILauncherAppsProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IJobServiceProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IJobServiceProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IAccessibilityManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IAccessibilityManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/ITelephonyRegistryProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/ITelephonyRegistryProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IDevicePolicyManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IDevicePolicyManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IAccountManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IConnectivityManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IConnectivityManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IPhoneSubInfoProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IPhoneSubInfoProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IMediaRouterServiceProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IMediaRouterServiceProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IPowerManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IPowerManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IContextHubServiceProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IContextHubServiceProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IVibratorServiceProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IVibratorServiceProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IPersistentDataBlockServiceProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IPersistentDataBlockServiceProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IBluetoothProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/BuildProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    invoke-static {}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->get()Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IWifiManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IWifiManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IWifiScannerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IWifiScannerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isS()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isR()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IPermissionManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IPermissionManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_2
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isQ()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IActivityTaskManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IActivityTaskManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_3
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isPie()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/ISystemUpdateProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/ISystemUpdateProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_4
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isOreo()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IAutofillManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IAutofillManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IDeviceIdentifiersPolicyProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IDeviceIdentifiersPolicyProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IStorageStatsManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IStorageStatsManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_5
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isN_MR1()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IShortcutManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IShortcutManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_6
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isN()Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/INetworkManagementServiceProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/INetworkManagementServiceProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_7
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isM()Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IFingerprintManagerProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IFingerprintManagerProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IGraphicsStatsProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IGraphicsStatsProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_8
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isL()Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/IJobServiceProxy;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/fake/service/IJobServiceProxy;-><init>()V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->addInjector(Ltop/niunaijun/blackbox/fake/hook/IInjectHook;)V

    :cond_9
    invoke-virtual {p0}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->injectAll()V

    return-void
.end method

.method public injectAll()V
    .locals 5

    const-string v0, "HookManager"

    iget-object v1, p0, Ltop/niunaijun/blackbox/fake/hook/HookManager;->mInjectors:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/fake/hook/IInjectHook;

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "hook: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v2}, Ltop/niunaijun/blackbox/fake/hook/IInjectHook;->injectHook()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "hook error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    return-void
.end method
