.class public final Lme/weishu/reflection/BootstrapClass;
.super Ljava/lang/Object;
.source "BootstrapClass.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BootstrapClass"

.field private static sVmRuntime:Ljava/lang/Object;

.field private static setHiddenApiExemptions:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 24
    :try_start_0
    const-class v0, Ljava/lang/Class;

    const-string v1, "forName"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 25
    .local v0, "forName":Ljava/lang/reflect/Method;
    const-class v1, Ljava/lang/Class;

    const-string v3, "getDeclaredMethod"

    const/4 v4, 0x2

    new-array v6, v4, [Ljava/lang/Class;

    const-class v7, Ljava/lang/String;

    aput-object v7, v6, v5

    const-class v7, [Ljava/lang/Class;

    aput-object v7, v6, v2

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 27
    .local v1, "getDeclaredMethod":Ljava/lang/reflect/Method;
    new-array v3, v2, [Ljava/lang/Object;

    const-string v6, "dalvik.system.VMRuntime"

    aput-object v6, v3, v5

    const/4 v6, 0x0

    invoke-virtual {v0, v6, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    .line 28
    .local v3, "vmRuntimeClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-array v7, v4, [Ljava/lang/Object;

    const-string v8, "getRuntime"

    aput-object v8, v7, v5

    aput-object v6, v7, v2

    invoke-virtual {v1, v3, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/reflect/Method;

    .line 29
    .local v7, "getRuntime":Ljava/lang/reflect/Method;
    new-array v4, v4, [Ljava/lang/Object;

    const-string/jumbo v8, "setHiddenApiExemptions"

    aput-object v8, v4, v5

    new-array v8, v2, [Ljava/lang/Class;

    const-class v9, [Ljava/lang/String;

    aput-object v9, v8, v5

    aput-object v8, v4, v2

    invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    sput-object v2, Lme/weishu/reflection/BootstrapClass;->setHiddenApiExemptions:Ljava/lang/reflect/Method;

    .line 30
    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v7, v6, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sput-object v2, Lme/weishu/reflection/BootstrapClass;->sVmRuntime:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .end local v0    # "forName":Ljava/lang/reflect/Method;
    .end local v1    # "getDeclaredMethod":Ljava/lang/reflect/Method;
    .end local v3    # "vmRuntimeClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v7    # "getRuntime":Ljava/lang/reflect/Method;
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    .local v0, "e":Ljava/lang/Throwable;
    const-string v1, "BootstrapClass"

    const-string/jumbo v2, "reflect bootstrap failed:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .end local v0    # "e":Ljava/lang/Throwable;
    :cond_0
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static exempt(Ljava/lang/String;)Z
    .locals 1
    .param p0, "method"    # Ljava/lang/String;

    .line 44
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lme/weishu/reflection/BootstrapClass;->exempt([Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static varargs exempt([Ljava/lang/String;)Z
    .locals 4
    .param p0, "methods"    # [Ljava/lang/String;

    .line 54
    sget-object v0, Lme/weishu/reflection/BootstrapClass;->sVmRuntime:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v2, Lme/weishu/reflection/BootstrapClass;->setHiddenApiExemptions:Ljava/lang/reflect/Method;

    if-nez v2, :cond_0

    goto :goto_0

    .line 59
    :cond_0
    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    const/4 v0, 0x1

    return v0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    .local v0, "e":Ljava/lang/Throwable;
    return v1

    .line 55
    .end local v0    # "e":Ljava/lang/Throwable;
    :cond_1
    :goto_0
    return v1
.end method

.method public static exemptAll()Z
    .locals 1

    .line 72
    const-string v0, "L"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lme/weishu/reflection/BootstrapClass;->exempt([Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
