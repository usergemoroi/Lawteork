.class Lkentos/loader/App$1;
.super Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;
.source "App.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkentos/loader/App;->attachBaseContext(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lkentos/loader/App;

.field final synthetic val$base:Landroid/content/Context;


# direct methods
.method constructor <init>(Lkentos/loader/App;Landroid/content/Context;)V
    .locals 0
    .param p1, "this$0"    # Lkentos/loader/App;

    .line 40
    iput-object p1, p0, Lkentos/loader/App$1;->this$0:Lkentos/loader/App;

    iput-object p2, p0, Lkentos/loader/App$1;->val$base:Landroid/content/Context;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;-><init>()V

    return-void
.end method


# virtual methods
.method public getHostPackageName()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lkentos/loader/App$1;->val$base:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isEnableDaemonService()Z
    .locals 1

    .line 58
    const/4 v0, 0x0

    return v0
.end method

.method public isHideRoot()Z
    .locals 1

    .line 48
    const/4 v0, 0x1

    return v0
.end method

.method public isHideXposed()Z
    .locals 1

    .line 53
    const/4 v0, 0x1

    return v0
.end method

.method public requestInstallPackage(Ljava/io/File;)Z
    .locals 3
    .param p1, "file"    # Ljava/io/File;

    .line 62
    iget-object v0, p0, Lkentos/loader/App$1;->val$base:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 63
    .local v0, "packageInfo":Landroid/content/pm/PackageInfo;
    return v2
.end method
