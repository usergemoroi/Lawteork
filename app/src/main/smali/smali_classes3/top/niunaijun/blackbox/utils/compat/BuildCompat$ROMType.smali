.class public final enum Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/utils/compat/BuildCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ROMType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum COLOR_OS:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum EMUI:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum FLYME:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum HYPEROS:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum LETV:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum MIUI:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum OTHER:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum SAMSUNG:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum VIVO:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

.field public static final enum _360:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;


# direct methods
.method private static synthetic $values()[Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;
    .locals 10

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->EMUI:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v1, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->MIUI:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v2, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->FLYME:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v3, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->COLOR_OS:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v4, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->LETV:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v5, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->VIVO:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v6, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->_360:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v7, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->SAMSUNG:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v8, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->HYPEROS:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    sget-object v9, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->OTHER:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    filled-new-array/range {v0 .. v9}, [Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    move-result-object v0

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "EMUI"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->EMUI:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "MIUI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->MIUI:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "FLYME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->FLYME:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "COLOR_OS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->COLOR_OS:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "LETV"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->LETV:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "VIVO"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->VIVO:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "_360"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->_360:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "SAMSUNG"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->SAMSUNG:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "HYPEROS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->HYPEROS:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    new-instance v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    const-string v1, "OTHER"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->OTHER:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->$values()[Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    move-result-object v0

    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->$VALUES:[Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

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

.method public static valueOf(Ljava/lang/String;)Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;
    .locals 1

    const-class v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    return-object p0
.end method

.method public static values()[Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->$VALUES:[Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    invoke-virtual {v0}, [Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    return-object v0
.end method
