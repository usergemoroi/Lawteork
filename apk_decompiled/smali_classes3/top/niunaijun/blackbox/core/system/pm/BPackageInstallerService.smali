.class public Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;
.super Ltop/niunaijun/blackbox/core/system/pm/IBPackageInstallerService$Stub;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/ISystemService;


# static fields
.field public static final TAG:Ljava/lang/String; = "BPackageInstallerService"

.field private static final sService:Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;->sService:Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/pm/IBPackageInstallerService$Stub;-><init>()V

    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;->sService:Ltop/niunaijun/blackbox/core/system/pm/BPackageInstallerService;

    return-object v0
.end method


# virtual methods
.method public clearPackage(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;I)I
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ltop/niunaijun/blackbox/core/system/pm/installer/RemoveUserExecutor;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/pm/installer/RemoveUserExecutor;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ltop/niunaijun/blackbox/core/system/pm/installer/CreateUserExecutor;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/pm/installer/CreateUserExecutor;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;->installOption:Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/pm/installer/Executor;

    invoke-interface {v2, p1, v1, p2}, Ltop/niunaijun/blackbox/core/system/pm/installer/Executor;->exec(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "uninstallPackageAsUser: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " exec: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "BPackageInstallerService"

    invoke-static {v4, v2}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v3, :cond_0

    return v3

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public installPackageAsUser(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;I)I
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ltop/niunaijun/blackbox/core/system/pm/installer/CreateUserExecutor;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/pm/installer/CreateUserExecutor;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ltop/niunaijun/blackbox/core/system/pm/installer/CreatePackageExecutor;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/pm/installer/CreatePackageExecutor;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ltop/niunaijun/blackbox/core/system/pm/installer/CopyExecutor;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/pm/installer/CopyExecutor;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;->installOption:Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/pm/installer/Executor;

    invoke-interface {v2, p1, v1, p2}, Ltop/niunaijun/blackbox/core/system/pm/installer/Executor;->exec(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "installPackageAsUser: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " exec: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "BPackageInstallerService"

    invoke-static {v4, v2}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v3, :cond_0

    return v3

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public systemReady()V
    .locals 0

    return-void
.end method

.method public uninstallPackageAsUser(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;ZI)I
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_0

    new-instance p2, Ltop/niunaijun/blackbox/core/system/pm/installer/RemoveAppExecutor;

    invoke-direct {p2}, Ltop/niunaijun/blackbox/core/system/pm/installer/RemoveAppExecutor;-><init>()V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance p2, Ltop/niunaijun/blackbox/core/system/pm/installer/RemoveUserExecutor;

    invoke-direct {p2}, Ltop/niunaijun/blackbox/core/system/pm/installer/RemoveUserExecutor;-><init>()V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;->installOption:Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/core/system/pm/installer/Executor;

    invoke-interface {v1, p1, p2, p3}, Ltop/niunaijun/blackbox/core/system/pm/installer/Executor;->exec(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "uninstallPackageAsUser: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " exec: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "BPackageInstallerService"

    invoke-static {v3, v1}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v2, :cond_1

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public updatePackage(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;)I
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ltop/niunaijun/blackbox/core/system/pm/installer/CreatePackageExecutor;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/pm/installer/CreatePackageExecutor;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ltop/niunaijun/blackbox/core/system/pm/installer/CopyExecutor;

    invoke-direct {v1}, Ltop/niunaijun/blackbox/core/system/pm/installer/CopyExecutor;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p1, Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;->installOption:Ltop/niunaijun/blackbox/entity/pm/InstallOption;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackbox/core/system/pm/installer/Executor;

    const/4 v3, -0x1

    invoke-interface {v2, p1, v1, v3}, Ltop/niunaijun/blackbox/core/system/pm/installer/Executor;->exec(Ltop/niunaijun/blackbox/core/system/pm/BPackageSettings;Ltop/niunaijun/blackbox/entity/pm/InstallOption;I)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
