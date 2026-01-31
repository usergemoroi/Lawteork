.class public Ltop/niunaijun/blackbox/core/env/VirtualRuntime;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sInitialPackageName:Ljava/lang/String;

.field private static sProcessName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInitialPackageName()Ljava/lang/String;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/env/VirtualRuntime;->sInitialPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public static getProcessName()Ljava/lang/String;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/env/VirtualRuntime;->sProcessName:Ljava/lang/String;

    return-object v0
.end method

.method public static setupRuntime(Ljava/lang/String;Landroid/content/pm/ApplicationInfo;)V
    .locals 2

    sget-object v0, Ltop/niunaijun/blackbox/core/env/VirtualRuntime;->sProcessName:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    sput-object p1, Ltop/niunaijun/blackbox/core/env/VirtualRuntime;->sInitialPackageName:Ljava/lang/String;

    sput-object p0, Ltop/niunaijun/blackbox/core/env/VirtualRuntime;->sProcessName:Ljava/lang/String;

    .line 1
    const-class p1, Lblack/android/os/ProcessStatic;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/os/ProcessStatic;

    .line 2
    invoke-interface {p1, p0}, Lblack/android/os/ProcessStatic;->setArgV0(Ljava/lang/String;)Ljava/lang/Void;

    .line 3
    const-class p1, Lblack/android/ddm/DdmHandleAppNameStatic;

    invoke-static {p1, v0, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lblack/android/ddm/DdmHandleAppNameStatic;

    .line 4
    invoke-interface {p1, p0, v1}, Lblack/android/ddm/DdmHandleAppNameStatic;->setAppName(Ljava/lang/String;I)Ljava/lang/Void;

    return-void
.end method
