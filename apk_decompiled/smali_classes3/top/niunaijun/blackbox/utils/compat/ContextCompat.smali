.class public Ltop/niunaijun/blackbox/utils/compat/ContextCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "ContextCompat"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fix(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :try_start_0
    instance-of v2, p0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0xa

    if-lt v1, v2, :cond_0

    return-void

    :cond_1
    invoke-static {p0}, Lb/d;->a(Ljava/lang/Object;)Lblack/android/app/ContextImplContext;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lblack/android/app/ContextImplContext;->_set_mPackageManager(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-static {p0}, Lb/d;->a(Ljava/lang/Object;)Lblack/android/app/ContextImplContext;

    move-result-object v1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lblack/android/app/ContextImplContext;->_set_mBasePackageName(Ljava/lang/Object;)V

    .line 1
    const-class v1, Lblack/android/app/ContextImplKitkatContext;

    invoke-static {v1, p0, v0}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lblack/android/app/ContextImplKitkatContext;

    .line 2
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lblack/android/app/ContextImplKitkatContext;->_set_mOpPackageName(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 3
    const-class v2, Lblack/android/content/ContentResolverContext;

    invoke-static {v2, v1, v0}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/content/ContentResolverContext;

    .line 4
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/content/ContentResolverContext;->_set_mPackageName(Ljava/lang/Object;)V

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isS()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lb/d;->a(Ljava/lang/Object;)Lblack/android/app/ContextImplContext;

    move-result-object p0

    invoke-interface {p0}, Lblack/android/app/ContextImplContext;->getAttributionSource()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getBUid()I

    move-result v0

    invoke-static {p0, v0}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fixAttributionSourceState(Ljava/lang/Object;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method public static fixAttributionSourceState(Ljava/lang/Object;I)V
    .locals 3

    if-eqz p0, :cond_0

    invoke-static {p0}, Lc/a;->a(Ljava/lang/Object;)Lblack/android/content/AttributionSourceContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/content/AttributionSourceContext;->_check_mAttributionSourceState()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lc/a;->a(Ljava/lang/Object;)Lblack/android/content/AttributionSourceContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/content/AttributionSourceContext;->mAttributionSourceState()Ljava/lang/Object;

    move-result-object v0

    .line 1
    const-class v1, Lblack/android/content/AttributionSourceStateContext;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/content/AttributionSourceStateContext;

    .line 2
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/content/AttributionSourceStateContext;->_set_packageName(Ljava/lang/Object;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/content/AttributionSourceStateContext;->_set_uid(Ljava/lang/Object;)V

    invoke-static {p0}, Lc/a;->a(Ljava/lang/Object;)Lblack/android/content/AttributionSourceContext;

    move-result-object p0

    invoke-interface {p0}, Lblack/android/content/AttributionSourceContext;->getNext()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fixAttributionSourceState(Ljava/lang/Object;I)V

    :cond_0
    return-void
.end method

.method public static fixAttributionSourceState(Ljava/lang/Object;II)V
    .locals 3

    .line 3
    if-eqz p0, :cond_0

    invoke-static {p0}, Lc/a;->a(Ljava/lang/Object;)Lblack/android/content/AttributionSourceContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/content/AttributionSourceContext;->_check_mAttributionSourceState()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lc/a;->a(Ljava/lang/Object;)Lblack/android/content/AttributionSourceContext;

    move-result-object v0

    invoke-interface {v0}, Lblack/android/content/AttributionSourceContext;->mAttributionSourceState()Ljava/lang/Object;

    move-result-object v0

    const-class v1, Lblack/android/content/AttributionSourceStateContext;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/content/AttributionSourceStateContext;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/content/AttributionSourceStateContext;->_set_packageName(Ljava/lang/Object;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/content/AttributionSourceStateContext;->_set_uid(Ljava/lang/Object;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lblack/android/content/AttributionSourceStateContext;->_set_pid(Ljava/lang/Object;)V

    invoke-static {p0}, Lc/a;->a(Ljava/lang/Object;)Lblack/android/content/AttributionSourceContext;

    move-result-object p0

    invoke-interface {p0}, Lblack/android/content/AttributionSourceContext;->getNext()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1, p2}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fixAttributionSourceState(Ljava/lang/Object;II)V

    return-void
.end method
