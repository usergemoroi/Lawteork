.class public Ltop/niunaijun/blackbox/fake/service/IAppWidgetManagerProxy;
.super Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v0

    const-string v1, "appwidget"

    invoke-interface {v0, v1}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 3

    .line 1
    const-class v0, Lblack/com/android/internal/appwidget/IAppWidgetServiceStubStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/com/android/internal/appwidget/IAppWidgetServiceStubStatic;

    .line 2
    invoke-static {}, Le/a;->a()Lblack/android/os/ServiceManagerStatic;

    move-result-object v1

    const-string v2, "appwidget"

    invoke-interface {v1, v2}, Lblack/android/os/ServiceManagerStatic;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/com/android/internal/appwidget/IAppWidgetServiceStubStatic;->asInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "appwidget"

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p3}, Ltop/niunaijun/blackbox/utils/MethodParameterUtils;->replaceAllAppPkg([Ljava/lang/Object;)V

    invoke-super {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onBindMethod()V
    .locals 5

    invoke-super {p0}, Ltop/niunaijun/blackbox/fake/hook/BinderInvocationStub;->onBindMethod()V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v1, [I

    const-string v4, "startListening"

    invoke-direct {v0, v4, v3}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "stopListening"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "allocateAppWidgetId"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "deleteAppWidgetId"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "deleteHost"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "deleteAllHosts"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "getAppWidgetViews"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "getAppWidgetIdsForHost"

    invoke-direct {v0, v3, v4}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "createAppWidgetConfigIntentSender"

    invoke-direct {v0, v3, v4}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "updateAppWidgetIds"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "updateAppWidgetOptions"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "getAppWidgetOptions"

    invoke-direct {v0, v3, v4}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "partiallyUpdateAppWidgetIds"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "updateAppWidgetProvider"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "notifyAppWidgetViewDataChanged"

    invoke-direct {v0, v3, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "getInstalledProvidersForProfile"

    invoke-direct {v0, v3, v4}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v3, "getAppWidgetInfo"

    invoke-direct {v0, v3, v4}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v4, "hasBindAppWidgetPermission"

    invoke-direct {v0, v4, v3}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v4, "setBindAppWidgetPermission"

    invoke-direct {v0, v4, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v4, "bindAppWidgetId"

    invoke-direct {v0, v4, v3}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v4, "bindRemoteViewsService"

    invoke-direct {v0, v4, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v4, "unbindRemoteViewsService"

    invoke-direct {v0, v4, v2}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    new-array v1, v1, [I

    const-string v2, "getAppWidgetIds"

    invoke-direct {v0, v2, v1}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;

    const-string v1, "isBoundWidgetPackage"

    invoke-direct {v0, v1, v3}, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    return-void
.end method
