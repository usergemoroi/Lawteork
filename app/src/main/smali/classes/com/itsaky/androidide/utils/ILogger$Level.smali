.class public final enum Lcom/itsaky/androidide/utils/ILogger$Level;
.super Ljava/lang/Enum;
.source "ILogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/itsaky/androidide/utils/ILogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Level"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/itsaky/androidide/utils/ILogger$Level;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/itsaky/androidide/utils/ILogger$Level;

.field public static final enum DEBUG:Lcom/itsaky/androidide/utils/ILogger$Level;

.field public static final enum ERROR:Lcom/itsaky/androidide/utils/ILogger$Level;

.field public static final enum INFO:Lcom/itsaky/androidide/utils/ILogger$Level;

.field public static final enum VERBOSE:Lcom/itsaky/androidide/utils/ILogger$Level;

.field public static final enum WARNING:Lcom/itsaky/androidide/utils/ILogger$Level;


# instance fields
.field public final levelChar:C


# direct methods
.method private static synthetic $values()[Lcom/itsaky/androidide/utils/ILogger$Level;
    .locals 5

    .line 239
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->DEBUG:Lcom/itsaky/androidide/utils/ILogger$Level;

    sget-object v1, Lcom/itsaky/androidide/utils/ILogger$Level;->WARNING:Lcom/itsaky/androidide/utils/ILogger$Level;

    sget-object v2, Lcom/itsaky/androidide/utils/ILogger$Level;->ERROR:Lcom/itsaky/androidide/utils/ILogger$Level;

    sget-object v3, Lcom/itsaky/androidide/utils/ILogger$Level;->INFO:Lcom/itsaky/androidide/utils/ILogger$Level;

    sget-object v4, Lcom/itsaky/androidide/utils/ILogger$Level;->VERBOSE:Lcom/itsaky/androidide/utils/ILogger$Level;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/itsaky/androidide/utils/ILogger$Level;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 241
    new-instance v0, Lcom/itsaky/androidide/utils/ILogger$Level;

    const/4 v1, 0x0

    const/16 v2, 0x44

    const-string v3, "DEBUG"

    invoke-direct {v0, v3, v1, v2}, Lcom/itsaky/androidide/utils/ILogger$Level;-><init>(Ljava/lang/String;IC)V

    sput-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->DEBUG:Lcom/itsaky/androidide/utils/ILogger$Level;

    .line 242
    new-instance v0, Lcom/itsaky/androidide/utils/ILogger$Level;

    const/4 v1, 0x1

    const/16 v2, 0x57

    const-string v3, "WARNING"

    invoke-direct {v0, v3, v1, v2}, Lcom/itsaky/androidide/utils/ILogger$Level;-><init>(Ljava/lang/String;IC)V

    sput-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->WARNING:Lcom/itsaky/androidide/utils/ILogger$Level;

    .line 243
    new-instance v0, Lcom/itsaky/androidide/utils/ILogger$Level;

    const/4 v1, 0x2

    const/16 v2, 0x45

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/itsaky/androidide/utils/ILogger$Level;-><init>(Ljava/lang/String;IC)V

    sput-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->ERROR:Lcom/itsaky/androidide/utils/ILogger$Level;

    .line 244
    new-instance v0, Lcom/itsaky/androidide/utils/ILogger$Level;

    const/4 v1, 0x3

    const/16 v2, 0x49

    const-string v3, "INFO"

    invoke-direct {v0, v3, v1, v2}, Lcom/itsaky/androidide/utils/ILogger$Level;-><init>(Ljava/lang/String;IC)V

    sput-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->INFO:Lcom/itsaky/androidide/utils/ILogger$Level;

    .line 245
    new-instance v0, Lcom/itsaky/androidide/utils/ILogger$Level;

    const/4 v1, 0x4

    const/16 v2, 0x56

    const-string v3, "VERBOSE"

    invoke-direct {v0, v3, v1, v2}, Lcom/itsaky/androidide/utils/ILogger$Level;-><init>(Ljava/lang/String;IC)V

    sput-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->VERBOSE:Lcom/itsaky/androidide/utils/ILogger$Level;

    .line 239
    invoke-static {}, Lcom/itsaky/androidide/utils/ILogger$Level;->$values()[Lcom/itsaky/androidide/utils/ILogger$Level;

    move-result-object v0

    sput-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->$VALUES:[Lcom/itsaky/androidide/utils/ILogger$Level;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IC)V
    .locals 0
    .param p3, "levelChar"    # C
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C)V"
        }
    .end annotation

    .line 249
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 250
    iput-char p3, p0, Lcom/itsaky/androidide/utils/ILogger$Level;->levelChar:C

    .line 251
    return-void
.end method

.method public static forChar(C)Lcom/itsaky/androidide/utils/ILogger$Level;
    .locals 5
    .param p0, "c"    # C

    .line 254
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p0

    .line 255
    invoke-static {}, Lcom/itsaky/androidide/utils/ILogger$Level;->values()[Lcom/itsaky/androidide/utils/ILogger$Level;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 256
    .local v3, "value":Lcom/itsaky/androidide/utils/ILogger$Level;
    iget-char v4, v3, Lcom/itsaky/androidide/utils/ILogger$Level;->levelChar:C

    if-ne v4, p0, :cond_0

    .line 257
    return-object v3

    .line 255
    .end local v3    # "value":Lcom/itsaky/androidide/utils/ILogger$Level;
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 261
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid level char "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger$Level;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 239
    const-class v0, Lcom/itsaky/androidide/utils/ILogger$Level;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/itsaky/androidide/utils/ILogger$Level;

    return-object v0
.end method

.method public static values()[Lcom/itsaky/androidide/utils/ILogger$Level;
    .locals 1

    .line 239
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->$VALUES:[Lcom/itsaky/androidide/utils/ILogger$Level;

    invoke-virtual {v0}, [Lcom/itsaky/androidide/utils/ILogger$Level;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/itsaky/androidide/utils/ILogger$Level;

    return-object v0
.end method
