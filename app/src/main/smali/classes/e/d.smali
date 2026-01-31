.class public abstract Le/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/c;

.field public static final b:La/a;

.field public static final c:La/a;

.field public static final d:La/a;

.field public static final e:La/a;

.field public static final f:La/a;

.field public static final g:La/a;

.field public static final h:La/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-string v0, "android.os.Build"

    .line 1
    new-instance v1, La/c;

    .line 2
    const/4 v2, 0x0

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Reflector"

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v2

    .line 3
    :goto_0
    invoke-direct {v1, v0}, La/c;-><init>(Ljava/lang/Class;)V

    .line 4
    sput-object v1, Le/d;->a:La/c;

    const-string v3, "BOARD"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "BRAND"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    move-result-object v3

    sput-object v3, Le/d;->b:La/a;

    const-string v3, "DEVICE"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "DISPLAY"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "HOST"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "ID"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "MANUFACTURER"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "MODEL"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    move-result-object v3

    sput-object v3, Le/d;->c:La/a;

    const-string v3, "PRODUCT"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "TAGS"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    move-result-object v3

    sput-object v3, Le/d;->d:La/a;

    const-string v3, "TYPE"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    move-result-object v3

    sput-object v3, Le/d;->e:La/a;

    const-string v3, "USER"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    move-result-object v3

    sput-object v3, Le/d;->f:La/a;

    const-string v3, "FINGERPRINT"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    move-result-object v3

    sput-object v3, Le/d;->g:La/a;

    const-string v3, "BOOTLOADER"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "HARDWARE"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    const-string v3, "SERIAL"

    invoke-virtual {v1, v3}, La/c;->a(Ljava/lang/String;)La/a;

    move-result-object v1

    sput-object v1, Le/d;->h:La/a;

    const-string v1, "getRadioVersion"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    .line 5
    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v2, v4

    goto :goto_2

    :catch_1
    move-exception v4

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v4, v0

    :goto_1
    if-ge v3, v4, :cond_1

    aget-object v6, v0, v3

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    move-object v2, v6

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_2
    return-void
.end method
