.class public Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static appThreadIndex:I

.field private static callingFeatureIdIndex:I

.field private static callingPageIndex:I

.field private static flagsIndex:I

.field private static index:I

.field private static intentIndex:I

.field private static optionsIndex:I

.field private static profilerInfoIndex:I

.field private static requestCodeIndex:I

.field private static resolvedTypeIndex:I

.field private static resultToIndex:I

.field private static resultWhoIndex:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isR()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->index:I

    add-int/lit8 v1, v0, 0x1

    sput v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->appThreadIndex:I

    add-int/lit8 v0, v1, 0x1

    sput v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->callingPageIndex:I

    add-int/lit8 v1, v0, 0x1

    sput v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->callingFeatureIdIndex:I

    goto :goto_0

    :cond_0
    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->index:I

    add-int/lit8 v1, v0, 0x1

    sput v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->appThreadIndex:I

    add-int/lit8 v0, v1, 0x1

    sput v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->callingPageIndex:I

    move v1, v0

    :goto_0
    add-int/lit8 v0, v1, 0x1

    sput v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->intentIndex:I

    add-int/lit8 v1, v0, 0x1

    sput v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resolvedTypeIndex:I

    add-int/lit8 v0, v1, 0x1

    sput v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resultToIndex:I

    add-int/lit8 v1, v0, 0x1

    sput v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resultWhoIndex:I

    add-int/lit8 v0, v1, 0x1

    sput v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->requestCodeIndex:I

    add-int/lit8 v1, v0, 0x1

    sput v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->flagsIndex:I

    add-int/lit8 v0, v1, 0x1

    sput v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->profilerInfoIndex:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->index:I

    sput v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->optionsIndex:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAppThreadIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->appThreadIndex:I

    return v0
.end method

.method public static getCallingPackage([Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->callingPageIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getCallingPageIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->callingPageIndex:I

    return v0
.end method

.method public static getFlags([Ljava/lang/Object;)I
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->flagsIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static getFlagsIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->flagsIndex:I

    return v0
.end method

.method public static getIApplicationThread([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->appThreadIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getIntent([Ljava/lang/Object;)Landroid/content/Intent;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->intentIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Landroid/content/Intent;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getIntentIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->intentIndex:I

    return v0
.end method

.method public static getOptions([Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->optionsIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Landroid/os/Bundle;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getOptionsIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->optionsIndex:I

    return v0
.end method

.method public static getProfilerInfo([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->profilerInfoIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getProfilerInfoIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->profilerInfoIndex:I

    return v0
.end method

.method public static getRequestCode([Ljava/lang/Object;)I
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->requestCodeIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static getRequestCodeIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->requestCodeIndex:I

    return v0
.end method

.method public static getResolvedType([Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resolvedTypeIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getResolvedTypeIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resolvedTypeIndex:I

    return v0
.end method

.method public static getResultTo([Ljava/lang/Object;)Landroid/os/IBinder;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resultToIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Landroid/os/IBinder;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getResultToIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resultToIndex:I

    return v0
.end method

.method public static getResultWho([Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    sget v1, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resultWhoIndex:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getResultWhoIndex()I
    .locals 1

    sget v0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resultWhoIndex:I

    return v0
.end method

.method public static setAppThreadIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->appThreadIndex:I

    return-void
.end method

.method public static setCallingPageIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->callingPageIndex:I

    return-void
.end method

.method public static setFlagsIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->flagsIndex:I

    return-void
.end method

.method public static setIntentIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->intentIndex:I

    return-void
.end method

.method public static setOptionsIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->optionsIndex:I

    return-void
.end method

.method public static setProfilerInfoIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->profilerInfoIndex:I

    return-void
.end method

.method public static setRequestCodeIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->requestCodeIndex:I

    return-void
.end method

.method public static setResolvedTypeIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resolvedTypeIndex:I

    return-void
.end method

.method public static setResultToIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resultToIndex:I

    return-void
.end method

.method public static setResultWhoIndex(I)V
    .locals 0

    sput p0, Ltop/niunaijun/blackbox/utils/compat/StartActivityCompat;->resultWhoIndex:I

    return-void
.end method
