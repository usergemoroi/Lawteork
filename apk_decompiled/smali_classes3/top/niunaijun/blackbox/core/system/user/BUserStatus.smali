.class public final enum Ltop/niunaijun/blackbox/core/system/user/BUserStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltop/niunaijun/blackbox/core/system/user/BUserStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

.field public static final enum DISABLE:Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

.field public static final enum ENABLE:Ltop/niunaijun/blackbox/core/system/user/BUserStatus;


# direct methods
.method private static synthetic $values()[Ltop/niunaijun/blackbox/core/system/user/BUserStatus;
    .locals 2

    sget-object v0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->ENABLE:Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    sget-object v1, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->DISABLE:Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    filled-new-array {v0, v1}, [Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    move-result-object v0

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    const-string v1, "ENABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->ENABLE:Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    new-instance v0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    const-string v1, "DISABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->DISABLE:Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    invoke-static {}, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->$values()[Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    move-result-object v0

    sput-object v0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->$VALUES:[Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ltop/niunaijun/blackbox/core/system/user/BUserStatus;
    .locals 1

    const-class v0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    return-object p0
.end method

.method public static values()[Ltop/niunaijun/blackbox/core/system/user/BUserStatus;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->$VALUES:[Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    invoke-virtual {v0}, [Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    return-object v0
.end method
