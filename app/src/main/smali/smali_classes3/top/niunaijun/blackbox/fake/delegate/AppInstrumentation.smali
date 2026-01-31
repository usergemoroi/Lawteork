.class public final Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;
.super Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/fake/hook/IInjectHook;


# static fields
.field static final $assertionsDisabled:Z = false

.field private static final TAG:Ljava/lang/String; = "AppInstrumentation"

.field private static volatile sAppInstrumentation:Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;-><init>()V

    return-void
.end method

.method private checkActivity(Landroid/app/Activity;)V
    .locals 4

    sget-object v0, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callActivityOnCreate: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/HackAppUtils;->enableQQLogOutput(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->checkHCallback()V

    invoke-static {}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->get()Ltop/niunaijun/blackbox/fake/hook/HookManager;

    move-result-object v0

    const-class v1, Ltop/niunaijun/blackbox/fake/service/IActivityClientProxy;

    invoke-virtual {v0, v1}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->checkEnv(Ljava/lang/Class;)V

    invoke-static {p1}, Lb/a;->a(Ljava/lang/Object;)Lblack/android/app/ActivityContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityContext;->mActivityInfo()Landroid/content/pm/ActivityInfo;

    move-result-object v0

    invoke-static {p1}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fix(Landroid/content/Context;)V

    invoke-static {p1}, Ltop/niunaijun/blackbox/utils/compat/ActivityCompat;->fix(Landroid/app/Activity;)V

    iget v1, v0, Landroid/content/pm/ActivityInfo;->theme:I

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    iget v2, v0, Landroid/content/pm/ActivityInfo;->theme:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_0
    iget v0, v0, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    invoke-static {p1, v0}, Ltop/niunaijun/blackbox/utils/compat/ActivityManagerCompat;->setActivityOrientation(Landroid/app/Activity;I)V

    return-void
.end method

.method private checkHCallback()V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->get()Ltop/niunaijun/blackbox/fake/hook/HookManager;

    move-result-object v0

    const-class v1, Ltop/niunaijun/blackbox/fake/service/HCallbackProxy;

    invoke-virtual {v0, v1}, Ltop/niunaijun/blackbox/fake/hook/HookManager;->checkEnv(Ljava/lang/Class;)V

    return-void
.end method

.method private checkInstrumentation(Landroid/app/Instrumentation;)Z
    .locals 9

    instance-of v0, p1, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Landroid/app/Instrumentation;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    return v3

    :cond_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    array-length v4, v2

    move v5, v3

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, v2, v5

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroid/app/Instrumentation;

    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :try_start_0
    invoke-virtual {v6, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v6, v6, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v6, :cond_2

    return v1

    :catch_0
    move-exception p1

    return v3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Landroid/app/Instrumentation;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v3

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public static get()Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;
    .locals 2

    sget-object v0, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->sAppInstrumentation:Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    if-nez v0, :cond_1

    const-class v0, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->sAppInstrumentation:Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    if-nez v1, :cond_0

    new-instance v1, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;-><init>()V

    sput-object v1, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->sAppInstrumentation:Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->sAppInstrumentation:Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;

    return-object v0
.end method

.method private getCurrInstrumentation()Landroid/app/Instrumentation;
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/app/ActivityThreadContext;->mInstrumentation()Landroid/app/Instrumentation;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->checkActivity(Landroid/app/Activity;)V

    invoke-super {p0, p1, p2}, Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->checkActivity(Landroid/app/Activity;)V

    invoke-super {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    return-void
.end method

.method public callApplicationOnCreate(Landroid/app/Application;)V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->checkHCallback()V

    invoke-super {p0, p1}, Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;->callApplicationOnCreate(Landroid/app/Application;)V

    return-void
.end method

.method public injectHook()V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->getCurrInstrumentation()Landroid/app/Instrumentation;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->checkInstrumentation(Landroid/app/Instrumentation;)Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;->mBaseInstrumentation:Landroid/app/Instrumentation;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lb/c;->a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;

    move-result-object v0

    invoke-interface {v0, p0}, Lblack/android/app/ActivityThreadContext;->_set_mInstrumentation(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->getCurrInstrumentation()Landroid/app/Instrumentation;

    move-result-object v0

    invoke-direct {p0, v0}, Ltop/niunaijun/blackbox/fake/delegate/AppInstrumentation;->checkInstrumentation(Landroid/app/Instrumentation;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;
    .locals 1

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;->newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;->mBaseInstrumentation:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1

    return-object p1
.end method

.method public newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;
    .locals 0

    invoke-static {p3}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fix(Landroid/content/Context;)V

    invoke-super {p0, p1, p2, p3}, Ltop/niunaijun/blackbox/fake/delegate/BaseInstrumentationDelegate;->newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;

    move-result-object p1

    return-object p1
.end method
