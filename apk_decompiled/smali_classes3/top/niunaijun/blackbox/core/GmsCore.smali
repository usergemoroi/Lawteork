.class public Ltop/niunaijun/blackbox/core/GmsCore;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final GMS_PKG:Ljava/lang/String; = "com.google.android.gms"

.field private static final GOOGLE_APP:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final GOOGLE_SERVICE:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final GSF_PKG:Ljava/lang/String; = "com.google.android.gsf"

.field private static final TAG:Ljava/lang/String; = "GmsCore"

.field public static final VENDING_PKG:Ljava/lang/String; = "com.android.vending"


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_APP:Ljava/util/HashSet;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    sput-object v1, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_SERVICE:Ljava/util/HashSet;

    const-string v2, "com.android.vending"

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v2, "com.google.android.play.games"

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v2, "com.google.android.wearable.app"

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v2, "com.google.android.wearable.app.cn"

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.gms"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.gsf"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.gsf.login"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.backuptransport"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.backup"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.configupdater"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.syncadapters.contacts"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.feedback"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.onetimeinitializer"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.partnersetup"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.setupwizard"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "com.google.android.syncadapters.calendar"

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static installGApps(I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sget-object v1, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_SERVICE:Ljava/util/HashSet;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    sget-object v1, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_APP:Ljava/util/HashSet;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0, p0}, Ltop/niunaijun/blackbox/core/GmsCore;->installPackages(Ljava/util/Set;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object v0

    iget-boolean v1, v0, Ltop/niunaijun/blackbox/entity/pm/InstallResult;->success:Z

    if-nez v1, :cond_0

    invoke-static {p0}, Ltop/niunaijun/blackbox/core/GmsCore;->uninstallGApps(I)V

    :cond_0
    return-object v0
.end method

.method private static installPackages(Ljava/util/Set;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;I)",
            "Ltop/niunaijun/blackbox/entity/pm/InstallResult;"
        }
    .end annotation

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ltop/niunaijun/blackbox/BlackBoxCore;->isInstalled(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, v1, p1}, Ltop/niunaijun/blackbox/BlackBoxCore;->installPackageAsUser(Ljava/lang/String;I)Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    move-result-object v1

    iget-boolean v2, v1, Ltop/niunaijun/blackbox/entity/pm/InstallResult;->success:Z

    if-nez v2, :cond_0

    return-object v1

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_2
    new-instance p0, Ltop/niunaijun/blackbox/entity/pm/InstallResult;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/entity/pm/InstallResult;-><init>()V

    return-object p0
.end method

.method public static isGoogleAppOrService(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_APP:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_SERVICE:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isGoogleService(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_SERVICE:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isInstalledGoogleService(I)Z
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    const-string v1, "com.google.android.gms"

    invoke-virtual {v0, v1, p0}, Ltop/niunaijun/blackbox/BlackBoxCore;->isInstalled(Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method public static isSupportGms()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.google.android.gms"

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    return v0
.end method

.method public static remove(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_SERVICE:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    sget-object v0, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_APP:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static uninstallGApps(I)V
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_SERVICE:Ljava/util/HashSet;

    invoke-static {v0, p0}, Ltop/niunaijun/blackbox/core/GmsCore;->uninstallPackages(Ljava/util/Set;I)V

    sget-object v0, Ltop/niunaijun/blackbox/core/GmsCore;->GOOGLE_APP:Ljava/util/HashSet;

    invoke-static {v0, p0}, Ltop/niunaijun/blackbox/core/GmsCore;->uninstallPackages(Ljava/util/Set;I)V

    return-void
.end method

.method private static uninstallPackages(Ljava/util/Set;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ltop/niunaijun/blackbox/BlackBoxCore;->uninstallPackageAsUser(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
