.class public Ltop/niunaijun/blackbox/utils/compat/BuildCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;
    }
.end annotation


# static fields
.field private static sRomType:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getPreviewSDKInt()I
    .locals 1

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    const/4 v0, 0x0

    return v0
.end method

.method public static getROMType()Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->sRomType:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    if-nez v0, :cond_9

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isEMUI()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->EMUI:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    :goto_0
    sput-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->sRomType:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_1

    :cond_0
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isHyperOS()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->HYPEROS:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isMIUI()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->MIUI:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_2
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isFlyme()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->FLYME:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_3
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isColorOS()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->COLOR_OS:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_4
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->is360UI()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->_360:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_5
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isLetv()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->LETV:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_6
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isVivo()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->VIVO:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_7
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isSamsung()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->SAMSUNG:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_8
    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;->OTHER:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    goto :goto_0

    :cond_9
    :goto_1
    sget-object v0, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->sRomType:Ltop/niunaijun/blackbox/utils/compat/BuildCompat$ROMType;

    return-object v0
.end method

.method public static is360UI()Z
    .locals 2

    const-string v0, "ro.build.uiversion"

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/compat/SystemPropertiesCompat;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "360UI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isColorOS()Z
    .locals 1

    const-string v0, "ro.build.version.opporom"

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/compat/SystemPropertiesCompat;->isExist(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ro.rom.different.version"

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/compat/SystemPropertiesCompat;->isExist(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isEMUI()Z
    .locals 3

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "EMUI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "ro.build.version.emui"

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/compat/SystemPropertiesCompat;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "EmotionUI"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static isFlyme()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "flyme"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public static isHyperOS()Z
    .locals 6

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    :cond_2
    const-string v3, "hyperos"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_6

    const-string v4, "xiaomi"

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_3
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "ro.hyperos.version"

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/compat/SystemPropertiesCompat;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    return v5

    :cond_5
    const/4 v0, 0x0

    return v0

    :cond_6
    :goto_2
    return v5
.end method

.method public static isL()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isLetv()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "Letv"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isM()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isMIUI()Z
    .locals 2

    const-string v0, "ro.miui.ui.version.code"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/compat/SystemPropertiesCompat;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static isN()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isN_MR1()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isOreo()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isPie()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isQ()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isR()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isS()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isSamsung()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v1, "samsung"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isT()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isU()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x20

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isV()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public static isVivo()Z
    .locals 1

    const-string v0, "ro.vivo.os.build.display.id"

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/compat/SystemPropertiesCompat;->isExist(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isXiaomiDevice()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "xiaomi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "redmi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "poco"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isMIUI()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
