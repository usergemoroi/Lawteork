.class public abstract Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getHostPackageName()Ljava/lang/String;
.end method

.method public isEnableDaemonService()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isEnableLauncherActivity()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isHideRoot()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isHideXposed()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public requestInstallPackage(Ljava/io/File;I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
