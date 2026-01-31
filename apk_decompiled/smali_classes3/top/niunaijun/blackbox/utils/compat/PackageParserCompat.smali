.class public Ltop/niunaijun/blackbox/utils/compat/PackageParserCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final API_LEVEL:I

.field public static final GIDS:[I

.field private static final myUserId:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/PackageParserCompat;->GIDS:[I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Ltop/niunaijun/blackbox/utils/compat/PackageParserCompat;->API_LEVEL:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static collectCertificates(Landroid/content/pm/PackageParser;Landroid/content/pm/PackageParser$Package;I)V
    .locals 4

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isPie()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 1
    const-class p0, Lblack/android/content/pm/PackageParserPieStatic;

    invoke-static {p0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserPieStatic;

    .line 2
    invoke-interface {p0, p1, v2}, Lblack/android/content/pm/PackageParserPieStatic;->collectCertificates(Landroid/content/pm/PackageParser$Package;Z)Ljava/lang/Void;

    goto :goto_0

    :cond_0
    sget v0, Ltop/niunaijun/blackbox/utils/compat/PackageParserCompat;->API_LEVEL:I

    const/16 v3, 0x18

    if-lt v0, v3, :cond_1

    .line 3
    const-class p0, Lblack/android/content/pm/PackageParserNougatStatic;

    invoke-static {p0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserNougatStatic;

    .line 4
    invoke-interface {p0, p1, p2}, Lblack/android/content/pm/PackageParserNougatStatic;->collectCertificates(Landroid/content/pm/PackageParser$Package;I)Ljava/lang/Void;

    goto :goto_0

    :cond_1
    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 5
    const-class v0, Lblack/android/content/pm/PackageParserMarshmallowContext;

    invoke-static {v0, p0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserMarshmallowContext;

    .line 6
    invoke-interface {p0, p1, p2}, Lblack/android/content/pm/PackageParserMarshmallowContext;->collectCertificates(Landroid/content/pm/PackageParser$Package;I)Ljava/lang/Void;

    goto :goto_0

    :cond_2
    const/16 v1, 0x16

    if-lt v0, v1, :cond_3

    .line 7
    const-class v0, Lblack/android/content/pm/PackageParserLollipop22Context;

    invoke-static {v0, p0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserLollipop22Context;

    .line 8
    invoke-interface {p0, p1, p2}, Lblack/android/content/pm/PackageParserLollipop22Context;->collectCertificates(Landroid/content/pm/PackageParser$Package;I)Ljava/lang/Void;

    goto :goto_0

    :cond_3
    const/16 v1, 0x15

    if-lt v0, v1, :cond_4

    .line 9
    const-class v0, Lblack/android/content/pm/PackageParserLollipopContext;

    invoke-static {v0, p0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserLollipopContext;

    .line 10
    invoke-interface {p0, p1, p2}, Lblack/android/content/pm/PackageParserLollipopContext;->collectCertificates(Landroid/content/pm/PackageParser$Package;I)Ljava/lang/Void;

    goto :goto_0

    .line 11
    :cond_4
    const-class v0, Lblack/android/content/pm/PackageParserContext;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserContext;

    .line 12
    invoke-interface {p0, p1, p2}, Lblack/android/content/pm/PackageParserContext;->collectCertificates(Landroid/content/pm/PackageParser$Package;I)Ljava/lang/Void;

    :goto_0
    return-void
.end method

.method public static createParser(Ljava/io/File;)Landroid/content/pm/PackageParser;
    .locals 3

    sget p0, Ltop/niunaijun/blackbox/utils/compat/PackageParserCompat;->API_LEVEL:I

    const/16 v0, 0x17

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-lt p0, v0, :cond_0

    .line 1
    const-class p0, Lblack/android/content/pm/PackageParserMarshmallowStatic;

    invoke-static {p0, v2, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserMarshmallowStatic;

    .line 2
    invoke-interface {p0}, Lblack/android/content/pm/PackageParserMarshmallowStatic;->_new()Landroid/content/pm/PackageParser;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0x16

    if-lt p0, v0, :cond_1

    .line 3
    const-class p0, Lblack/android/content/pm/PackageParserLollipop22Static;

    invoke-static {p0, v2, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserLollipop22Static;

    .line 4
    invoke-interface {p0}, Lblack/android/content/pm/PackageParserLollipop22Static;->_new()Landroid/content/pm/PackageParser;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v0, 0x15

    if-lt p0, v0, :cond_2

    .line 5
    const-class p0, Lblack/android/content/pm/PackageParserLollipopStatic;

    invoke-static {p0, v2, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserLollipopStatic;

    .line 6
    invoke-interface {p0}, Lblack/android/content/pm/PackageParserLollipopStatic;->_new()Landroid/content/pm/PackageParser;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v2
.end method

.method public static parsePackage(Landroid/content/pm/PackageParser;Ljava/io/File;I)Landroid/content/pm/PackageParser$Package;
    .locals 3

    sget v0, Ltop/niunaijun/blackbox/utils/compat/PackageParserCompat;->API_LEVEL:I

    const/16 v1, 0x17

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    .line 1
    const-class v0, Lblack/android/content/pm/PackageParserMarshmallowContext;

    invoke-static {v0, p0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserMarshmallowContext;

    .line 2
    invoke-interface {p0, p1, p2}, Lblack/android/content/pm/PackageParserMarshmallowContext;->parsePackage(Ljava/io/File;I)Landroid/content/pm/PackageParser$Package;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v1, 0x16

    if-lt v0, v1, :cond_1

    .line 3
    const-class v0, Lblack/android/content/pm/PackageParserLollipop22Context;

    invoke-static {v0, p0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserLollipop22Context;

    .line 4
    invoke-interface {p0, p1, p2}, Lblack/android/content/pm/PackageParserLollipop22Context;->parsePackage(Ljava/io/File;I)Landroid/content/pm/PackageParser$Package;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    .line 5
    const-class v0, Lblack/android/content/pm/PackageParserLollipopContext;

    invoke-static {v0, p0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserLollipopContext;

    .line 6
    invoke-interface {p0, p1, p2}, Lblack/android/content/pm/PackageParserLollipopContext;->parsePackage(Ljava/io/File;I)Landroid/content/pm/PackageParser$Package;

    move-result-object p0

    return-object p0

    .line 7
    :cond_2
    const-class v0, Lblack/android/content/pm/PackageParserContext;

    invoke-static {v0, p0, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/content/pm/PackageParserContext;

    .line 8
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    const/4 v1, 0x0

    invoke-interface {p0, p1, v1, v0, p2}, Lblack/android/content/pm/PackageParserContext;->parsePackage(Ljava/io/File;Ljava/lang/String;Landroid/util/DisplayMetrics;I)Landroid/content/pm/PackageParser$Package;

    move-result-object p0

    return-object p0
.end method
