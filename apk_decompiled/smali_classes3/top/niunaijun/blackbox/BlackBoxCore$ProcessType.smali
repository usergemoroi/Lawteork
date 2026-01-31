.class final enum Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/BlackBoxCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ProcessType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

.field public static final enum BAppClient:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

.field public static final enum Main:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

.field public static final enum Server:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;


# direct methods
.method private static synthetic $values()[Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;
    .locals 3

    sget-object v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->Server:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    sget-object v1, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->BAppClient:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    sget-object v2, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->Main:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    filled-new-array {v0, v1, v2}, [Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    move-result-object v0

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    .line 1
    sget-object v1, Li/a;->a:[Ljava/lang/String;

    const-wide v2, 0x60e3fa38d969af0fL    # 5.485640575322426E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->Server:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    new-instance v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    .line 3
    const-wide v2, 0x60e3fa31d969af0fL    # 5.485611245742579E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    const/4 v3, 0x1

    invoke-direct {v0, v2, v3}, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->BAppClient:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    new-instance v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    .line 5
    const-wide v2, 0x60e3fa26d969af0fL    # 5.48556515640282E158

    invoke-static {v2, v3, v1}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getString(J[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->Main:Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->$values()[Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    move-result-object v0

    sput-object v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->$VALUES:[Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

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

.method public static valueOf(Ljava/lang/String;)Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;
    .locals 1

    const-class v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    return-object p0
.end method

.method public static values()[Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->$VALUES:[Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    invoke-virtual {v0}, [Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltop/niunaijun/blackbox/BlackBoxCore$ProcessType;

    return-object v0
.end method
