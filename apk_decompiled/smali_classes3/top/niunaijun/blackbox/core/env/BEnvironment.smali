.class public Ltop/niunaijun/blackbox/core/env/BEnvironment;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static EMPTY_JAR:Ljava/io/File;

.field public static JUNIT_JAR:Ljava/io/File;

.field private static final ObbDirectory:Ljava/io/File;

.field private static final sExternalVirtualRoot:Ljava/io/File;

.field private static final sVirtualRoot:Ljava/io/File;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fd18d969af0fL    # 5.488724371146313E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v0, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    sput-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->ObbDirectory:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    .line 3
    const-wide v3, 0x60e3fd0fd969af0fL    # 5.48868666168651E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    new-instance v0, Ljava/io/File;

    .line 5
    const-wide v2, 0x60e3fd06d969af0fL    # 5.488648952226707E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sExternalVirtualRoot:Ljava/io/File;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/File;

    .line 7
    const-wide v2, 0x60e3fcf5d969af0fL    # 5.488577723247079E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sExternalVirtualRoot:Ljava/io/File;

    :goto_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getCacheDir()Ljava/io/File;

    move-result-object v2

    .line 9
    const-wide v3, 0x60e3fcecd969af0fL    # 5.488540013787276E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->JUNIT_JAR:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getCacheDir()Ljava/io/File;

    move-result-object v2

    .line 11
    const-wide v3, 0x60e3fce2d969af0fL    # 5.488498114387495E158

    invoke-static {v3, v4, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->EMPTY_JAR:Ljava/io/File;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAccountsConf()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getSystemDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fe14d969af0fL    # 5.489780236020796E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getAppDir(Ljava/lang/String;)Ljava/io/File;
    .locals 6

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3fd4dd969af0fL    # 5.488946437965153E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getAppLibDir(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getAppDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fd2fd969af0fL    # 5.488820739765809E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getAppRootDir()Ljava/io/File;
    .locals 3

    .line 1
    sget-object v0, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fd4ed969af0fL    # 5.488950627905131E158

    invoke-static {v1, v2, v0}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getAppDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static getBaseApkDir(Ljava/lang/String;)Ljava/io/File;
    .locals 6

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3fd43d969af0fL    # 5.488904538565371E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 3
    const-wide v4, 0x60e3fd39d969af0fL    # 5.48886263916559E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getCacheDir()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fe24d969af0fL    # 5.489847275060446E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getDataCacheDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-static {p0, p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getDataDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    .line 1
    sget-object p1, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fd62d969af0fL    # 5.489034426704693E158

    invoke-static {v1, v2, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getDataDatabasesDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-static {p0, p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getDataDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    .line 1
    sget-object p1, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fd58d969af0fL    # 5.488992527304912E158

    invoke-static {v1, v2, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getDataDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 6

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 1
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3fd87d969af0fL    # 5.489189454483883E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v2, v3, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getDataFilesDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-static {p0, p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getDataDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    .line 1
    sget-object p1, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fd6ed969af0fL    # 5.48908470598443E158

    invoke-static {v1, v2, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getDataLibDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-static {p0, p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getDataDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    .line 1
    sget-object p1, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fd5cd969af0fL    # 5.489009287064824E158

    invoke-static {v1, v2, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getDeDataDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 6

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 1
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3fdaad969af0fL    # 5.4893361023831165E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v2, v3, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getExternalDataCacheDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-static {p0, p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getExternalDataDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    .line 1
    sget-object p1, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fd68d969af0fL    # 5.489059566344561E158

    invoke-static {v1, v2, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getExternalDataDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getExternalUserDir(I)Ljava/io/File;

    move-result-object p1

    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fd97d969af0fL    # 5.489256493523532E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, v2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getExternalDataFilesDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-static {p0, p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getExternalDataDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    .line 1
    sget-object p1, Li/a;->a:[Ljava/lang/String;

    const-wide v1, 0x60e3fd74d969af0fL    # 5.489109845624299E158

    invoke-static {v1, v2, p1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getExternalUserDir(I)Ljava/io/File;
    .locals 6

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sExternalVirtualRoot:Ljava/io/File;

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 1
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3fdb9d969af0fL    # 5.489398951482788E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v2, v3, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getExternalVirtualRoot()Ljava/io/File;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sExternalVirtualRoot:Ljava/io/File;

    return-object v0
.end method

.method public static getFakeLocationConf()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getSystemDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fdd9d969af0fL    # 5.489533029562088E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getObbDir(Ljava/lang/String;)Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fe45d969af0fL    # 5.489985543079723E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static getPackageConf(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getAppDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fdc6d969af0fL    # 5.4894534207025035E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getProcDir()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fe29d969af0fL    # 5.489868224760336E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getProcDir(I)Ljava/io/File;
    .locals 6

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getProcDir()Ljava/io/File;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 3
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3fd77d969af0fL    # 5.489122415444233E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v2, v3, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->mkdirs(Ljava/io/File;)V

    return-object v0
.end method

.method public static getSharedUserConf()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getSystemDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fdfdd969af0fL    # 5.489683867401299E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getSystemDir()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fe30d969af0fL    # 5.489897554340183E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getUidConf()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getSystemDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fe06d969af0fL    # 5.489721576861102E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getUserDir(I)Ljava/io/File;
    .locals 6

    new-instance v0, Ljava/io/File;

    sget-object v1, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 1
    sget-object v3, Li/a;->a:[Ljava/lang/String;

    const-wide v4, 0x60e3fdb7d969af0fL    # 5.489390571602832E158

    invoke-static {v4, v5, v3}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v2, v3, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getUserInfoConf()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getSystemDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fe1ed969af0fL    # 5.489822135420577E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getVirtualRoot()Ljava/io/File;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    return-object v0
.end method

.method public static getXPModuleConf()Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getSystemDir()Ljava/io/File;

    move-result-object v1

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fdecd969af0fL    # 5.489612638421672E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getXSharedPreferences(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getUserId()I

    move-result v1

    invoke-static {p0, v1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getDataDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1
    sget-object v2, Li/a;->a:[Ljava/lang/String;

    const-wide v3, 0x60e3fd2bd969af0fL    # 5.488803980005897E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 3
    const-wide v3, 0x60e3fd1dd969af0fL    # 5.488745320846203E158

    invoke-static {v3, v4, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static load()V
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sVirtualRoot:Ljava/io/File;

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->mkdirs(Ljava/io/File;)V

    sget-object v0, Ltop/niunaijun/blackbox/core/env/BEnvironment;->sExternalVirtualRoot:Ljava/io/File;

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->mkdirs(Ljava/io/File;)V

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getSystemDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->mkdirs(Ljava/io/File;)V

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->mkdirs(Ljava/io/File;)V

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getProcDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->mkdirs(Ljava/io/File;)V

    return-void
.end method
