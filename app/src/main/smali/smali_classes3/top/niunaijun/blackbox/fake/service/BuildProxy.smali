.class public Ltop/niunaijun/blackbox/fake/service/BuildProxy;
.super Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;
    }
.end annotation


# static fields
.field private static final IDENTITY_FILE:Ljava/lang/String; = "guest_identity.json"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;-><init>()V

    return-void
.end method

.method private static generateNewIdentity()Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;
    .locals 5

    new-instance v0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;-><init>(Ltop/niunaijun/blackbox/fake/service/BuildProxy$1;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "-"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->androidId:Ljava/lang/String;

    const-string v1, "unknown"

    iput-object v1, v0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->serial:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mi "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    const/4 v4, 0x5

    invoke-virtual {v2, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    const/16 v4, 0x8

    add-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->model:Ljava/lang/String;

    const-string v1, "Xiaomi"

    iput-object v1, v0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->brand:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Xiaomi/umi/umi:10/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":user/release-keys"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->fingerprint:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MPSS."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->radioVersion:Ljava/lang/String;

    return-object v0
.end method

.method private static getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\""

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, "\":\"([^\"]+)\""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method private static loadIdentity(Landroid/content/Context;)Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    const-string v2, "guest_identity.json"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v1

    invoke-static {v1}, Ljava/nio/file/Files;->readAllBytes(Ljava/nio/file/Path;)[B

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([B)V

    new-instance v1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;

    invoke-direct {v1, v0}, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;-><init>(Ltop/niunaijun/blackbox/fake/service/BuildProxy$1;)V

    const-string v2, "androidId"

    invoke-static {p0, v2}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->androidId:Ljava/lang/String;

    const-string v2, "serial"

    invoke-static {p0, v2}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->serial:Ljava/lang/String;

    const-string v2, "fingerprint"

    invoke-static {p0, v2}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->fingerprint:Ljava/lang/String;

    const-string v2, "model"

    invoke-static {p0, v2}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->model:Ljava/lang/String;

    const-string v2, "brand"

    invoke-static {p0, v2}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->brand:Ljava/lang/String;

    const-string v2, "radioVersion"

    invoke-static {p0, v2}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->radioVersion:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v0
.end method

.method public static resetGuest(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->generateNewIdentity()Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;

    move-result-object v0

    invoke-static {p0, v0}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->saveIdentity(Landroid/content/Context;Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;)V

    return-void
.end method

.method private static saveIdentity(Landroid/content/Context;Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;)V
    .locals 3

    const-string v0, "{\"androidId\":\""

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    const-string v2, "guest_identity.json"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->androidId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, "\",\"serial\":\""

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget-object v0, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->serial:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, "\",\"fingerprint\":\""

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget-object v0, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->fingerprint:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, "\",\"model\":\""

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget-object v0, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->model:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, "\",\"brand\":\""

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget-object v0, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->brand:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, "\",\"radioVersion\":\""

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget-object p1, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->radioVersion:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, "\"}"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/nio/file/OpenOption;

    invoke-static {p1, p0, v0}, Ljava/nio/file/Files;->write(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public getWho()Ljava/lang/Object;
    .locals 1

    sget-object v0, Le/d;->a:La/c;

    return-object v0
.end method

.method public inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;

    invoke-static {p1}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->loadIdentity(Landroid/content/Context;)Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p2, v1

    if-nez v0, :cond_0

    invoke-static {}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->generateNewIdentity()Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;

    move-result-object v0

    aput-object v0, p2, v1

    invoke-static {p1, v0}, Ltop/niunaijun/blackbox/fake/service/BuildProxy;->saveIdentity(Landroid/content/Context;Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;)V

    :cond_0
    aget-object p1, p2, v1

    sget-object v0, Le/d;->b:La/a;

    iget-object v1, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->brand:Ljava/lang/String;

    invoke-virtual {v0, v1}, La/a;->a(Ljava/lang/String;)V

    sget-object v0, Le/d;->c:La/a;

    iget-object v1, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->model:Ljava/lang/String;

    invoke-virtual {v0, v1}, La/a;->a(Ljava/lang/String;)V

    sget-object v0, Le/d;->h:La/a;

    iget-object v1, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->serial:Ljava/lang/String;

    invoke-virtual {v0, v1}, La/a;->a(Ljava/lang/String;)V

    sget-object v0, Le/d;->g:La/a;

    iget-object p1, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->fingerprint:Ljava/lang/String;

    invoke-virtual {v0, p1}, La/a;->a(Ljava/lang/String;)V

    sget-object p1, Le/d;->f:La/a;

    const-string v0, "guest"

    invoke-virtual {p1, v0}, La/a;->a(Ljava/lang/String;)V

    sget-object p1, Le/d;->e:La/a;

    const-string v0, "user"

    invoke-virtual {p1, v0}, La/a;->a(Ljava/lang/String;)V

    sget-object p1, Le/d;->d:La/a;

    const-string v0, "release-keys"

    invoke-virtual {p1, v0}, La/a;->a(Ljava/lang/String;)V

    new-instance p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$1;

    invoke-direct {p1, p0, p2}, Ltop/niunaijun/blackbox/fake/service/BuildProxy$1;-><init>(Ltop/niunaijun/blackbox/fake/service/BuildProxy;[Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;)V

    const-string v0, "getRadioVersion"

    invoke-virtual {p0, v0, p1}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ljava/lang/String;Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    new-instance p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$2;

    invoke-direct {p1, p0, p2}, Ltop/niunaijun/blackbox/fake/service/BuildProxy$2;-><init>(Ltop/niunaijun/blackbox/fake/service/BuildProxy;[Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;)V

    const-string p2, "getString"

    invoke-virtual {p0, p2, p1}, Ltop/niunaijun/blackbox/fake/hook/ClassInvocationStub;->addMethodHook(Ljava/lang/String;Ltop/niunaijun/blackbox/fake/hook/MethodHook;)V

    return-void
.end method

.method public isBadEnv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
